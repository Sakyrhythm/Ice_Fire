package com.sakyrhythm.ice_fire.item.ActivatedIceTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class ActivatedIceDiamondAxe extends AxeItem{

    public ActivatedIceDiamondAxe(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return ActivatedIceToolBehavior.postHit(stack,target,attacker);
    }
}
