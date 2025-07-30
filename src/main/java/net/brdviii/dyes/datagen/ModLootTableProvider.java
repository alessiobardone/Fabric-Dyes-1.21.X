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

        addDrop(ModBlocks.BLURPLE_CONCRETE_POWDER);
        addDrop(ModBlocks.CANARY_CONCRETE_POWDER);
        addDrop(ModBlocks.CORAL_CONCRETE_POWDER);
        addDrop(ModBlocks.ROSE_CONCRETE_POWDER);
        addDrop(ModBlocks.SACRAMENTO_CONCRETE_POWDER);
        addDrop(ModBlocks.SANGRIA_CONCRETE_POWDER);
        addDrop(ModBlocks.SKY_CONCRETE_POWDER);
        addDrop(ModBlocks.WASABI_CONCRETE_POWDER);

        addDrop(ModBlocks.BLURPLE_TERRACOTTA);
        addDrop(ModBlocks.CANARY_TERRACOTTA);
        addDrop(ModBlocks.CORAL_TERRACOTTA);
        addDrop(ModBlocks.ROSE_TERRACOTTA);
        addDrop(ModBlocks.SACRAMENTO_TERRACOTTA);
        addDrop(ModBlocks.SANGRIA_TERRACOTTA);
        addDrop(ModBlocks.SKY_TERRACOTTA);
        addDrop(ModBlocks.WASABI_TERRACOTTA);

        addDropWithSilkTouch(ModBlocks.BLURPLE_STAINED_GLASS);
        addDropWithSilkTouch(ModBlocks.CANARY_STAINED_GLASS);
        addDropWithSilkTouch(ModBlocks.CORAL_STAINED_GLASS);
        addDropWithSilkTouch(ModBlocks.ROSE_STAINED_GLASS);
        addDropWithSilkTouch(ModBlocks.SACRAMENTO_STAINED_GLASS);
        addDropWithSilkTouch(ModBlocks.SANGRIA_STAINED_GLASS);
        addDropWithSilkTouch(ModBlocks.SKY_STAINED_GLASS);
        addDropWithSilkTouch(ModBlocks.WASABI_STAINED_GLASS);

        addDropWithSilkTouch(ModBlocks.BLURPLE_STAINED_GLASS_PANE);
        addDropWithSilkTouch(ModBlocks.CANARY_STAINED_GLASS_PANE);
        addDropWithSilkTouch(ModBlocks.CORAL_STAINED_GLASS_PANE);
        addDropWithSilkTouch(ModBlocks.ROSE_STAINED_GLASS_PANE);
        addDropWithSilkTouch(ModBlocks.SACRAMENTO_STAINED_GLASS_PANE);
        addDropWithSilkTouch(ModBlocks.SANGRIA_STAINED_GLASS_PANE);
        addDropWithSilkTouch(ModBlocks.SKY_STAINED_GLASS_PANE);
        addDropWithSilkTouch(ModBlocks.WASABI_STAINED_GLASS_PANE);

        addDrop(ModBlocks.BLURPLE_WOOL);
        addDrop(ModBlocks.CANARY_WOOL);
        addDrop(ModBlocks.CORAL_WOOL);
        addDrop(ModBlocks.ROSE_WOOL);
        addDrop(ModBlocks.SACRAMENTO_WOOL);
        addDrop(ModBlocks.SANGRIA_WOOL);
        addDrop(ModBlocks.SKY_WOOL);
        addDrop(ModBlocks.WASABI_WOOL);

        addDrop(ModBlocks.BLURPLE_CARPET);
        addDrop(ModBlocks.CANARY_CARPET);
        addDrop(ModBlocks.CORAL_CARPET);
        addDrop(ModBlocks.ROSE_CARPET);
        addDrop(ModBlocks.SACRAMENTO_CARPET);
        addDrop(ModBlocks.SANGRIA_CARPET);
        addDrop(ModBlocks.SKY_CARPET);
        addDrop(ModBlocks.WASABI_CARPET);

        addDrop(ModBlocks.BLURPLE_CANDLE);
        addDrop(ModBlocks.CANARY_CANDLE);
        addDrop(ModBlocks.CORAL_CANDLE);
        addDrop(ModBlocks.ROSE_CANDLE);
        addDrop(ModBlocks.SACRAMENTO_CANDLE);
        addDrop(ModBlocks.SANGRIA_CANDLE);
        addDrop(ModBlocks.SKY_CANDLE);
        addDrop(ModBlocks.WASABI_CANDLE);
    }
}
