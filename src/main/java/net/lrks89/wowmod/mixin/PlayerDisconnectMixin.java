package net.lrks89.wowmod.mixin;

import net.lrks89.wowmod.item.custom.DualWieldingSwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//DualWield Mechanic: Prevents cached items vanishing when disconnecting from server
@Mixin(ServerPlayerEntity.class)
public class PlayerDisconnectMixin {

    @Inject(method = "onDisconnect", at = @At("HEAD"))
    private void onDisconnect(CallbackInfo ci) {
        ServerPlayerEntity player = (ServerPlayerEntity) (Object) this;
        ItemStack mainHandStack = player.getStackInHand(Hand.MAIN_HAND);
        ItemStack offhandStack = player.getStackInHand(Hand.OFF_HAND);

        // If the player is dual-wielding and logging out, remove the clone.
        if (mainHandStack.getItem() instanceof DualWieldingSwordItem && offhandStack.getItem() instanceof DualWieldingSwordItem) {
            player.setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY);
        }
    }
}
