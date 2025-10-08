package net.lrks89.wowmod;

import net.fabricmc.api.ModInitializer;
import net.lrks89.wowmod.item.ModItemGroups;
import net.lrks89.wowmod.item.ModItems;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponsOfWar implements ModInitializer {
	public static final String MOD_ID = "wowmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Identifier ALT_STANCE_KEY = Identifier.of("wowmod", "alt_stance_key");

	@Override
	public void onInitialize() {
        ModItemGroups.initialize();
        ModItems.registerModItems();


    }
}
