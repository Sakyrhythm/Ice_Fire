package com.sakyrhythm.ice_fire;

import com.sakyrhythm.ice_fire.block.ICE_DIAMOND_BLOCK;
import com.sakyrhythm.ice_fire.client.renderers.FireAxeRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;

import static com.sakyrhythm.ice_fire.Ice_Fire.FIRE_AXE;

public class Ice_FireClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //BlockRenderLayerMap.INSTANCE.putBlock(ICE_DIAMOND_BLOCK.ICE_DIAMOND_BLOCK, RenderLayer.getCutout());
        EntityRendererRegistry.register(FIRE_AXE, (context) -> new FireAxeRenderer(context));
    }
}
