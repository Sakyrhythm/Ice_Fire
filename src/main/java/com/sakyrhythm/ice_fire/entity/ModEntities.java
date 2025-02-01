package com.sakyrhythm.ice_fire.entity;

import com.sakyrhythm.ice_fire.Ice_Fire;
import com.sakyrhythm.ice_fire.entity.custom.BulletEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BulletEntity> BULLET_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Ice_Fire.MOD_ID, "bullet"),
            EntityType.Builder.<BulletEntity>create(BulletEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f) // 设置实体尺寸
                    .build()
    );
}
