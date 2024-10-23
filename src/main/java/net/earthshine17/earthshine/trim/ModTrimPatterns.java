package net.earthshine17.earthshine.trim;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModTrimPatterns {
    public static final ResourceKey<TrimPattern> ES = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "es"));
    public static final ResourceKey<TrimPattern> RAINBOW = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "rainbow"));

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        register(context, ModItems.ES_SMITHING_TEMPLATE, ES);

        //////////////// TRIMS /////////////////////
        /*public static final ResourceKey<TrimPattern> RAINBOW = ResourceKey.create(Registries.TRIM_PATTERN,
                ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "es"));
        public static void bootstrap(BootstrapContext<TrimPattern> context) {
            register(context, ModItems.RAINBOW_SMITHING_TEMPLATE, RAINBOW);*/
    }

    private static void register(BootstrapContext<TrimPattern> context, DeferredItem<Item> item, ResourceKey<TrimPattern> key) {
        TrimPattern trimPattern = new TrimPattern(key.location(), item.getDelegate(),
                Component.translatable(Util.makeDescriptionId("trim_pattern", key.location())), false);
        context.register(key, trimPattern);
    }
}