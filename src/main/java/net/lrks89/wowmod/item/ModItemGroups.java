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
            .icon(() -> new ItemStack(ModItems.M13113_LONGSWORD))
            .displayName(Text.translatable("itemGroup.wowmod.weapons_of_war"))
            .entries((context, entries) -> {
                        //TEST
                        entries.add(ModItems.TEST);

                        //Slashing Weapons
                        entries.add(ModItems.M11113_DAGGER);
                        entries.add(ModItems.M11213_FANG);
                        entries.add(ModItems.M11313_KUNAI);

                        entries.add(ModItems.M12113_SHORTSWORD);
                        entries.add(ModItems.M12213_CUTLASS);
                        entries.add(ModItems.M12313_NINJATO);

                        entries.add(ModItems.M13113_LONGSWORD);
                        entries.add(ModItems.M13213_SCIMITAR);
                        entries.add(ModItems.M13313_UCHIGATANA);

                        entries.add(ModItems.M14113_GREATSWORD);
                        entries.add(ModItems.M14213_GROSSMESSER);
                        entries.add(ModItems.M14313_NODACHI);

                        entries.add(ModItems.M15113_GLAIVE);
                        entries.add(ModItems.M15213_NAGAMAKI);

                        //Piercing Weapons
                        entries.add(ModItems.M21113_CLAW);
                        entries.add(ModItems.M21213_KAMA);
                        entries.add(ModItems.M21313_HATCHET);

                        entries.add(ModItems.M22113_SAI);
                        entries.add(ModItems.M22213_SICKLE);
                        entries.add(ModItems.M22313_LABRYS);

                        entries.add(ModItems.M23113_RAPIER);
                        entries.add(ModItems.M23213_HOOKSWORD);
                        entries.add(ModItems.M23313_WARAXE);

                        entries.add(ModItems.M24113_ESTOC);
                        entries.add(ModItems.M24213_SCYTHE);
                        entries.add(ModItems.M24313_BATTLEAXE);

                        entries.add(ModItems.M25113_SPEAR);
                        entries.add(ModItems.M25213_HALBERD);

                        //Bludgeoning Weapons
                        entries.add(ModItems.M31113_TONFA);
                        entries.add(ModItems.M31213_KNUCKLE);
                        entries.add(ModItems.M31313_GAUNTLET);

                        entries.add(ModItems.M32113_JITTE);
                        entries.add(ModItems.M32213_MACE);
                        entries.add(ModItems.M32313_HAMMER);

                        entries.add(ModItems.M33113_CLUB);
                        entries.add(ModItems.M33213_WARMACE);
                        entries.add(ModItems.M33313_WARHAMMER);

                        entries.add(ModItems.M34113_KANABO);
                        entries.add(ModItems.M34213_GREATMACE);
                        entries.add(ModItems.M34313_MAUL);

                        entries.add(ModItems.M35113_STAFF);
                        entries.add(ModItems.M35213_LUCERNE);

                        //Unique Weapons
                        entries.add(ModItems.M41113_CHAKRAM);
                        entries.add(ModItems.M41213_SHURIKEN);
                        entries.add(ModItems.M41313_BOOMERANG);

                        entries.add(ModItems.M42113_TWINGLAIVE);
                        entries.add(ModItems.M42213_TWINBLADE);
                        entries.add(ModItems.M42313_BO);
                    }).build();

    public static void initialize() {
        // Since 1.21:
        Registry.register(Registries.ITEM_GROUP, Identifier.of("wowmod", "weapons_of_war"), WEAPONS_OF_WAR);
    }
}
