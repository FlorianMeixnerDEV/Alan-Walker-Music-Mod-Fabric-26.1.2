package net.florianmeixnerdev.alanwalkermusic.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.florianmeixnerdev.alanwalkermusic.world.inventory.WalkerRadioGUIMenu;
import net.florianmeixnerdev.alanwalkermusic.network.WalkerRadioGUIButtonMessage;
import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModScreens;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class WalkerRadioGUIScreen extends AbstractContainerScreen<WalkerRadioGUIMenu> implements AlanWalkerMusicFabricModScreens.FabricScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_play;
	private Button button_back;
	private Button button_stop;
	private Button button_next;
	private Button button_close;
	private AlanWalkerMusicFabricModScreens.ExtendedSlider Volume;
	private static final Identifier BACKGROUND = Identifier.parse("alan_walker_music_fabric:textures/screens/walker_radio_gui.png");

	public WalkerRadioGUIScreen(WalkerRadioGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 300, 220);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 2 && elementState instanceof Number n) {
			if (name.equals("Volume"))
				Volume.setValue(n.doubleValue());
		}
		menuStateUpdateActive = false;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
	}

	@Override
	public boolean keyPressed(KeyEvent event) {
		int key = event.key();
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(event);
	}

	@Override
	protected void extractLabels(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY) {
		guiGraphics.text(this.font, Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.label_walker_radio"), 113, 7, -39322, true);
		guiGraphics.text(this.font, Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.label_faded"), 131, 97, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.label_volume_100"), 14, 196, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_play = Button.builder(Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.button_play"), e -> {
			int x = WalkerRadioGUIScreen.this.x;
			int y = WalkerRadioGUIScreen.this.y;
			if (true) {
				ClientPlayNetworking.send(new WalkerRadioGUIButtonMessage(0, x, y, z));
				WalkerRadioGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 169, 45, 20).build();
		this.addRenderableWidget(button_play);
		button_back = Button.builder(Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.button_back"), e -> {
		}).bounds(this.leftPos + 221, this.topPos + 169, 45, 20).build();
		this.addRenderableWidget(button_back);
		button_stop = Button.builder(Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.button_stop"), e -> {
			int x = WalkerRadioGUIScreen.this.x;
			int y = WalkerRadioGUIScreen.this.y;
			if (true) {
				ClientPlayNetworking.send(new WalkerRadioGUIButtonMessage(2, x, y, z));
				WalkerRadioGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 95, this.topPos + 169, 45, 20).build();
		this.addRenderableWidget(button_stop);
		button_next = Button.builder(Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.button_next"), e -> {
		}).bounds(this.leftPos + 158, this.topPos + 169, 45, 20).build();
		this.addRenderableWidget(button_next);
		button_close = Button.builder(Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.button_close"), e -> {
		}).bounds(this.leftPos + 239, this.topPos + 7, 50, 20).build();
		this.addRenderableWidget(button_close);
		Volume = new AlanWalkerMusicFabricModScreens.ExtendedSlider(this.leftPos + 14, this.topPos + 7, 50, 20, Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.Volume_prefix"),
				Component.translatable("gui.alan_walker_music_fabric.walker_radio_gui.Volume_suffix"), 0, 100, 100, 1, 0, true) {
			@Override
			protected void applyValue() {
				if (!menuStateUpdateActive)
					menu.sendMenuStateUpdate(entity, 2, "Volume", this.getValue(), false);
			}
		};
		this.addRenderableWidget(Volume);
		if (!menuStateUpdateActive)
			menu.sendMenuStateUpdate(entity, 2, "Volume", Volume.getValue(), false);
	}
}