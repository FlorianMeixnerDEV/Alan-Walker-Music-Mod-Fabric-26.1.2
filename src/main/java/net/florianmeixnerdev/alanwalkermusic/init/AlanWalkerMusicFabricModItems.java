/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermusic.item.*;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicFabricMod;

import java.util.function.Function;

public class AlanWalkerMusicFabricModItems {
	public static Item ALAN_WALKER_135;
	public static Item WELCOME_TO_LONELY_CLUB;
	public static Item ALONE;
	public static Item SAILING;
	public static Item AVALON;
	public static Item BELIEVERS;
	public static Item BLUE;
	public static Item CATCH_ME_IF_YOU_CAN;
	public static Item CREATOR_CIRCLE;
	public static Item DIAMOND_HEART;
	public static Item DREAMER;
	public static Item DUST;
	public static Item EXTREMES;
	public static Item FADED;
	public static Item FIRE;
	public static Item HEADLIGHTS;
	public static Item HEARTBREAK_MELODY;
	public static Item HELLO_WORLD;
	public static Item INCOMMUNICADO;
	public static Item JUMPSTART;
	public static Item LOVESICK;
	public static Item ME_MYSELF_AND_THE_NIGHT;
	public static Item MOONSHINE;
	public static Item OLD_HABITS;
	public static Item PLAY;
	public static Item SHUT_UP;
	public static Item SING_ME_TO_SLEEP;
	public static Item THE_DRUM;
	public static Item THE_SPECTRE;
	public static Item TIME;
	public static Item SPACE_MELODY;
	public static Item WECOME_TO_WALKERWORLD;
	public static Item RISE_OF_THE_DRONES;
	public static Item ALAN_WALKER_SPAWN_EGG;
	public static Item BODYGUARD_SPAWN_EGG;
	public static Item BROKEN_STRINGS;
	public static Item NOT_HOME;
	public static Item FADED_10TH_ANINIVERSARY;
	public static Item ALAN_WALKER_VOID;
	public static Item ADAGIO;
	public static Item THIS_IS_ME;
	public static Item AW_MONSTER;
	public static Item A_WORLD_I_DONT_KNOW;
	public static Item EROINA;
	public static Item POLICE_HELMET;
	public static Item POLICE_CHESTPLATE;
	public static Item POLICE_LEGGINGS;
	public static Item POLICE_BOOTS;
	public static Item CRAZY_FAN_SPAWN_EGG;
	public static Item TISCH;
	public static Item AW_LOGO;
	public static Item AUFSTELLER;
	public static Item FANTASY;
	public static Item KILLING_ME_SLOWLY;
	public static Item BROKEN_ANGEL;
	public static Item HYM_FOR_THE_WEEKEND_REMIX;
	public static Item RUNNING_OUT_OF_ROSES;
	public static Item FADED_JODOK;
	public static Item WHO_I_AM_JODOK;
	public static Item GETAWAY;
	public static Item BELIEVER_AV_8;
	public static Item PETER_PAN;
	public static Item DREAM_ON;
	public static Item OP_SCHWERT;
	public static Item ANGRY_POLICE_SPAWN_EGG;
	public static Item WALKER_RADIO;

	public static void load() {
		ALAN_WALKER_135 = register("alan_walker_135", AlanWalker135Item::new);
		WELCOME_TO_LONELY_CLUB = register("welcome_to_lonely_club", WelcomeToLonelyClubItem::new);
		ALONE = register("alone", AloneItem::new);
		SAILING = register("sailing", SailingItem::new);
		AVALON = register("avalon", AvalonItem::new);
		BELIEVERS = register("believers", BelieversItem::new);
		BLUE = register("blue", BlueItem::new);
		CATCH_ME_IF_YOU_CAN = register("catch_me_if_you_can", CatchMeIfYouCanItem::new);
		CREATOR_CIRCLE = register("creator_circle", CreatorCircleItem::new);
		DIAMOND_HEART = register("diamond_heart", DiamondHeartItem::new);
		DREAMER = register("dreamer", DreamerItem::new);
		DUST = register("dust", DustItem::new);
		EXTREMES = register("extremes", ExtremesItem::new);
		FADED = register("faded", FadedItem::new);
		FIRE = register("fire", FireItem::new);
		HEADLIGHTS = register("headlights", HeadlightsItem::new);
		HEARTBREAK_MELODY = register("heartbreak_melody", HeartbreakMelodyItem::new);
		HELLO_WORLD = register("hello_world", HelloWorldItem::new);
		INCOMMUNICADO = register("incommunicado", IncommunicadoItem::new);
		JUMPSTART = register("jumpstart", JumpstartItem::new);
		LOVESICK = register("lovesick", LovesickItem::new);
		ME_MYSELF_AND_THE_NIGHT = register("me_myself_and_the_night", MeMyselfAndTheNightItem::new);
		MOONSHINE = register("moonshine", MoonshineItem::new);
		OLD_HABITS = register("old_habits", OldHabitsItem::new);
		PLAY = register("play", PlayItem::new);
		SHUT_UP = register("shut_up", ShutUpItem::new);
		SING_ME_TO_SLEEP = register("sing_me_to_sleep", SingMeToSleepItem::new);
		THE_DRUM = register("the_drum", TheDrumItem::new);
		THE_SPECTRE = register("the_spectre", TheSpectreItem::new);
		TIME = register("time", TimeItem::new);
		SPACE_MELODY = register("space_melody", SpaceMelodyItem::new);
		WECOME_TO_WALKERWORLD = register("wecome_to_walkerworld", WecomeToWalkerworldItem::new);
		RISE_OF_THE_DRONES = register("rise_of_the_drones", RiseOfTheDronesItem::new);
		ALAN_WALKER_SPAWN_EGG = register("alan_walker_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AlanWalkerMusicFabricModEntities.ALAN_WALKER)));
		BODYGUARD_SPAWN_EGG = register("bodyguard_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AlanWalkerMusicFabricModEntities.BODYGUARD)));
		BROKEN_STRINGS = register("broken_strings", BrokenStringsItem::new);
		NOT_HOME = register("not_home", NotHomeItem::new);
		FADED_10TH_ANINIVERSARY = register("faded_10th_aniniversary", Faded10thAniniversaryItem::new);
		ALAN_WALKER_VOID = register("alan_walker_void", AlanWalkerVoidItem::new);
		ADAGIO = register("adagio", AdagioItem::new);
		THIS_IS_ME = register("this_is_me", ThisIsMeItem::new);
		AW_MONSTER = register("aw_monster", AWMonsterItem::new);
		A_WORLD_I_DONT_KNOW = register("a_world_i_dont_know", AWorldIDontKnowItem::new);
		EROINA = register("eroina", EroinaItem::new);
		POLICE_HELMET = register("police_helmet", PoliceItem.Helmet::new);
		POLICE_CHESTPLATE = register("police_chestplate", PoliceItem.Chestplate::new);
		POLICE_LEGGINGS = register("police_leggings", PoliceItem.Leggings::new);
		POLICE_BOOTS = register("police_boots", PoliceItem.Boots::new);
		CRAZY_FAN_SPAWN_EGG = register("crazy_fan_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AlanWalkerMusicFabricModEntities.CRAZY_FAN)));
		TISCH = block(AlanWalkerMusicFabricModBlocks.TISCH, "tisch");
		AW_LOGO = block(AlanWalkerMusicFabricModBlocks.AW_LOGO, "aw_logo");
		AUFSTELLER = block(AlanWalkerMusicFabricModBlocks.AUFSTELLER, "aufsteller");
		FANTASY = register("fantasy", FantasyItem::new);
		KILLING_ME_SLOWLY = register("killing_me_slowly", KillingMeSlowlyItem::new);
		BROKEN_ANGEL = register("broken_angel", BrokenAngelItem::new);
		HYM_FOR_THE_WEEKEND_REMIX = register("hym_for_the_weekend_remix", HymForTheWeekendRemixItem::new);
		RUNNING_OUT_OF_ROSES = register("running_out_of_roses", RunningOutOfRosesItem::new);
		FADED_JODOK = register("faded_jodok", FadedJodokItem::new);
		WHO_I_AM_JODOK = register("who_i_am_jodok", WhoIAmJodokItem::new);
		GETAWAY = register("getaway", GetawayItem::new);
		BELIEVER_AV_8 = register("believer_av_8", BelieverAV8Item::new);
		PETER_PAN = register("peter_pan", PeterPanItem::new);
		DREAM_ON = register("dream_on", DreamOnItem::new);
		OP_SCHWERT = register("op_schwert", OPSchwertItem::new);
		ANGRY_POLICE_SPAWN_EGG = register("angry_police_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(AlanWalkerMusicFabricModEntities.ANGRY_POLICE)));
		WALKER_RADIO = block(AlanWalkerMusicFabricModBlocks.WALKER_RADIO, "walker_radio", new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}