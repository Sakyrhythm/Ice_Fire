package com.sakyrhythm.ice_fire.item;

import com.sakyrhythm.ice_fire.entity.custom.BulletEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Predicate;

public class GunItem extends RangedWeaponItem {

	public GunItem(Settings settings) {
		super(settings);
	}

	@Override
	public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
		if (user instanceof PlayerEntity playerEntity) {
			ItemStack itemStack = playerEntity.getProjectileType(stack);
			if (!itemStack.isEmpty()) {
				int i = this.getMaxUseTime(stack, user) - remainingUseTicks;
				float f = getPullProgress(i);
				if (!((double)f < 0.1)) {
					List<ItemStack> list = load(stack, itemStack, playerEntity);
					if (world instanceof ServerWorld serverWorld && !list.isEmpty()) {
						this.shootAll(serverWorld, playerEntity, playerEntity.getActiveHand(), stack, list, f * 9.0F, 1.0F, f == 1.0F, null);
					}

					world.playSound(
							null,
							playerEntity.getX(),
							playerEntity.getY(),
							playerEntity.getZ(),
							SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT,
							SoundCategory.PLAYERS,
							1.0F,
							1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F
					);
					world.playSound(
							null,
							playerEntity.getX(),
							playerEntity.getY(),
							playerEntity.getZ(),
							SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER,
							SoundCategory.PLAYERS,
							1.0F,
							1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F
					);
				}
			}
		}
	}
	protected void shootAll(
			ServerWorld world,
			LivingEntity shooter,
			Hand hand,
			ItemStack stack,
			List<ItemStack> projectiles,
			float speed,
			float divergence,
			boolean critical,
			@Nullable LivingEntity target
	) {
		float f = EnchantmentHelper.getProjectileSpread(world, stack, shooter, 0.0F);
		float g = projectiles.size() == 1 ? 0.0F : 2.0F * f / (float)(projectiles.size() - 1);
		float h = (float)((projectiles.size() - 1) % 2) * g / 2.0F;
		float i = 1.0F;

		for (int j = 0; j < projectiles.size(); j++) {
			ItemStack itemStack = (ItemStack)projectiles.get(j);
			if (!itemStack.isEmpty()) {
				float k = h + i * (float)((j + 1) / 2) * g;
				i = -i;
				ProjectileEntity projectileEntity = this.createArrowEntity(world, shooter, stack, itemStack, critical);

				this.shoot(shooter, projectileEntity, j, speed, divergence, k, target);
				world.spawnEntity(projectileEntity);
				stack.damage(this.getWeaponStackDamage(itemStack), shooter, LivingEntity.getSlotForHand(hand));
				if (stack.isEmpty()) {
					break;
				}
			}
		}
	}
	@Override
	protected ProjectileEntity createArrowEntity(World world, LivingEntity shooter, ItemStack bowStack, ItemStack arrowStack, boolean critical) {
		BulletEntity bulletEntity = new BulletEntity(world, shooter);
		if (arrowStack.getItem() instanceof BulletItem) {
			// 如果有需要，可以在这里设置子弹的一些属性，例如速度、伤害等
			// 设置发射者
			bulletEntity.setOwner(shooter);
			// 其他初始化代码...
		}
		return bulletEntity;
	}

	@Override
	protected void shoot(LivingEntity shooter, ProjectileEntity projectile, int index, float speed, float divergence, float yaw, @Nullable LivingEntity target) {
		projectile.setVelocity(shooter, shooter.getPitch(), shooter.getYaw() + yaw, 0.0F, speed, divergence);
	}

	public static float getPullProgress(int useTicks) {
		return 1.0F;
	}

	@Override
	public int getMaxUseTime(ItemStack stack, LivingEntity user) {
		return 72000;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack itemStack = user.getStackInHand(hand);
		boolean bl = !user.getProjectileType(itemStack).isEmpty();
		if (!user.isInCreativeMode() && !bl) {
			return TypedActionResult.fail(itemStack);
		} else {
			user.setCurrentHand(hand);
			return TypedActionResult.consume(itemStack);
		}
	}

	@Override
	public Predicate<ItemStack> getProjectiles() {
		return stack -> stack.getItem() instanceof BulletItem;
	}

	@Override
	public int getRange() {
		return 15;
	}
}