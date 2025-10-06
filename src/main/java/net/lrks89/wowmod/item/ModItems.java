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
    public static final Item M11113_DAGGER = registerItem("11113_dagger",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M11213_FANG = registerItem("11213_fang",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M11313_KUNAI = registerItem("11313_kunai",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M12113_SHORTSWORD = registerItem("12113_shortsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M12213_CUTLASS = registerItem("12213_cutlass",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M12313_NINJATO = registerItem("12313_ninjato",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M13113_LONGSWORD = registerItem("13113_longsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M13213_SCIMITAR = registerItem("13213_scimitar",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M13313_UCHIGATANA = registerItem("13313_uchigatana",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    public static final Item M14113_GREATSWORD = registerItem("14113_greatsword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M14213_GROSSMESSER = registerItem("14213_grossmesser",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M14313_NODACHI = registerItem("14313_nodachi",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M15113_GLAIVE = registerItem("15113_glaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.4f, setting));
    public static final Item M15213_NAGAMAKI = registerItem("15213_nagamaki",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.4f, setting));

    //Piercing Weapons
    public static final Item M21113_CLAW = registerItem("21113_claw",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M21213_KAMA = registerItem("21213_kama",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M21313_HATCHET = registerItem("21313_hatchet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M22113_SAI = registerItem("22113_sai",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M22213_SICKLE = registerItem("22213_sickle",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M22313_LABRYS = registerItem("22313_labrys",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M23113_RAPIER = registerItem("23113_rapier",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M23213_HOOKSWORD = registerItem("23213_hooksword",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M23313_WARAXE = registerItem("23313_waraxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    public static final Item M24113_ESTOC = registerItem("24113_estoc",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M24213_SCYTHE = registerItem("24213_sythe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M24313_BATTLEAXE = registerItem("24313_battleaxe",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M25113_SPEAR = registerItem("25113_spear",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.4f, setting));
    public static final Item M25213_HALBERD = registerItem("25213_halberd",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.4f, setting));

    //Blugeoning Weapons
    public static final Item M31113_TONFA = registerItem("31113_tonfa",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M31213_KNUCKLE = registerItem("31213_knuckle",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M31313_GAUNTLET = registerItem("31313_gauntlet",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M32113_JITTE = registerItem("32113_jitte",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M32213_MACE = registerItem("32213_mace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));
    public static final Item M32313_HAMMER = registerItem("32313_hammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -1, -2.0f, setting));

    public static final Item M33113_CLUB = registerItem("33113_club",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M33213_WARMACE = registerItem("33213_warmace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));
    public static final Item M33313_WARHAMMER = registerItem("33313_warhammer",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 1, -2.4f, setting));

    public static final Item M34113_KANABO = registerItem("34113_kanabo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M34213_GREATMACE = registerItem("34213_greatmace",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));
    public static final Item M34313_MAUL = registerItem("34313_maul",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 2, -2.8f, setting));

    public static final Item M35113_STAFF = registerItem("35113_staff",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.4f, setting));
    public static final Item M35213_LUCERNE = registerItem("35213_lucerne",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.4f, setting));

    //Blugeoning Weapons
    public static final Item M41113_CHAKRAM = registerItem("41113_chakram",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M41213_SHURIKEN = registerItem("41213_shuriken",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));
    public static final Item M41313_BOOMERANG = registerItem("41313_boomerang",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, -2, -1.6f, setting));

    public static final Item M42113_TWINGLAIVE = registerItem("42113_twinglaive",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));
    public static final Item M42213_TWINBLADE = registerItem("42213_twinblade",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));
    public static final Item M42313_BO = registerItem("42313_bo",
            setting -> new SwordItem(ModToolMaterials.IRON_WEAPONS, 0, -2.0f, setting));

    private static void customModIngredients(FabricItemGroupEntries entries) {
    }
    private static void customModWeapons(FabricItemGroupEntries entries) {
        //Slashing Weapons
        entries.add(M11113_DAGGER);
        entries.add(M11213_FANG);
        entries.add(M11313_KUNAI);

        entries.add(M12113_SHORTSWORD);
        entries.add(M12213_CUTLASS);
        entries.add(M12313_NINJATO);

        entries.add(M13113_LONGSWORD);
        entries.add(M13213_SCIMITAR);
        entries.add(M13313_UCHIGATANA);

        entries.add(M14113_GREATSWORD);
        entries.add(M14213_GROSSMESSER);
        entries.add(M14313_NODACHI);

        entries.add(M15113_GLAIVE);
        entries.add(M15213_NAGAMAKI);

        //Piercing Weapons
        entries.add(M21113_CLAW);
        entries.add(M21213_KAMA);
        entries.add(M21313_HATCHET);

        entries.add(M22113_SAI);
        entries.add(M22213_SICKLE);
        entries.add(M22313_LABRYS);

        entries.add(M23113_RAPIER);
        entries.add(M23213_HOOKSWORD);
        entries.add(M23313_WARAXE);

        entries.add(M24113_ESTOC);
        entries.add(M24213_SCYTHE);
        entries.add(M24313_BATTLEAXE);

        entries.add(M25113_SPEAR);
        entries.add(M25213_HALBERD);

        //Bludgeoning Weapons
        entries.add(M31113_TONFA);
        entries.add(M31213_KNUCKLE);
        entries.add(M31313_GAUNTLET);

        entries.add(M32113_JITTE);
        entries.add(M32213_MACE);
        entries.add(M32313_HAMMER);

        entries.add(M33113_CLUB);
        entries.add(M33213_WARMACE);
        entries.add(M33313_WARHAMMER);

        entries.add(M34113_KANABO);
        entries.add(M34213_GREATMACE);
        entries.add(M34313_MAUL);

        entries.add(M35113_STAFF);
        entries.add(M35213_LUCERNE);

        //Unique Weapons
        entries.add(M41113_CHAKRAM);
        entries.add(M41213_SHURIKEN);
        entries.add(M41313_BOOMERANG);

        entries.add(M42113_TWINGLAIVE);
        entries.add(M42213_TWINBLADE);
        entries.add(M42313_BO);
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