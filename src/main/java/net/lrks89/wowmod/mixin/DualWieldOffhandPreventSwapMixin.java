package net.lrks89.wowmod.mixin;

import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class DualWieldOffhandPreventSwapMixin {

    /**
     * @author YourName
     * @reason To prevent players from swapping the offhand item while dual-wielding the custom sword.
     */
    @Overwrite
    public void setStackInHand(Hand hand, ItemStack stack) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;

        // Check if the entity is a player and is dual-wielding your sword
        if (livingEntity instanceof PlayerEntity player) {
            ItemStack mainHandStack = player.getStackInHand(Hand.MAIN_HAND);
            ItemStack offHandStack = player.getStackInHand(Hand.OFF_HAND);

            if (mainHandStack.getItem() instanceof DualWieldingSwordItem && offHandStack.getItem() instanceof DualWieldingSwordItem) {
                // If the player is trying to change the item in the offhand, block it
                if (hand == Hand.OFF_HAND) {
                    // Do nothing, preventing the swap. The existing offhand item is kept.
                    return;
                }
            }
        }
        // If not dual-wielding or not the offhand, proceed with vanilla logic
        // The original method would call `equipStack` to update the inventory
        livingEntity.equipStack(
                hand == Hand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND,
                stack
        );
    }
}
