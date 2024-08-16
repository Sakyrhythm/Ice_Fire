package com.sakyrhythm.ice_fire.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    ICE_DIAMOND(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 7680, 20.0F, 10.0F, 15, () -> Ingredient.ofItems(ModItems.ICE_DIAMOND)),
    FIRE_CRYSTAL_SHARD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15260, 40.0F, 20.0F, 22, () -> Ingredient.ofItems(ModItems.FIRE_CRYSTAL_SHARD)),
    ACTIVATED_ICE_DIAMOND(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15260, 40.0F, 20.0F, 22, () -> Ingredient.ofItems(ModItems.ICE_DIAMOND)),
    ACTIVATED_FIRE_CRYSTAL_SHARD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15260, 80.0F, 40.0F, 22, () -> Ingredient.ofItems(ModItems.FIRE_CRYSTAL_SHARD));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
