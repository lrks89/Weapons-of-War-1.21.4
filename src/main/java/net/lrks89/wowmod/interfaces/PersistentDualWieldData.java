package net.lrks89.wowmod.interfaces;

import net.minecraft.item.ItemStack;

public interface PersistentDualWieldData {
    ItemStack getOffhandCache();
    void setOffhandCache(ItemStack stack);
}
