package net.florianmeixnerdev.alanwalkermusic.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class FalleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getDifficulty() == Difficulty.NORMAL)) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
				entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}