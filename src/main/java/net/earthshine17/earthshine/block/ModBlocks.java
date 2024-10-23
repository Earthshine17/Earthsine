package net.earthshine17.earthshine.block;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.block.custom.MagicBlock;
import net.earthshine17.earthshine.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ESMod.MOD_ID);

    public static final DeferredBlock<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BISMUTH_DEEPSLATE_ORE = registerBlock("bismuth_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MAGIC_BLOCK = registerBlock("magic_block",
            () -> new MagicBlock(BlockBehaviour.Properties.of().strength(2f).noLootTable()));

    public static final DeferredBlock<StairBlock> BISMUTH_STAIRS = registerBlock("bismuth_stairs",
            () -> new StairBlock(ModBlocks.BISMUTH_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BISMUTH_SLAB = registerBlock("bismuth_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> BISMUTH_PRESSURE_PLATE = registerBlock("bismuth_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> BISMUTH_BUTTON = registerBlock("bismuth_button",
            () -> new ButtonBlock(BlockSetType.IRON, 20, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> BISMUTH_FENCE = registerBlock("bismuth_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> BISMUTH_FENCE_GATE = registerBlock("bismuth_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> BISMUTH_WALL = registerBlock("bismuth_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> BISMUTH_DOOR = registerBlock("bismuth_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> BISMUTH_TRAPDOOR = registerBlock("bismuth_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noOcclusion()));


    /////////////////////// ORES /////////////////////
    public static final DeferredBlock<Block> DREAMSTONE_ORE = registerBlock("dreamstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> ROSIUM_ORE = registerBlock("rosium_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> LUNARITE_ORE = registerBlock("lunarite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> RAINBOW_ORE = registerBlock("rainbow_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> DREAMSTONE_DEEPSLATE_ORE = registerBlock("dreamstone_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> ROSIUM_DEEPSLATE_ORE = registerBlock("rosium_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> LUNARITE_DEEPSLATE_ORE = registerBlock("lunarite_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> RAINBOW_DEEPSLATE_ORE = registerBlock("rainbow_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    /////////////////////// BLOCKS /////////////////////
    public static final DeferredBlock<Block> DREAMSTONE_BLOCK = registerBlock("dreamstone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> ROSIUM_BLOCK = registerBlock("rosium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> LUNARITE_BLOCK = registerBlock("lunarite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> RAINBOW_BLOCK = registerBlock("rainbow_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    ////////////////////// SLABS ////////////////////////////
    public static final DeferredBlock<SlabBlock> ROSIUM_SLAB = registerBlock("rosium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> LUNARITE_SLAB = registerBlock("lunarite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> DREAMSTONE_SLAB = registerBlock("dreamstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> RAINBOW_SLAB = registerBlock("rainbow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //////////////////// STAIRS /////////////////////////////
    public static final DeferredBlock<StairBlock> ROSIUM_STAIRS = registerBlock("rosium_stairs",
            () -> new StairBlock(ModBlocks.ROSIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> LUNARITE_STAIRS = registerBlock("lunarite_stairs",
            () -> new StairBlock(ModBlocks.LUNARITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> DREAMSTONE_STAIRS = registerBlock("dreamstone_stairs",
            () -> new StairBlock(ModBlocks.DREAMSTONE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> RAINBOW_STAIRS = registerBlock("rainbow_stairs",
            () -> new StairBlock(ModBlocks.RAINBOW_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    ///////////////////////// WALLS ////////////////////////////////
    public static final DeferredBlock<WallBlock> ROSIUM_WALL = registerBlock("rosium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> LUNARITE_WALL = registerBlock("lunarite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> DREAMSTONE_WALL = registerBlock("dreamstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> RAINBOW_WALL = registerBlock("rainbow_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}