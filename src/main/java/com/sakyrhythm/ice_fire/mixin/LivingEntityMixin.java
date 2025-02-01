package com.sakyrhythm.ice_fire.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow private int hurtTime;

    @Inject(method = "tick", at = @At("HEAD"))
    private void removeHurtCooldown(CallbackInfo ci) {
        this.hurtTime = 0; // 将受击时间清零，取消无敌时间
    }
}