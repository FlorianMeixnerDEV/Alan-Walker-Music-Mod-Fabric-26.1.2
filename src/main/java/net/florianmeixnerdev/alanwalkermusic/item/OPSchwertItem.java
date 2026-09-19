package net.florianmeixnerdev.alanwalkermusic.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class OPSchwertItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100, 100000f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("alan_walker_music_fabric:op_schwert_repair_items")));

	public OPSchwertItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 99999f, 96f).rarity(Rarity.EPIC).fireResistant());
	}
}