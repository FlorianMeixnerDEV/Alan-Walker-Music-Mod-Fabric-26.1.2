package net.florianmeixnerdev.alanwalkermusic;

import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModScreens;
import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModMenus;
import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModEntityRenderers;
import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModArmorModels;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class AlanWalkerMusicFabricModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		AlanWalkerMusicFabricModArmorModels.clientLoad();
		AlanWalkerMusicFabricModEntityRenderers.clientLoad();
		AlanWalkerMusicFabricModScreens.clientLoad();
		AlanWalkerMusicFabricModMenus.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}