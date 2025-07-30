package net.brdviii.dyes.datagen;

import net.brdviii.dyes.Dyes;
import net.brdviii.dyes.block.ModBlocks;
import net.brdviii.dyes.block.custom.BlueberryBushBlock;
import net.brdviii.dyes.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.BLURPLE_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.CANARY_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.CORAL_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.ROSE_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.SACRAMENTO_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.SANGRIA_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.SKY_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSouthDefaultHorizontalFacing(TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,ModBlocks.WASABI_GLAZED_TERRACOTTA);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLURPLE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CANARY_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORAL_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SACRAMENTO_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANGRIA_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKY_CONCRETE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WASABI_CONCRETE);

        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.BLURPLE_CONCRETE_POWDER);
        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.CANARY_CONCRETE_POWDER);
        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.CORAL_CONCRETE_POWDER);
        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.ROSE_CONCRETE_POWDER);
        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.SACRAMENTO_CONCRETE_POWDER);
        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.SANGRIA_CONCRETE_POWDER);
        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.SKY_CONCRETE_POWDER);
        blockStateModelGenerator.registerRandomHorizontalRotations(TexturedModel.CUBE_ALL,ModBlocks.WASABI_CONCRETE_POWDER);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLURPLE_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CANARY_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORAL_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SACRAMENTO_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANGRIA_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKY_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WASABI_TERRACOTTA);

        blockStateModelGenerator.registerGlassPane(ModBlocks.BLURPLE_STAINED_GLASS, ModBlocks.BLURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.CANARY_STAINED_GLASS, ModBlocks.CANARY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.CORAL_STAINED_GLASS, ModBlocks.CORAL_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.ROSE_STAINED_GLASS, ModBlocks.ROSE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.SACRAMENTO_STAINED_GLASS, ModBlocks.SACRAMENTO_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.SANGRIA_STAINED_GLASS, ModBlocks.SANGRIA_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.SKY_STAINED_GLASS, ModBlocks.SKY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.WASABI_STAINED_GLASS, ModBlocks.WASABI_STAINED_GLASS_PANE);

        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLURPLE_WOOL, ModBlocks.BLURPLE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CANARY_WOOL, ModBlocks.CANARY_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CORAL_WOOL, ModBlocks.CORAL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ROSE_WOOL, ModBlocks.ROSE_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.SACRAMENTO_WOOL, ModBlocks.SACRAMENTO_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.SANGRIA_WOOL, ModBlocks.SANGRIA_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.SKY_WOOL, ModBlocks.SKY_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WASABI_WOOL, ModBlocks.WASABI_CARPET);

        blockStateModelGenerator.registerCandle(ModBlocks.BLURPLE_CANDLE,ModBlocks.BLURPLE_CANDLE_CAKE);
        blockStateModelGenerator.registerCandle(ModBlocks.CANARY_CANDLE,ModBlocks.CANARY_CANDLE_CAKE);
        blockStateModelGenerator.registerCandle(ModBlocks.CORAL_CANDLE,ModBlocks.CORAL_CANDLE_CAKE);
        blockStateModelGenerator.registerCandle(ModBlocks.ROSE_CANDLE,ModBlocks.ROSE_CANDLE_CAKE);
        blockStateModelGenerator.registerCandle(ModBlocks.SACRAMENTO_CANDLE,ModBlocks.SACRAMENTO_CANDLE_CAKE);
        blockStateModelGenerator.registerCandle(ModBlocks.SANGRIA_CANDLE,ModBlocks.SANGRIA_CANDLE_CAKE);
        blockStateModelGenerator.registerCandle(ModBlocks.SKY_CANDLE,ModBlocks.SKY_CANDLE_CAKE);
        blockStateModelGenerator.registerCandle(ModBlocks.WASABI_CANDLE,ModBlocks.WASABI_CANDLE_CAKE);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BLUEBERRY_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED,
                BlueberryBushBlock.AGE, 0,1,2,3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BLURPLE_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANARY_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORAL_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SACRAMENTO_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANGRIA_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SKY_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WASABI_DYE, Models.GENERATED);
    }
}
