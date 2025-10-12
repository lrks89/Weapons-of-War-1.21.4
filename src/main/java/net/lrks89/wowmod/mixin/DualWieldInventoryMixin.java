package net.lrks89.wowmod.mixin;

import net.lrks89.wowmod.interfaces.PersistentDualWieldData;
import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//DualWield Mechanic: Basic Logic
@Mixin(PlayerInventory.class)
public abstract class DualWieldInventoryMixin {

    @Shadow public PlayerEntity player;

    @Inject(method = "updateItems", at = @At("HEAD"))
    private void onUpdateItems(CallbackInfo info) {
        ItemStack mainHandStack = player.getStackInHand(Hand.MAIN_HAND);
        ItemStack offhandStack = player.getStackInHand(Hand.OFF_HAND);
        PersistentDualWieldData data = (PersistentDualWieldData) player;

        boolean shouldDualWield = mainHandStack.getItem() instanceof DualWieldingSwordItem;

        if (shouldDualWield) {
            // Check if dual-wielding is becoming active
            if (!data.isDualWieldingActive()) {
                if (data.getOffhandCache().isEmpty()) {
                    data.setOffhandCache(offhandStack.copy());
                }
                data.setDualWieldingActive(true);
            }
            player.setStackInHand(Hand.OFF_HAND, mainHandStack.copy());

        } else {
            // Check if dual-wielding was active and has now stopped
            if (data.isDualWieldingActive()) {
                ItemStack cachedItem = data.getOffhandCache();
                if (!cachedItem.isEmpty()) {
                    player.setStackInHand(Hand.OFF_HAND, cachedItem.copy());
                    data.setOffhandCache(ItemStack.EMPTY);
                } else {
                    player.setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY);
                }
                data.setDualWieldingActive(false);
            }
        }
    }
}