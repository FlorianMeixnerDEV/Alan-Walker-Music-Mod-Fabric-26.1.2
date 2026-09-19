package net.florianmeixnerdev.alanwalkermusic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicFabricMod;

public class BrokenStringsItem extends Item {
	public BrokenStringsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, "broken_strings"))));
	}
}