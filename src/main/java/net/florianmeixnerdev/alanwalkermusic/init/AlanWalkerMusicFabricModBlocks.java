/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermusic.block.WalkerRadioBlock;
import net.florianmeixnerdev.alanwalkermusic.block.TischBlock;
import net.florianmeixnerdev.alanwalkermusic.block.AufstellerBlock;
import net.florianmeixnerdev.alanwalkermusic.block.AWLogoBlock;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicFabricMod;

import java.util.function.Function;

public class AlanWalkerMusicFabricModBlocks {
	public static Block TISCH;
	public static Block AW_LOGO;
	public static Block AUFSTELLER;
	public static Block WALKER_RADIO;

	public static void load() {
		TISCH = register("tisch", TischBlock::new);
		AW_LOGO = register("aw_logo", AWLogoBlock::new);
		AUFSTELLER = register("aufsteller", AufstellerBlock::new);
		WALKER_RADIO = register("walker_radio", WalkerRadioBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}