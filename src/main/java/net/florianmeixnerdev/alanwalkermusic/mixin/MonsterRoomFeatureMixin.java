package net.florianmeixnerdev.alanwalkermusic.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Final;

import net.minecraft.world.level.levelgen.feature.MonsterRoomFeature;
import net.minecraft.world.entity.EntityType;

import net.florianmeixnerdev.alanwalkermusic.init.AlanWalkerMusicFabricModEntities;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

@Mixin(MonsterRoomFeature.class)
public abstract class MonsterRoomFeatureMixin {
	@Shadow
	@Final
	@Mutable
	private static EntityType<?>[] MOBS;

	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void injectCustomEntity(CallbackInfo ci) {
		List<EntityType<?>> entities = new ArrayList<>(Arrays.asList(MOBS));
		entities.add(AlanWalkerMusicFabricModEntities.ALAN_WALKER);
		MOBS = entities.toArray(new EntityType[0]);
	}
}