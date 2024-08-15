package com.sakyrhythm.ice_fire.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;

import static com.sakyrhythm.ice_fire.block.ModBlocks.registerBlocks;


public class ICE_DIAMOND_BLOCK extends Block {
    public static Block ICE_DIAMOND_BLOCK = registerBlocks("ice_diamond_block",
            new TransparentBlock(Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .nonOpaque()
                    .luminance(ModBlocks::getLuminance)
                    .requiresTool().strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.GLASS)
    				.allowsSpawning(Blocks::never)
				    .solidBlock(Blocks::never)
				    .suffocates(Blocks::never)
				    .blockVision(Blocks::never)));
    public ICE_DIAMOND_BLOCK(Settings settings) {
        super(settings);
    }

    // 在客户端中设置渲染层
    public static void setRenderLayer() {
        // 使用 BlockRenderLayerMap 来设置渲染层
        BlockRenderLayerMap.INSTANCE.putBlock(ICE_DIAMOND_BLOCK, RenderLayer.getCutout());
    }
}
