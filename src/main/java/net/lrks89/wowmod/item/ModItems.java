package net.lrks89.wowmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lrks89.wowmod.WeaponsOfWar;
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
    public static final Item M1113A_DAGGER = registerItem("m1113a_dagger",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M1113B_DAGGER = registerItem("m1113b_dagger",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M1123A_FANG = registerItem("m1123a_fang",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M1123B_FANG = registerItem("m1123b_fang",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    //Straight Swords
    public static final Item M1213A_SHORTSWORD = registerItem("m1213a_shortsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M1213B_SHORTSWORD = registerItem("m1213b_shortsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M1223A_LONGSWORD = registerItem("m1223a_longsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M1223B_LONGSWORD = registerItem("m1223b_longsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Curved Swords
    public static final Item M1313A_CUTLASS = registerItem("m1313a_cutlass",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M1313B_CUTLASS = registerItem("m1313b_cutlass",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M1323A_SCIMITAR = registerItem("m1323a_scimitar",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M1323B_SCIMITAR = registerItem("m1323b_scimitar",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Katana
    public static final Item M1413A_NINJATO = registerItem("m1413a_ninjato",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M1413B_NINJATO = registerItem("m1413b_ninjato",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M1423A_UCHIGATANA = registerItem("m1423a_uchigatana",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M1423B_UCHIGATANA = registerItem("m1423b_uchigatana",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Great Slashers
    public static final Item M1513A_GREATSWORD = registerItem("m1513a_greatsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M1513B_GREATSWORD = registerItem("m1513b_greatsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M1523A_GROSSMESSER = registerItem("m1523a_grossmesser",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M1523B_GROSSMESSER = registerItem("m1523b_grossmesser",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    //Slashing Polearms
    public static final Item M1613A_GLAIVE = registerItem("m1613a_glaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M1613B_GLAIVE = registerItem("m1613b_glaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    public static final Item M1623A_NAGAMAKI = registerItem("m1623a_nagamaki",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M1623B_NAGAMAKI = registerItem("m1623b_nagamaki",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    //Piercing Weapons
    //Short Piercers
    public static final Item M2113A_CLAW = registerItem("m2113a_claw",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M2113B_CLAW = registerItem("m2113b_claw",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M2123A_HATCHET = registerItem("m2123a_hatchet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M2123B_HATCHET = registerItem("m2123b_hatchet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    //Thrusting Swords
    public static final Item M2213A_SAI = registerItem("m2213a_sai",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M2213B_SAI = registerItem("m2213b_sai",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M2223A_RAPIER = registerItem("m2223a_rapier",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M2223B_RAPIER = registerItem("m2223b_rapier",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Reapers
    public static final Item M2313A_SICKLE = registerItem("m2313a_sickle",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M2313B_SICKLE = registerItem("m2313b_sickle",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M2323A_HOOKSWORD = registerItem("m2323a_hooksword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M2323B_HOOKSWORD = registerItem("m2323b_hooksword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Axes
    public static final Item M2413A_LABRYS = registerItem("m2413a_labrys",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M2413B_LABRYS = registerItem("m2413b_labrys",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M2423A_WARAXE = registerItem("m2423a_waraxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M2423B_WARAXE = registerItem("m2423b_waraxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Great Piercers
    public static final Item M2513A_SCYTHE = registerItem("m2513a_sythe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M2513B_SCYTHE = registerItem("m2513b_sythe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M2523A_BATTLEAXE = registerItem("m2523a_battleaxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M2523B_BATTLEAXE = registerItem("m2523b_battleaxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    //Piercing Polearms
    public static final Item M2613A_SPEAR = registerItem("m2613a_spear",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M2613B_SPEAR = registerItem("m2613b_spear",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    public static final Item M2623A_HALBERD = registerItem("m2623a_halberd",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M2623B_HALBERD = registerItem("m2623b_halberd",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    //Bludgeoning Weapons
    //Fists
    public static final Item M3113A_TONFA = registerItem("m3113a_tonfa",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M3113B_TONFA = registerItem("m3113b_tonfa",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M3123A_GAUNTLET = registerItem("m3123a_gauntlet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M3123B_GAUNTLET = registerItem("m3123b_gauntlet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    //Clubs
    public static final Item M3213A_JITTE = registerItem("m3213a_jitte",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M3213B_JITTE = registerItem("m3213b_jitte",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M3223A_WARCLUB = registerItem("m3223a_warclub",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M3223B_WARCLUB = registerItem("m3223b_warclub",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Maces
    public static final Item M3313A_MACE = registerItem("m3313a_mace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M3313B_MACE = registerItem("m3313b_mace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M3323A_WARMACE = registerItem("m3323a_warmace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M3323B_WARMACE = registerItem("m3323b_warmace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    //Hammers
    public static final Item M3413A_HAMMER = registerItem("m3413a_hammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M3413B_HAMMER = registerItem("m3413b_hammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M3423A_WARHAMMER = registerItem("m3423a_warhammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M3423B_WARHAMMER = registerItem("m3423b_warhammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));


    //Great Bludgeons
    public static final Item M3513A_KANABO = registerItem("m3513a_kanabo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M3513B_KANABO = registerItem("m3513b_kanabo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M3523A_MAUL = registerItem("m3523a_maul",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M3523B_MAUL = registerItem("m3523b_maul",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    //Bludgeoning Polearms
    public static final Item M3613A_STAFF = registerItem("m3613a_staff",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M3613B_STAFF = registerItem("m3613b_staff",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));

    public static final Item M3623A_LUCERNE = registerItem("m3623a_lucerne",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));
    public static final Item M3623B_LUCERNE = registerItem("m3623b_lucerne",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.6f, setting));


    //Unique Weapons
    //Chakrams
    public static final Item M4113A_CHAKRAM = registerItem("m4113a_chakram",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -3.2f, setting));
    public static final Item M4113B_CHAKRAM = registerItem("m4113b_chakram",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -3.2f, setting));


    //Poles
    public static final Item M4213A_TWINGLAIVE = registerItem("m4213a_twinglaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));
    public static final Item M4213B_TWINGLAIVE = registerItem("m4213b_twinglaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));

    public static final Item M4223A_BO = registerItem("m4223a_bo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));
    public static final Item M4223B_BO = registerItem("m4223b_bo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));


    private static void customModIngredients(FabricItemGroupEntries entries) {
    }
    private static void customModWeapons(FabricItemGroupEntries entries) {
        //Slashing Weapons
        //Daggers
        entries.add(M1113A_DAGGER);
        entries.add(M1113B_DAGGER);

        entries.add(M1123A_FANG);
        entries.add(M1123B_FANG);

        //Straight Swords
        entries.add(M1213A_SHORTSWORD);
        entries.add(M1213B_SHORTSWORD);

        entries.add(M1223A_LONGSWORD);
        entries.add(M1223B_LONGSWORD);

        //Curved Swords
        entries.add(M1313A_CUTLASS);
        entries.add(M1313B_CUTLASS);

        entries.add(M1323A_SCIMITAR);
        entries.add(M1323B_SCIMITAR);

        //Katana
        entries.add(M1413A_NINJATO);
        entries.add(M1413B_NINJATO);

        entries.add(M1423A_UCHIGATANA);
        entries.add(M1423B_UCHIGATANA);

        //Great Slashers
        entries.add(M1513A_GREATSWORD);
        entries.add(M1513B_GREATSWORD);

        entries.add(M1523A_GROSSMESSER);
        entries.add(M1523B_GROSSMESSER);

        //Slashing Polearms
        entries.add(M1613A_GLAIVE);
        entries.add(M1613B_GLAIVE);

        entries.add(M1623A_NAGAMAKI);
        entries.add(M1623B_NAGAMAKI);

        //Piercing Weapons
        //Short Piercers
        entries.add(M2113A_CLAW);
        entries.add(M2113B_CLAW);

        entries.add(M2123A_HATCHET);
        entries.add(M2123B_HATCHET);

        //Thrusting Swords
        entries.add(M2213A_SAI);
        entries.add(M2213B_SAI);

        entries.add(M2223A_RAPIER);
        entries.add(M2223B_RAPIER);

        //Reapers
        entries.add(M2313A_SICKLE);
        entries.add(M2313B_SICKLE);

        entries.add(M2323A_HOOKSWORD);
        entries.add(M2323B_HOOKSWORD);

        //Axes
        entries.add(M2413A_LABRYS);
        entries.add(M2413B_LABRYS);

        entries.add(M2423A_WARAXE);
        entries.add(M2423B_WARAXE);

        //Great Piercers
        entries.add(M2513A_SCYTHE);
        entries.add(M2513B_SCYTHE);

        entries.add(M2523A_BATTLEAXE);
        entries.add(M2523B_BATTLEAXE);

        //Slashing Polearms
        entries.add(M2613A_SPEAR);
        entries.add(M2613B_SPEAR);

        entries.add(M2623A_HALBERD);
        entries.add(M2623B_HALBERD);

        //Bludgeoning Weapons
        //Fists
        entries.add(M3113A_TONFA);
        entries.add(M3113B_TONFA);

        entries.add(M3123A_GAUNTLET);
        entries.add(M3123B_GAUNTLET);

        //Clubs
        entries.add(M3213A_JITTE);
        entries.add(M3213B_JITTE);

        entries.add(M3223A_WARCLUB);
        entries.add(M3223B_WARCLUB);

        //Maces
        entries.add(M3313A_MACE);
        entries.add(M3313B_MACE);

        entries.add(M3323A_WARMACE);
        entries.add(M3323B_WARMACE);

        //Hammers
        entries.add(M3413A_HAMMER);
        entries.add(M3413B_HAMMER);

        entries.add(M3423A_WARHAMMER);
        entries.add(M3423B_WARHAMMER);

        //Great Bludgeons
        entries.add(M3513A_KANABO);
        entries.add(M3513B_KANABO);

        entries.add(M3523A_MAUL);
        entries.add(M3523B_MAUL);

        //Bludgeoning Polearms
        entries.add(M3613A_STAFF);
        entries.add(M3613B_STAFF);

        entries.add(M3623A_LUCERNE);
        entries.add(M3623B_LUCERNE);

        //Unique Weapons
        //Chakrams
        entries.add(M4113A_CHAKRAM);
        entries.add(M4113B_CHAKRAM);

        //Poles
        entries.add(M4213A_TWINGLAIVE);
        entries.add(M4213B_TWINGLAIVE);

        entries.add(M4223A_BO);
        entries.add(M4223B_BO);
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