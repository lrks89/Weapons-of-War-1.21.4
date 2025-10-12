package net.lrks89.wowmod.mixin;

import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerInventory.class)
public class OffhandItemDropMixin {

    @Inject(method = "dropSelectedItem", at = @At("HEAD"), cancellable = true)
    private void onDrop(boolean entireStack, CallbackInfoReturnable<ItemStack> cir) {
        PlayerInventory inventory = (PlayerInventory) (Object) this;
        PlayerEntity player = inventory.player;

        ItemStack offhandStack = player.getStackInHand(Hand.OFF_HAND);
        ItemStack mainHandStack = player.getStackInHand(Hand.MAIN_HAND);

        // Check if player is dual-wielding AND the offhand item is the one to be dropped
        // The drop method is often called with the currently selected slot.
        if (mainHandStack.getItem() instanceof DualWieldingSwordItem && offhandStack.getItem() instanceof DualWieldingSwordItem) {
            // Cancel the drop if it's the dual-wielding sword in the offhand
            cir.setReturnValue(ItemStack.EMPTY);
        }
    }
}