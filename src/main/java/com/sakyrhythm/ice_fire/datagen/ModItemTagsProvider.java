package com.sakyrhythm.ice_fire.datagen;

import com.sakyrhythm.ice_fire.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {


    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ICE_DIAMOND_HELMET)
                .add(ModItems.ICE_DIAMOND_CHESTPLATE)
                .add(ModItems.ICE_DIAMOND_LEGGINGS)
                .add(ModItems.ICE_DIAMOND_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.FIRE_CRYSTAL_SHARD_HELMET)
                .add(ModItems.FIRE_CRYSTAL_SHARD_CHESTPLATE)
                .add(ModItems.FIRE_CRYSTAL_SHARD_LEGGINGS)
                .add(ModItems.FIRE_CRYSTAL_SHARD_BOOTS);
    }
}
