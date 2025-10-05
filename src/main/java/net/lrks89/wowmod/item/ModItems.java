package net.lrks89.wowmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lrks89.wowmod.WeaponsOfWar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    //Weapons
    public static final Item M12113_SHORTSWORD = registerItem("m12113_shortsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.4f, setting));

    private static void customModIngredients(FabricItemGroupEntries entries) {
    }
    private static void customModWeapons(FabricItemGroupEntries entries) {
        entries.add(M12113_SHORTSWORD);
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(WeaponsOfWar.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsOfWar.MOD_ID, name)))));
    }
    public static void  registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS). register(ModItems::customModIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT). register(ModItems::customModWeapons);
    }
}