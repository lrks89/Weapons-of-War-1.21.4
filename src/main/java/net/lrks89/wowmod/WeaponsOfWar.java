package net.lrks89.wowmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.lrks89.wowmod.event.KeyInputHandler;
import net.lrks89.wowmod.item.ModItemGroups;
import net.lrks89.wowmod.item.ModItems;
import net.lrks89.wowmod.payload.AltStancePayload;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.Unit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class WeaponsOfWar implements ModInitializer {
    public static final String MOD_ID = "wowmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    //AltStance Mechanic (A-B Map)
    private static final Map<Item, Item> ALT_STANCE_MAP = new HashMap<>();

    //Dual-wielding mechanic (Triggers)
    private static final Set<Item> DUAL_WIELD_ITEMS = new HashSet<>();
    private static final Map<UUID, ItemStack> storedOffhandItems = new HashMap<>();

    @Override
    public void onInitialize() {
        ModItemGroups.initialize();
        ModItems.registerModItems();
        KeyInputHandler.registerKeyInputs();
        populatealtStanceMap();
        populateDualWieldItems();

        //AltStance Setup
        PayloadTypeRegistry.playC2S().register(AltStancePayload.ID, AltStancePayload.CODEC);
        ServerPlayNetworking.registerGlobalReceiver(AltStancePayload.ID, (payload, context) -> {
            context.server().execute(() -> {
                var player = context.player();
                ItemStack mainHandStack = player.getMainHandStack();
                Optional<ItemStack> swappedWeapon = swapWeaponStance(mainHandStack);
                swappedWeapon.ifPresent(weapon -> {
                    player.setStackInHand(Hand.MAIN_HAND, weapon);
                });
            });
        });
        // Register the server tick event for the dual-wield mechanic
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                handleDualWieldMechanic(player);
            }
        });
    }
    //AltStance Method
    private Optional<ItemStack> swapWeaponStance(ItemStack originalStack) {
        Item targetItem = ALT_STANCE_MAP.get(originalStack.getItem());
        if (targetItem != null) {
            ItemStack newStack = new ItemStack(targetItem);
            var oldComponents = originalStack.getComponents();
            //Component Transfers
            var enchantments = oldComponents.get(DataComponentTypes.ENCHANTMENTS);
            if (enchantments != null) {newStack.set(DataComponentTypes.ENCHANTMENTS, enchantments);}
            var customName = oldComponents.get(DataComponentTypes.CUSTOM_NAME);
            if (customName != null) {newStack.set(DataComponentTypes.CUSTOM_NAME, customName);}
            var lore = oldComponents.get(DataComponentTypes.LORE);
            if (lore != null) {newStack.set(DataComponentTypes.LORE, lore);}
            var damage = oldComponents.get(DataComponentTypes.DAMAGE);
            if (damage != null) {newStack.set(DataComponentTypes.DAMAGE, damage);}

            return Optional.of(newStack);
        }
        return Optional.empty(); // No swap possible for this item
    }
    //DualWield Method
    private void handleDualWieldMechanic(ServerPlayerEntity player) {
        UUID playerId = player.getUuid();
        ItemStack mainHandStack = player.getMainHandStack();
        ItemStack offHandStack = player.getOffHandStack();
        Item mainHandItem = mainHandStack.getItem();

        boolean shouldDualWield = DUAL_WIELD_ITEMS.contains(mainHandItem) && !mainHandStack.isEmpty();

        boolean isOffhandClone = offHandStack.getItem() == mainHandItem
                && offHandStack.get(DataComponentTypes.CREATIVE_SLOT_LOCK) != null;

        if (shouldDualWield) {
            if (!storedOffhandItems.containsKey(playerId)) {
                storedOffhandItems.put(playerId, offHandStack.copy());
                LOGGER.info("Starting dual wield for " + player.getName().getString() + ". Storing offhand item.");
            }

            if (!isOffhandClone) {
                ItemStack offHandClone = mainHandStack.copy();
                offHandClone.set(DataComponentTypes.CREATIVE_SLOT_LOCK, Unit.INSTANCE);
                offHandClone.setCount(1);
                player.setStackInHand(Hand.OFF_HAND, offHandClone);

                LOGGER.info("Restored locked clone to offhand for " + player.getName().getString());
            }
        } else {
            // ... (existing code for restoring original offhand item)
            if (storedOffhandItems.containsKey(playerId)) {
                ItemStack storedItem = storedOffhandItems.remove(playerId);
                player.setStackInHand(Hand.OFF_HAND, storedItem);
                LOGGER.info("Ending dual wield for " + player.getName().getString() + ". Restoring offhand item.");
            }
        }
    }
    //Lists
    private static void populateDualWieldItems() {
        // Based on the 'Daggers' category in populateAltStanceMap
        DUAL_WIELD_ITEMS.add(ModItems.M1113B_DAGGER);
        DUAL_WIELD_ITEMS.add(ModItems.M1123B_FANG);
    }

    private static void populatealtStanceMap() {
        // Slashing Weapons
        //Daggers
        ALT_STANCE_MAP.put(ModItems.M1113A_DAGGER, ModItems.M1113B_DAGGER);
        ALT_STANCE_MAP.put(ModItems.M1113B_DAGGER, ModItems.M1113A_DAGGER);
        ALT_STANCE_MAP.put(ModItems.M1123A_FANG, ModItems.M1123B_FANG);
        ALT_STANCE_MAP.put(ModItems.M1123B_FANG, ModItems.M1123A_FANG);

        // Straight Swords
        ALT_STANCE_MAP.put(ModItems.M1213A_SHORTSWORD, ModItems.M1213B_SHORTSWORD);
        ALT_STANCE_MAP.put(ModItems.M1213B_SHORTSWORD, ModItems.M1213A_SHORTSWORD);
        ALT_STANCE_MAP.put(ModItems.M1223A_LONGSWORD, ModItems.M1223B_LONGSWORD);
        ALT_STANCE_MAP.put(ModItems.M1223B_LONGSWORD, ModItems.M1223A_LONGSWORD);

        // Curved Swords
        ALT_STANCE_MAP.put(ModItems.M1313A_CUTLASS, ModItems.M1313B_CUTLASS);
        ALT_STANCE_MAP.put(ModItems.M1313B_CUTLASS, ModItems.M1313A_CUTLASS);
        ALT_STANCE_MAP.put(ModItems.M1323A_SCIMITAR, ModItems.M1323B_SCIMITAR);
        ALT_STANCE_MAP.put(ModItems.M1323B_SCIMITAR, ModItems.M1323A_SCIMITAR);

        // Katana
        ALT_STANCE_MAP.put(ModItems.M1413A_NINJATO, ModItems.M1413B_NINJATO);
        ALT_STANCE_MAP.put(ModItems.M1413B_NINJATO, ModItems.M1413A_NINJATO);
        ALT_STANCE_MAP.put(ModItems.M1423A_UCHIGATANA, ModItems.M1423B_UCHIGATANA);
        ALT_STANCE_MAP.put(ModItems.M1423B_UCHIGATANA, ModItems.M1423A_UCHIGATANA);

        // Great Slashers
        ALT_STANCE_MAP.put(ModItems.M1513A_GREATSWORD, ModItems.M1513B_GREATSWORD);
        ALT_STANCE_MAP.put(ModItems.M1513B_GREATSWORD, ModItems.M1513A_GREATSWORD);
        ALT_STANCE_MAP.put(ModItems.M1523A_GROSSMESSER, ModItems.M1523B_GROSSMESSER);
        ALT_STANCE_MAP.put(ModItems.M1523B_GROSSMESSER, ModItems.M1523A_GROSSMESSER);

        // Slashing Polearms
        ALT_STANCE_MAP.put(ModItems.M1613A_GLAIVE, ModItems.M1613B_GLAIVE);
        ALT_STANCE_MAP.put(ModItems.M1613B_GLAIVE, ModItems.M1613A_GLAIVE);
        ALT_STANCE_MAP.put(ModItems.M1623A_NAGAMAKI, ModItems.M1623B_NAGAMAKI);
        ALT_STANCE_MAP.put(ModItems.M1623B_NAGAMAKI, ModItems.M1623A_NAGAMAKI);

        // Piercing Weapons
        // Claws
        ALT_STANCE_MAP.put(ModItems.M2113A_CLAW, ModItems.M2113B_CLAW);
        ALT_STANCE_MAP.put(ModItems.M2113B_CLAW, ModItems.M2113A_CLAW);
        ALT_STANCE_MAP.put(ModItems.M2123A_HATCHET, ModItems.M2123B_HATCHET);
        ALT_STANCE_MAP.put(ModItems.M2123B_HATCHET, ModItems.M2123A_HATCHET);

        // Thrusting Swords
        ALT_STANCE_MAP.put(ModItems.M2213A_SAI, ModItems.M2213B_SAI);
        ALT_STANCE_MAP.put(ModItems.M2213B_SAI, ModItems.M2213A_SAI);
        ALT_STANCE_MAP.put(ModItems.M2223A_RAPIER, ModItems.M2223B_RAPIER);
        ALT_STANCE_MAP.put(ModItems.M2223B_RAPIER, ModItems.M2223A_RAPIER);

        // Reapers
        ALT_STANCE_MAP.put(ModItems.M2313A_SICKLE, ModItems.M2313B_SICKLE);
        ALT_STANCE_MAP.put(ModItems.M2313B_SICKLE, ModItems.M2313A_SICKLE);
        ALT_STANCE_MAP.put(ModItems.M2323A_HOOKSWORD, ModItems.M2323B_HOOKSWORD);
        ALT_STANCE_MAP.put(ModItems.M2323B_HOOKSWORD, ModItems.M2323A_HOOKSWORD);

        // Axes
        ALT_STANCE_MAP.put(ModItems.M2413A_LABRYS, ModItems.M2413B_LABRYS);
        ALT_STANCE_MAP.put(ModItems.M2413B_LABRYS, ModItems.M2413A_LABRYS);
        ALT_STANCE_MAP.put(ModItems.M2423A_WARAXE, ModItems.M2423B_WARAXE);
        ALT_STANCE_MAP.put(ModItems.M2423B_WARAXE, ModItems.M2423A_WARAXE);

        // Great Piercers
        ALT_STANCE_MAP.put(ModItems.M2513A_SCYTHE, ModItems.M2513B_SCYTHE);
        ALT_STANCE_MAP.put(ModItems.M2513B_SCYTHE, ModItems.M2513A_SCYTHE);
        ALT_STANCE_MAP.put(ModItems.M2523A_BATTLEAXE, ModItems.M2523B_BATTLEAXE);
        ALT_STANCE_MAP.put(ModItems.M2523B_BATTLEAXE, ModItems.M2523A_BATTLEAXE);

        // Piercing Polearms
        ALT_STANCE_MAP.put(ModItems.M2613A_SPEAR, ModItems.M2613B_SPEAR);
        ALT_STANCE_MAP.put(ModItems.M2613B_SPEAR, ModItems.M2613A_SPEAR);
        ALT_STANCE_MAP.put(ModItems.M2623A_HALBERD, ModItems.M2623B_HALBERD);
        ALT_STANCE_MAP.put(ModItems.M2623B_HALBERD, ModItems.M2623A_HALBERD);

        // Bludgeoning Weapons
        // Fists
        ALT_STANCE_MAP.put(ModItems.M3113A_TONFA, ModItems.M3113B_TONFA);
        ALT_STANCE_MAP.put(ModItems.M3113B_TONFA, ModItems.M3113A_TONFA);
        ALT_STANCE_MAP.put(ModItems.M3123A_GAUNTLET, ModItems.M3123B_GAUNTLET);
        ALT_STANCE_MAP.put(ModItems.M3123B_GAUNTLET, ModItems.M3123A_GAUNTLET);

        // Clubs
        ALT_STANCE_MAP.put(ModItems.M3213A_JITTE, ModItems.M3213B_JITTE);
        ALT_STANCE_MAP.put(ModItems.M3213B_JITTE, ModItems.M3213A_JITTE);
        ALT_STANCE_MAP.put(ModItems.M3223A_WARCLUB, ModItems.M3223B_WARCLUB);
        ALT_STANCE_MAP.put(ModItems.M3223B_WARCLUB, ModItems.M3223A_WARCLUB);

        // Maces
        ALT_STANCE_MAP.put(ModItems.M3313A_MACE, ModItems.M3313B_MACE);
        ALT_STANCE_MAP.put(ModItems.M3313B_MACE, ModItems.M3313A_MACE);
        ALT_STANCE_MAP.put(ModItems.M3323A_WARMACE, ModItems.M3323B_WARMACE);
        ALT_STANCE_MAP.put(ModItems.M3323B_WARMACE, ModItems.M3323A_WARMACE);

        // Hammers
        ALT_STANCE_MAP.put(ModItems.M3413A_HAMMER, ModItems.M3413B_HAMMER);
        ALT_STANCE_MAP.put(ModItems.M3413B_HAMMER, ModItems.M3413A_HAMMER);
        ALT_STANCE_MAP.put(ModItems.M3423A_WARHAMMER, ModItems.M3423B_WARHAMMER);
        ALT_STANCE_MAP.put(ModItems.M3423B_WARHAMMER, ModItems.M3423A_WARHAMMER);

        // Great Bludgeons
        ALT_STANCE_MAP.put(ModItems.M3513A_KANABO, ModItems.M3513B_KANABO);
        ALT_STANCE_MAP.put(ModItems.M3513B_KANABO, ModItems.M3513A_KANABO);
        ALT_STANCE_MAP.put(ModItems.M3523A_MAUL, ModItems.M3523B_MAUL);
        ALT_STANCE_MAP.put(ModItems.M3523B_MAUL, ModItems.M3523A_MAUL);

        // Bludgeoning Polearms
        ALT_STANCE_MAP.put(ModItems.M3613A_STAFF, ModItems.M3613B_STAFF);
        ALT_STANCE_MAP.put(ModItems.M3613B_STAFF, ModItems.M3613A_STAFF);
        ALT_STANCE_MAP.put(ModItems.M3623A_LUCERNE, ModItems.M3623B_LUCERNE);
        ALT_STANCE_MAP.put(ModItems.M3623B_LUCERNE, ModItems.M3623A_LUCERNE);

        //Uniques Weapons
        //Chakrams
        ALT_STANCE_MAP.put(ModItems.M4113A_CHAKRAM, ModItems.M4113B_CHAKRAM);
        ALT_STANCE_MAP.put(ModItems.M4113B_CHAKRAM, ModItems.M4113A_CHAKRAM);

        //Poles
        ALT_STANCE_MAP.put(ModItems.M4213A_TWINGLAIVE, ModItems.M4213B_TWINGLAIVE);
        ALT_STANCE_MAP.put(ModItems.M4213B_TWINGLAIVE, ModItems.M4213A_TWINGLAIVE);
        ALT_STANCE_MAP.put(ModItems.M4223A_BO, ModItems.M4223B_BO);
        ALT_STANCE_MAP.put(ModItems.M4223B_BO, ModItems.M4223A_BO);
    }
}