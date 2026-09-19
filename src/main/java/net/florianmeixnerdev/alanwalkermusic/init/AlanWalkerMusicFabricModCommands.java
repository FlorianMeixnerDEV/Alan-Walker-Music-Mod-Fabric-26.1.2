/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.florianmeixnerdev.alanwalkermusic.command.InfoCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class AlanWalkerMusicFabricModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, environment) -> {
			InfoCommand.register(dispatcher, commandBuildContext, environment);
		});
	}
}