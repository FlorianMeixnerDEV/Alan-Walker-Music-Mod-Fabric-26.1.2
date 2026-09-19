package net.florianmeixnerdev.alanwalkermusic.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GithubWebsiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, LevelBasedPermissionSet.OWNER, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"tellraw @p [\"\",{text:\"Website\",bold:true,italic:true,underlined:true,color:\"gold\"},{text:\"\\n\"},{text:\"My website  Here you'll also find the Alan Walker Music Wiki\"},{text:\"\\n\"},{text:\"https://florianmeixnerdev.github.io\",bold:true,italic:true,underlined:true,click_event:{action:\"open_url\",url:\"https://florianmeixnerdev.github.io\"}}]");
	}
}