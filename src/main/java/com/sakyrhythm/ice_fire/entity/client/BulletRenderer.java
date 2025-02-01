package com.sakyrhythm.ice_fire.entity.client;

import com.sakyrhythm.ice_fire.Ice_Fire;
import com.sakyrhythm.ice_fire.entity.custom.BulletEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BulletRenderer extends ProjectileEntityRenderer<BulletEntity> {
    public static final Identifier TEXTURE = Identifier.of(Ice_Fire.MOD_ID,"textures/entity/bullet.png");

    private final EntityModel<BulletEntity> model;

    public BulletRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new BulletModel<>(context.getPart(ModModelLayers.Bullet));
        this.shadowRadius = 0.5f;
    }


    @Override
    public Identifier getTexture(BulletEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(BulletEntity persistentProjectileEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(persistentProjectileEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
