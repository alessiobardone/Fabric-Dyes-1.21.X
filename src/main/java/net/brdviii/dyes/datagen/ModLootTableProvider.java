package net.brdviii.dyes.datagen;

import net.brdviii.dyes.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLURPLE_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.CANARY_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.CORAL_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.ROSE_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.SACRAMENTO_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.SANGRIA_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.SKY_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.WASABI_GLAZED_TERRACOTTA);

        addDrop(ModBlocks.BLURPLE_CONCRETE);
        addDrop(ModBlocks.CANARY_CONCRETE);
        addDrop(ModBlocks.CORAL_CONCRETE);
        addDrop(ModBlocks.ROSE_CONCRETE);
        addDrop(ModBlocks.SACRAMENTO_CONCRETE);
        addDrop(ModBlocks.SANGRIA_CONCRETE);
        addDrop(ModBlocks.SKY_CONCRETE);
        addDrop(ModBlocks.WASABI_CONCRETE);
    }
}
