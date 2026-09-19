/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.Minecraft;

import net.florianmeixnerdev.alanwalkermusic.world.inventory.WalkerRadioGUIMenu;
import net.florianmeixnerdev.alanwalkermusic.world.inventory.LinkInfoMenu;
import net.florianmeixnerdev.alanwalkermusic.network.MenuStateUpdateMessage;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicFabricMod;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import java.util.Map;

public class AlanWalkerMusicFabricModMenus {
	public static MenuType<LinkInfoMenu> LINK_INFO;
	public static MenuType<WalkerRadioGUIMenu> WALKER_RADIO_GUI;

	public static void load() {
		LINK_INFO = register("link_info", LinkInfoMenu::new);
		LinkInfoMenu.screenInit();
		WALKER_RADIO_GUI = register("walker_radio_gui", WalkerRadioGUIMenu::new);
		WalkerRadioGUIMenu.screenInit();
		PayloadTypeRegistry.serverboundPlay().register(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage.STREAM_CODEC);
		ServerPlayNetworking.registerGlobalReceiver(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage::handleMenuState);
	}

	public static void clientLoad() {
		PayloadTypeRegistry.clientboundPlay().register(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage.STREAM_CODEC);
		ClientPlayNetworking.registerGlobalReceiver(MenuStateUpdateMessage.TYPE, MenuStateUpdateMessage::handleClientMenuState);
	}

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				ServerPlayNetworking.send(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide()) {
				if (Minecraft.getInstance().screen instanceof AlanWalkerMusicFabricModScreens.FabricScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPlayNetworking.send(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}

	private static <M extends AbstractContainerMenu> MenuType<M> register(String registryname, MenuType.MenuSupplier<M> element) {
		return Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, registryname), new MenuType<>(element, FeatureFlags.DEFAULT_FLAGS));
	}
}