package net.brdviii.dyes.datagen;

import net.brdviii.dyes.block.ModBlocks;
import net.brdviii.dyes.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
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
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup,recipeExporter) {
            @Override
            public void generate() {
                //GLAZED TERRACOTTA
                List<ItemConvertible> BLURPLE_TERRACOTTA = List.of(ModBlocks.BLURPLE_TERRACOTTA);
                List<ItemConvertible> CANARY_TERRACOTTA = List.of(ModBlocks.CANARY_TERRACOTTA);
                List<ItemConvertible> CORAL_TERRACOTTA = List.of(ModBlocks.CORAL_TERRACOTTA);
                List<ItemConvertible> ROSE_TERRACOTTA = List.of(ModBlocks.ROSE_TERRACOTTA);
                List<ItemConvertible> SACRAMENTO_TERRACOTTA = List.of(ModBlocks.SACRAMENTO_TERRACOTTA);
                List<ItemConvertible> SANGRIA_TERRACOTTA = List.of(ModBlocks.SANGRIA_TERRACOTTA);
                List<ItemConvertible> SKY_TERRACOTTA = List.of(ModBlocks.SKY_TERRACOTTA);
                List<ItemConvertible> WASABI_TERRACOTTA = List.of(ModBlocks.WASABI_TERRACOTTA);

                offerSmelting(BLURPLE_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.BLURPLE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "blurple_glazed_terracotta");
                offerSmelting(CANARY_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.CANARY_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "canary_glazed_terracotta");
                offerSmelting(CORAL_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.CORAL_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "coral_glazed_terracotta");
                offerSmelting(ROSE_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.ROSE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "rose_glazed_terracotta");
                offerSmelting(SACRAMENTO_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.SACRAMENTO_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "sacramento_glazed_terracotta");
                offerSmelting(SANGRIA_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.SANGRIA_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "sangria_glazed_terracotta");
                offerSmelting(SKY_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.SKY_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "sky_glazed_terracotta");
                offerSmelting(WASABI_TERRACOTTA, RecipeCategory.DECORATIONS, ModBlocks.WASABI_GLAZED_TERRACOTTA.asItem(), 0.1F, 200, "wasabi_glazed_terracotta");

                //CONCRETE POWDER
                offerConcretePowderDyeingRecipe(ModBlocks.BLURPLE_CONCRETE_POWDER, ModItems.BLURPLE_DYE);
                offerConcretePowderDyeingRecipe(ModBlocks.CANARY_CONCRETE_POWDER, ModItems.CANARY_DYE);
                offerConcretePowderDyeingRecipe(ModBlocks.CORAL_CONCRETE_POWDER, ModItems.CORAL_DYE);
                offerConcretePowderDyeingRecipe(ModBlocks.ROSE_CONCRETE_POWDER, ModItems.ROSE_DYE);
                offerConcretePowderDyeingRecipe(ModBlocks.SACRAMENTO_CONCRETE_POWDER, ModItems.SACRAMENTO_DYE);
                offerConcretePowderDyeingRecipe(ModBlocks.SANGRIA_CONCRETE_POWDER, ModItems.SANGRIA_DYE);
                offerConcretePowderDyeingRecipe(ModBlocks.SKY_CONCRETE_POWDER, ModItems.SKY_DYE);
                offerConcretePowderDyeingRecipe(ModBlocks.WASABI_CONCRETE_POWDER, ModItems.WASABI_DYE);

                //TERRACOTTA
                offerTerracottaDyeingRecipe(ModBlocks.BLURPLE_TERRACOTTA, ModItems.BLURPLE_DYE);
                offerTerracottaDyeingRecipe(ModBlocks.CANARY_TERRACOTTA, ModItems.CANARY_DYE);
                offerTerracottaDyeingRecipe(ModBlocks.CORAL_TERRACOTTA, ModItems.CORAL_DYE);
                offerTerracottaDyeingRecipe(ModBlocks.ROSE_TERRACOTTA, ModItems.ROSE_DYE);
                offerTerracottaDyeingRecipe(ModBlocks.SACRAMENTO_TERRACOTTA, ModItems.SACRAMENTO_DYE);
                offerTerracottaDyeingRecipe(ModBlocks.SANGRIA_TERRACOTTA, ModItems.SANGRIA_DYE);
                offerTerracottaDyeingRecipe(ModBlocks.SKY_TERRACOTTA, ModItems.SKY_DYE);
                offerTerracottaDyeingRecipe(ModBlocks.WASABI_TERRACOTTA, ModItems.WASABI_DYE);

                //GLASS
                offerStainedGlassDyeingRecipe(ModBlocks.BLURPLE_STAINED_GLASS, ModItems.BLURPLE_DYE);
                offerStainedGlassDyeingRecipe(ModBlocks.CANARY_STAINED_GLASS, ModItems.CANARY_DYE);
                offerStainedGlassDyeingRecipe(ModBlocks.CORAL_STAINED_GLASS, ModItems.CORAL_DYE);
                offerStainedGlassDyeingRecipe(ModBlocks.ROSE_STAINED_GLASS, ModItems.ROSE_DYE);
                offerStainedGlassDyeingRecipe(ModBlocks.SACRAMENTO_STAINED_GLASS, ModItems.SACRAMENTO_DYE);
                offerStainedGlassDyeingRecipe(ModBlocks.SANGRIA_STAINED_GLASS, ModItems.SANGRIA_DYE);
                offerStainedGlassDyeingRecipe(ModBlocks.SKY_STAINED_GLASS, ModItems.SKY_DYE);
                offerStainedGlassDyeingRecipe(ModBlocks.WASABI_STAINED_GLASS, ModItems.WASABI_DYE);

                //GLASS PANE
                offerStainedGlassPaneRecipe(ModBlocks.BLURPLE_STAINED_GLASS_PANE, ModBlocks.BLURPLE_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.BLURPLE_STAINED_GLASS_PANE, ModItems.BLURPLE_DYE);
                offerStainedGlassPaneRecipe(ModBlocks.CANARY_STAINED_GLASS_PANE, ModBlocks.CANARY_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.CANARY_STAINED_GLASS_PANE, ModItems.CANARY_DYE);
                offerStainedGlassPaneRecipe(ModBlocks.CORAL_STAINED_GLASS_PANE, ModBlocks.CORAL_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.CORAL_STAINED_GLASS_PANE, ModItems.CORAL_DYE);
                offerStainedGlassPaneRecipe(ModBlocks.ROSE_STAINED_GLASS_PANE, ModBlocks.ROSE_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.ROSE_STAINED_GLASS_PANE, ModItems.ROSE_DYE);
                offerStainedGlassPaneRecipe(ModBlocks.SACRAMENTO_STAINED_GLASS_PANE, ModBlocks.SACRAMENTO_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.SACRAMENTO_STAINED_GLASS_PANE, ModItems.SACRAMENTO_DYE);
                offerStainedGlassPaneRecipe(ModBlocks.SANGRIA_STAINED_GLASS_PANE, ModBlocks.SANGRIA_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.SANGRIA_STAINED_GLASS_PANE, ModItems.SANGRIA_DYE);
                offerStainedGlassPaneRecipe(ModBlocks.SKY_STAINED_GLASS_PANE, ModBlocks.SKY_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.SKY_STAINED_GLASS_PANE, ModItems.SKY_DYE);
                offerStainedGlassPaneRecipe(ModBlocks.WASABI_STAINED_GLASS_PANE, ModBlocks.WASABI_STAINED_GLASS);
                offerStainedGlassPaneDyeingRecipe(ModBlocks.WASABI_STAINED_GLASS_PANE, ModItems.WASABI_DYE);

                //WOOL
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.BLURPLE_WOOL,1)
                        .input(ModItems.BLURPLE_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.BLURPLE_DYE), conditionsFromItem(ModItems.BLURPLE_DYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.CANARY_WOOL,1)
                        .input(ModItems.CANARY_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.CANARY_DYE), conditionsFromItem(ModItems.CANARY_DYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.CORAL_WOOL,1)
                        .input(ModItems.CORAL_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.CORAL_DYE), conditionsFromItem(ModItems.CORAL_DYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.ROSE_WOOL,1)
                        .input(ModItems.ROSE_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.ROSE_DYE), conditionsFromItem(ModItems.ROSE_DYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.SACRAMENTO_WOOL,1)
                        .input(ModItems.SACRAMENTO_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.SACRAMENTO_DYE), conditionsFromItem(ModItems.SACRAMENTO_DYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.SANGRIA_WOOL,1)
                        .input(ModItems.SANGRIA_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.SANGRIA_DYE), conditionsFromItem(ModItems.SANGRIA_DYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.SKY_WOOL,1)
                        .input(ModItems.SKY_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.SKY_DYE), conditionsFromItem(ModItems.SKY_DYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.DECORATIONS,ModBlocks.WASABI_WOOL,1)
                        .input(ModItems.WASABI_DYE)
                        .input(Blocks.WHITE_WOOL)
                        .criterion(hasItem(ModItems.WASABI_DYE), conditionsFromItem(ModItems.WASABI_DYE))
                        .offerTo(exporter);

                //WOOL CARPET
                offerCarpetRecipe(ModBlocks.BLURPLE_CARPET, ModBlocks.BLURPLE_WOOL);
                offerCarpetRecipe(ModBlocks.CANARY_CARPET, ModBlocks.CANARY_WOOL);
                offerCarpetRecipe(ModBlocks.CORAL_CARPET, ModBlocks.CORAL_WOOL);
                offerCarpetRecipe(ModBlocks.ROSE_CARPET, ModBlocks.ROSE_WOOL);
                offerCarpetRecipe(ModBlocks.SACRAMENTO_CARPET, ModBlocks.SACRAMENTO_WOOL);
                offerCarpetRecipe(ModBlocks.SANGRIA_CARPET, ModBlocks.SANGRIA_WOOL);
                offerCarpetRecipe(ModBlocks.SKY_CARPET, ModBlocks.SKY_WOOL);
                offerCarpetRecipe(ModBlocks.WASABI_CARPET, ModBlocks.WASABI_WOOL);

                //CANDLE
                offerCandleDyeingRecipe(ModBlocks.BLURPLE_CANDLE, ModItems.BLURPLE_DYE);
                offerCandleDyeingRecipe(ModBlocks.CANARY_CANDLE, ModItems.CANARY_DYE);
                offerCandleDyeingRecipe(ModBlocks.CORAL_CANDLE, ModItems.CORAL_DYE);
                offerCandleDyeingRecipe(ModBlocks.ROSE_CANDLE, ModItems.ROSE_DYE);
                offerCandleDyeingRecipe(ModBlocks.SACRAMENTO_CANDLE, ModItems.SACRAMENTO_DYE);
                offerCandleDyeingRecipe(ModBlocks.SANGRIA_CANDLE, ModItems.SANGRIA_DYE);
                offerCandleDyeingRecipe(ModBlocks.SKY_CANDLE, ModItems.SKY_DYE);
                offerCandleDyeingRecipe(ModBlocks.WASABI_CANDLE, ModItems.WASABI_DYE);

                //DYE
                createShapeless(RecipeCategory.MISC,ModItems.BLURPLE_DYE,1)
                        .input(ModItems.BLUEBERRIES)
                        .criterion(hasItem(ModItems.BLUEBERRIES), conditionsFromItem(ModItems.BLUEBERRIES))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.CANARY_DYE,2)
                        .input(ModBlocks.GOOB_BLOSSOM)
                        .criterion(hasItem(ModBlocks.GOOB_BLOSSOM), conditionsFromItem(ModBlocks.GOOB_BLOSSOM))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.CORAL_DYE,1)
                        .input(ModBlocks.PEACH_BELLFLOWER)
                        .criterion(hasItem(ModBlocks.PEACH_BELLFLOWER), conditionsFromItem(ModBlocks.PEACH_BELLFLOWER))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.ROSE_DYE,1)
                        .input(ModBlocks.ROSE)
                        .criterion(hasItem(ModBlocks.ROSE), conditionsFromItem(ModBlocks.ROSE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.SACRAMENTO_DYE,2)
                        .input(Items.CYAN_DYE)
                        .input(Items.GREEN_DYE)
                        .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                        .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.SANGRIA_DYE,2)
                        .input(Items.RED_DYE)
                        .input(Items.PURPLE_DYE)
                        .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                        .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.SKY_DYE,2)
                        .input(Items.LIGHT_BLUE_DYE)
                        .input(Items.WHITE_DYE)
                        .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                        .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.WASABI_DYE,2)
                        .input(Items.LIME_DYE)
                        .input(Items.WHITE_DYE)
                        .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                        .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                        .offerTo(exporter);

                //FOOD
                createShapeless(RecipeCategory.FOOD,ModItems.SWEETBERRIES_COOKIE,1)
                        .input(Items.COOKIE)
                        .input(Items.SWEET_BERRIES)
                        .criterion(hasItem(Items.COOKIE), conditionsFromItem(Items.COOKIE))
                        .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD,ModItems.BLUEBERRIES_COOKIE,1)
                        .input(Items.COOKIE)
                        .input(ModItems.BLUEBERRIES)
                        .criterion(hasItem(Items.COOKIE), conditionsFromItem(Items.COOKIE))
                        .criterion(hasItem(ModItems.BLUEBERRIES), conditionsFromItem(ModItems.BLUEBERRIES))
                        .offerTo(exporter);
            }
        };
    }


    @Override
    public String getName() {
        return "";
    }
}
