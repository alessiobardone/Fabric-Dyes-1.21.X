package net.brdviii.dyes.world;

import net.brdviii.dyes.Dyes;
import net.brdviii.dyes.block.ModBlocks;
import net.brdviii.dyes.block.custom.BlueberryBushBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUEBERRIES_KEY = registerKey("blueberries_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLOWERS_KEY = registerKey("flowers_key");

    static Map<Block, Integer> flowers = Map.of(
            ModBlocks.GOOB_BLOSSOM, 1,
            ModBlocks.PEACH_BELLFLOWER, 1,
            ModBlocks.ROSE, 1
    );



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        Dyes.LOGGER.info("[Configured] BootsTrap");

        register(context, BLUEBERRIES_KEY, Feature.RANDOM_PATCH,
                ModConfiguredFeatures.BLUEBERRIES_BUSH_PATCH);
        Dyes.LOGGER.info("[Configured] Created: Blueberries Bush");


        register(context, FLOWERS_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(flowers,32));
    }


    public static RandomPatchFeatureConfig createMixedPatch(Map<Block, Integer> blocksWithWeights, int tries) {
        Dyes.LOGGER.info("[Configured] Created Mixed Patch of Tries " + tries);

        Pool.Builder<BlockState> builder = Pool.builder();
        for (Map.Entry<Block, Integer> entry : blocksWithWeights.entrySet()) {
            builder.add(entry.getKey().getDefaultState(), entry.getValue());
        }

        WeightedBlockStateProvider provider = new WeightedBlockStateProvider(builder);
        SimpleBlockFeatureConfig config = new SimpleBlockFeatureConfig(provider);

        return ConfiguredFeatures.createRandomPatchFeatureConfig(
                tries,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, config)
        );
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Dyes.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(@NotNull Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static final RandomPatchFeatureConfig BLUEBERRIES_BUSH_PATCH = net.minecraft.world.gen.feature.ConfiguredFeatures.createRandomPatchFeatureConfig(
            Feature.SIMPLE_BLOCK,
            new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(ModBlocks.BLUEBERRY_BUSH.getDefaultState()
                            .with(BlueberryBushBlock.AGE, 3))
            ),
            List.of(Blocks.GRASS_BLOCK)
    );
}
