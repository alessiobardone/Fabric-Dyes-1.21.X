package net.brdviii.dyes.world.gen;

import net.brdviii.dyes.Dyes;
import net.brdviii.dyes.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModWorldGen {
    public static void generateModWorldGen() {
        Dyes.LOGGER.info("Adding Custom Worldgen for " + Dyes.MOD_ID);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUEBERRIES_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FLOWERS_PLACED_KEY);
    }
}

