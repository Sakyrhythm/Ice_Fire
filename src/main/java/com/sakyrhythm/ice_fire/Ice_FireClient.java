package com.sakyrhythm.ice_fire;

import com.sakyrhythm.ice_fire.block.ICE_DIAMOND_BLOCK;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;

public class Ice_FireClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //BlockRenderLayerMap.INSTANCE.putBlock(ICE_DIAMOND_BLOCK.ICE_DIAMOND_BLOCK, RenderLayer.getCutout());
    }
}
