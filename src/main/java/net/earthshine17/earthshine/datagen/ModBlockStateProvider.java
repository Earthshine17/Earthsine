package net.earthshine17.earthshine.datagen;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.model.generators.ModelFile;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ESMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BISMUTH_BLOCK);

        blockWithItem(ModBlocks.BISMUTH_ORE);
        blockWithItem(ModBlocks.BISMUTH_DEEPSLATE_ORE);

        blockWithItem(ModBlocks.MAGIC_BLOCK);

        stairsBlock(ModBlocks.BISMUTH_STAIRS.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        slabBlock(ModBlocks.BISMUTH_SLAB.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));

        buttonBlock(ModBlocks.BISMUTH_BUTTON.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        pressurePlateBlock(ModBlocks.BISMUTH_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));

        fenceBlock(ModBlocks.BISMUTH_FENCE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        fenceGateBlock(ModBlocks.BISMUTH_FENCE_GATE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        wallBlock(ModBlocks.BISMUTH_WALL.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.BISMUTH_DOOR.get(), modLoc("block/bismuth_door_bottom"), modLoc("block/bismuth_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BISMUTH_TRAPDOOR.get(), modLoc("block/bismuth_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BISMUTH_STAIRS);
        blockItem(ModBlocks.BISMUTH_SLAB);
        blockItem(ModBlocks.BISMUTH_PRESSURE_PLATE);
        blockItem(ModBlocks.BISMUTH_FENCE_GATE);
        blockItem(ModBlocks.BISMUTH_TRAPDOOR, "_bottom");



        /////////////////// ORES //////////////////
        blockWithItem(ModBlocks.ROSIUM_ORE);
        blockWithItem(ModBlocks.DREAMSTONE_ORE);
        blockWithItem(ModBlocks.LUNARITE_ORE);
        blockWithItem(ModBlocks.RAINBOW_ORE);

        blockWithItem(ModBlocks.ROSIUM_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.DREAMSTONE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.LUNARITE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.RAINBOW_DEEPSLATE_ORE);

        /////////////////// BLOCKS //////////////////
        blockWithItem(ModBlocks.ROSIUM_BLOCK);
        blockWithItem(ModBlocks.DREAMSTONE_BLOCK);
        blockWithItem(ModBlocks.LUNARITE_BLOCK);
        blockWithItem(ModBlocks.RAINBOW_BLOCK);

        ////////////////// STAIRS ////////////////////
        stairsBlock(ModBlocks.ROSIUM_STAIRS.get(), blockTexture(ModBlocks.ROSIUM_BLOCK.get()));
        stairsBlock(ModBlocks.LUNARITE_STAIRS.get(), blockTexture(ModBlocks.LUNARITE_BLOCK.get()));
        stairsBlock(ModBlocks.DREAMSTONE_STAIRS.get(), blockTexture(ModBlocks.DREAMSTONE_BLOCK.get()));
        stairsBlock(ModBlocks.RAINBOW_STAIRS.get(), blockTexture(ModBlocks.RAINBOW_BLOCK.get()));
        blockItem(ModBlocks.ROSIUM_STAIRS);
        blockItem(ModBlocks.LUNARITE_STAIRS);
        blockItem(ModBlocks.DREAMSTONE_STAIRS);
        blockItem(ModBlocks.RAINBOW_STAIRS);

        ////////////////// SLABS ////////////////////
        slabBlock(ModBlocks.ROSIUM_SLAB.get(), blockTexture(ModBlocks.ROSIUM_BLOCK.get()), blockTexture(ModBlocks.ROSIUM_BLOCK.get()));
        slabBlock(ModBlocks.LUNARITE_SLAB.get(), blockTexture(ModBlocks.LUNARITE_BLOCK.get()), blockTexture(ModBlocks.LUNARITE_BLOCK.get()));
        slabBlock(ModBlocks.DREAMSTONE_SLAB.get(), blockTexture(ModBlocks.DREAMSTONE_BLOCK.get()), blockTexture(ModBlocks.DREAMSTONE_BLOCK.get()));
        slabBlock(ModBlocks.RAINBOW_SLAB.get(), blockTexture(ModBlocks.RAINBOW_BLOCK.get()), blockTexture(ModBlocks.RAINBOW_BLOCK.get()));
        blockItem(ModBlocks.ROSIUM_SLAB);
        blockItem(ModBlocks.LUNARITE_SLAB);
        blockItem(ModBlocks.DREAMSTONE_SLAB);
        blockItem(ModBlocks.RAINBOW_SLAB);

        //////////////////  WALLS ////////////////////
        wallBlock(ModBlocks.ROSIUM_WALL.get(), blockTexture(ModBlocks.ROSIUM_BLOCK.get()));
        wallBlock(ModBlocks.LUNARITE_WALL.get(), blockTexture(ModBlocks.LUNARITE_BLOCK.get()));
        wallBlock(ModBlocks.DREAMSTONE_WALL.get(), blockTexture(ModBlocks.DREAMSTONE_BLOCK.get()));
        wallBlock(ModBlocks.RAINBOW_WALL.get(), blockTexture(ModBlocks.RAINBOW_BLOCK.get()));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("esmod:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("esmod:block/" + deferredBlock.getId().getPath() + appendix));
    }
}