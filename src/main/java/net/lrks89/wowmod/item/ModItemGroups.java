package net.lrks89.wowmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup WEAPONS_OF_WAR = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.M1223A_LONGSWORD))
            .displayName(Text.translatable("itemGroup.wowmod.weapons_of_war"))
            .entries((context, entries) -> {
                        //Slashing Weapons
                        //Daggers
                        entries.add(ModItems.M1113A_DAGGER);
                        entries.add(ModItems.M1123A_FANG);
                        //Straight Swords
                        entries.add(ModItems.M1213A_SHORTSWORD);
                        entries.add(ModItems.M1223A_LONGSWORD);
                        //Curved Swords
                        entries.add(ModItems.M1313A_CUTLASS);
                        entries.add(ModItems.M1323A_SCIMITAR);
                        //Katana
                        entries.add(ModItems.M1413A_NINJATO);
                        entries.add(ModItems.M1423A_UCHIGATANA);
                        //Great Slashers
                        entries.add(ModItems.M1513A_GREATSWORD);
                        entries.add(ModItems.M1523A_GROSSMESSER);
                        //Slashing Polearms
                        entries.add(ModItems.M1613A_GLAIVE);
                        entries.add(ModItems.M1623A_NAGAMAKI);

                        //Piercing Weapons
                        //Short Piercers
                        entries.add(ModItems.M2113A_CLAW);
                        entries.add(ModItems.M2123A_HATCHET);
                        //Thrusting Swords
                        entries.add(ModItems.M2213A_SAI);
                        entries.add(ModItems.M2223A_RAPIER);
                        //Reapers
                        entries.add(ModItems.M2313a_SICKLE);
                        entries.add(ModItems.M2323A_HOOKSWORD);
                        //Axes
                        entries.add(ModItems.M2413A_LABRYS);
                        entries.add(ModItems.M2423A_WARAXE);
                        //Great Piercers
                        entries.add(ModItems.M2513A_SCYTHE);
                        entries.add(ModItems.M2523A_BATTLEAXE);
                        //Piercing Polearms
                        entries.add(ModItems.M2613A_SPEAR);
                        entries.add(ModItems.M2623A_HALBERD);

                        //Bludgeoning Weapons
                        //Fists
                        entries.add(ModItems.M3113A_TONFA);
                        entries.add(ModItems.M3123A_GAUNTLET);
                        //Clubs
                        entries.add(ModItems.M3213A_JITTE);
                        entries.add(ModItems.M3223A_WARCLUB);
                        //Maces
                        entries.add(ModItems.M3313A_MACE);
                        entries.add(ModItems.M3323A_WARMACE);
                        //Hammers
                        entries.add(ModItems.M3413A_HAMMER);
                        entries.add(ModItems.M3423A_WARHAMMER);
                        //Great Bludgeons
                        entries.add(ModItems.M3513A_KANABO);
                        entries.add(ModItems.M3523A_MAUL);
                        //Bludgeoning Polearms
                        entries.add(ModItems.M3613A_STAFF);
                        entries.add(ModItems.M3623A_LUCERNE);

                        //Unique Weapons
                        //Chakrams
                        entries.add(ModItems.M4113A_CHAKRAM);
                        //Poles
                        entries.add(ModItems.M4213A_TWINGLAIVE);
                        entries.add(ModItems.M4223A_BO);

                    }).build();

    public static void initialize() {
        // Since 1.21:
        Registry.register(Registries.ITEM_GROUP, Identifier.of("wowmod", "weapons_of_war"), WEAPONS_OF_WAR);
    }
}
