package net.lrks89.wowmod.interfaces;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public interface PersistentDualWieldData {
    ItemStack getOffhandCache();
    void setOffhandCache(ItemStack stack);
    boolean isDualWieldingActive();
    void setDualWieldingActive(boolean active);
}
