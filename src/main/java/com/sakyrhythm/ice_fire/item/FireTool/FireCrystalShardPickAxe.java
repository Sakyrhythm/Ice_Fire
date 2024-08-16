package com.sakyrhythm.ice_fire.item.FireTool;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class FireCrystalShardPickAxe extends PickaxeItem {
    public FireCrystalShardPickAxe(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker){
        return FireToolBehavior.postHit(stack,target,attacker);
    }
}
