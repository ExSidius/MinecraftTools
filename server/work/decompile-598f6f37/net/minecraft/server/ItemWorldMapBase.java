package net.minecraft.server;

public class ItemWorldMapBase extends Item {

    protected ItemWorldMapBase() {}

    public boolean f() {
        return true;
    }

    public Packet<?> a(ItemStack itemstack, World world, EntityHuman entityhuman) {
        return null;
    }
}
