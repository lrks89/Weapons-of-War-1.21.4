package net.lrks89.wowmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lrks89.wowmod.WeaponsOfWar;
import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    //Slashing Weapons
    //Daggers
    public static final Item M1113A_DAGGER = registerSwordItem("m1113a_dagger",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -2.1f, setting));
    public static final Item M1113B_DAGGER = registerSwordItem("m1113b_dagger",
            setting -> new DualWieldingSwordItem(ModToolMaterials.IRON_WEAPONS, -2, -2.1f, setting));

    public static final Item M1123A_FANG = registerSwordItem("m1123a_fang",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -2.0f, setting));
    public static final Item M1123B_FANG = registerSwordItem("m1123b_fang",
            setting -> new DualWieldingSwordItem(ModToolMaterials.IRON_WEAPONS, -2, -2.0f, setting));

    //Straight Swords
    public static final Item M1213A_SHORTSWORD = registerSwordItem("m1213a_shortsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.4f, setting));
    public static final Item M1213B_SHORTSWORD = registerSwordItem("m1213b_shortsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.4f, setting));

    public static final Item M1223A_LONGSWORD = registerSwordItem("m1223a_longsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.7f, setting));
    public static final Item M1223B_LONGSWORD = registerSwordItem("m1223b_longsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.7f, setting));

    //Curved Swords
    public static final Item M1313A_CUTLASS = registerSwordItem("m1313a_cutlass",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M1313B_CUTLASS = registerSwordItem("m1313b_cutlass",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M1323A_SCIMITAR = registerSwordItem("m1323a_scimitar",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M1323B_SCIMITAR = registerSwordItem("m1323b_scimitar",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Katana
    public static final Item M1413A_NINJATO = registerSwordItem("m1413a_ninjato",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M1413B_NINJATO = registerSwordItem("m1413b_ninjato",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M1423A_UCHIGATANA = registerSwordItem("m1423a_uchigatana",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M1423B_UCHIGATANA = registerSwordItem("m1423b_uchigatana",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Great Slashers
    public static final Item M1513A_GREATSWORD = registerSwordItem("m1513a_greatsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -3.0f, setting));
    public static final Item M1513B_GREATSWORD = registerSwordItem("m1513b_greatsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -3.0f, setting));

    public static final Item M1523A_GROSSMESSER = registerSwordItem("m1523a_grossmesser",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M1523B_GROSSMESSER = registerSwordItem("m1523b_grossmesser",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    //Slashing Polearms
    public static final Item M1613A_GLAIVE = registerSwordItem("m1613a_glaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M1613B_GLAIVE = registerSwordItem("m1613b_glaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    public static final Item M1623A_NAGAMAKI = registerSwordItem("m1623a_nagamaki",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M1623B_NAGAMAKI = registerSwordItem("m1623b_nagamaki",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    //Piercing Weapons
    //Short Piercers
    public static final Item M2113A_CLAW = registerSwordItem("m2113a_claw",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M2113B_CLAW = registerSwordItem("m2113b_claw",
            setting -> new DualWieldingSwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M2123A_HATCHET = registerSwordItem("m2123a_hatchet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M2123B_HATCHET = registerSwordItem("m2123b_hatchet",
            setting -> new DualWieldingSwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    //Thrusting Swords
    public static final Item M2213A_SAI = registerSwordItem("m2213a_sai",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M2213B_SAI = registerSwordItem("m2213b_sai",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M2223A_RAPIER = registerSwordItem("m2223a_rapier",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M2223B_RAPIER = registerSwordItem("m2223b_rapier",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Reapers
    public static final Item M2313A_SICKLE = registerSwordItem("m2313a_sickle",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M2313B_SICKLE = registerSwordItem("m2313b_sickle",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M2323A_HOOKSWORD = registerSwordItem("m2323a_hooksword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M2323B_HOOKSWORD = registerSwordItem("m2323b_hooksword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Axes
    public static final Item M2413A_LABRYS = registerSwordItem("m2413a_labrys",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M2413B_LABRYS = registerSwordItem("m2413b_labrys",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M2423A_WARAXE = registerSwordItem("m2423a_waraxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M2423B_WARAXE = registerSwordItem("m2423b_waraxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Great Piercers
    public static final Item M2513A_SCYTHE = registerSwordItem("m2513a_sythe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M2513B_SCYTHE = registerSwordItem("m2513b_sythe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M2523A_BATTLEAXE = registerSwordItem("m2523a_battleaxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M2523B_BATTLEAXE = registerSwordItem("m2523b_battleaxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    //Piercing Polearms
    public static final Item M2613A_SPEAR = registerSwordItem("m2613a_spear",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M2613B_SPEAR = registerSwordItem("m2613b_spear",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    public static final Item M2623A_HALBERD = registerSwordItem("m2623a_halberd",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M2623B_HALBERD = registerSwordItem("m2623b_halberd",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    //Bludgeoning Weapons
    //Fists
    public static final Item M3113A_TONFA = registerSwordItem("m3113a_tonfa",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M3113B_TONFA = registerSwordItem("m3113b_tonfa",
            setting -> new DualWieldingSwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M3123A_GAUNTLET = registerSwordItem("m3123a_gauntlet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M3123B_GAUNTLET = registerSwordItem("m3123b_gauntlet",
            setting -> new DualWieldingSwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    //Clubs
    public static final Item M3213A_JITTE = registerSwordItem("m3213a_jitte",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M3213B_JITTE = registerSwordItem("m3213b_jitte",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M3223A_WARCLUB = registerSwordItem("m3223a_warclub",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M3223B_WARCLUB = registerSwordItem("m3223b_warclub",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Maces
    public static final Item M3313A_MACE = registerSwordItem("m3313a_mace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M3313B_MACE = registerSwordItem("m3313b_mace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M3323A_WARMACE = registerSwordItem("m3323a_warmace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M3323B_WARMACE = registerSwordItem("m3323b_warmace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Hammers
    public static final Item M3413A_HAMMER = registerSwordItem("m3413a_hammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M3413B_HAMMER = registerSwordItem("m3413b_hammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M3423A_WARHAMMER = registerSwordItem("m3423a_warhammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M3423B_WARHAMMER = registerSwordItem("m3423b_warhammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));


    //Great Bludgeons
    public static final Item M3513A_KANABO = registerSwordItem("m3513a_kanabo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M3513B_KANABO = registerSwordItem("m3513b_kanabo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M3523A_MAUL = registerSwordItem("m3523a_maul",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M3523B_MAUL = registerSwordItem("m3523b_maul",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    //Bludgeoning Polearms
    public static final Item M3613A_STAFF = registerSwordItem("m3613a_staff",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M3613B_STAFF = registerSwordItem("m3613b_staff",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    public static final Item M3623A_LUCERNE = registerSwordItem("m3623a_lucerne",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M3623B_LUCERNE = registerSwordItem("m3623b_lucerne",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));


    //Unique Weapons
    //Chakrams
    public static final Item M4113A_CHAKRAM = registerSwordItem("m4113a_chakram",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M4113B_CHAKRAM = registerSwordItem("m4113b_chakram",
            setting -> new DualWieldingSwordItem(ModToolMaterials.IRON_WEAPONS, -2, -3.2f, setting));


    //Poles
    public static final Item M4213A_TWINGLAIVE = registerSwordItem("m4213a_twinglaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));
    public static final Item M4213B_TWINGLAIVE = registerSwordItem("m4213b_twinglaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));

    public static final Item M4223A_BO = registerSwordItem("m4223a_bo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));
    public static final Item M4223B_BO = registerSwordItem("m4223b_bo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));


    private static void customModIngredients(FabricItemGroupEntries entries) {
    }
    private static void customModWeapons(FabricItemGroupEntries entries) {
        //Slashing Weapons
        //Daggers
        entries.add(M1113A_DAGGER);

        entries.add(M1123A_FANG);

        //Straight Swords
        entries.add(M1213A_SHORTSWORD);

        entries.add(M1223A_LONGSWORD);

        //Curved Swords
        entries.add(M1313A_CUTLASS);

        entries.add(M1323A_SCIMITAR);

        //Katana
        entries.add(M1413A_NINJATO);

        entries.add(M1423A_UCHIGATANA);

        //Great Slashers
        entries.add(M1513A_GREATSWORD);

        entries.add(M1523A_GROSSMESSER);

        //Slashing Polearms
        entries.add(M1613A_GLAIVE);

        entries.add(M1623A_NAGAMAKI);

        //Piercing Weapons
        //Short Piercers
        entries.add(M2113A_CLAW);

        entries.add(M2123A_HATCHET);

        //Thrusting Swords
        entries.add(M2213A_SAI);

        entries.add(M2223A_RAPIER);

        //Reapers
        entries.add(M2313A_SICKLE);

        entries.add(M2323A_HOOKSWORD);

        //Axes
        entries.add(M2413A_LABRYS);

        entries.add(M2423A_WARAXE);

        //Great Piercers
        entries.add(M2513A_SCYTHE);

        entries.add(M2523A_BATTLEAXE);

        //Slashing Polearms
        entries.add(M2613A_SPEAR);

        entries.add(M2623A_HALBERD);

        //Bludgeoning Weapons
        //Fists
        entries.add(M3113A_TONFA);

        entries.add(M3123A_GAUNTLET);

        //Clubs
        entries.add(M3213A_JITTE);

        entries.add(M3223A_WARCLUB);

        //Maces
        entries.add(M3313A_MACE);

        entries.add(M3323A_WARMACE);

        //Hammers
        entries.add(M3413A_HAMMER);

        entries.add(M3423A_WARHAMMER);

        //Great Bludgeons
        entries.add(M3513A_KANABO);

        entries.add(M3523A_MAUL);

        //Bludgeoning Polearms
        entries.add(M3613A_STAFF);

        entries.add(M3623A_LUCERNE);

        //Unique Weapons
        //Chakrams
        entries.add(M4113A_CHAKRAM);

        //Poles
        entries.add(M4213A_TWINGLAIVE);

        entries.add(M4223A_BO);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WeaponsOfWar.MOD_ID, name), item);
    }
    private static Item registerSwordItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(WeaponsOfWar.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WeaponsOfWar.MOD_ID, name)))));
    }
    public static void  registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS). register(ModItems::customModIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT). register(ModItems::customModWeapons);
    }
}