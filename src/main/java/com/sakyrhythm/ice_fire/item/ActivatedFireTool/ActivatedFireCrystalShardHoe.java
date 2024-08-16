package com.sakyrhythm.ice_fire.item.ActivatedFireTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class ActivatedFireCrystalShardHoe extends HoeItem{
    public ActivatedFireCrystalShardHoe(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return ActivatedFireToolBehavior.postHit(stack,target,attacker);
    }
}
