/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicFabricMod;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class AlanWalkerMusicFabricModTabs {
	public static ResourceKey<CreativeModeTab> TAB_DISC = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, "disc"));
	public static ResourceKey<CreativeModeTab> TAB_MOBS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, "mobs"));
	public static ResourceKey<CreativeModeTab> TAB_CUSTOM_ARMOR = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, "custom_armor"));
	public static ResourceKey<CreativeModeTab> TAB_DEKO = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, "deko"));
	public static ResourceKey<CreativeModeTab> TAB_TOOLS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, "tools"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DISC, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.alan_walker_music_fabric.disc")).icon(() -> new ItemStack(Items.MUSIC_DISC_13))
				.type(CreativeModeTab.Type.SEARCH).backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_item_search.png")).displayItems((parameters, tabData) -> {
					tabData.accept(AlanWalkerMusicFabricModItems.WELCOME_TO_LONELY_CLUB);
					tabData.accept(AlanWalkerMusicFabricModItems.ALONE);
					tabData.accept(AlanWalkerMusicFabricModItems.SAILING);
					tabData.accept(AlanWalkerMusicFabricModItems.AVALON);
					tabData.accept(AlanWalkerMusicFabricModItems.BELIEVERS);
					tabData.accept(AlanWalkerMusicFabricModItems.BLUE);
					tabData.accept(AlanWalkerMusicFabricModItems.CATCH_ME_IF_YOU_CAN);
					tabData.accept(AlanWalkerMusicFabricModItems.CREATOR_CIRCLE);
					tabData.accept(AlanWalkerMusicFabricModItems.DREAMER);
					tabData.accept(AlanWalkerMusicFabricModItems.DUST);
					tabData.accept(AlanWalkerMusicFabricModItems.EXTREMES);
					tabData.accept(AlanWalkerMusicFabricModItems.FADED);
					tabData.accept(AlanWalkerMusicFabricModItems.FIRE);
					tabData.accept(AlanWalkerMusicFabricModItems.HEADLIGHTS);
					tabData.accept(AlanWalkerMusicFabricModItems.HEARTBREAK_MELODY);
					tabData.accept(AlanWalkerMusicFabricModItems.HELLO_WORLD);
					tabData.accept(AlanWalkerMusicFabricModItems.INCOMMUNICADO);
					tabData.accept(AlanWalkerMusicFabricModItems.JUMPSTART);
					tabData.accept(AlanWalkerMusicFabricModItems.LOVESICK);
					tabData.accept(AlanWalkerMusicFabricModItems.ME_MYSELF_AND_THE_NIGHT);
					tabData.accept(AlanWalkerMusicFabricModItems.MOONSHINE);
					tabData.accept(AlanWalkerMusicFabricModItems.OLD_HABITS);
					tabData.accept(AlanWalkerMusicFabricModItems.PLAY);
					tabData.accept(AlanWalkerMusicFabricModItems.SHUT_UP);
					tabData.accept(AlanWalkerMusicFabricModItems.SING_ME_TO_SLEEP);
					tabData.accept(AlanWalkerMusicFabricModItems.THE_DRUM);
					tabData.accept(AlanWalkerMusicFabricModItems.THE_SPECTRE);
					tabData.accept(AlanWalkerMusicFabricModItems.TIME);
					tabData.accept(AlanWalkerMusicFabricModItems.SPACE_MELODY);
					tabData.accept(AlanWalkerMusicFabricModItems.WECOME_TO_WALKERWORLD);
					tabData.accept(AlanWalkerMusicFabricModItems.RISE_OF_THE_DRONES);
					tabData.accept(AlanWalkerMusicFabricModItems.BROKEN_STRINGS);
					tabData.accept(AlanWalkerMusicFabricModItems.NOT_HOME);
					tabData.accept(AlanWalkerMusicFabricModItems.FADED_10TH_ANINIVERSARY);
					tabData.accept(AlanWalkerMusicFabricModItems.ALAN_WALKER_VOID);
					tabData.accept(AlanWalkerMusicFabricModItems.ADAGIO);
					tabData.accept(AlanWalkerMusicFabricModItems.THIS_IS_ME);
					tabData.accept(AlanWalkerMusicFabricModItems.AW_MONSTER);
					tabData.accept(AlanWalkerMusicFabricModItems.A_WORLD_I_DONT_KNOW);
					tabData.accept(AlanWalkerMusicFabricModItems.EROINA);
					tabData.accept(AlanWalkerMusicFabricModItems.FANTASY);
					tabData.accept(AlanWalkerMusicFabricModItems.KILLING_ME_SLOWLY);
					tabData.accept(AlanWalkerMusicFabricModItems.BROKEN_ANGEL);
					tabData.accept(AlanWalkerMusicFabricModItems.HYM_FOR_THE_WEEKEND_REMIX);
					tabData.accept(AlanWalkerMusicFabricModItems.RUNNING_OUT_OF_ROSES);
					tabData.accept(AlanWalkerMusicFabricModItems.FADED_JODOK);
					tabData.accept(AlanWalkerMusicFabricModItems.WHO_I_AM_JODOK);
					tabData.accept(AlanWalkerMusicFabricModItems.GETAWAY);
					tabData.accept(AlanWalkerMusicFabricModItems.BELIEVER_AV_8);
					tabData.accept(AlanWalkerMusicFabricModItems.PETER_PAN);
					tabData.accept(AlanWalkerMusicFabricModItems.DREAM_ON);
				}).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MOBS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.alan_walker_music_fabric.mobs")).icon(() -> new ItemStack(Items.BLUE_EGG))
				.type(CreativeModeTab.Type.SEARCH).backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_item_search.png")).displayItems((parameters, tabData) -> {
					tabData.accept(AlanWalkerMusicFabricModItems.ALAN_WALKER_SPAWN_EGG);
					tabData.accept(AlanWalkerMusicFabricModItems.BODYGUARD_SPAWN_EGG);
					tabData.accept(AlanWalkerMusicFabricModItems.CRAZY_FAN_SPAWN_EGG);
					tabData.accept(AlanWalkerMusicFabricModItems.ANGRY_POLICE_SPAWN_EGG);
				}).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CUSTOM_ARMOR,
				CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.alan_walker_music_fabric.custom_armor")).icon(() -> new ItemStack(Items.NETHERITE_CHESTPLATE)).type(CreativeModeTab.Type.SEARCH)
						.backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_item_search.png")).displayItems((parameters, tabData) -> {
							tabData.accept(AlanWalkerMusicFabricModItems.POLICE_HELMET);
							tabData.accept(AlanWalkerMusicFabricModItems.POLICE_CHESTPLATE);
							tabData.accept(AlanWalkerMusicFabricModItems.POLICE_LEGGINGS);
							tabData.accept(AlanWalkerMusicFabricModItems.POLICE_BOOTS);
						}).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DEKO, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.alan_walker_music_fabric.deko")).icon(() -> new ItemStack(Blocks.GOLD_BLOCK))
				.type(CreativeModeTab.Type.SEARCH).backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_item_search.png")).displayItems((parameters, tabData) -> {
					tabData.accept(AlanWalkerMusicFabricModBlocks.TISCH.asItem());
					tabData.accept(AlanWalkerMusicFabricModBlocks.AW_LOGO.asItem());
					tabData.accept(AlanWalkerMusicFabricModBlocks.AUFSTELLER.asItem());
				}).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_TOOLS, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.alan_walker_music_fabric.tools")).icon(() -> new ItemStack(Items.DIAMOND_HOE))
				.type(CreativeModeTab.Type.SEARCH).backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_item_search.png")).displayItems((parameters, tabData) -> {
					tabData.accept(AlanWalkerMusicFabricModItems.OP_SCHWERT);
				}).build());
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(tabData -> {
			tabData.accept(AlanWalkerMusicFabricModItems.DIAMOND_HEART);
		});
	}
}