package net.florianmeixnerdev.alanwalkermusic.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class PoliceItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(30, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 2, ArmorType.BODY, 6), 9,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.armor.equip_diamond"))), 9f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("alan_walker_music_fabric:police_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("alan_walker_music_fabric:police")));

	private PoliceItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends PoliceItem {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends PoliceItem {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends PoliceItem {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends PoliceItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}