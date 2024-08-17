package com.sakyrhythm.ice_fire.datagen;

import com.sakyrhythm.ice_fire.block.ModBlocks;
import com.sakyrhythm.ice_fire.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //物品语言文件生成
        //translationBuilder.add(ModItems.FIRE_CRYSTAL_SHARD, "FIRE CRYSTAL SHARD");
        //方块语言文件生成
        //translationBuilder.add(ModBlocks.FIRE_CRYSTAL_SHARD_BLOCK, "FIRE CRYSTAL SHARD BLOCK");
    }
}
