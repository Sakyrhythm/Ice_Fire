package com.sakyrhythm.ice_fire.item.IceTool;

import com.sakyrhythm.ice_fire.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.List;

public interface IceToolBehavior {
    final List<Item> ICE_TOOL_LIST = List.of(
            ModItems.ICE_DIAMOND_AXE,
            ModItems.ICE_DIAMOND_HOE,
            ModItems.ICE_DIAMOND_PICKAXE,
            ModItems.ICE_DIAMOND_SWORD,
            ModItems.ICE_DIAMOND_SHOVEL,
            ModItems.ICE_DIAMOND
    );

    // 定义一个方法，用于在攻击后处理扑灭效果
    static boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            ItemStack mainHandStack = player.getMainHandStack();
            if(ICE_TOOL_LIST.contains(mainHandStack.getItem()) && target.isOnFire()) {
                target.extinguish(); // 灭火
                return true;
            }
        }
        return false;
    }

    /**
     * 给实体效果
     * @param target 目标实体
     * @param effect 需要个给予的效果，即StatusEffects.XXX
     * @param duration 效果时长（tick为单位）
     * @param amplifier 效果等级（注意：0等于1级，1等于2级，2等于3级，以此类推）
     */
    static void giveEffect(LivingEntity target, RegistryEntry<StatusEffect> effect, int duration, int amplifier){
        StatusEffectInstance instance = new StatusEffectInstance(effect,duration,amplifier);
        target.addStatusEffect(instance);
    }
}
