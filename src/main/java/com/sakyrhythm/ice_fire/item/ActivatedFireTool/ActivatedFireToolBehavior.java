package com.sakyrhythm.ice_fire.item.ActivatedFireTool;

import com.sakyrhythm.ice_fire.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.List;

public interface ActivatedFireToolBehavior {
    List<Item> ACTIVATED_FIRE_TOOL_LIST = List.of(
            ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_AXE,
            ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_HOE,
            ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_PICKAXE,
            ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_SWORD,
            ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_SHOVEL,
            ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD
    );

    // 定义一个方法，用于在攻击后处理燃烧效果
    static boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            ItemStack mainHandStack = player.getMainHandStack();
            if(ACTIVATED_FIRE_TOOL_LIST.contains(mainHandStack.getItem())) {
                target.setOnFireFor(5); // 设置燃烧效果持续5秒
                RegistryEntry<StatusEffect> blindnessEffect = StatusEffects.BLINDNESS;
                // 给目标实体添加失明效果
                giveEffect(target, blindnessEffect, 100, 2);
                return true;
            }
        }
        return false;
    }
    static void giveEffect(LivingEntity target, RegistryEntry<StatusEffect> effect, int duration, int amplifier){
        StatusEffectInstance instance = new StatusEffectInstance(effect,duration,amplifier);
        target.addStatusEffect(instance);
    }
}
