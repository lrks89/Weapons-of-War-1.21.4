package net.lrks89.wowmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lrks89.wowmod.WeaponsOfWar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item M12113_SHORTSWORD = registerItem("m12113_shortsword", Item::new, new Item.Settings());
    public static final Item M12213_LONGSWORD = registerItem("m12213_longsword", Item::new, new Item.Settings());
    public static final Item M12313_GREATSWORD = registerItem("m12313_greatsword", Item::new, new Item.Settings());

    public static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registerKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsOfWar.MOD_ID, name));
        return Items.register(registerKey, factory, settings);
    }

    private static void customModIngredients(FabricItemGroupEntries entries) {
    }
    private static void customModWeapons(FabricItemGroupEntries entries) {
        entries.add(M12113_SHORTSWORD);
        entries.add(M12213_LONGSWORD);
        entries.add(M12313_GREATSWORD);
    }

    public static void  registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS). register(ModItems::customModIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT). register(ModItems::customModWeapons);
    }
}