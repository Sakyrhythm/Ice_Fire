package com.sakyrhythm.ice_fire.item.IceTool;

import com.sakyrhythm.ice_fire.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
}
