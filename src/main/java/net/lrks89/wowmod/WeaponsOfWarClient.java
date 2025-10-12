package net.lrks89.wowmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.lrks89.wowmod.event.KeyInputHandler;
import net.minecraft.util.Hand;

public class WeaponsOfWarClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}