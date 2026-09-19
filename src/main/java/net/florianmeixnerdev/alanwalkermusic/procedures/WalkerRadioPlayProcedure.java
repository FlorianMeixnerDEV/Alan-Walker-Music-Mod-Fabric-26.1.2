package net.florianmeixnerdev.alanwalkermusic.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class WalkerRadioPlayProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double radio_song = 0;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("alan_walker_music_fabric:faded")), SoundSource.MUSIC, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("alan_walker_music_fabric:faded")), SoundSource.MUSIC, 1, 1, false);
			}
		}
		assert Boolean.TRUE; //#dbg:WalkerRadioPlay:play
	}
}