package net.earthshine17.earthshine.item;

import net.earthshine17.earthshine.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier BISMUTH = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BISMUTH_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.BISMUTH));


    ////////////////// TOOL MODIFIERS ///////////////////
    public static final Tier RAINBOW = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RAINBOW_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.RAINBOW_INGOT));

    public static final Tier ROSIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ROSIUM_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.ROSIUM_INGOT));

    public static final Tier LUNARITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_LUNARITE_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.LUNARITE_INGOT));

    public static final Tier DREAMSTONE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_DREAMSTONE_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.DREAMSTONE_INGOT));

    public static final Tier EARTHSHINE_ALLOY = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EARTHSHINE_ALLOY_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.EARTHSHINE_ALLOY_INGOT));


}