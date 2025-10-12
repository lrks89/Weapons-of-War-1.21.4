package net.lrks89.wowmod.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(ScreenHandler.class)
public class OffhandSlotInteractionMixin {

    @Inject(method = "onSlotClick", at = @At("HEAD"), cancellable = true)
    private void onSlotClick(int slotIndex, int button, SlotActionType actionType, PlayerEntity player, CallbackInfo ci) {
        if (player.getStackInHand(Hand.MAIN_HAND).getItem() instanceof DualWieldingSwordItem) {
            int offhandSlotIndex = 45;
            if (slotIndex == offhandSlotIndex) {
                ci.cancel();
            }
        }
    }
}