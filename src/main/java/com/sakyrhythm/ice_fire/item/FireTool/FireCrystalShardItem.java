package com.sakyrhythm.ice_fire.item.FireTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FireCrystalShardItem extends Item {

    public FireCrystalShardItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return FireToolBehavior.postHit(stack,target,attacker);
    }
}
