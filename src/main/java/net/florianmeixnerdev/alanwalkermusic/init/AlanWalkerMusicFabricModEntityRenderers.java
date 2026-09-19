/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.florianmeixnerdev.alanwalkermusic.client.renderer.CrazyFanRenderer;
import net.florianmeixnerdev.alanwalkermusic.client.renderer.BodyguardRenderer;
import net.florianmeixnerdev.alanwalkermusic.client.renderer.AngryPoliceRenderer;
import net.florianmeixnerdev.alanwalkermusic.client.renderer.AlanWalkerRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class AlanWalkerMusicFabricModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(AlanWalkerMusicFabricModEntities.ALAN_WALKER, AlanWalkerRenderer::new);
		EntityRendererRegistry.register(AlanWalkerMusicFabricModEntities.BODYGUARD, BodyguardRenderer::new);
		EntityRendererRegistry.register(AlanWalkerMusicFabricModEntities.CRAZY_FAN, CrazyFanRenderer::new);
		EntityRendererRegistry.register(AlanWalkerMusicFabricModEntities.ANGRY_POLICE, AngryPoliceRenderer::new);
	}
}