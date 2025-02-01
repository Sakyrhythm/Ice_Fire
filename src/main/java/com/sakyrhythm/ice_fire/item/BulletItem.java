package com.sakyrhythm.ice_fire.item;

import com.sakyrhythm.ice_fire.entity.custom.BulletEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BulletItem extends Item implements ProjectileItem {
	public BulletItem(Item.Settings settings) {
		super(settings);
	}

	@Override
	public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
		BulletEntity arrowEntity = new BulletEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack.copyWithCount(1), null);
		arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
		return arrowEntity;
	}
}
