package net.lrks89.wowmod.mixin;

import net.lrks89.wowmod.interfaces.PersistentDualWieldData;
import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//TEST
@Mixin(PlayerInventory.class)
public abstract class DualWieldInventoryDropMixin {

    @Shadow public PlayerEntity player;

    @Inject(method = "dropAll", at = @At("HEAD"))
    private void dropAll(CallbackInfo ci) {
        if (this.player instanceof PersistentDualWieldData) {
            PersistentDualWieldData data = (PersistentDualWieldData) this.player;

            // Check if dual-wielding is active and the offhand item is the cloned sword.
            if (data.isDualWieldingActive() && this.player.getStackInHand(Hand.OFF_HAND).getItem() instanceof DualWieldingSwordItem) {
                // Set the offhand stack to empty, so it doesn't get dropped.
                this.player.getInventory().setStack(40, ItemStack.EMPTY);
            }
        }
    }
}
