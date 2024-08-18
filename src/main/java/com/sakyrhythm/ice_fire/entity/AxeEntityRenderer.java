package com.sakyrhythm.ice_fire.entity;

import com.sakyrhythm.ice_fire.Ice_Fire;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelTextured;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class AxeEntityRenderer extends GeoEntityRenderer<AxeEntity> {

    public AxeEntityRenderer(EntityRendererFactory.Context context, EntityModelTextured<AxeEntity> model) {
        super(context, model);
        this.shadowRadius = 0.3f;
    }

    @Override
    public Identifier getTextureLocation(AxeEntity entity) {
        return Identifier.of(Ice_Fire.MOD_ID, "textures/item/activated_fire_crystal_shard_axe.png");
    }
}
