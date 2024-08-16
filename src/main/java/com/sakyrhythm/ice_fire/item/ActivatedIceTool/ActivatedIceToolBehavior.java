package com.sakyrhythm.ice_fire.item.ActivatedIceTool;

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

public interface ActivatedIceToolBehavior {
    List<Item> ACTIVATED_ICE_TOOL_LIST = List.of(
            ModItems.ACTIVATED_ICE_DIAMOND_AXE,
            ModItems.ACTIVATED_ICE_DIAMOND_HOE,
            ModItems.ACTIVATED_ICE_DIAMOND_PICKAXE,
            ModItems.ACTIVATED_ICE_DIAMOND_SWORD,
            ModItems.ACTIVATED_ICE_DIAMOND_SHOVEL,
            ModItems.ACTIVATED_ICE_DIAMOND
    );

    // 定义一个方法，用于在攻击后处理扑灭效果
    static boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            ItemStack mainHandStack = player.getMainHandStack();
            if(ACTIVATED_ICE_TOOL_LIST.contains(mainHandStack.getItem())) {
                target.clearStatusEffects();//清除效果
                if (target.isOnFire()){
                    target.extinguish(); // 灭火
                }
                return true;
            }
        }
        return false;
    }
}
