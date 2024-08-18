package com.sakyrhythm.ice_fire.item.ActivatedFireTool;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FireAxeEntity extends net.minecraft.entity.projectile.TridentEntity {
    public FireAxeEntity(EntityType<FireAxeEntity> entityType, World world) {
        super(entityType, world);
    }

    public FireAxeEntity(World world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
    }

    public FireAxeEntity(World world, double x, double y, double z, ItemStack stack) {
        super(world, x, y, z, stack);
    }

}
