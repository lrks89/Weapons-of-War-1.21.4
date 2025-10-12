package net.lrks89.wowmod.mixin;

import net.lrks89.wowmod.interfaces.PersistentDualWieldData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtOps;
import net.minecraft.registry.RegistryOps;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//DualWield Mechanic: managed offhand cache for stored item
@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin implements PersistentDualWieldData {
    @Unique
    private ItemStack offhandCache = ItemStack.EMPTY;

    @Inject(method = "readCustomDataFromNbt", at = @At("TAIL"))
    private void readOffhandCache(NbtCompound nbt, CallbackInfo info) {
        if (nbt.contains("offhandCache")) {
            RegistryOps<NbtElement> registryOps = RegistryOps.of(NbtOps.INSTANCE, PlayerEntity.class.cast(this).getRegistryManager());
            ItemStack.CODEC.parse(registryOps, nbt.get("offhandCache"))
                    .result().ifPresent(stack -> this.offhandCache = stack);
        }
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("TAIL"))
    private void writeOffhandCache(NbtCompound nbt, CallbackInfo info) {
        if (!this.offhandCache.isEmpty()) {
            RegistryOps<NbtElement> registryOps = RegistryOps.of(NbtOps.INSTANCE, PlayerEntity.class.cast(this).getRegistryManager());
            ItemStack.CODEC.encodeStart(registryOps, this.offhandCache)
                    .result().ifPresent(itemNbt -> nbt.put("offhandCache", itemNbt));
        }
    }
    @Override
    public ItemStack getOffhandCache() {
        return this.offhandCache;
    }

    @Override
    public void setOffhandCache(ItemStack stack) {
        this.offhandCache = stack;
    }
}