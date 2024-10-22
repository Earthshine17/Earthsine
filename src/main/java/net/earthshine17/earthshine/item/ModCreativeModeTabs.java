package net.earthshine17.earthshine.item;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ESMod.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BISMUTH.get()))
                    .title(Component.translatable("creativetab.esmod.bismuth_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModItems.RAW_BISMUTH);

                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.RADISH);

                        output.accept(ModItems.FROSTFIRE_ICE);
                        output.accept(ModItems.STARLIGHT_ASHES);

                        output.accept(ModItems.BISMUTH_SWORD);
                        output.accept(ModItems.BISMUTH_PICKAXE);
                        output.accept(ModItems.BISMUTH_SHOVEL);
                        output.accept(ModItems.BISMUTH_AXE);
                        output.accept(ModItems.BISMUTH_HOE);
                        output.accept(ModItems.BISMUTH_HAMMER);

                        output.accept(ModItems.BISMUTH_HELMET);
                        output.accept(ModItems.BISMUTH_CHESTPLATE);
                        output.accept(ModItems.BISMUTH_LEGGINGS);
                        output.accept(ModItems.BISMUTH_BOOTS);

                        output.accept(ModItems.BISMUTH_HORSE_ARMOR);

                        output.accept(ModItems.ES_SMITHING_TEMPLATE);








                    }).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_MODE_TAB.register("bismuth_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "bismuth_items_tab"))
                    .title(Component.translatable("creativetab.esmod.bismuth_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BISMUTH_BLOCK);
                        output.accept(ModBlocks.BISMUTH_ORE);
                        output.accept(ModBlocks.BISMUTH_DEEPSLATE_ORE);

                        output.accept(ModBlocks.MAGIC_BLOCK);

                        output.accept(ModBlocks.BISMUTH_STAIRS);
                        output.accept(ModBlocks.BISMUTH_SLAB);

                        output.accept(ModBlocks.BISMUTH_PRESSURE_PLATE);
                        output.accept(ModBlocks.BISMUTH_BUTTON);

                        output.accept(ModBlocks.BISMUTH_FENCE);
                        output.accept(ModBlocks.BISMUTH_FENCE_GATE);
                        output.accept(ModBlocks.BISMUTH_WALL);

                        output.accept(ModBlocks.BISMUTH_DOOR);
                        output.accept(ModBlocks.BISMUTH_TRAPDOOR);





                    }).build());

    public static final Supplier<CreativeModeTab> EARTHSHONE_TAB = CREATIVE_MODE_TAB.register("earthshine_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ROSIUM_ORE))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "bismuth_blocks_tab"))
                    .title(Component.translatable("creativetab.esmod.earthshine"))
                    .displayItems((itemDisplayParameters, output) -> {

                        ////////////////// ORES ////////////////////
                        output.accept(ModBlocks.ROSIUM_ORE);
                        output.accept(ModBlocks.DREAMSTONE_ORE);
                        output.accept(ModBlocks.LUNARITE_ORE);
                        output.accept(ModBlocks.RAINBOW_ORE);

                        ////////////////// BLOCKS ////////////////////
                        output.accept(ModBlocks.ROSIUM_BLOCK);
                        output.accept(ModBlocks.DREAMSTONE_BLOCK);
                        output.accept(ModBlocks.LUNARITE_BLOCK);
                        output.accept(ModBlocks.RAINBOW_BLOCK);

                        /////////// INGOTS ///////////
                        output.accept(ModItems.DREAMSTONE_INGOT);
                        output.accept(ModItems.ROSIUM_INGOT);
                        output.accept(ModItems.LUNARITE_INGOT);
                        output.accept(ModItems.RAINBOW_INGOT);

                        /////////// RAW MATERIAL ///////////
                        output.accept(ModItems.RAW_DREAMSTONE);
                        output.accept(ModItems.RAW_ROSIUM);
                        output.accept(ModItems.RAW_LUNARITE);
                        output.accept(ModItems.RAW_RAINBOW);

                        /////////// NUGGET ///////////
                        output.accept(ModItems.DREAMSTONE_NUGGET);
                        output.accept(ModItems.ROSIUM_NUGGET);
                        output.accept(ModItems.LUNARITE_NUGGET);

                        //////////////// ARMORS //////////////////
                        output.accept(ModItems.RAINBOW_CHESTPLATE);
                        output.accept(ModItems.RAINBOW_BOOTS);
                        output.accept(ModItems.RAINBOW_LEGGINGS);
                        output.accept(ModItems.RAINBOW_HELMET);
                        output.accept(ModItems.RAINBOW_HORSE_ARMOR);

                        output.accept(ModItems.ROSIUM_CHESTPLATE);
                        output.accept(ModItems.ROSIUM_BOOTS);
                        output.accept(ModItems.ROSIUM_LEGGINGS);
                        output.accept(ModItems.ROSIUM_HELMET);
                        output.accept(ModItems.ROSIUM_HORSE_ARMOR);

                        output.accept(ModItems.LUNARITE_CHESTPLATE);
                        output.accept(ModItems.LUNARITE_BOOTS);
                        output.accept(ModItems.LUNARITE_LEGGINGS);
                        output.accept(ModItems.LUNARITE_HELMET);
                        output.accept(ModItems.LUNARITE_HORSE_ARMOR);

                        output.accept(ModItems.DREAMSTONE_CHESTPLATE);
                        output.accept(ModItems.DREAMSTONE_BOOTS);
                        output.accept(ModItems.DREAMSTONE_LEGGINGS);
                        output.accept(ModItems.DREAMSTONE_HELMET);
                        output.accept(ModItems.DREAMSTONE_HORSE_ARMOR);

                        /////////////// TOOLS /////////////////////
                        output.accept(ModItems.RAINBOW_SWORD);
                        output.accept(ModItems.RAINBOW_PICKAXE);
                        output.accept(ModItems.RAINBOW_SHOVEL);
                        output.accept(ModItems.RAINBOW_AXE);
                        output.accept(ModItems.RAINBOW_HOE);
                        output.accept(ModItems.RAINBOW_HAMMER);

                        output.accept(ModItems.ROSIUM_SWORD);
                        output.accept(ModItems.ROSIUM_PICKAXE);
                        output.accept(ModItems.ROSIUM_SHOVEL);
                        output.accept(ModItems.ROSIUM_AXE);
                        output.accept(ModItems.ROSIUM_HOE);
                        output.accept(ModItems.ROSIUM_HAMMER);

                        output.accept(ModItems.LUNARITE_SWORD);
                        output.accept(ModItems.LUNARITE_PICKAXE);
                        output.accept(ModItems.LUNARITE_SHOVEL);
                        output.accept(ModItems.LUNARITE_AXE);
                        output.accept(ModItems.LUNARITE_HOE);
                        output.accept(ModItems.LUNARITE_HAMMER);

                        output.accept(ModItems.DREAMSTONE_SWORD);
                        output.accept(ModItems.DREAMSTONE_PICKAXE);
                        output.accept(ModItems.DREAMSTONE_SHOVEL);
                        output.accept(ModItems.DREAMSTONE_AXE);
                        output.accept(ModItems.DREAMSTONE_HOE);
                        output.accept(ModItems.DREAMSTONE_HAMMER);

                        /////////////// SMITHING /////////////////
                        output.accept(ModItems.RAINBOW_SMITHING_TEMPLATE);



                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}