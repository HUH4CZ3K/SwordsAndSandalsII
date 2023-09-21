package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.entity.EntityEmperorAntares;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureSummonEmperorAntaresCommandExecuted extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureSummonEmperorAntaresCommandExecuted(ElementsSwordsandsandalsMod instance) {
		super(instance, 440);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SummonEmperorAntaresCommandExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SummonEmperorAntaresCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SummonEmperorAntaresCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SummonEmperorAntaresCommandExecuted!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityEmperorAntares.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
