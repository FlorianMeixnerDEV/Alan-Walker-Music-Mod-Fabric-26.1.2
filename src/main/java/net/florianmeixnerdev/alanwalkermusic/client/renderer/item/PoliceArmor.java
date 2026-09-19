package net.florianmeixnerdev.alanwalkermusic.client.renderer.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModItems;
import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModArmorModels;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PoliceArmor {
	public static void clientLoad() {
		AlanWalkerMusicFabricModArmorModels.ARMOR_MODELS.put(AlanWalkerMusicFabricModItems.POLICE_HELMET, new AlanWalkerMusicFabricModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("alan_walker_music_fabric:textures/entity/equipment/humanoid/iron_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
		AlanWalkerMusicFabricModArmorModels.ARMOR_MODELS.put(AlanWalkerMusicFabricModItems.POLICE_CHESTPLATE, new AlanWalkerMusicFabricModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("alan_walker_music_fabric:textures/entity/equipment/humanoid/iron_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
		AlanWalkerMusicFabricModArmorModels.ARMOR_MODELS.put(AlanWalkerMusicFabricModItems.POLICE_LEGGINGS, new AlanWalkerMusicFabricModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("alan_walker_music_fabric:textures/entity/equipment/humanoid_leggings/iron_layer_2.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
		AlanWalkerMusicFabricModArmorModels.ARMOR_MODELS.put(AlanWalkerMusicFabricModItems.POLICE_BOOTS, new AlanWalkerMusicFabricModArmorModels.ArmorModel() {
			private final Identifier armorTexture = Identifier.parse("alan_walker_music_fabric:textures/entity/equipment/humanoid/iron_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		});
	}
}