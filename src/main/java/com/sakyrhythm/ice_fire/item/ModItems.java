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
    public static final Item ACTIVATED_ICE_DIAMOND = registerItems("activated_ice_diamond",new Item(new Item.Settings()));
    public static final Item ACTIVATED_FIRE_CRYSTAL_SHARD = registerItems("activated_fire_crystal_shard",new Item(new Item.Settings()));

    //冰属性装备
    public static final Item ICE_DIAMOND_SHOVEL = registerItems("ice_diamond_shovel",new ShovelItem(ModToolMaterial.ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ICE_DIAMOND,1.5F,0.0F))));
    public static final Item ICE_DIAMOND_SWORD = registerItems("ice_diamond_sword",new SwordItem(ModToolMaterial.ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ICE_DIAMOND,14.0F,0.0F))));
    public static final Item ICE_DIAMOND_PICKAXE = registerItems("ice_diamond_pickaxe",new PickaxeItem(ModToolMaterial.ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ICE_DIAMOND,1F,0.0F))));
    public static final Item ICE_DIAMOND_HOE = registerItems("ice_diamond_hoe",new HoeItem(ModToolMaterial.ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ICE_DIAMOND,-4.0F,0.0F))));
    public static final Item ICE_DIAMOND_AXE = registerItems("ice_diamond_axe",new AxeItem(ModToolMaterial.ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ICE_DIAMOND,26.0F,0.0F))));
    //火属性装备
    public static final Item FIRE_CRYSTAL_SHARD_SHOVEL = registerItems("fire_crystal_shard_shovel",new ShovelItem(ModToolMaterial.FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.FIRE_CRYSTAL_SHARD,1.5F,0.0F))));
    public static final Item FIRE_CRYSTAL_SHARD_SWORD = registerItems("fire_crystal_shard_sword",new SwordItem(ModToolMaterial.FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.FIRE_CRYSTAL_SHARD,25.0F,0.0F))));
    public static final Item FIRE_CRYSTAL_SHARD_PICKAXE = registerItems("fire_crystal_shard_pickaxe",new PickaxeItem(ModToolMaterial.FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.FIRE_CRYSTAL_SHARD,1F,0.0F))));
    public static final Item FIRE_CRYSTAL_SHARD_HOE = registerItems("fire_crystal_shard_hoe",new HoeItem(ModToolMaterial.FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.FIRE_CRYSTAL_SHARD,-4.0F,0.0F))));
    public static final Item FIRE_CRYSTAL_SHARD_AXE = registerItems("fire_crystal_shard_axe",new AxeItem(ModToolMaterial.FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.FIRE_CRYSTAL_SHARD,32.0F,0.0F))));

    //激活冰属性装备
    public static final Item ACTIVATED_ICE_DIAMOND_SHOVEL = registerItems("activated_ice_diamond_shovel",new ShovelItem(ModToolMaterial.ACTIVATED_ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_ICE_DIAMOND,1.5F,0.0F))));
    public static final Item ACTIVATED_ICE_DIAMOND_SWORD = registerItems("activated_ice_diamond_sword",new SwordItem(ModToolMaterial.ACTIVATED_ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_ICE_DIAMOND,26.0F,0.0F))));
    public static final Item ACTIVATED_ICE_DIAMOND_PICKAXE = registerItems("activated_ice_diamond_pickaxe",new PickaxeItem(ModToolMaterial.ACTIVATED_ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_ICE_DIAMOND,1F,0.0F))));
    public static final Item ACTIVATED_ICE_DIAMOND_HOE = registerItems("activated_ice_diamond_hoe",new HoeItem(ModToolMaterial.ACTIVATED_ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_ICE_DIAMOND,-4.0F,0.0F))));
    public static final Item ACTIVATED_ICE_DIAMOND_AXE = registerItems("activated_ice_diamond_axe",new AxeItem(ModToolMaterial.ACTIVATED_ICE_DIAMOND,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_ICE_DIAMOND,33.0F,0.0F))));
    //激活火属性装备
    public static final Item ACTIVATED_FIRE_CRYSTAL_SHARD_SHOVEL = registerItems("activated_fire_crystal_shard_shovel",new ShovelItem(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,1.5F,0.0F))));
    public static final Item ACTIVATED_FIRE_CRYSTAL_SHARD_SWORD = registerItems("activated_fire_crystal_shard_sword",new SwordItem(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,26.0F,0.0F))));
    public static final Item ACTIVATED_FIRE_CRYSTAL_SHARD_PICKAXE = registerItems("activated_fire_crystal_shard_pickaxe",new PickaxeItem(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,1F,0.0F))));
    public static final Item ACTIVATED_FIRE_CRYSTAL_SHARD_HOE = registerItems("activated_fire_crystal_shard_hoe",new HoeItem(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,-4.0F,0.0F))));
    public static final Item ACTIVATED_FIRE_CRYSTAL_SHARD_AXE = registerItems("activated_fire_crystal_shard_axe",new AxeItem(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ACTIVATED_FIRE_CRYSTAL_SHARD,33.0F,0.0F))));

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
            entries.add(ModItems.ACTIVATED_ICE_DIAMOND);
            entries.add(ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD);
            entries.add(ICE_DIAMOND_BLOCK.ICE_DIAMOND_BLOCK);
            entries.add(ModBlocks.FIRE_CRYSTAL_SHARD_BLOCK);

            entries.add(ModItems.FIRE_CRYSTAL_SHARD_SHOVEL);
            entries.add(ModItems.FIRE_CRYSTAL_SHARD_SWORD);
            entries.add(ModItems.FIRE_CRYSTAL_SHARD_PICKAXE);
            entries.add(ModItems.FIRE_CRYSTAL_SHARD_HOE);
            entries.add(ModItems.FIRE_CRYSTAL_SHARD_AXE);

            entries.add(ModItems.ICE_DIAMOND_SHOVEL);
            entries.add(ModItems.ICE_DIAMOND_SWORD);
            entries.add(ModItems.ICE_DIAMOND_PICKAXE);
            entries.add(ModItems.ICE_DIAMOND_HOE);
            entries.add(ModItems.ICE_DIAMOND_AXE);

            entries.add(ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_SHOVEL);
            entries.add(ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_SWORD);
            entries.add(ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_PICKAXE);
            entries.add(ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_HOE);
            entries.add(ModItems.ACTIVATED_FIRE_CRYSTAL_SHARD_AXE);

            entries.add(ModItems.ACTIVATED_ICE_DIAMOND_SHOVEL);
            entries.add(ModItems.ACTIVATED_ICE_DIAMOND_SWORD);
            entries.add(ModItems.ACTIVATED_ICE_DIAMOND_PICKAXE);
            entries.add(ModItems.ACTIVATED_ICE_DIAMOND_HOE);
            entries.add(ModItems.ACTIVATED_ICE_DIAMOND_AXE);
        });
    }
}