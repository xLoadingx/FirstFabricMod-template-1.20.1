package net.error.tutorialmod.datagen;

import net.error.tutorialmod.block.ModBlocks;
import net.error.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        rubyPool.stairs(ModBlocks.RUBY_STAIRS);
        rubyPool.slab(ModBlocks.RUBY_SLAB);
        rubyPool.button(ModBlocks.RUBY_BUTTON);
        rubyPool.fence(ModBlocks.RUBY_FENCE);
        rubyPool.fenceGate(ModBlocks.RUBY_FENCE_GATE);
        rubyPool.pressurePlate(ModBlocks.RUBY_PRESSURE_PLATE);
        rubyPool.wall(ModBlocks.RUBY_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.RUBY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUBY_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.COAL_BRIQUETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.COPPER_STICK_NORMAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_STICK_OXIDIZED, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_STICK_WEATHERED, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_STICK_EXPOSED, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_OAK_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ACACIA_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRCH_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRUCE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUARTZ_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_LAZULI_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COAL_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SINGULARITY_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_STICK, Models.GENERATED);

    }
}