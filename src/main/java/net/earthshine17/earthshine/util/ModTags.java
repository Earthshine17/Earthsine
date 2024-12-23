package net.earthshine17.earthshine.util;

import net.earthshine17.earthshine.ESMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BISMUTH_TOOL = createTag("needs_bismuth_tool");
        public static final TagKey<Block> INCORRECT_FOR_BISMUTH_TOOL = createTag("incorrect_for_bismuth_tool");

        //////////////// TOOL MOD TAGE ///////////////////////////
        public static final TagKey<Block> NEEDS_RAINBOW_TOOL = createTag("needs_rainbow_tool");
        public static final TagKey<Block> INCORRECT_FOR_RAINBOW_TOOL = createTag("incorrect_for_rainbow_tool");

        public static final TagKey<Block> NEEDS_ROSIUM_TOOL = createTag("needs_rosium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ROSIUM_TOOL = createTag("incorrect_for_rosium_tool");

        public static final TagKey<Block> NEEDS_LUNARITE_TOOL = createTag("needs_lunarite_tool");
        public static final TagKey<Block> INCORRECT_FOR_LUNARITE_TOOL = createTag("incorrect_for_lunarite_tool");

        public static final TagKey<Block> NEEDS_DREAMSTONE_TOOL = createTag("needs_dreamstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_DREAMSTONE_TOOL = createTag("incorrect_for_dreamstone_tool");

        public static final TagKey<Block> NEEDS_EARTHSHINE_ALLOY_TOOL = createTag("needs_earthshine_alloy_tool");
        public static final TagKey<Block> INCORRECT_FOR_EARTHSHINE_ALLOY_TOOL = createTag("incorrect_for_earthshine_alloy_tool");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, name));
        }
    }
}