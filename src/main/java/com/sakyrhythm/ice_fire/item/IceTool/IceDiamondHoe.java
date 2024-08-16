package com.sakyrhythm.ice_fire.item.IceTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class IceDiamondHoe extends HoeItem{
    public IceDiamondHoe(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return IceToolBehavior.postHit(stack,target,attacker);
    }
}
