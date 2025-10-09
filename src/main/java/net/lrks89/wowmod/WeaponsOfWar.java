package net.lrks89.wowmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.lrks89.wowmod.event.KeyInputHandler;
import net.lrks89.wowmod.item.ModItemGroups;
import net.lrks89.wowmod.item.ModItems;
import net.lrks89.wowmod.payload.AltStancePayload;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponsOfWar implements ModInitializer {
	public static final String MOD_ID = "wowmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.initialize();
        ModItems.registerModItems();
        KeyInputHandler.registerKeyInputs();

        PayloadTypeRegistry.playC2S().register(AltStancePayload.ID, AltStancePayload.CODEC);

        ServerPlayNetworking.registerGlobalReceiver(AltStancePayload.ID, (payload, context) -> {
            context.server().execute(() -> {
                var player = context.player();
                ItemStack mainHandStack = player.getMainHandStack();
                //Slashing Weapons
                //Daggers
                if (mainHandStack.getItem() == ModItems.M1113A_DAGGER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1113B_DAGGER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1113B_DAGGER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1113A_DAGGER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M1123A_FANG) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1123B_FANG);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1123B_FANG) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1123A_FANG);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Straight Swords
                if (mainHandStack.getItem() == ModItems.M1213A_SHORTSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1213B_SHORTSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1213B_SHORTSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1213A_SHORTSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M1223A_LONGSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1223B_LONGSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1223B_LONGSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1223A_LONGSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Curved Swords
                if (mainHandStack.getItem() == ModItems.M1313A_CUTLASS) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1313B_CUTLASS);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1313B_CUTLASS) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1313A_CUTLASS);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M1323A_SCIMITAR) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1323B_SCIMITAR);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1323B_SCIMITAR) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1323A_SCIMITAR);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Katana
                if (mainHandStack.getItem() == ModItems.M1413A_NINJATO) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1413B_NINJATO);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1413B_NINJATO) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1413A_NINJATO);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M1423A_UCHIGATANA) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1423B_UCHIGATANA);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1423B_UCHIGATANA) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1423A_UCHIGATANA);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Great Slashers
                if (mainHandStack.getItem() == ModItems.M1513A_GREATSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1513B_GREATSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1513B_GREATSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1513A_GREATSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M1523A_GROSSMESSER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1523B_GROSSMESSER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1523B_GROSSMESSER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1523A_GROSSMESSER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Slashing Polearms
                if (mainHandStack.getItem() == ModItems.M1613A_GLAIVE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1613B_GLAIVE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1613B_GLAIVE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1613A_GLAIVE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M1623A_NAGAMAKI) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1623B_NAGAMAKI);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M1623B_NAGAMAKI) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M1623A_NAGAMAKI);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Piercing Weapons
                //Claws
                if (mainHandStack.getItem() == ModItems.M2113A_CLAW) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2113B_CLAW);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2113B_CLAW) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2113A_CLAW);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M2123A_HATCHET) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2123B_HATCHET);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2123B_HATCHET) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2123A_HATCHET);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Thrusting Swords
                if (mainHandStack.getItem() == ModItems.M2213A_SAI) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2213B_SAI);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2213B_SAI) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2213A_SAI);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M2223A_RAPIER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2223B_RAPIER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2223B_RAPIER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2223A_RAPIER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Reapers
                if (mainHandStack.getItem() == ModItems.M2313A_SICKLE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2313B_SICKLE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2313B_SICKLE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2313A_SICKLE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M2323A_HOOKSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2323B_HOOKSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2323B_HOOKSWORD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2323A_HOOKSWORD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Axes
                if (mainHandStack.getItem() == ModItems.M2413A_LABRYS) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2413B_LABRYS);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2413B_LABRYS) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2413A_LABRYS);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M2423A_WARAXE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2423B_WARAXE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2423B_WARAXE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2423A_WARAXE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Great Piercers
                if (mainHandStack.getItem() == ModItems.M2513A_SCYTHE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2513B_SCYTHE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2513B_SCYTHE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2513A_SCYTHE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M2523A_BATTLEAXE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2523B_BATTLEAXE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2523B_BATTLEAXE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2523A_BATTLEAXE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Piercing Polearms
                if (mainHandStack.getItem() == ModItems.M2613A_SPEAR) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2613B_SPEAR);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2613B_SPEAR) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2613A_SPEAR);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M2623A_HALBERD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2623B_HALBERD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M2623B_HALBERD) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M2623A_HALBERD);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Bludgeoning Weapons
                //Fists
                if (mainHandStack.getItem() == ModItems.M3113A_TONFA) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3113B_TONFA);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3113B_TONFA) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3113A_TONFA);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M3123A_GAUNTLET) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3123B_GAUNTLET);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3123B_GAUNTLET) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3123A_GAUNTLET);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Clubs
                if (mainHandStack.getItem() == ModItems.M3213A_JITTE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3213B_JITTE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3213B_JITTE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3213A_JITTE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M3223A_WARCLUB) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3223B_WARCLUB);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3223B_WARCLUB) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3223A_WARCLUB);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Maces
                if (mainHandStack.getItem() == ModItems.M3313A_MACE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3313B_MACE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3313B_MACE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3313A_MACE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M3323A_WARMACE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3323B_WARMACE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3323B_WARMACE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3323A_WARMACE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Hammers
                if (mainHandStack.getItem() == ModItems.M3413A_HAMMER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3413B_HAMMER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3413B_HAMMER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3413A_HAMMER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M3423A_WARHAMMER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3423B_WARHAMMER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3423B_WARHAMMER) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3423A_WARHAMMER);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Great Bludgeons
                if (mainHandStack.getItem() == ModItems.M3513A_KANABO) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3513B_KANABO);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3513B_KANABO) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3513A_KANABO);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M3523A_MAUL) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3523B_MAUL);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3523B_MAUL) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3523A_MAUL);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Bludgeoning Polearms
                if (mainHandStack.getItem() == ModItems.M3613A_STAFF) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3613B_STAFF);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3613B_STAFF) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3613A_STAFF);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M3623A_LUCERNE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3623B_LUCERNE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M3623B_LUCERNE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M3623A_LUCERNE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                //Unique Weapons
                //Chakrams
                if (mainHandStack.getItem() == ModItems.M4113A_CHAKRAM) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M4113B_CHAKRAM);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M4113B_CHAKRAM) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M4113A_CHAKRAM);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}


                //Poles
                if (mainHandStack.getItem() == ModItems.M4213A_TWINGLAIVE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M4213B_TWINGLAIVE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M4213B_TWINGLAIVE) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M4213A_TWINGLAIVE);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

                if (mainHandStack.getItem() == ModItems.M4223A_BO) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M4223B_BO);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}
                if (mainHandStack.getItem() == ModItems.M4223B_BO) {
                    var oldComponents = mainHandStack.getComponents();
                    ItemStack weapon = new ItemStack(ModItems.M4223A_BO);
                    weapon.applyComponentsFrom(oldComponents);
                    player.setStackInHand(Hand.MAIN_HAND, weapon);}

            });
        });
    }
}