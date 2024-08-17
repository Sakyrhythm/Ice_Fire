package com.sakyrhythm.ice_fire.datagen;

import com.sakyrhythm.ice_fire.block.ModBlocks;
import com.sakyrhythm.ice_fire.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_CRYSTAL_SHARD_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.FIRE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_DIAMOND_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_DIAMOND_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_DIAMOND_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_DIAMOND_BOOTS);
    }
}
