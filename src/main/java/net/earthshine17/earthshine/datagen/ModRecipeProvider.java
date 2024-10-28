package net.earthshine17.earthshine.datagen;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.block.ModBlocks;
import net.earthshine17.earthshine.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> BISMUTH_SMELTABLES = List.of(ModItems.RAW_BISMUTH,
                ModBlocks.BISMUTH_ORE, ModBlocks.BISMUTH_DEEPSLATE_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH.get(), 9)
                .requires(ModBlocks.BISMUTH_BLOCK)
                .unlockedBy("has_bismuth_block", has(ModBlocks.BISMUTH_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH.get(), 18)
                .requires(ModBlocks.MAGIC_BLOCK)
                .unlockedBy("has_magic_block", has(ModBlocks.MAGIC_BLOCK))
                .save(recipeOutput, "esmod:bismuth_from_magic_block");

        oreSmelting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 200, "bismuth");
        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");

        stairBuilder(ModBlocks.BISMUTH_STAIRS.get(), Ingredient.of(ModItems.BISMUTH)).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_SLAB.get(), ModItems.BISMUTH.get());

        buttonBuilder(ModBlocks.BISMUTH_BUTTON.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BISMUTH_PRESSURE_PLATE.get(), ModItems.BISMUTH.get());

        fenceBuilder(ModBlocks.BISMUTH_FENCE.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BISMUTH_FENCE_GATE.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_WALL.get(), ModItems.BISMUTH.get());

        doorBuilder(ModBlocks.BISMUTH_DOOR.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BISMUTH_TRAPDOOR.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);

        trimSmithing(recipeOutput, ModItems.ES_SMITHING_TEMPLATE.get(), ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "es"));



        ///////////////////// BLOCKS ////////////////////////
        ///ROSIUM
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ROSIUM_NUGGET.get())
                .unlockedBy("has_rosium2", has(ModItems.ROSIUM_NUGGET)).save(recipeOutput);*/

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSIUM_INGOT.get(), 9)
                .requires(ModBlocks.ROSIUM_BLOCK)
                .unlockedBy("has_rosium_block", has(ModBlocks.ROSIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSIUM_NUGGET.get(), 9)
                .requires(ModItems.ROSIUM_INGOT.get())
                .unlockedBy("has_rosium_ingot", has(ModItems.ROSIUM_INGOT.get())).save(recipeOutput);

        ///LUNARITE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LUNARITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.LUNARITE_INGOT.get(), 9)
                .requires(ModBlocks.LUNARITE_BLOCK)
                .unlockedBy("has_lunarite_block", has(ModBlocks.LUNARITE_BLOCK)).save(recipeOutput);

        ///DREAMSTONE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DREAMSTONE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DREAMSTONE_INGOT.get(), 9)
                .requires(ModBlocks.DREAMSTONE_BLOCK)
                .unlockedBy("has_dreamstone_block", has(ModBlocks.DREAMSTONE_BLOCK)).save(recipeOutput);

        ///RAINBOW
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAINBOW_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .unlockedBy("has_rainbow", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAINBOW_INGOT.get(), 9)
                .requires(ModBlocks.RAINBOW_BLOCK)
                .unlockedBy("has_dreamstone_block", has(ModBlocks.RAINBOW_BLOCK)).save(recipeOutput);

        ///////////////// TEMP DUST //////////////////
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSIUM_DUST.get(), 2)
                .requires(ModItems.RAW_ROSIUM.get())
                .unlockedBy("has_raw_rosium", has(ModItems.RAW_ROSIUM.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LUNARITE_DUST.get(), 2)
                .requires(ModItems.RAW_LUNARITE.get())
                .unlockedBy("has_raw_lunarite", has(ModItems.RAW_LUNARITE.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DREAMSTONE_DUST.get(), 2)
                .requires(ModItems.RAW_DREAMSTONE.get())
                .unlockedBy("has_raw_dreamstone", has(ModItems.RAW_DREAMSTONE.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAINBOW_DUST.get(), 2)
                .requires(ModItems.RAW_RAINBOW.get())
                .unlockedBy("has_raw_rainbow", has(ModItems.RAW_RAINBOW.get())).save(recipeOutput);

        ///////////////// SMELTING ///////////////////

        List<ItemLike> RAINBOW_SMELTABLES = List.of(ModItems.RAW_RAINBOW,
                ModBlocks.RAINBOW_ORE, ModItems.RAINBOW_DUST);
        oreSmelting(recipeOutput, RAINBOW_SMELTABLES, RecipeCategory.MISC, ModItems.RAINBOW_INGOT.get(), 0.25f, 200, "rainbow_ingot");
        oreBlasting(recipeOutput, RAINBOW_SMELTABLES, RecipeCategory.MISC, ModItems.RAINBOW_INGOT.get(), 0.25f, 100, "rainbow_ingot");

        List<ItemLike> ROSIUM_SMELTABLES = List.of(ModItems.RAW_ROSIUM,
                ModBlocks.ROSIUM_ORE, ModItems.ROSIUM_DUST);
        oreSmelting(recipeOutput, ROSIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ROSIUM_INGOT.get(), 0.25f, 200, "rosium_ingot");
        oreBlasting(recipeOutput, ROSIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ROSIUM_INGOT.get(), 0.25f, 100, "rosium_ingot");

        List<ItemLike> LUNARITE_SMELTABLES = List.of(ModItems.RAW_ROSIUM,
                ModBlocks.LUNARITE_ORE, ModItems.LUNARITE_DUST);
        oreSmelting(recipeOutput, LUNARITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUNARITE_INGOT.get(), 0.25f, 200, "lunarite_ingot");
        oreBlasting(recipeOutput, LUNARITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUNARITE_INGOT.get(), 0.25f, 100, "lunarite_ingot");

        List<ItemLike> DREAMSTONE_SMELTABLES = List.of(ModItems.RAW_ROSIUM,
                ModBlocks.DREAMSTONE_ORE, ModItems.DREAMSTONE_DUST);
        oreSmelting(recipeOutput, DREAMSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.DREAMSTONE_INGOT.get(), 0.25f, 200, "dreamstone_ingot");
        oreBlasting(recipeOutput, DREAMSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.DREAMSTONE_INGOT.get(), 0.25f, 100, "dreamstone_ingot");

        ///////////////// PICKAXE ////////////////////
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ///////////////// SHOVEL /////////////////////
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_SHOVEL.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rainbow", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ///////////////// AXE ////////////////////////
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_AXE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rainbow", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ///////////////// HOE ////////////////////////
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_HOE.get())
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rainbow", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ///////////////// SWORD //////////////////////
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rainbow", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);


        ///////////////// HAMMER /////////////////////
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_HAMMER.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern(" A ")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_HAMMER.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern(" A ")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_HAMMER.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern(" A ")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_HAMMER.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern(" A ")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .define('A', Items.STICK.asItem())
                .unlockedBy("has_rainbow", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ///////////////// ARMORS //////////////////////
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_HELMET.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("   ")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_CHESTPLATE.get())
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_LEGGINGS.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSIUM_BOOTS.get())
                .pattern("   ")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.ROSIUM_INGOT.get())
                .unlockedBy("has_rosium", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_HELMET.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("   ")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_CHESTPLATE.get())
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_LEGGINGS.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LUNARITE_BOOTS.get())
                .pattern("   ")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.LUNARITE_INGOT.get())
                .unlockedBy("has_lunarite", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_HELMET.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("   ")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_CHESTPLATE.get())
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_LEGGINGS.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DREAMSTONE_BOOTS.get())
                .pattern("   ")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.DREAMSTONE_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_HELMET.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("   ")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_CHESTPLATE.get())
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_LEGGINGS.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAINBOW_BOOTS.get())
                .pattern("   ")
                .pattern("B B")
                .pattern("B B")
                .define('B', ModItems.RAINBOW_INGOT.get())
                .unlockedBy("has_dreamstone", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ///////////////////////// STAIRS ///////////////////////
        stairBuilder(ModBlocks.ROSIUM_STAIRS.get(), Ingredient.of(ModItems.ROSIUM_INGOT)).group("rosium")
                .unlockedBy("has_bismuth", has(ModItems.ROSIUM_INGOT)).save(recipeOutput);
        stairBuilder(ModBlocks.LUNARITE_STAIRS.get(), Ingredient.of(ModItems.LUNARITE_INGOT)).group("lunarite")
                .unlockedBy("has_bismuth", has(ModItems.LUNARITE_INGOT)).save(recipeOutput);
        stairBuilder(ModBlocks.DREAMSTONE_STAIRS.get(), Ingredient.of(ModItems.DREAMSTONE_INGOT)).group("dreamstone")
                .unlockedBy("has_bismuth", has(ModItems.DREAMSTONE_INGOT)).save(recipeOutput);
        stairBuilder(ModBlocks.RAINBOW_STAIRS.get(), Ingredient.of(ModItems.RAINBOW_INGOT)).group("rainbow")
                .unlockedBy("has_bismuth", has(ModItems.RAINBOW_INGOT)).save(recipeOutput);

        ////////////////////// SLABS ///////////////////////////
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSIUM_SLAB.get(), ModBlocks.ROSIUM_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LUNARITE_SLAB.get(), ModBlocks.LUNARITE_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DREAMSTONE_SLAB.get(), ModBlocks.DREAMSTONE_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAINBOW_SLAB.get(), ModBlocks.RAINBOW_BLOCK.get());

        ///////////////////// WALLS ////////////////////////////
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSIUM_WALL.get(), ModItems.ROSIUM_INGOT.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LUNARITE_WALL.get(), ModItems.LUNARITE_INGOT.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DREAMSTONE_WALL.get(), ModItems.DREAMSTONE_INGOT.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAINBOW_WALL.get(), ModItems.RAINBOW_INGOT.get());


    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, ESMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}