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

import net.florianmeixnerdev.alanwalkermusic.world.inventory.LinkInfoMenu;
import net.florianmeixnerdev.alanwalkermusic.network.LinkInfoButtonMessage;
import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModScreens;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class LinkInfoScreen extends AbstractContainerScreen<LinkInfoMenu> implements AlanWalkerMusicFabricModScreens.FabricScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_modrinth;
	private Button button_github;
	private Button button_website;
	private Button button_close;
	private static final Identifier BACKGROUND = Identifier.parse("alan_walker_music_fabric:textures/screens/link_info.png");
	private static final Identifier IMAGE_0 = Identifier.parse("alan_walker_music_fabric:textures/screens/awlogo128.png");

	public LinkInfoScreen(LinkInfoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 200, 200);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + 38, this.topPos + 11, 0, 0, 128, 13, 128, 13);
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
		guiGraphics.text(this.font, Component.translatable("gui.alan_walker_music_fabric.link_info.label_here_you_can_find_my_online_pres"), 47, 46, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.alan_walker_music_fabric.link_info.label_online_presence"), 57, 61, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_modrinth = Button.builder(Component.translatable("gui.alan_walker_music_fabric.link_info.button_modrinth"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPlayNetworking.send(new LinkInfoButtonMessage(0, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 98, 67, 20).build();
		this.addRenderableWidget(button_modrinth);
		button_github = Button.builder(Component.translatable("gui.alan_walker_music_fabric.link_info.button_github"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPlayNetworking.send(new LinkInfoButtonMessage(1, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 139, this.topPos + 98, 56, 20).build();
		this.addRenderableWidget(button_github);
		button_website = Button.builder(Component.translatable("gui.alan_walker_music_fabric.link_info.button_website"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPlayNetworking.send(new LinkInfoButtonMessage(2, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 75, this.topPos + 98, 61, 20).build();
		this.addRenderableWidget(button_website);
		button_close = Button.builder(Component.translatable("gui.alan_walker_music_fabric.link_info.button_close"), e -> {
			int x = LinkInfoScreen.this.x;
			int y = LinkInfoScreen.this.y;
			if (true) {
				ClientPlayNetworking.send(new LinkInfoButtonMessage(3, x, y, z));
				LinkInfoButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 77, this.topPos + 171, 51, 20).build();
		this.addRenderableWidget(button_close);
	}
}