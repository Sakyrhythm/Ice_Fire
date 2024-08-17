package com.sakyrhythm.ice_fire.datagen;

import com.sakyrhythm.ice_fire.block.ICE_DIAMOND_BLOCK;
import com.sakyrhythm.ice_fire.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ICE_DIAMOND_BLOCK.ICE_DIAMOND_BLOCK)
                .add(ModBlocks.FIRE_CRYSTAL_SHARD_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ICE_DIAMOND_BLOCK.ICE_DIAMOND_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.FIRE_CRYSTAL_SHARD_BLOCK);
    }
}
