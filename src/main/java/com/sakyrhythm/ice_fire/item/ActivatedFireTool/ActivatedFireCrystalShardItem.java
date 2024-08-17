package com.sakyrhythm.ice_fire.item.ActivatedFireTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ActivatedFireCrystalShardItem extends Item{

    public ActivatedFireCrystalShardItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return ActivatedFireToolBehavior.postHit(stack,target,attacker);
    }
}
