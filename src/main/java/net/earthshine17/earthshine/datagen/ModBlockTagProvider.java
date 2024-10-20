package net.earthshine17.earthshine.datagen;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.block.ModBlocks;
import net.earthshine17.earthshine.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ESMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.BISMUTH_ORE.get())
                .add(ModBlocks.BISMUTH_DEEPSLATE_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BISMUTH_DEEPSLATE_ORE.get());


        tag(BlockTags.FENCES).add(ModBlocks.BISMUTH_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.BISMUTH_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.BISMUTH_WALL.get());

        tag(ModTags.Blocks.NEEDS_BISMUTH_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_BISMUTH_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_BISMUTH_TOOL);


        ////////////////// ORES/BLOCKS //////////////////////
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ROSIUM_ORE.get())
                .add(ModBlocks.DREAMSTONE_ORE.get())
                .add(ModBlocks.LUNARITE_ORE.get())
                .add(ModBlocks.RAINBOW_ORE.get())

                .add(ModBlocks.LUNARITE_BLOCK.get())
                .add(ModBlocks.DREAMSTONE_BLOCK.get())
                .add(ModBlocks.ROSIUM_BLOCK.get())
                .add(ModBlocks.RAINBOW_BLOCK.get());

        /////////////////// TOOLS ////////////////////
        tag(ModTags.Blocks.NEEDS_RAINBOW_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_RAINBOW_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_RAINBOW_TOOL);


    }
}