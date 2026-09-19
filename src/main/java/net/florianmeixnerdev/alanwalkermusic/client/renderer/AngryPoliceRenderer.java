package net.florianmeixnerdev.alanwalkermusic.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ArmorModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.florianmeixnerdev.alanwalkermusic.entity.AngryPoliceEntity;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class AngryPoliceRenderer extends HumanoidMobRenderer<AngryPoliceEntity, HumanoidRenderState, HumanoidModel<HumanoidRenderState>> {
	private final Identifier entityTexture = Identifier.parse("alan_walker_music_fabric:textures/entities/a687a89788ed1c66.png");

	public AngryPoliceRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HumanoidRenderState>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, ArmorModelSet.bake(ModelLayers.PLAYER_ARMOR, context.getModelSet(), HumanoidModel::new), context.getEquipmentRenderer()));
	}

	@Override
	public HumanoidRenderState createRenderState() {
		return new HumanoidRenderState();
	}

	@Override
	public void extractRenderState(AngryPoliceEntity entity, HumanoidRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(HumanoidRenderState state) {
		return entityTexture;
	}
}