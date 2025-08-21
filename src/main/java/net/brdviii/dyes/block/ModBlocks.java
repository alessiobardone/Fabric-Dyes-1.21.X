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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //GLAZED TERRACOTTA
    public static final Block BLURPLE_GLAZED_TERRACOTTA = registerBlock("blurple_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CANARY_GLAZED_TERRACOTTA = registerBlock("canary_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CORAL_GLAZED_TERRACOTTA = registerBlock("coral_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block ROSE_GLAZED_TERRACOTTA = registerBlock("rose_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SACRAMENTO_GLAZED_TERRACOTTA = registerBlock("sacramento_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SANGRIA_GLAZED_TERRACOTTA = registerBlock("sangria_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SKY_GLAZED_TERRACOTTA = registerBlock("sky_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block WASABI_GLAZED_TERRACOTTA = registerBlock("wasabi_glazed_terracotta",
            new GlazedTerracottaBlock(AbstractBlock.Settings.create()
                    .strength(1.4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    //CONCRETE
    public static final Block BLURPLE_CONCRETE = registerBlock("blurple_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block CANARY_CONCRETE = registerBlock("canary_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block CORAL_CONCRETE = registerBlock("coral_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block ROSE_CONCRETE = registerBlock("rose_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block SACRAMENTO_CONCRETE = registerBlock("sacramento_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block SANGRIA_CONCRETE = registerBlock("sangria_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block SKY_CONCRETE = registerBlock("sky_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    public static final Block WASABI_CONCRETE = registerBlock("wasabi_concrete",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)));

    //CONCRETE POWDER
    public static final Block BLURPLE_CONCRETE_POWDER = registerBlock("blurple_concrete_powder",
            new ConcretePowderBlock(BLURPLE_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    public static final Block CANARY_CONCRETE_POWDER = registerBlock("canary_concrete_powder",
            new ConcretePowderBlock(CANARY_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    public static final Block CORAL_CONCRETE_POWDER = registerBlock("coral_concrete_powder",
            new ConcretePowderBlock(CORAL_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    public static final Block ROSE_CONCRETE_POWDER = registerBlock("rose_concrete_powder",
            new ConcretePowderBlock(ROSE_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    public static final Block SACRAMENTO_CONCRETE_POWDER = registerBlock("sacramento_concrete_powder",
            new ConcretePowderBlock(SACRAMENTO_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    public static final Block SANGRIA_CONCRETE_POWDER = registerBlock("sangria_concrete_powder",
            new ConcretePowderBlock(SANGRIA_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    public static final Block SKY_CONCRETE_POWDER = registerBlock("sky_concrete_powder",
            new ConcretePowderBlock(SKY_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    public static final Block WASABI_CONCRETE_POWDER = registerBlock("wasabi_concrete_powder",
            new ConcretePowderBlock(WASABI_CONCRETE, AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.SNARE).
                    strength(0.5F).
                    sounds(BlockSoundGroup.SAND)));

    //TERRACOTTA
    public static final Block BLURPLE_TERRACOTTA = registerBlock("blurple_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    public static final Block CANARY_TERRACOTTA = registerBlock("canary_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    public static final Block CORAL_TERRACOTTA = registerBlock("coral_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    public static final Block ROSE_TERRACOTTA = registerBlock("rose_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    public static final Block SACRAMENTO_TERRACOTTA = registerBlock("sacramento_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    public static final Block SANGRIA_TERRACOTTA = registerBlock("sangria_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    public static final Block SKY_TERRACOTTA = registerBlock("sky_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    public static final Block WASABI_TERRACOTTA = registerBlock("wasabi_terracotta",
            new Block(AbstractBlock.Settings.create().
                    instrument(NoteBlockInstrument.BASEDRUM).
                    requiresTool()
                    .strength(1.25F, 4.2F)));

    //GLASS
    public static final Block BLURPLE_STAINED_GLASS = registerBlock("blurple_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block CANARY_STAINED_GLASS = registerBlock("canary_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block CORAL_STAINED_GLASS = registerBlock("coral_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block ROSE_STAINED_GLASS = registerBlock("rose_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block SACRAMENTO_STAINED_GLASS = registerBlock("sacramento_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block SANGRIA_STAINED_GLASS = registerBlock("sangria_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block SKY_STAINED_GLASS = registerBlock("sky_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)));

    public static final Block WASABI_STAINED_GLASS = registerBlock("wasabi_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE,AbstractBlock.Settings.create()
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
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block CANARY_STAINED_GLASS_PANE = registerBlock("canary_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block CORAL_STAINED_GLASS_PANE = registerBlock("coral_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block ROSE_STAINED_GLASS_PANE = registerBlock("rose_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block SACRAMENTO_STAINED_GLASS_PANE = registerBlock("sacramento_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block SANGRIA_STAINED_GLASS_PANE = registerBlock("sangria_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block SKY_STAINED_GLASS_PANE = registerBlock("sky_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    public static final Block WASABI_STAINED_GLASS_PANE = registerBlock("wasabi_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()));

    //WOOL
    public static final Block BLURPLE_WOOL = registerBlock("blurple_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CANARY_WOOL = registerBlock("canary_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CORAL_WOOL = registerBlock("coral_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block ROSE_WOOL = registerBlock("rose_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SACRAMENTO_WOOL = registerBlock("sacramento_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SANGRIA_WOOL = registerBlock("sangria_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));


    public static final Block SKY_WOOL = registerBlock("sky_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block WASABI_WOOL = registerBlock("wasabi_wool",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    //WOOL CARPET
    public static final Block BLURPLE_CARPET = registerBlock("blurple_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CANARY_CARPET = registerBlock("canary_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block CORAL_CARPET = registerBlock("coral_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block ROSE_CARPET = registerBlock("rose_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SACRAMENTO_CARPET = registerBlock("sacramento_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SANGRIA_CARPET = registerBlock("sangria_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block SKY_CARPET = registerBlock("sky_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    public static final Block WASABI_CARPET = registerBlock("wasabi_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, AbstractBlock.Settings.create()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()));

    //CANDLE
    public static final Block BLURPLE_CANDLE = registerBlock("blurple_candle", createCandleBlock());
    public static final Block BLURPLE_CANDLE_CAKE = registerBlock("blurple_candle_cake", createCandleCakeBlock());

    public static final Block CANARY_CANDLE = registerBlock("canary_candle", createCandleBlock());
    public static final Block CANARY_CANDLE_CAKE = registerBlock("canary_candle_cake", createCandleCakeBlock());

    public static final Block CORAL_CANDLE = registerBlock("coral_candle", createCandleBlock());
    public static final Block CORAL_CANDLE_CAKE = registerBlock("coral_candle_cake", createCandleCakeBlock());

    public static final Block ROSE_CANDLE = registerBlock("rose_candle", createCandleBlock());
    public static final Block ROSE_CANDLE_CAKE = registerBlock("rose_candle_cake", createCandleCakeBlock());

    public static final Block SACRAMENTO_CANDLE = registerBlock("sacramento_candle", createCandleBlock());
    public static final Block SACRAMENTO_CANDLE_CAKE = registerBlock("sacramento_candle_cake", createCandleCakeBlock());

    public static final Block SANGRIA_CANDLE = registerBlock("sangria_candle", createCandleBlock());
    public static final Block SANGRIA_CANDLE_CAKE = registerBlock("sangria_candle_cake", createCandleCakeBlock());

    public static final Block SKY_CANDLE = registerBlock("sky_candle", createCandleBlock());
    public static final Block SKY_CANDLE_CAKE = registerBlock("sky_candle_cake", createCandleCakeBlock());

    public static final Block WASABI_CANDLE = registerBlock("wasabi_candle", createCandleBlock());
    public static final Block WASABI_CANDLE_CAKE = registerBlock("wasabi_candle_cake", createCandleCakeBlock());

    //BLUE BERRIES
    public static  final Block BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush",
            new BlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    //FLOWERS
    public static final Block GOOB_BLOSSOM = registerBlock("goob_blossom",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));

    public static final Block PEACH_BELLFLOWER = registerBlock("peach_bellflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PEACH_BELLFLOWER = registerBlock("potted_peach_bellflower", createFlowerPotBlock(ModBlocks.PEACH_BELLFLOWER));

    public static final Block ROSE = registerBlock("rose",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ROSE = registerBlock("potted_rose", createFlowerPotBlock(ModBlocks.ROSE));





    public static Block createFlowerPotBlock(Block flower) {
        return new FlowerPotBlock(flower, AbstractBlock.Settings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
    }

    private static Block createCandleCakeBlock(){
        return new CandleCakeBlock(
                ModBlocks.BLURPLE_CANDLE,
                AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)
        );
    }
    private static Block createCandleBlock() {
        return new CandleBlock(
                AbstractBlock.Settings.create()
                        .nonOpaque()
                        .strength(0.1F)
                        .sounds(BlockSoundGroup.CANDLE)
                        .luminance(CandleBlock.STATE_TO_LUMINANCE)
                        .pistonBehavior(PistonBehavior.DESTROY)
        );
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(Dyes.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Dyes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Dyes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
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
