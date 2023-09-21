package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureFrightningBoltBulletHitsBlock extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureFrightningBoltBulletHitsBlock(ElementsSwordsandsandalsMod instance) {
		super(instance, 505);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FrightningBoltBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FrightningBoltBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FrightningBoltBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FrightningBoltBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 0), (int) y, (int) (z + 0), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 1), (int) y, (int) (z + 0), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 1), (int) y, (int) (z + 0), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 0), (int) y, (int) (z + 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 0), (int) y, (int) (z - 1), false));
	}
}
