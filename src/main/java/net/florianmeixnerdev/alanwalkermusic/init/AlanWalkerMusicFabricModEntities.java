/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.florianmeixnerdev.alanwalkermusic.entity.CrazyFanEntity;
import net.florianmeixnerdev.alanwalkermusic.entity.BodyguardEntity;
import net.florianmeixnerdev.alanwalkermusic.entity.AngryPoliceEntity;
import net.florianmeixnerdev.alanwalkermusic.entity.AlanWalkerEntity;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicFabricMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class AlanWalkerMusicFabricModEntities {
	public static EntityType<AlanWalkerEntity> ALAN_WALKER = register("alan_walker", EntityType.Builder.<AlanWalkerEntity>of(AlanWalkerEntity::new, MobCategory.AMBIENT).clientTrackingRange(64).updateInterval(3)

			.ridingOffset(-0.6f)

			.sized(0.6f, 1.8f));
	public static EntityType<BodyguardEntity> BODYGUARD = register("bodyguard", EntityType.Builder.<BodyguardEntity>of(BodyguardEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3).fireImmune().ridingOffset(-0.6f)

			.sized(0.6f, 1.8f));
	public static EntityType<CrazyFanEntity> CRAZY_FAN = register("crazy_fan", EntityType.Builder.<CrazyFanEntity>of(CrazyFanEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));
	public static EntityType<AngryPoliceEntity> ANGRY_POLICE = register("angry_police", EntityType.Builder.<AngryPoliceEntity>of(AngryPoliceEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.ridingOffset(-0.6f)

			.sized(0.6f, 1.8f));

	public static void load() {
		init();
		registerAttributes();
	}

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, registryname),
				(EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(AlanWalkerMusicFabricMod.MODID, registryname))));
	}

	public static void init() {
		AlanWalkerEntity.init();
		BodyguardEntity.init();
		CrazyFanEntity.init();
		AngryPoliceEntity.init();
	}

	public static void registerAttributes() {
		FabricDefaultAttributeRegistry.register(ALAN_WALKER, AlanWalkerEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(BODYGUARD, BodyguardEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(CRAZY_FAN, CrazyFanEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ANGRY_POLICE, AngryPoliceEntity.createAttributes());
	}
}