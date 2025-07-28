package net.brdviii.dyes.datagen;

import net.brdviii.dyes.Dyes;
import net.brdviii.dyes.block.ModBlocks;
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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLURPLE_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CANARY_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORAL_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SACRAMENTO_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANGRIA_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKY_STAINED_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WASABI_STAINED_GLASS);
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
