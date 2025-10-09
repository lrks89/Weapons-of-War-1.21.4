package net.lrks89.wowmod.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.lrks89.wowmod.item.ModItems;
import net.lrks89.wowmod.payload.AltStancePayload;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_WEAPON_ALT = "key.category.wowmod.weapon.alt";
    public static final String ALT_STANCE_KEY = "key.wowmod.weapon.alt";

    public static KeyBinding altStanceKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (altStanceKey.wasPressed()) {
                if (client.player != null) {
                    ItemStack mainHandStack = client.player.getMainHandStack();
                    //Longsword
                    if (mainHandStack.getItem() == ModItems.M1113A_DAGGER) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1113B_DAGGER) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    //TEST
                    if (!mainHandStack.isEmpty()) {
                        Text message = Text.of("You are holding: " + mainHandStack.getName().getString());
                        client.player.sendMessage(message, false);
                    } else {
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
