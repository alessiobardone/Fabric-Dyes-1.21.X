package net.brdviii.dyes.item;

import net.brdviii.dyes.Dyes;
import net.brdviii.dyes.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item BLURPLE_DYE = registerItem("blurple_dye", Item::new);
    public static final Item CANARY_DYE = registerItem("canary_dye", Item::new);
    public static final Item CORAL_DYE = registerItem("coral_dye", Item::new);
    public static final Item ROSE_DYE = registerItem("rose_dye",  Item::new);
    public static final Item SACRAMENTO_DYE = registerItem("sacramento_dye", Item::new);
    public static final Item SANGRIA_DYE = registerItem("sangria_dye", Item::new);
    public static final Item SKY_DYE = registerItem("sky_dye", Item::new);
    public static final Item WASABI_DYE = registerItem("wasabi_dye", Item::new);

    public static final Item BLUEBERRIES = registerItem("blueberries",
            setting -> new BlockItem(ModBlocks.BLUEBERRY_BUSH,
                    setting.food(ModFoodComponents.BLUEBERRIES)));

    public static final Item BLUEBERRIES_COOKIE = registerItem("blueberries_cookie",
            settings -> new Item(settings.food(ModFoodComponents.BLUEBERRIES_COOKIE,ModFoodComponents.BLUEBERRIES_COOKIE_EFFECT)));

    public static final Item SWEETBERRIES_COOKIE = registerItem("sweetberries_cookie",
            settings -> new Item(settings.food(ModFoodComponents.SWEETBERRIES_COOKIE,ModFoodComponents.SWEETBERRIES_COOKIE_EFFECT)));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Dyes.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Dyes.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Dyes.LOGGER.info("Registering Mod Item for" + Dyes.MOD_ID);

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
