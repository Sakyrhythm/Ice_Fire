package com.sakyrhythm.ice_fire.block;

import com.sakyrhythm.ice_fire.Ice_Fire;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FIRE_CRYSTAL_SHARD_BLOCK = registerBlocks("fire_crystal_shard_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .luminance(ModBlocks::getLuminance)
                    .requiresTool().strength(1.5F, 6000.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    static Block registerBlocks(String name, Block block){
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,Identifier.of(Ice_Fire.MOD_ID,name),block);
    }
    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,Identifier.of(Ice_Fire.MOD_ID,name),
                new BlockItem(block,new Item.Settings()));
    }
    public static void registerModBlocks(){

    }
    public static int getLuminance(BlockState state){
        return 15;
    }
}
