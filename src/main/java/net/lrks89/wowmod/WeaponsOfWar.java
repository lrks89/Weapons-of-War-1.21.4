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
            });
        });
    }
}