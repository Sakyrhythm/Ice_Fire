package com.sakyrhythm.ice_fire.item.ActivatedFireTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ActivatedFireCrystalShardShovel extends ShovelItem {
    public ActivatedFireCrystalShardShovel(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return ActivatedFireToolBehavior.postHit(stack,target,attacker);
    }
}
