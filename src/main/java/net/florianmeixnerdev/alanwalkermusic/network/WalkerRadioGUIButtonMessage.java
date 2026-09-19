package net.florianmeixnerdev.alanwalkermusic.network;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.florianmeixnerdev.alanwalkermusic.procedures.WalkerRadioStopProcedure;
import net.florianmeixnerdev.alanwalkermusic.procedures.WalkerRadioPlayProcedure;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicFabricMod;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public record WalkerRadioGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<WalkerRadioGUIButtonMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, "walker_radio_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, WalkerRadioGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, WalkerRadioGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new WalkerRadioGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<WalkerRadioGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final WalkerRadioGUIButtonMessage message, final ServerPlayNetworking.Context context) {
		context.server().execute(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z));
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (buttonID == 0) {

			WalkerRadioPlayProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			WalkerRadioStopProcedure.execute(world, x, y, z);
		}
	}
}