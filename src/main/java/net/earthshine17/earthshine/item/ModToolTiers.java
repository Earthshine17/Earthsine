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

}