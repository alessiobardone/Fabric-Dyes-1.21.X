package net.brdviii.dyes.block;

import com.mojang.serialization.MapCodec;
import net.brdviii.dyes.Dyes;
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


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Dyes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Dyes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Dyes.LOGGER.info("Registring Mod Block");

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
        });
    }
}
