package net.lrks89.wowmod.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//DualWield Mechanic: Prevents player from moving cloned offhand item from inventory
@Environment(EnvType.CLIENT)
@Mixin(ScreenHandler.class)
public class DualWieldOffhandClickMixin {

    @Inject(method = "onSlotClick", at = @At("HEAD"), cancellable = true)
    private void onSlotClick(int slotIndex, int button, net.minecraft.screen.slot.SlotActionType actionType, PlayerEntity player, CallbackInfo ci) {
        // Correctly cast 'this' to the target type
        ScreenHandler screenHandler = (ScreenHandler) (Object) this;

        // Ensure we are in the player's personal inventory screen
        if (screenHandler instanceof PlayerScreenHandler) {
            // Check for your dual-wielding conditions
            ItemStack mainHandStack = player.getStackInHand(Hand.MAIN_HAND);
            ItemStack offHandStack = player.getStackInHand(Hand.OFF_HAND);

            if (mainHandStack.getItem() instanceof DualWieldingSwordItem && offHandStack.getItem() instanceof DualWieldingSwordItem) {
                // Get the offhand slot from the player's screen handler
                Slot offhandSlot = screenHandler.getSlot(45);

                // Check if the clicked slot index matches the offhand slot's index
                if (slotIndex == offhandSlot.id) {
                    // Prevent the item from being placed
                    ci.cancel();
                }

                // Check for a quick-move action (shift-click)
                if (actionType == net.minecraft.screen.slot.SlotActionType.QUICK_MOVE) {
                    // Get the itemstack in the offhand slot
                    ItemStack stackInOffhand = offhandSlot.getStack();
                    // Check if the quick-moved item is the dual-wielding sword in the offhand
                    if (!stackInOffhand.isEmpty() && stackInOffhand.getItem() instanceof DualWieldingSwordItem) {
                        // Prevent the item from being shift-clicked out
                        ci.cancel();
                    }
                }
            }
        }
    }
}
