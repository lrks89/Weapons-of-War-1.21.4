package net.lrks89.wowmod.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_WEAPON_ALT = "key.category.wowmod.weapon.alt";
    public static final String ALT_STANCE_KEY = "key.wowmod.weapon.alt";

    public static KeyBinding altStanceKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while(altStanceKey.wasPressed()) {
                if (client.player != null) {
                    // Get the item stack in the player's main hand
                    ItemStack mainHandStack = client.player.getMainHandStack();

                    if (!mainHandStack.isEmpty()) {
                        // Display the item's name
                        Text message = Text.of("You are holding: " + mainHandStack.getName().getString());
                        client.player.sendMessage(message, false);
                    } else {
                        // Handle case where hand is empty
                        client.player.sendMessage(Text.of("Your hand is empty."), false);
                    }
                }
            }
        });
    }
    public static void register() {
        altStanceKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
           ALT_STANCE_KEY, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_G, KEY_CATEGORY_WEAPON_ALT
        ));

        registerKeyInputs();
    }
}
