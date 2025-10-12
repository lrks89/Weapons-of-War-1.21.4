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
                    //Slashing Weapons
                    //Daggers
                    if (mainHandStack.getItem() == ModItems.M1113A_DAGGER) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1113B_DAGGER) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M1123A_FANG) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1123B_FANG) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Straight Swords
                    if (mainHandStack.getItem() == ModItems.M1213A_SHORTSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1213B_SHORTSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M1223A_LONGSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1223B_LONGSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Curved Swords
                    if (mainHandStack.getItem() == ModItems.M1313A_CUTLASS) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1313B_CUTLASS) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M1323A_SCIMITAR) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1323B_SCIMITAR) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Katana
                    if (mainHandStack.getItem() == ModItems.M1413A_NINJATO) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1413B_NINJATO) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M1423A_UCHIGATANA) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1423B_UCHIGATANA) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Great Slashers
                    if (mainHandStack.getItem() == ModItems.M1513A_GREATSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1513B_GREATSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M1523A_GROSSMESSER) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1523B_GROSSMESSER) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Slashing Polearms
                    if (mainHandStack.getItem() == ModItems.M1613A_GLAIVE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1613B_GLAIVE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M1623A_NAGAMAKI) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M1623B_NAGAMAKI) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Piercing Weapons
                    //Claws
                    if (mainHandStack.getItem() == ModItems.M2113A_CLAW) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2113B_CLAW) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M2123A_HATCHET) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2123B_HATCHET) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Thrusting Swords
                    if (mainHandStack.getItem() == ModItems.M2213A_SAI) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2213B_SAI) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M2223A_RAPIER) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2223B_RAPIER) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Reapers
                    if (mainHandStack.getItem() == ModItems.M2313A_SICKLE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2313B_SICKLE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M2323A_HOOKSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2323B_HOOKSWORD) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Axes
                    if (mainHandStack.getItem() == ModItems.M2413A_LABRYS) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2413B_LABRYS) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M2423A_WARAXE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2423B_WARAXE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Great Piercers
                    if (mainHandStack.getItem() == ModItems.M2513A_SCYTHE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2513B_SCYTHE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M2523A_BATTLEAXE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2523B_BATTLEAXE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Piercing Polearms
                    if (mainHandStack.getItem() == ModItems.M2613A_SPEAR) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2613B_SPEAR) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M2623A_HALBERD) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M2623B_HALBERD) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Bludgeoning Weapons
                    //Fist
                    if (mainHandStack.getItem() == ModItems.M3113A_TONFA) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3113B_TONFA) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M3123A_GAUNTLET) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3123B_GAUNTLET) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Clubs
                    if (mainHandStack.getItem() == ModItems.M3213A_JITTE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3213B_JITTE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M3223A_WARCLUB) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3223B_WARCLUB) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Maces
                    if (mainHandStack.getItem() == ModItems.M3313A_MACE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3313B_MACE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M3323A_WARMACE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3323B_WARMACE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Hammers
                    if (mainHandStack.getItem() == ModItems.M3413A_HAMMER) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3413B_HAMMER) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M3423A_WARHAMMER) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3423B_WARHAMMER) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Great Bludgeons
                    if (mainHandStack.getItem() == ModItems.M3513A_KANABO) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3513B_KANABO) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M3523A_MAUL) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3523B_MAUL) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Bludgeoning Polearms
                    if (mainHandStack.getItem() == ModItems.M3613A_STAFF) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3613B_STAFF) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M3623A_LUCERNE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M3623B_LUCERNE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Unique Weapons
                    //Chakrams
                    if (mainHandStack.getItem() == ModItems.M4113A_CHAKRAM) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M4113B_CHAKRAM) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    //Poles
                    if (mainHandStack.getItem() == ModItems.M4213A_TWINGLAIVE) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M4213B_TWINGLAIVE) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                    if (mainHandStack.getItem() == ModItems.M4223A_BO) {
                        ClientPlayNetworking.send(new AltStancePayload());}
                    if(mainHandStack.getItem() == ModItems.M4223B_BO) {
                        ClientPlayNetworking.send(new AltStancePayload());}

                }
            }
        });
    }
    public static void register() {
        altStanceKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
           ALT_STANCE_KEY, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_R, KEY_CATEGORY_WEAPON_ALT
        ));

        registerKeyInputs();
    }
}
