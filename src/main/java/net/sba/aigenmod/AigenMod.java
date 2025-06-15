package net.sba.aigenmod;

import net.fabricmc.api.ModInitializer;

import net.sba.aigenmod.block.ModBlocks;
import net.sba.aigenmod.item.ModItemGroups;
import net.sba.aigenmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AigenMod implements ModInitializer {
	public static final String MOD_ID = "aigen-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}