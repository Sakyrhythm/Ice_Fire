package com.sakyrhythm.ice_fire;

import com.sakyrhythm.ice_fire.entity.ModEntities;
import com.sakyrhythm.ice_fire.entity.client.BulletModel;
import com.sakyrhythm.ice_fire.entity.client.BulletRenderer;
import com.sakyrhythm.ice_fire.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class Ice_FireClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //BlockRenderLayerMap.INSTANCE.putBlock(ICE_DIAMOND_BLOCK.ICE_DIAMOND_BLOCK, RenderLayer.getCutout());
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.Bullet, BulletModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BULLET_ENTITY,BulletRenderer::new);
    }
}
