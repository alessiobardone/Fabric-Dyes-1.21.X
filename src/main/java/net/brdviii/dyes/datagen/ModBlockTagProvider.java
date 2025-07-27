package net.brdviii.dyes.datagen;

import net.brdviii.dyes.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLURPLE_GLAZED_TERRACOTTA)
                .add(ModBlocks.CANARY_GLAZED_TERRACOTTA)
                .add(ModBlocks.CORAL_GLAZED_TERRACOTTA)
                .add(ModBlocks.ROSE_GLAZED_TERRACOTTA)
                .add(ModBlocks.SACRAMENTO_GLAZED_TERRACOTTA)
                .add(ModBlocks.SANGRIA_GLAZED_TERRACOTTA)
                .add(ModBlocks.SKY_GLAZED_TERRACOTTA)
                .add(ModBlocks.WASABI_GLAZED_TERRACOTTA)

                .add(ModBlocks.BLURPLE_CONCRETE)
                .add(ModBlocks.CANARY_CONCRETE)
                .add(ModBlocks.CORAL_CONCRETE)
                .add(ModBlocks.ROSE_CONCRETE)
                .add(ModBlocks.SACRAMENTO_CONCRETE)
                .add(ModBlocks.SANGRIA_CONCRETE)
                .add(ModBlocks.SKY_CONCRETE)
                .add(ModBlocks.WASABI_CONCRETE);
    }
}
