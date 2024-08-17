package com.sakyrhythm.ice_fire.item.ActivatedFireTool;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TridentEntity extends net.minecraft.entity.projectile.TridentEntity {
    public TridentEntity(EntityType<? extends net.minecraft.entity.projectile.TridentEntity> entityType, World world) {
        super(entityType, world);
    }

    public TridentEntity(World world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
    }

    public TridentEntity(World world, double x, double y, double z, ItemStack stack) {
        super(world, x, y, z, stack);
    }
}
