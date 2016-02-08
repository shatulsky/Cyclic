package com.lothrazar.cyclicmagic.util;

import com.lothrazar.cyclicmagic.Const;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class UtilSound {
	public static final float volume = 1.0F;
	public static final float pitch = 1.0F;
	
	public static final String fizz = "random.fizz";
	public static final String toss = "random.bow";
	public static final String orb = "random.orb";
	public static final String snow = "dig.snow";
	public static final String portal =  "mob.endermen.portal";
	public static final String splash = "game.neutral.swim.splash";
	public static final String shears = "mob.sheep.shear";
	public static final String drink = "random.drink";
	public static final String click = "random.wood_click";
	
	public static class Own{
		//internal sounds added by mod
		public static final String bip = Const.MODID+":bip";
		public static final String buzzp = Const.MODID+":buzzp";
		public static final String bwoaaap = Const.MODID+":bwoaaap";
		public static final String pew = Const.MODID+":pew";
	}

	public static void playSoundAt(Entity player, String sound) {
		playSoundAt(player,sound);
	}

	public static void playSoundAt(World world, BlockPos pos, String sound) {
		world.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), sound, volume,pitch);
	}
}
