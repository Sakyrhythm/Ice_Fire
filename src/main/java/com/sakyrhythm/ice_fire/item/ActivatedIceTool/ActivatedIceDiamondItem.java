package com.sakyrhythm.ice_fire.item.ActivatedIceTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ActivatedIceDiamondItem extends Item {

    public ActivatedIceDiamondItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return ActivatedIceToolBehavior.postHit(stack,target,attacker);
    }
}
