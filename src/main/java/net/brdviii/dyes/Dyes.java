package net.brdviii.dyes;

import net.brdviii.dyes.block.ModBlocks;
import net.brdviii.dyes.block.entity.ModBlockEntities;
import net.brdviii.dyes.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//ciao
public class Dyes implements ModInitializer {
	public static final String MOD_ID = "dyes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModBlockEntities.registerBlockEntities();
	}
}