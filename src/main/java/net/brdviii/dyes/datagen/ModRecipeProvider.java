package net.brdviii.dyes.datagen;

import net.brdviii.dyes.block.ModBlocks;
import net.brdviii.dyes.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //GLAZED TERRACOTTA
        List<ItemConvertible> BLURPLE_TERRACOTTA = List.of(ModBlocks.BLURPLE_TERRACOTTA);
        List<ItemConvertible> CANARY_TERRACOTTA = List.of(ModBlocks.CANARY_TERRACOTTA);
        List<ItemConvertible> CORAL_TERRACOTTA = List.of(ModBlocks.CORAL_TERRACOTTA);
        List<ItemConvertible> ROSE_TERRACOTTA = List.of(ModBlocks.ROSE_TERRACOTTA);
        List<ItemConvertible> SACRAMENTO_TERRACOTTA = List.of(ModBlocks.SACRAMENTO_TERRACOTTA);
        List<ItemConvertible> SANGRIA_TERRACOTTA = List.of(ModBlocks.SANGRIA_TERRACOTTA);
        List<ItemConvertible> SKY_TERRACOTTA = List.of(ModBlocks.SKY_TERRACOTTA);
        List<ItemConvertible> WASABI_TERRACOTTA = List.of(ModBlocks.WASABI_TERRACOTTA);

        offerSmelting(exporter, BLURPLE_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.BLURPLE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "blurple_glazed_terracotta");
        offerSmelting(exporter, CANARY_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.CANARY_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "canary_glazed_terracotta");
        offerSmelting(exporter, CORAL_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.CORAL_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "coral_glazed_terracotta");
        offerSmelting(exporter, ROSE_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.ROSE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "rose_glazed_terracotta");
        offerSmelting(exporter, SACRAMENTO_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.SACRAMENTO_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "sacramento_glazed_terracotta");
        offerSmelting(exporter, SANGRIA_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.SANGRIA_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "sangria_glazed_terracotta");
        offerSmelting(exporter, SKY_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.SKY_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "sky_glazed_terracotta");
        offerSmelting(exporter, WASABI_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.WASABI_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "wasabi_glazed_terracotta");

        //CONCRETE POWDER
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.BLURPLE_CONCRETE_POWDER, ModItems.BLURPLE_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.CANARY_CONCRETE_POWDER, ModItems.CANARY_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.CORAL_CONCRETE_POWDER, ModItems.CORAL_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.ROSE_CONCRETE_POWDER, ModItems.ROSE_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.SACRAMENTO_CONCRETE_POWDER, ModItems.SACRAMENTO_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.SANGRIA_CONCRETE_POWDER, ModItems.SANGRIA_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.SKY_CONCRETE_POWDER, ModItems.SKY_DYE);
        offerConcretePowderDyeingRecipe(exporter, ModBlocks.WASABI_CONCRETE_POWDER, ModItems.WASABI_DYE);

        //TERRACOTTA
        offerTerracottaDyeingRecipe(exporter, ModBlocks.BLURPLE_TERRACOTTA, ModItems.BLURPLE_DYE);
        offerTerracottaDyeingRecipe(exporter, ModBlocks.CANARY_TERRACOTTA, ModItems.CANARY_DYE);
        offerTerracottaDyeingRecipe(exporter, ModBlocks.CORAL_TERRACOTTA, ModItems.CORAL_DYE);
        offerTerracottaDyeingRecipe(exporter, ModBlocks.ROSE_TERRACOTTA, ModItems.ROSE_DYE);
        offerTerracottaDyeingRecipe(exporter, ModBlocks.SACRAMENTO_TERRACOTTA, ModItems.SACRAMENTO_DYE);
        offerTerracottaDyeingRecipe(exporter, ModBlocks.SANGRIA_TERRACOTTA, ModItems.SANGRIA_DYE);
        offerTerracottaDyeingRecipe(exporter, ModBlocks.SKY_TERRACOTTA, ModItems.SKY_DYE);
        offerTerracottaDyeingRecipe(exporter, ModBlocks.WASABI_TERRACOTTA, ModItems.WASABI_DYE);

        //GLASS
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.BLURPLE_STAINED_GLASS, ModItems.BLURPLE_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.CANARY_STAINED_GLASS, ModItems.CANARY_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.CORAL_STAINED_GLASS, ModItems.CORAL_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.ROSE_STAINED_GLASS, ModItems.ROSE_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.SACRAMENTO_STAINED_GLASS, ModItems.SACRAMENTO_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.SANGRIA_STAINED_GLASS, ModItems.SANGRIA_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.SKY_STAINED_GLASS, ModItems.SKY_DYE);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.WASABI_STAINED_GLASS, ModItems.WASABI_DYE);

        //GLASS PANE
        offerStainedGlassPaneRecipe(exporter, ModBlocks.BLURPLE_STAINED_GLASS_PANE, ModBlocks.BLURPLE_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.BLURPLE_STAINED_GLASS_PANE, ModItems.BLURPLE_DYE);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.CANARY_STAINED_GLASS_PANE, ModBlocks.CANARY_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.CANARY_STAINED_GLASS_PANE, ModItems.CANARY_DYE);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.CORAL_STAINED_GLASS_PANE, ModBlocks.CORAL_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.CORAL_STAINED_GLASS_PANE, ModItems.CORAL_DYE);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.ROSE_STAINED_GLASS_PANE, ModBlocks.ROSE_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.ROSE_STAINED_GLASS_PANE, ModItems.ROSE_DYE);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.SACRAMENTO_STAINED_GLASS_PANE, ModBlocks.SACRAMENTO_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.SACRAMENTO_STAINED_GLASS_PANE, ModItems.SACRAMENTO_DYE);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.SANGRIA_STAINED_GLASS_PANE, ModBlocks.SANGRIA_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.SANGRIA_STAINED_GLASS_PANE, ModItems.SANGRIA_DYE);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.SKY_STAINED_GLASS_PANE, ModBlocks.SKY_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.SKY_STAINED_GLASS_PANE, ModItems.SKY_DYE);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.WASABI_STAINED_GLASS_PANE, ModBlocks.WASABI_STAINED_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.WASABI_STAINED_GLASS_PANE, ModItems.WASABI_DYE);

        //WOOL
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.BLURPLE_WOOL,1)
                .input(ModItems.BLURPLE_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.BLURPLE_DYE), conditionsFromItem(ModItems.BLURPLE_DYE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.CANARY_WOOL,1)
                .input(ModItems.CANARY_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.CANARY_DYE), conditionsFromItem(ModItems.CANARY_DYE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.CORAL_WOOL,1)
                .input(ModItems.CORAL_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.CORAL_DYE), conditionsFromItem(ModItems.CORAL_DYE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.ROSE_WOOL,1)
                .input(ModItems.ROSE_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.ROSE_DYE), conditionsFromItem(ModItems.ROSE_DYE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.SACRAMENTO_WOOL,1)
                .input(ModItems.SACRAMENTO_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.SACRAMENTO_DYE), conditionsFromItem(ModItems.SACRAMENTO_DYE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.SANGRIA_WOOL,1)
                .input(ModItems.SANGRIA_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.SANGRIA_DYE), conditionsFromItem(ModItems.SANGRIA_DYE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.SKY_WOOL,1)
                .input(ModItems.SKY_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.SKY_DYE), conditionsFromItem(ModItems.SKY_DYE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,ModBlocks.WASABI_WOOL,1)
                .input(ModItems.WASABI_DYE)
                .input(Blocks.WHITE_WOOL)
                .criterion(hasItem(ModItems.WASABI_DYE), conditionsFromItem(ModItems.WASABI_DYE))
                .offerTo(exporter);

        //WOOL CARPET
        offerCarpetRecipe(exporter, ModBlocks.BLURPLE_CARPET, ModBlocks.BLURPLE_WOOL);
        offerCarpetRecipe(exporter, ModBlocks.CANARY_CARPET, ModBlocks.CANARY_WOOL);
        offerCarpetRecipe(exporter, ModBlocks.CORAL_CARPET, ModBlocks.CORAL_WOOL);
        offerCarpetRecipe(exporter, ModBlocks.ROSE_CARPET, ModBlocks.ROSE_WOOL);
        offerCarpetRecipe(exporter, ModBlocks.SACRAMENTO_CARPET, ModBlocks.SACRAMENTO_WOOL);
        offerCarpetRecipe(exporter, ModBlocks.SANGRIA_CARPET, ModBlocks.SANGRIA_WOOL);
        offerCarpetRecipe(exporter, ModBlocks.SKY_CARPET, ModBlocks.SKY_WOOL);
        offerCarpetRecipe(exporter, ModBlocks.WASABI_CARPET, ModBlocks.WASABI_WOOL);

        //CANDLE
        offerCandleDyeingRecipe(exporter, ModBlocks.BLURPLE_CANDLE, ModItems.BLURPLE_DYE);
        offerCandleDyeingRecipe(exporter, ModBlocks.CANARY_CANDLE, ModItems.CANARY_DYE);
        offerCandleDyeingRecipe(exporter, ModBlocks.CORAL_CANDLE, ModItems.CORAL_DYE);
        offerCandleDyeingRecipe(exporter, ModBlocks.ROSE_CANDLE, ModItems.ROSE_DYE);
        offerCandleDyeingRecipe(exporter, ModBlocks.SACRAMENTO_CANDLE, ModItems.SACRAMENTO_DYE);
        offerCandleDyeingRecipe(exporter, ModBlocks.SANGRIA_CANDLE, ModItems.SANGRIA_DYE);
        offerCandleDyeingRecipe(exporter, ModBlocks.SKY_CANDLE, ModItems.SKY_DYE);
        offerCandleDyeingRecipe(exporter, ModBlocks.WASABI_CANDLE, ModItems.WASABI_DYE);

        //DYE
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BLURPLE_DYE,1)
                .input(ModItems.BLUEBERRIES)
                .criterion(hasItem(ModItems.BLUEBERRIES), conditionsFromItem(ModItems.BLUEBERRIES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.CANARY_DYE,2)
                .input(ModBlocks.GOOB_BLOSSOM)
                .criterion(hasItem(ModBlocks.GOOB_BLOSSOM), conditionsFromItem(ModBlocks.GOOB_BLOSSOM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.CORAL_DYE,1)
                .input(ModBlocks.PEACH_BELLFLOWER)
                .criterion(hasItem(ModBlocks.PEACH_BELLFLOWER), conditionsFromItem(ModBlocks.PEACH_BELLFLOWER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.ROSE_DYE,1)
                .input(ModBlocks.ROSE)
                .criterion(hasItem(ModBlocks.ROSE), conditionsFromItem(ModBlocks.ROSE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.SACRAMENTO_DYE,2)
                .input(Items.CYAN_DYE)
                .input(Items.GREEN_DYE)
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.SANGRIA_DYE,2)
                .input(Items.RED_DYE)
                .input(Items.PURPLE_DYE)
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.SKY_DYE,2)
                .input(Items.LIGHT_BLUE_DYE)
                .input(Items.WHITE_DYE)
                .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.WASABI_DYE,2)
                .input(Items.LIME_DYE)
                .input(Items.WHITE_DYE)
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter);

        //FOOD
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.SWEETBERRIES_COOKIE,1)
                .input(Items.COOKIE)
                .input(Items.SWEET_BERRIES)
                .criterion(hasItem(Items.COOKIE), conditionsFromItem(Items.COOKIE))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.BLUEBERRIES_COOKIE,1)
                .input(Items.COOKIE)
                .input(ModItems.BLUEBERRIES)
                .criterion(hasItem(Items.COOKIE), conditionsFromItem(Items.COOKIE))
                .criterion(hasItem(ModItems.BLUEBERRIES), conditionsFromItem(ModItems.BLUEBERRIES))
                .offerTo(exporter);
    }
}
