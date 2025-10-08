package net.lrks89.wowmod;

import net.fabricmc.api.ClientModInitializer;
import net.lrks89.wowmod.event.KeyInputHandler;

public class WeaponsOfWarClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}