package com.sakyrhythm.ice_fire.entity.client;

import com.sakyrhythm.ice_fire.Ice_Fire;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer Bullet =
            new EntityModelLayer(Identifier.of(Ice_Fire.MOD_ID,"bullet"),"main");
}
