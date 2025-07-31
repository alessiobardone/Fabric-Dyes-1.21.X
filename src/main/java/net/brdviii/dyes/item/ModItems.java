package net.brdviii.dyes.item;

import net.brdviii.dyes.Dyes;
import net.brdviii.dyes.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLURPLE_DYE = registerItem("blurple_dye", new Item(new Item.Settings()));
    public static final Item CANARY_DYE = registerItem("canary_dye", new Item(new Item.Settings()));
    public static final Item CORAL_DYE = registerItem("coral_dye", new Item(new Item.Settings()));
    public static final Item ROSE_DYE = registerItem("rose_dye", new Item(new Item.Settings()));
    public static final Item SACRAMENTO_DYE = registerItem("sacramento_dye", new Item(new Item.Settings()));
    public static final Item SANGRIA_DYE = registerItem("sangria_dye", new Item(new Item.Settings()));
    public static final Item SKY_DYE = registerItem("sky_dye", new Item(new Item.Settings()));
    public static final Item WASABI_DYE = registerItem("wasabi_dye", new Item(new Item.Settings()));

    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(ModFoodComponents.BLUEBERRIES)));

    public static final Item BLUEBERRIES_COOKIE = registerItem("blueberries_cookie", new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRIES_COOKIE)));
    public static final Item SWEETBERRIES_COOKIE = registerItem("sweetberries_cookie", new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRIES_COOKIE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Dyes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Dyes.LOGGER.info("Registering Mod Item");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLURPLE_DYE);
            entries.add(CANARY_DYE);
            entries.add(CORAL_DYE);
            entries.add(ROSE_DYE);
            entries.add(SACRAMENTO_DYE);
            entries.add(SANGRIA_DYE);
            entries.add(SKY_DYE);
            entries.add(WASABI_DYE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ModItems.BLUEBERRIES);
            entries.add(ModItems.BLUEBERRIES_COOKIE);
            entries.add(ModItems.SWEETBERRIES_COOKIE);
        });

    }
}
