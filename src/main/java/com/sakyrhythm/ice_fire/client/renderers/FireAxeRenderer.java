package com.sakyrhythm.ice_fire.client.renderers;

import com.sakyrhythm.ice_fire.Ice_Fire;
import com.sakyrhythm.ice_fire.item.ActivatedFireTool.FireAxeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class FireAxeRenderer extends EntityRenderer<FireAxeEntity> {
    public FireAxeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public Identifier getTexture(FireAxeEntity entity) {
        return Identifier.of(Ice_Fire.MOD_ID, "ice_fire:item/activated_fire_crystal_shard_axe");
    }

}
