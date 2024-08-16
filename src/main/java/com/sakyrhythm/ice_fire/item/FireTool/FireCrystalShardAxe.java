package com.sakyrhythm.ice_fire.item.FireTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class FireCrystalShardAxe extends AxeItem{
    public FireCrystalShardAxe(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return FireToolBehavior.postHit(stack,target,attacker);
    }
}
