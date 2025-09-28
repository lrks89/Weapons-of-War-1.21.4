package net.lrks89.wowmod;

import net.fabricmc.api.ModInitializer;

import net.lrks89.wowmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponsOfWar implements ModInitializer {
	public static final String MOD_ID = "wowmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}