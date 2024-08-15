package com.sakyrhythm.ice_fire.item;

import com.sakyrhythm.ice_fire.Ice_Fire;
import com.sakyrhythm.ice_fire.block.ICE_DIAMOND_BLOCK;
import com.sakyrhythm.ice_fire.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;

public class ModItems {
    public static final Item ICE_DIAMOND = registerItems("ice_diamond",new Item(new Item.Settings()));
    public static final Item FIRE_CRYSTAL_SHARD = registerItems("fire_crystal_shard",new Item(new Item.Settings()));
    private static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_DIAMOND);
        fabricItemGroupEntries.add(FIRE_CRYSTAL_SHARD);
    }
    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Ice_Fire.MOD_ID,name),item);
    }
    public static void registerModItems(){
//ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);
    }
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of("ice_fire", "item_group"));
    public static final ItemGroup ICE_FIRE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ICE_DIAMOND))
            .displayName(Text.translatable("itemGroup.fabric_docs_reference"))
            .build();
    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, ICE_FIRE);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(entries -> {
            entries.add(ModItems.ICE_DIAMOND);
            entries.add(ModItems.FIRE_CRYSTAL_SHARD);
            entries.add(ICE_DIAMOND_BLOCK.ICE_DIAMOND_BLOCK);
            entries.add(ModBlocks.FIRE_CRYSTAL_SHARD_BLOCK);
        });
    }
}