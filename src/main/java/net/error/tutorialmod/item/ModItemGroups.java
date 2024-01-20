package net.error.tutorialmod.item;

import net.error.tutorialmod.TutorialMod;
import net.error.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        // Ruby Item's
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        // Ruby Block's
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);
                        entries.add(ModBlocks.RUBY_DOOR);

                        // Advanced Item's / Block's
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.COAL_BRIQUETTE);

                        // Food Item's
                        entries.add(ModItems.TOMATO);

                        // Ruby Ore type's
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);

                    }).build());

    public static final ItemGroup MORE_STICKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "sticks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sticks"))
                    .icon(() -> new ItemStack(Items.STICK)).entries((displayContext, entries) -> {
                        entries.add(Items.STICK);
                        entries.add(ModItems.DARK_OAK_STICK);
                        entries.add(ModItems.ACACIA_STICK);
                        entries.add(ModItems.JUNGLE_STICK);
                        entries.add(ModItems.BIRCH_STICK);

                        entries.add(ModItems.CRIMSON_STICK);
                        entries.add(ModItems.WARPED_STICK);

                        entries.add(ModItems.NETHERITE_STICK);
                        entries.add(ModItems.DIAMOND_STICK);
                        entries.add(ModItems.GOLD_STICK);
                        entries.add(ModItems.IRON_STICK);
                        entries.add(ModItems.STONE_STICK);

                        entries.add(ModItems.COPPER_STICK_OXIDIZED);
                        entries.add(ModItems.COPPER_STICK_WEATHERED);
                        entries.add(ModItems.COPPER_STICK_EXPOSED);
                        entries.add(ModItems.COPPER_STICK_NORMAL);

                        entries.add(ModItems.EMERALD_STICK);
                        entries.add(ModItems.LAPIS_LAZULI_STICK);
                        entries.add(ModItems.REDSTONE_STICK);
                        entries.add(ModItems.COAL_STICK);

                        entries.add(ModItems.SINGULARITY_STICK);

                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
