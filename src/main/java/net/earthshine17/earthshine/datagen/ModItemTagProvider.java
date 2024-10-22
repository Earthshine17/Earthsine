package net.earthshine17.earthshine.datagen;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.item.ModItems;
import net.earthshine17.earthshine.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ESMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.BISMUTH.get())
                .add(ModItems.RAW_BISMUTH.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);

        tag(ItemTags.SWORDS)
                .add(ModItems.BISMUTH_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.BISMUTH_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.BISMUTH_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.BISMUTH_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.BISMUTH_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BISMUTH_HELMET.get())
                .add(ModItems.BISMUTH_CHESTPLATE.get())
                .add(ModItems.BISMUTH_LEGGINGS.get())
                .add(ModItems.BISMUTH_BOOTS.get());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.BISMUTH.get());

        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.ES_SMITHING_TEMPLATE.get());


        ///////////////////// ARMORS /////////////////////
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RAINBOW_HELMET.get())
                .add(ModItems.RAINBOW_CHESTPLATE.get())
                .add(ModItems.RAINBOW_LEGGINGS.get())
                .add(ModItems.RAINBOW_BOOTS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSIUM_HELMET.get())
                .add(ModItems.ROSIUM_CHESTPLATE.get())
                .add(ModItems.ROSIUM_LEGGINGS.get())
                .add(ModItems.ROSIUM_BOOTS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.LUNARITE_HELMET.get())
                .add(ModItems.LUNARITE_CHESTPLATE.get())
                .add(ModItems.LUNARITE_LEGGINGS.get())
                .add(ModItems.LUNARITE_BOOTS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.DREAMSTONE_HELMET.get())
                .add(ModItems.DREAMSTONE_CHESTPLATE.get())
                .add(ModItems.DREAMSTONE_LEGGINGS.get())
                .add(ModItems.DREAMSTONE_BOOTS.get());

        //////////////////// TOOLS ////////////////////////
        tag(ItemTags.SWORDS)
                .add(ModItems.RAINBOW_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.RAINBOW_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.RAINBOW_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.RAINBOW_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.RAINBOW_HOE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.ROSIUM_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ROSIUM_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ROSIUM_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.ROSIUM_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.ROSIUM_HOE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.LUNARITE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.LUNARITE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.LUNARITE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.LUNARITE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.LUNARITE_HOE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.DREAMSTONE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.DREAMSTONE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.DREAMSTONE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.DREAMSTONE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.DREAMSTONE_HOE.get());

        /////////////////// SMITHING //////////////////////
        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RAINBOW_INGOT.get());

        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.RAINBOW_SMITHING_TEMPLATE.get());
    }
}