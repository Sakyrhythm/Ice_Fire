package com.sakyrhythm.ice_fire.item.FireTool;

import com.sakyrhythm.ice_fire.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public interface FireToolBehavior {
    final List<Item> FIRE_TOOL_LIST = List.of(
            ModItems.FIRE_CRYSTAL_SHARD_AXE,
            ModItems.FIRE_CRYSTAL_SHARD_HOE,
            ModItems.FIRE_CRYSTAL_SHARD_PICKAXE,
            ModItems.FIRE_CRYSTAL_SHARD_SWORD,
            ModItems.FIRE_CRYSTAL_SHARD_SHOVEL,
            ModItems.FIRE_CRYSTAL_SHARD
    );

    // 定义一个方法，用于在攻击后处理燃烧效果
    static boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            ItemStack mainHandStack = player.getMainHandStack();
            if(FIRE_TOOL_LIST.contains(mainHandStack.getItem())) {
                target.setOnFireFor(5); // 设置燃烧效果持续5秒
                return true;
            }
        }
        return false;
    }
}
