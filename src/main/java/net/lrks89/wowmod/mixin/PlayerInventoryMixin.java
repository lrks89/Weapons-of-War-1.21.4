package net.lrks89.wowmod.mixin;

import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerInventory.class)
public abstract class PlayerInventoryMixin {

    @Shadow public PlayerEntity player;
    @Unique private ItemStack offhandCache = ItemStack.EMPTY;
    @Unique private boolean hasCachedItem = false;
    @Unique private boolean isDualWieldingActive = false;

    @Inject(method = "updateItems", at = @At("HEAD"))
    private void onUpdateItems(CallbackInfo info) {
        ItemStack mainHandStack = player.getStackInHand(Hand.MAIN_HAND);
        ItemStack offhandStack = player.getStackInHand(Hand.OFF_HAND);

        if (mainHandStack.getItem() instanceof DualWieldingSwordItem) {
            if (!(offhandStack.getItem() instanceof DualWieldingSwordItem)) {
                offhandCache = offhandStack.copy(); // Store the item to be "lost"
                hasCachedItem = true;
                player.setStackInHand(Hand.OFF_HAND, mainHandStack.copy());
            }

            if (!isDualWieldingActive) {
                isDualWieldingActive = true;
            }
        } else if (isDualWieldingActive) {
            if (hasCachedItem) {
                player.setStackInHand(Hand.OFF_HAND, offhandCache.copy());
                offhandCache = ItemStack.EMPTY;
                hasCachedItem = false;
            } else {
                player.setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY);
            }
            isDualWieldingActive = false;
        }

        ScreenHandler currentScreenHandler = player.currentScreenHandler;
        if (currentScreenHandler != null) {
            ItemStack cursorStack = currentScreenHandler.getCursorStack();
            if (cursorStack.getItem() instanceof DualWieldingSwordItem && mainHandStack.getItem() instanceof DualWieldingSwordItem) {
                currentScreenHandler.setCursorStack(ItemStack.EMPTY);
            }
        }
    }
}