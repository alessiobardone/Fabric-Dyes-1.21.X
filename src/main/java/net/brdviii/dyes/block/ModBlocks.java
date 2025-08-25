package net.brdviii.dyes.block;

import net.brdviii.dyes.Dyes;
import net.brdviii.dyes.block.custom.BlueberryBushBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    //GLAZED TERRACOTTA
    public static final Block BLURPLE_GLAZED_TERRACOTTA = registerBlock("blurple_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block CANARY_GLAZED_TERRACOTTA = registerBlock("canary_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block CORAL_GLAZED_TERRACOTTA = registerBlock("coral_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block ROSE_GLAZED_TERRACOTTA = registerBlock("rose_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block SACRAMENTO_GLAZED_TERRACOTTA = registerBlock("sacramento_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block SANGRIA_GLAZED_TERRACOTTA = registerBlock("sangria_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block SKY_GLAZED_TERRACOTTA = registerBlock("sky_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block WASABI_GLAZED_TERRACOTTA = registerBlock("wasabi_glazed_terracotta",
            properties ->  new GlazedTerracottaBlock(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.4F)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)));

    //CONCRETE
    public static final Block BLURPLE_CONCRETE = registerBlock("blurple_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block CANARY_CONCRETE = registerBlock("canary_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block CORAL_CONCRETE = registerBlock("coral_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block ROSE_CONCRETE = registerBlock("rose_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block SACRAMENTO_CONCRETE = registerBlock("sacramento_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block SANGRIA_CONCRETE = registerBlock("sangria_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block SKY_CONCRETE = registerBlock("sky_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block WASABI_CONCRETE = registerBlock("wasabi_concrete",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    //CONCRETE POWDER
    public static final Block BLURPLE_CONCRETE_POWDER = registerBlock("blurple_concrete_powder",
            properties -> new ConcretePowderBlock(BLURPLE_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block CANARY_CONCRETE_POWDER = registerBlock("canary_concrete_powder",
            properties -> new ConcretePowderBlock(CANARY_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block CORAL_CONCRETE_POWDER = registerBlock("coral_concrete_powder",
            properties -> new ConcretePowderBlock(CORAL_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block ROSE_CONCRETE_POWDER = registerBlock("rose_concrete_powder",
            properties -> new ConcretePowderBlock(ROSE_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block SACRAMENTO_CONCRETE_POWDER = registerBlock("sacramento_concrete_powder",
            properties -> new ConcretePowderBlock(SACRAMENTO_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block SANGRIA_CONCRETE_POWDER = registerBlock("sangria_concrete_powder",
            properties -> new ConcretePowderBlock(SANGRIA_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block SKY_CONCRETE_POWDER = registerBlock("sky_concrete_powder",
            properties -> new ConcretePowderBlock(SKY_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block WASABI_CONCRETE_POWDER = registerBlock("wasabi_concrete_powder",
            properties -> new ConcretePowderBlock(WASABI_CONCRETE, properties
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    //TERRACOTTA
    public static final Block BLURPLE_TERRACOTTA = registerBlock("blurple_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block CANARY_TERRACOTTA = registerBlock("canary_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block CORAL_TERRACOTTA = registerBlock("coral_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block ROSE_TERRACOTTA = registerBlock("rose_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block SACRAMENTO_TERRACOTTA = registerBlock("sacramento_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block SANGRIA_TERRACOTTA = registerBlock("sangria_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block SKY_TERRACOTTA = registerBlock("sky_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    public static final Block WASABI_TERRACOTTA = registerBlock("wasabi_terracotta",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()
                    .strength(1.5F, 6.0F)));

    //GLASS
    public static final Block BLURPLE_STAINED_GLASS = registerBlock("blurple_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block CANARY_STAINED_GLASS = registerBlock("canary_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block CORAL_STAINED_GLASS = registerBlock("coral_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block ROSE_STAINED_GLASS = registerBlock("rose_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block SACRAMENTO_STAINED_GLASS = registerBlock("sacramento_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block SANGRIA_STAINED_GLASS = registerBlock("sangria_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block SKY_STAINED_GLASS = registerBlock("sky_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block WASABI_STAINED_GLASS = registerBlock("wasabi_stained_glass",
            properties -> new StainedGlassBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    //GLASS PANE
    public static final Block BLURPLE_STAINED_GLASS_PANE = registerBlock("blurple_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block CANARY_STAINED_GLASS_PANE = registerBlock("canary_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block CORAL_STAINED_GLASS_PANE = registerBlock("coral_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block ROSE_STAINED_GLASS_PANE = registerBlock("rose_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block SACRAMENTO_STAINED_GLASS_PANE = registerBlock("sacramento_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block SANGRIA_STAINED_GLASS_PANE = registerBlock("sangria_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block SKY_STAINED_GLASS_PANE = registerBlock("sky_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block WASABI_STAINED_GLASS_PANE = registerBlock("wasabi_stained_glass_pane",
            properties -> new StainedGlassPaneBlock(DyeColor.WHITE, properties
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    //WOOL
    public static final Block BLURPLE_WOOL = registerBlock("blurple_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CANARY_WOOL = registerBlock("canary_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CORAL_WOOL = registerBlock("coral_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block ROSE_WOOL = registerBlock("rose_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SACRAMENTO_WOOL = registerBlock("sacramento_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SANGRIA_WOOL = registerBlock("sangria_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));


    public static final Block SKY_WOOL = registerBlock("sky_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block WASABI_WOOL = registerBlock("wasabi_wool",
            properties -> new Block(properties
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    //WOOL CARPET
    public static final Block BLURPLE_CARPET = registerBlock("blurple_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CANARY_CARPET = registerBlock("canary_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CORAL_CARPET = registerBlock("coral_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block ROSE_CARPET = registerBlock("rose_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SACRAMENTO_CARPET = registerBlock("sacramento_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SANGRIA_CARPET = registerBlock("sangria_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SKY_CARPET = registerBlock("sky_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block WASABI_CARPET = registerBlock("wasabi_carpet",
            properties -> new DyedCarpetBlock(DyeColor.WHITE, properties
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    //CANDLE
    public static final Block BLURPLE_CANDLE = registerBlock("blurple_candle",
            properties -> new CandleBlock(properties
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(CandleBlock.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLURPLE_CANDLE_CAKE = registerBlock("blurple_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.BLURPLE_CANDLE, properties
                    .solid()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CANARY_CANDLE = registerBlock("canary_candle",
            properties -> new CandleBlock(properties
            .nonOpaque()
            .strength(0.1F)
            .sounds(BlockSoundGroup.CANDLE)
            .luminance(CandleBlock.STATE_TO_LUMINANCE)
            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CANARY_CANDLE_CAKE = registerBlock("canary_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.CANARY_CANDLE, properties
            .solid()
            .strength(0.5F)
            .sounds(BlockSoundGroup.WOOL)
            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CORAL_CANDLE = registerBlock("coral_candle",
            properties -> new CandleBlock(properties
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(CandleBlock.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CORAL_CANDLE_CAKE = registerBlock("coral_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.CORAL_CANDLE, properties
                    .solid()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ROSE_CANDLE = registerBlock("rose_candle",
            properties -> new CandleBlock(properties
                    .nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(CandleBlock.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ROSE_CANDLE_CAKE = registerBlock("rose_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.ROSE_CANDLE, properties
                    .solid()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SACRAMENTO_CANDLE = registerBlock("sacramento_candle",
            properties -> new CandleBlock(properties
            .nonOpaque()
            .strength(0.1F)
            .sounds(BlockSoundGroup.CANDLE)
            .luminance(CandleBlock.STATE_TO_LUMINANCE)
            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SACRAMENTO_CANDLE_CAKE = registerBlock("sacramento_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.SACRAMENTO_CANDLE, properties
            .solid()
            .strength(0.5F)
            .sounds(BlockSoundGroup.WOOL)
            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SANGRIA_CANDLE = registerBlock("sangria_candle",
            properties -> new CandleBlock(properties
            .nonOpaque()
            .strength(0.1F)
            .sounds(BlockSoundGroup.CANDLE)
            .luminance(CandleBlock.STATE_TO_LUMINANCE)
            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SANGRIA_CANDLE_CAKE = registerBlock("sangria_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.SANGRIA_CANDLE, properties
                    .solid()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SKY_CANDLE = registerBlock("sky_candle",
            properties -> new CandleBlock(properties
            .nonOpaque()
            .strength(0.1F)
            .sounds(BlockSoundGroup.CANDLE)
            .luminance(CandleBlock.STATE_TO_LUMINANCE)
            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SKY_CANDLE_CAKE = registerBlock("sky_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.SKY_CANDLE, properties
                    .solid()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WASABI_CANDLE = registerBlock("wasabi_candle",
            properties -> new CandleBlock(properties
            .nonOpaque()
            .strength(0.1F)
            .sounds(BlockSoundGroup.CANDLE)
            .luminance(CandleBlock.STATE_TO_LUMINANCE)
            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WASABI_CANDLE_CAKE = registerBlock("wasabi_candle_cake",
            properties -> new CandleCakeBlock(ModBlocks.WASABI_CANDLE, properties
                    .solid()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    //BLUE BERRIES
    public static  final Block BLUEBERRY_BUSH = registerBlockWithoutItem("blueberry_bush",
            properties -> new BlueberryBushBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    //FLOWERS
    public static final Block GOOB_BLOSSOM = registerBlock("goob_blossom",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PEACH_BELLFLOWER = registerBlock("peach_bellflower",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POTTED_PEACH_BELLFLOWER = registerBlock("potted_peach_bellflower",
            properties -> new FlowerPotBlock(ModBlocks.PEACH_BELLFLOWER, properties
                    .breakInstantly()
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ROSE = registerBlock("rose",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POTTED_ROSE = registerBlock("potted_rose",
            properties -> new FlowerPotBlock(ModBlocks.ROSE, properties
                    .breakInstantly()
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));



    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyes.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Dyes.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(Dyes.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyes.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Dyes.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Dyes.MOD_ID, name)))));
    }


    public static void registerModBlocks() {
        Dyes.LOGGER.info("Registering Mod Block for " + Dyes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BLURPLE_GLAZED_TERRACOTTA);
            entries.add(ModBlocks.CANARY_GLAZED_TERRACOTTA);
            entries.add(ModBlocks.CORAL_GLAZED_TERRACOTTA);
            entries.add(ModBlocks.ROSE_GLAZED_TERRACOTTA);
            entries.add(ModBlocks.SACRAMENTO_GLAZED_TERRACOTTA);
            entries.add(ModBlocks.SANGRIA_GLAZED_TERRACOTTA);
            entries.add(ModBlocks.SKY_GLAZED_TERRACOTTA);
            entries.add(ModBlocks.WASABI_GLAZED_TERRACOTTA);

            entries.add(ModBlocks.BLURPLE_CONCRETE);
            entries.add(ModBlocks.CANARY_CONCRETE);
            entries.add(ModBlocks.CORAL_CONCRETE);
            entries.add(ModBlocks.ROSE_CONCRETE);
            entries.add(ModBlocks.SACRAMENTO_CONCRETE);
            entries.add(ModBlocks.SANGRIA_CONCRETE);
            entries.add(ModBlocks.SKY_CONCRETE);
            entries.add(ModBlocks.WASABI_CONCRETE);

            entries.add(ModBlocks.BLURPLE_CONCRETE_POWDER);
            entries.add(ModBlocks.CANARY_CONCRETE_POWDER);
            entries.add(ModBlocks.CORAL_CONCRETE_POWDER);
            entries.add(ModBlocks.ROSE_CONCRETE_POWDER);
            entries.add(ModBlocks.SACRAMENTO_CONCRETE_POWDER);
            entries.add(ModBlocks.SANGRIA_CONCRETE_POWDER);
            entries.add(ModBlocks.SKY_CONCRETE_POWDER);
            entries.add(ModBlocks.WASABI_CONCRETE_POWDER);

            entries.add(ModBlocks.BLURPLE_TERRACOTTA);
            entries.add(ModBlocks.CANARY_TERRACOTTA);
            entries.add(ModBlocks.CORAL_TERRACOTTA);
            entries.add(ModBlocks.ROSE_TERRACOTTA);
            entries.add(ModBlocks.SACRAMENTO_TERRACOTTA);
            entries.add(ModBlocks.SANGRIA_TERRACOTTA);
            entries.add(ModBlocks.SKY_TERRACOTTA);
            entries.add(ModBlocks.WASABI_TERRACOTTA);

            entries.add(ModBlocks.BLURPLE_STAINED_GLASS);
            entries.add(ModBlocks.CANARY_STAINED_GLASS);
            entries.add(ModBlocks.CORAL_STAINED_GLASS);
            entries.add(ModBlocks.ROSE_STAINED_GLASS);
            entries.add(ModBlocks.SACRAMENTO_STAINED_GLASS);
            entries.add(ModBlocks.SANGRIA_STAINED_GLASS);
            entries.add(ModBlocks.SKY_STAINED_GLASS);
            entries.add(ModBlocks.WASABI_STAINED_GLASS);

            entries.add(ModBlocks.BLURPLE_STAINED_GLASS_PANE);
            entries.add(ModBlocks.CANARY_STAINED_GLASS_PANE);
            entries.add(ModBlocks.CORAL_STAINED_GLASS_PANE);
            entries.add(ModBlocks.ROSE_STAINED_GLASS_PANE);
            entries.add(ModBlocks.SACRAMENTO_STAINED_GLASS_PANE);
            entries.add(ModBlocks.SANGRIA_STAINED_GLASS_PANE);
            entries.add(ModBlocks.SKY_STAINED_GLASS_PANE);
            entries.add(ModBlocks.WASABI_STAINED_GLASS_PANE);

            entries.add(ModBlocks.BLURPLE_WOOL);
            entries.add(ModBlocks.CANARY_WOOL);
            entries.add(ModBlocks.CORAL_WOOL);
            entries.add(ModBlocks.ROSE_WOOL);
            entries.add(ModBlocks.SACRAMENTO_WOOL);
            entries.add(ModBlocks.SANGRIA_WOOL);
            entries.add(ModBlocks.SKY_WOOL);
            entries.add(ModBlocks.WASABI_WOOL);

            entries.add(ModBlocks.BLURPLE_CARPET);
            entries.add(ModBlocks.CANARY_CARPET);
            entries.add(ModBlocks.CORAL_CARPET);
            entries.add(ModBlocks.ROSE_CARPET);
            entries.add(ModBlocks.SACRAMENTO_CARPET);
            entries.add(ModBlocks.SANGRIA_CARPET);
            entries.add(ModBlocks.SKY_CARPET);
            entries.add(ModBlocks.WASABI_CARPET);

            entries.add(ModBlocks.BLURPLE_CANDLE);
            entries.add(ModBlocks.CANARY_CANDLE);
            entries.add(ModBlocks.CORAL_CANDLE);
            entries.add(ModBlocks.ROSE_CANDLE);
            entries.add(ModBlocks.SACRAMENTO_CANDLE);
            entries.add(ModBlocks.SANGRIA_CANDLE);
            entries.add(ModBlocks.SKY_CANDLE);
            entries.add(ModBlocks.WASABI_CANDLE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
            entries.add(BLUEBERRY_BUSH);
            entries.add(GOOB_BLOSSOM);
            entries.add(PEACH_BELLFLOWER);
            entries.add(ROSE);
        });
    }
}
