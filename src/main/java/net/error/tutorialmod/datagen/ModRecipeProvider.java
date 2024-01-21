package net.error.tutorialmod.datagen;

import net.error.tutorialmod.block.ModBlocks;
import net.error.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.Criterion;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    Item RUBY = ModItems.RUBY;
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_STONE_RUBY_ORE);
    private static final List<ItemConvertible> RAW_RUBY_BLOCK_TO_RUBY_BLOCK = List.of(ModBlocks.RAW_RUBY_BLOCK);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");
        offerSmelting(exporter, RAW_RUBY_BLOCK_TO_RUBY_BLOCK, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK,
                0.7f, 500, "ruby");
        offerBlasting(exporter, RAW_RUBY_BLOCK_TO_RUBY_BLOCK, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK,
                0.7f, 300, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY, 1)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', ModItems.RUBY)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_RUBY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COAL_BRIQUETTE, 1)
                .pattern("KKK")
                .pattern("KCK")
                .pattern("KKK")
                .input('K', Items.KELP)
                .input('C', Items.COAL)
                .criterion(hasItem(Items.KELP), conditionsFromItem(Items.KELP))
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COAL_BRIQUETTE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_WALL, 6)
                .pattern("   ")
                .pattern("ooo")
                .pattern("ooo")
                .input('o', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUBY_BUTTON, 1)
                .pattern("   ")
                .pattern(" o ")
                .pattern("   ")
                .input('o', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUBY_DOOR, 3)
                .pattern("oo ")
                .pattern("oo ")
                .pattern("oo ")
                .input('o', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_STAIRS, 4)
                .pattern("o  ")
                .pattern("oo ")
                .pattern("ooo")
                .input('o', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.RUBY_FENCE, 3)
                .pattern("o/o")
                .pattern("o/o")
                .pattern("   ")
                .input('o', ModItems.RUBY)
                .input('/', ModItems.RUBY_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.RUBY_FENCE_GATE, 3)
                .pattern("/o/")
                .pattern("/o/")
                .pattern("   ")
                .input('o', ModItems.RUBY)
                .input('/', ModItems.RUBY_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUBY_PRESSURE_PLATE, 1)
                .pattern("   ")
                .pattern("   ")
                .pattern("oo ")
                .input('o', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUBY_TRAPDOOR, 2)
                .pattern("ooo")
                .pattern("ooo")
                .pattern("   ")
                .input('o', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SWORD, 1)
                .pattern(" o ")
                .pattern(" o ")
                .pattern(" | ")
                .input('o', ModItems.RUBY)
                .input('|', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE, 1)
                .pattern("ooo")
                .pattern(" | ")
                .pattern(" | ")
                .input('o', ModItems.RUBY)
                .input('|', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_AXE, 1)
                .pattern("oo ")
                .pattern("o| ")
                .pattern(" | ")
                .input('o', ModItems.RUBY)
                .input('|', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL, 1)
                .pattern(" o ")
                .pattern(" | ")
                .pattern(" | ")
                .input('o', ModItems.RUBY)
                .input('|', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HOE, 1)
                .pattern("oo ")
                .pattern(" | ")
                .pattern(" | ")
                .input('o', ModItems.RUBY)
                .input('|', ModItems.NETHERITE_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NETHERITE_STICK, 10)
                .pattern("   ")
                .pattern(" | ")
                .pattern(" | ")
                .input('|', Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SINGULARITY_STICK, 10)
                .pattern(" | ")
                .pattern(" O ")
                .pattern(" | ")
                .input('|', ModItems.NETHERITE_STICK)
                .input('O', Items.ENDER_PEARL)
                .criterion(hasItem(ModItems.NETHERITE_STICK), conditionsFromItem(ModItems.NETHERITE_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SINGULARITY_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WARPED_STICK, 4)
                .pattern("   ")
                .pattern(" | ")
                .pattern(" | ")
                .input('|', Items.WARPED_PLANKS)
                .criterion(hasItem(Items.WARPED_PLANKS), conditionsFromItem(Items.WARPED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WARPED_STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRIMSON_STICK, 4)
                .pattern("   ")
                .pattern(" | ")
                .pattern(" | ")
                .input('|', Items.CRIMSON_PLANKS)
                .criterion(hasItem(Items.CRIMSON_PLANKS), conditionsFromItem(Items.CRIMSON_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRIMSON_STICK)));
    }
}
