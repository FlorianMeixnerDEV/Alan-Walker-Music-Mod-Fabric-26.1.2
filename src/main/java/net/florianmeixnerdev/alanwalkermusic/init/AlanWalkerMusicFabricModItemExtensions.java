/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class AlanWalkerMusicFabricModItemExtensions {
	public static void load() {
		FuelValueEvents.BUILD.register((builder, context) -> {
			builder.add(AlanWalkerMusicFabricModBlocks.AUFSTELLER.asItem(), 1600);
		});
	}
}