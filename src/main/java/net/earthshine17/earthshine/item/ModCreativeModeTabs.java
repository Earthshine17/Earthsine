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

    public static final Supplier<CreativeModeTab> EARTHSHINE_TAB = CREATIVE_MODE_TAB.register("earthshine_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ROSIUM_ORE))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "blocks_tab"))
                    .title(Component.translatable("creativetab.esmod.earthshine"))
                    .displayItems((itemDisplayParameters, output) -> {

                        ////////////////// ORES ////////////////////
                        output.accept(ModBlocks.ROSIUM_ORE);
                        output.accept(ModBlocks.DREAMSTONE_ORE);
                        output.accept(ModBlocks.LUNARITE_ORE);
                        output.accept(ModBlocks.RAINBOW_ORE);

                        output.accept(ModBlocks.ROSIUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.DREAMSTONE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.LUNARITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.RAINBOW_DEEPSLATE_ORE);

                        ////////////////// BLOCKS ////////////////////
                        output.accept(ModBlocks.ROSIUM_BLOCK);
                        output.accept(ModBlocks.DREAMSTONE_BLOCK);
                        output.accept(ModBlocks.LUNARITE_BLOCK);
                        output.accept(ModBlocks.RAINBOW_BLOCK);

                        //////////////// SLABS /////////////////////
                        output.accept(ModBlocks.ROSIUM_SLAB);
                        output.accept(ModBlocks.LUNARITE_SLAB);
                        output.accept(ModBlocks.DREAMSTONE_SLAB);
                        output.accept(ModBlocks.RAINBOW_SLAB);

                        //////////////////// STAIRS //////////////////
                        output.accept(ModBlocks.ROSIUM_STAIRS);
                        output.accept(ModBlocks.LUNARITE_STAIRS);
                        output.accept(ModBlocks.DREAMSTONE_STAIRS);
                        output.accept(ModBlocks.RAINBOW_STAIRS);

                        ///////////////////// WALLS //////////////////
                        output.accept(ModBlocks.ROSIUM_WALL);
                        output.accept(ModBlocks.LUNARITE_WALL);
                        output.accept(ModBlocks.DREAMSTONE_WALL);
                        output.accept(ModBlocks.RAINBOW_WALL);


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
                        //output.accept(ModItems.DREAMSTONE_NUGGET);
                        //output.accept(ModItems.ROSIUM_NUGGET);
                        //output.accept(ModItems.LUNARITE_NUGGET);

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
                        output.accept(ModItems.ES_SMITHING_TEMPLATE);



                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}