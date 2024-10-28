package net.earthshine17.earthshine.item;

import net.earthshine17.earthshine.ESMod;
import net.earthshine17.earthshine.item.custom.ChiselItem;
import net.earthshine17.earthshine.item.custom.FuelItem;
import net.earthshine17.earthshine.item.custom.HammerItem;
import net.earthshine17.earthshine.item.custom.ModArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ESMod.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.esmod.radish.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice",
            () -> new FuelItem(new Item.Properties(), 800));
    public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> BISMUTH_SWORD = ITEMS.register("bismuth_sword",
            () -> new SwordItem(ModToolTiers.BISMUTH, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BISMUTH, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> BISMUTH_PICKAXE = ITEMS.register("bismuth_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BISMUTH, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BISMUTH, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> BISMUTH_SHOVEL = ITEMS.register("bismuth_shovel",
            () -> new ShovelItem(ModToolTiers.BISMUTH, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BISMUTH, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> BISMUTH_AXE = ITEMS.register("bismuth_axe",
            () -> new AxeItem(ModToolTiers.BISMUTH, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BISMUTH, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> BISMUTH_HOE = ITEMS.register("bismuth_hoe",
            () -> new HoeItem(ModToolTiers.BISMUTH, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BISMUTH, 0F, -3.0f))));

    public static final DeferredItem<HammerItem> BISMUTH_HAMMER = ITEMS.register("bismuth_hammer",
            () -> new HammerItem(ModToolTiers.BISMUTH, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BISMUTH, 7F, -3.5f))));

    public static final DeferredItem<ArmorItem> BISMUTH_HELMET = ITEMS.register("bismuth_helmet",
            () -> new ModArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> BISMUTH_CHESTPLATE = ITEMS.register("bismuth_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> BISMUTH_LEGGINGS = ITEMS.register("bismuth_leggings",
            () -> new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> BISMUTH_BOOTS = ITEMS.register("bismuth_boots",
            () -> new ArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    public static final DeferredItem<Item> BISMUTH_HORSE_ARMOR = ITEMS.register("bismuth_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.BISMUTH_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));



    /////////// DUSTS ////////////
    public static final DeferredItem<Item> ROSIUM_DUST = ITEMS.register("rosium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUNARITE_DUST = ITEMS.register("lunarite_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DREAMSTONE_DUST = ITEMS.register("dreamstone_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_DUST = ITEMS.register("rainbow_dust",
            () -> new Item(new Item.Properties()));


    /////////// INGOTS ///////////
    public static final DeferredItem<Item> ROSIUM_INGOT = ITEMS.register("rosium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUNARITE_INGOT = ITEMS.register("lunarite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DREAMSTONE_INGOT = ITEMS.register("dreamstone_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot",
            () -> new Item(new Item.Properties()));


    /////////// RAW MATERIAL ///////////
    public static final DeferredItem<Item> RAW_ROSIUM = ITEMS.register("raw_rosium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LUNARITE = ITEMS.register("raw_lunarite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_DREAMSTONE = ITEMS.register("raw_dreamstone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RAINBOW = ITEMS.register("raw_rainbow",
            () -> new Item(new Item.Properties()));

    /////////// NUGGET ///////////
    public static final DeferredItem<Item> ROSIUM_NUGGET = ITEMS.register("rosium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUNARITE_NUGGET = ITEMS.register("lunarite_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DREAMSTONE_NUGGET = ITEMS.register("dreamstone_nugget",
            () -> new Item(new Item.Properties()));

    ////////////////// ARMORS ///////////////////////
    ////RAINBOW
    public static final DeferredItem<ArmorItem> RAINBOW_HELMET = ITEMS.register("rainbow_helmet",
            () -> new ArmorItem(ModArmorMaterials.RAINBOW_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> RAINBOW_CHESTPLATE = ITEMS.register("rainbow_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RAINBOW_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> RAINBOW_LEGGINGS = ITEMS.register("rainbow_leggings",
            () -> new ArmorItem(ModArmorMaterials.RAINBOW_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> RAINBOW_BOOTS = ITEMS.register("rainbow_boots",
            () -> new ArmorItem(ModArmorMaterials.RAINBOW_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
    public static final DeferredItem<Item> RAINBOW_HORSE_ARMOR = ITEMS.register("rainbow_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.RAINBOW_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    /////ROSIUM
    public static final DeferredItem<ArmorItem> ROSIUM_HELMET = ITEMS.register("rosium_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> ROSIUM_CHESTPLATE = ITEMS.register("rosium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> ROSIUM_LEGGINGS = ITEMS.register("rosium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> ROSIUM_BOOTS = ITEMS.register("rosium_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
    public static final DeferredItem<Item> ROSIUM_HORSE_ARMOR = ITEMS.register("rosium_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.ROSIUM_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    /////LUNARITE
    public static final DeferredItem<ArmorItem> LUNARITE_HELMET = ITEMS.register("lunarite_helmet",
            () -> new ArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> LUNARITE_CHESTPLATE = ITEMS.register("lunarite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> LUNARITE_LEGGINGS = ITEMS.register("lunarite_leggings",
            () -> new ArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> LUNARITE_BOOTS = ITEMS.register("lunarite_boots",
            () -> new ArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
    public static final DeferredItem<Item> LUNARITE_HORSE_ARMOR = ITEMS.register("lunarite_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    /////DREAMSTONE
    public static final DeferredItem<ArmorItem> DREAMSTONE_HELMET = ITEMS.register("dreamstone_helmet",
            () -> new ArmorItem(ModArmorMaterials.DREAMSTONE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> DREAMSTONE_CHESTPLATE = ITEMS.register("dreamstone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DREAMSTONE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> DREAMSTONE_LEGGINGS = ITEMS.register("dreamstone_leggings",
            () -> new ArmorItem(ModArmorMaterials.DREAMSTONE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> DREAMSTONE_BOOTS = ITEMS.register("dreamstone_boots",
            () -> new ArmorItem(ModArmorMaterials.DREAMSTONE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
    public static final DeferredItem<Item> DREAMSTONE_HORSE_ARMOR = ITEMS.register("dreamstone_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.DREAMSTONE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    ///////////////////// TOOLS //////////////////////////
    //RAINBOW
    public static final DeferredItem<SwordItem> RAINBOW_SWORD = ITEMS.register("rainbow_sword",
            () -> new SwordItem(ModToolTiers.RAINBOW, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.RAINBOW, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> RAINBOW_PICKAXE = ITEMS.register("rainbow_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RAINBOW, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.RAINBOW, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> RAINBOW_SHOVEL = ITEMS.register("rainbow_shovel",
            () -> new ShovelItem(ModToolTiers.RAINBOW, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.RAINBOW, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> RAINBOW_AXE = ITEMS.register("rainbow_axe",
            () -> new AxeItem(ModToolTiers.RAINBOW, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.RAINBOW, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> RAINBOW_HOE = ITEMS.register("rainbow_hoe",
            () -> new HoeItem(ModToolTiers.RAINBOW, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.RAINBOW, 0F, -3.0f))));

    public static final DeferredItem<HammerItem> RAINBOW_HAMMER = ITEMS.register("rainbow_hammer",
            () -> new HammerItem(ModToolTiers.RAINBOW, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.RAINBOW, 7F, -3.5f))));

    //ROSIUM
    public static final DeferredItem<SwordItem> ROSIUM_SWORD = ITEMS.register("rosium_sword",
            () -> new SwordItem(ModToolTiers.ROSIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ROSIUM, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> ROSIUM_PICKAXE = ITEMS.register("rosium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROSIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ROSIUM, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> ROSIUM_SHOVEL = ITEMS.register("rosium_shovel",
            () -> new ShovelItem(ModToolTiers.ROSIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ROSIUM, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> ROSIUM_AXE = ITEMS.register("rosium_axe",
            () -> new AxeItem(ModToolTiers.ROSIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ROSIUM, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> ROSIUM_HOE = ITEMS.register("rosium_hoe",
            () -> new HoeItem(ModToolTiers.ROSIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ROSIUM, 0F, -3.0f))));

    public static final DeferredItem<HammerItem> ROSIUM_HAMMER = ITEMS.register("rosium_hammer",
            () -> new HammerItem(ModToolTiers.ROSIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ROSIUM, 7F, -3.5f))));

    //LUNARITE
    public static final DeferredItem<SwordItem> LUNARITE_SWORD = ITEMS.register("lunarite_sword",
            () -> new SwordItem(ModToolTiers.LUNARITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.LUNARITE, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> LUNARITE_PICKAXE = ITEMS.register("lunarite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LUNARITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.LUNARITE, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> LUNARITE_SHOVEL = ITEMS.register("lunarite_shovel",
            () -> new ShovelItem(ModToolTiers.LUNARITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.LUNARITE, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> LUNARITE_AXE = ITEMS.register("lunarite_axe",
            () -> new AxeItem(ModToolTiers.LUNARITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.LUNARITE, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> LUNARITE_HOE = ITEMS.register("lunarite_hoe",
            () -> new HoeItem(ModToolTiers.LUNARITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.LUNARITE, 0F, -3.0f))));

    public static final DeferredItem<HammerItem> LUNARITE_HAMMER = ITEMS.register("lunarite_hammer",
            () -> new HammerItem(ModToolTiers.LUNARITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.LUNARITE, 7F, -3.5f))));

    //DREAMSTONE
    public static final DeferredItem<SwordItem> DREAMSTONE_SWORD = ITEMS.register("dreamstone_sword",
            () -> new SwordItem(ModToolTiers.DREAMSTONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DREAMSTONE, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> DREAMSTONE_PICKAXE = ITEMS.register("dreamstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DREAMSTONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.DREAMSTONE, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> DREAMSTONE_SHOVEL = ITEMS.register("dreamstone_shovel",
            () -> new ShovelItem(ModToolTiers.DREAMSTONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.DREAMSTONE, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> DREAMSTONE_AXE = ITEMS.register("dreamstone_axe",
            () -> new AxeItem(ModToolTiers.DREAMSTONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.DREAMSTONE, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> DREAMSTONE_HOE = ITEMS.register("dreamstone_hoe",
            () -> new HoeItem(ModToolTiers.DREAMSTONE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.DREAMSTONE, 0F, -3.0f))));

    public static final DeferredItem<HammerItem> DREAMSTONE_HAMMER = ITEMS.register("dreamstone_hammer",
            () -> new HammerItem(ModToolTiers.DREAMSTONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.DREAMSTONE, 7F, -3.5f))));

    ////////////////////////////// SMITHING //////////////////////////////////
    public static final DeferredItem<Item> ES_SMITHING_TEMPLATE = ITEMS.register("es_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(ESMod.MOD_ID, "esmod")));

    ///////////////////////////// ENCHANTING //////////////////////////////////



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
