package com.sakyrhythm.ice_fire.item.IceTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IceDiamondItem extends Item {

    public IceDiamondItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return IceToolBehavior.postHit(stack,target,attacker);
    }
}
