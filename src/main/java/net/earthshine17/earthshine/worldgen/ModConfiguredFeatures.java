package net.earthshine17.earthshine.worldgen;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RAINBOW_ORE = createKey("overworld_rainbow_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ROSIUM_ORE = createKey("overworld_rosium_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LUNARITE_ORE = createKey("overworld_lunarite_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DREAMSTONE_ORE = createKey("overworld_dreamstone_ore");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> context) {
        RuleTest stoneReplacable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> rainbowOre =
                List.of(OreConfiguration.target(stoneReplacable, ModBlocks.RAINBOW_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, ModBlocks.RAINBOW_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> rosiumOre =
                List.of(OreConfiguration.target(stoneReplacable, ModBlocks.ROSIUM_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, ModBlocks.ROSIUM_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> lunariteOre =
                List.of(OreConfiguration.target(stoneReplacable, ModBlocks.LUNARITE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, ModBlocks.LUNARITE_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> dreamstoneOre =
                List.of(OreConfiguration.target(stoneReplacable, ModBlocks.DREAMSTONE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, ModBlocks.DREAMSTONE_DEEPSLATE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_RAINBOW_ORE, Feature.ORE, new OreConfiguration(rainbowOre, 16));
        register(context, OVERWORLD_ROSIUM_ORE, Feature.ORE, new OreConfiguration(rosiumOre, 16));
        register(context, OVERWORLD_LUNARITE_ORE, Feature.ORE, new OreConfiguration(lunariteOre, 16));
        register(context, OVERWORLD_DREAMSTONE_ORE, Feature.ORE, new OreConfiguration(dreamstoneOre, 16));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, name));
    }

    private static  <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
