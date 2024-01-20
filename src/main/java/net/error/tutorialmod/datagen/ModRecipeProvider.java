package net.error.tutorialmod.datagen;

import net.error.tutorialmod.block.ModBlocks;
import net.error.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
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

        createDoorRecipe(ModBlocks.RUBY_DOOR, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY));
        createStairsRecipe(ModBlocks.RUBY_STAIRS, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY));
        createFenceRecipe(ModBlocks.RUBY_FENCE, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY));
        createFenceGateRecipe(ModBlocks.RUBY_FENCE_GATE, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY));
        createPressurePlateRecipe(RecipeCategory.MISC, ModBlocks.RUBY_PRESSURE_PLATE, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY));
        createTrapdoorRecipe(ModBlocks.RUBY_TRAPDOOR, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_WALL, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_BUTTON, 1)
                .pattern("   ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_BUTTON)));
    }
}
