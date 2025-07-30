package net.brdviii.dyes.datagen;

import net.brdviii.dyes.block.ModBlocks;
import net.brdviii.dyes.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
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
    }
}
