package net.lrks89.wowmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lrks89.wowmod.WeaponsOfWar;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup WEAPOMS_OF_WAR = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.M12213_LONGSWORD))
            .displayName(Text.translatable("itemGroup.wowmod.weapons_of_war"))
            .entries((context, entries) -> {
                        entries.add(ModItems.M12113_SHORTSWORD);
                        entries.add(ModItems.M12213_LONGSWORD);
                        entries.add(ModItems.M12313_GREATSWORD);
                    }).build();

    public static void initialize() {
        // Since 1.21:
        Registry.register(Registries.ITEM_GROUP, Identifier.of("wowmod", "weapons_of_war"), WEAPOMS_OF_WAR);
    }
}
