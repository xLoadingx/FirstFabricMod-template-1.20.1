package net.error.tutorialmod.item;

import net.error.tutorialmod.TutorialMod;
import net.error.tutorialmod.item.custom.MetalDetectorItem;
import net.error.tutorialmod.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registeritem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registeritem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registeritem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TOMATO = registeritem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));

    public static final Item COAL_BRIQUETTE = registeritem("coal_briquette",
            new Item(new FabricItemSettings()));

    // More Sticks
    public static final Item CRIMSON_STICK = registeritem("crimson_stick",
            new Item(new FabricItemSettings()));
    public static final Item DARK_OAK_STICK = registeritem("dark_oak_stick",
                new Item(new FabricItemSettings()));
    public static final Item ACACIA_STICK = registeritem("acacia_stick",
                new Item(new FabricItemSettings()));
    public static final Item JUNGLE_STICK = registeritem("jungle_stick",
                new Item(new FabricItemSettings()));
    public static final Item BIRCH_STICK = registeritem("birch_stick",
                new Item(new FabricItemSettings()));
    public static final Item SPRUCE_STICK = registeritem("spruce_stick",
                new Item(new FabricItemSettings()));
    public static final Item COPPER_STICK_OXIDIZED = registeritem("copper_stick_oxidized",
                new Item(new FabricItemSettings()));
    public static final Item COPPER_STICK_WEATHERED = registeritem("copper_stick_weathered",
                new Item(new FabricItemSettings()));
    public static final Item COPPER_STICK_EXPOSED = registeritem("copper_stick_exposed",
                new Item(new FabricItemSettings()));
    public static final Item COPPER_STICK_NORMAL = registeritem("copper_stick_normal",
                new Item(new FabricItemSettings()));
    public static final Item QUARTZ_STICK = registeritem("quartz_stick",
                new Item(new FabricItemSettings()));
    public static final Item EMERALD_STICK = registeritem("emerald_stick",
                new Item(new FabricItemSettings()));
    public static final Item LAPIS_LAZULI_STICK = registeritem("lapis_lazuli_stick",
                new Item(new FabricItemSettings()));
    public static final Item COAL_STICK = registeritem("coal_stick",
                new Item(new FabricItemSettings()));
    public static final Item REDSTONE_STICK = registeritem("redstone_stick",
                new Item(new FabricItemSettings()));
    public static final Item DIAMOND_STICK = registeritem("diamond_stick",
                new Item(new FabricItemSettings()));
    public static final Item GOLD_STICK = registeritem("gold_stick",
                new Item(new FabricItemSettings()));
    public static final Item IRON_STICK = registeritem("iron_stick",
                new Item(new FabricItemSettings()));
    public static final Item STONE_STICK = registeritem("stone_stick",
                new Item(new FabricItemSettings()));
    public static final Item NETHERITE_STICK = registeritem("netherite_stick",
                new Item(new FabricItemSettings()));
    public static final Item SINGULARITY_STICK = registeritem("singularity_stick",
                new Item(new FabricItemSettings()));
    public static final Item WARPED_STICK = registeritem("warped_stick",
                new Item(new FabricItemSettings()));
    public static final Item RUBY_STICK = registeritem("ruby_stick",
            new Item(new FabricItemSettings()));

    // End Of More Sticks

    public static final Item RUBY_STAFF = registeritem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item RUBY_PICKAXE = registeritem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registeritem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 9, 3f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registeritem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 7, 2f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registeritem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registeritem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registeritem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registeritem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registeritem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registeritem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item RUBY_PICKAXE = registeritem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));

    public static final Item RUBY_AXE = registeritem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 9, 3f, new FabricItemSettings()));

    public static final Item RUBY_SWORD = registeritem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 7, 2f, new FabricItemSettings()));

    public static final Item RUBY_SHOVEL = registeritem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));

    public static final Item RUBY_HOE = registeritem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registeritem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item RUBY_CHESTPLATE = registeritem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item RUBY_LEGGINGS = registeritem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item RUBY_BOOTS = registeritem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY_STICK);
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(DARK_OAK_STICK);
        entries.add(ACACIA_STICK);
        entries.add(JUNGLE_STICK);
        entries.add(BIRCH_STICK);
        entries.add(SPRUCE_STICK);
        entries.add(COPPER_STICK_OXIDIZED);
        entries.add(COPPER_STICK_WEATHERED);
        entries.add(COPPER_STICK_EXPOSED);
        entries.add(COPPER_STICK_NORMAL);
        entries.add(QUARTZ_STICK);
        entries.add(EMERALD_STICK);
        entries.add(LAPIS_LAZULI_STICK);
        entries.add(COAL_STICK);
        entries.add(REDSTONE_STICK);
        entries.add(DIAMOND_STICK);
        entries.add(GOLD_STICK);
        entries.add(IRON_STICK);
        entries.add(STONE_STICK);
        entries.add(NETHERITE_STICK);
        entries.add(SINGULARITY_STICK);
        entries.add(WARPED_STICK);
        entries.add(CRIMSON_STICK);
    }

    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
