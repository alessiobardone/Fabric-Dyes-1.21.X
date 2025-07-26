package net.brdviii.dyes.datagen;

import net.brdviii.dyes.block.ModBlocks;
import net.brdviii.dyes.item.ModItems;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLURPLE_GLAZED_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SACRAMENTO_GLAZED_TERRACOTTA);
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
