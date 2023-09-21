package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureMoltenRockEntityDies extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureMoltenRockEntityDies(ElementsSwordsandsandalsMod instance) {
		super(instance, 426);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MoltenRockEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MoltenRockEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MoltenRockEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MoltenRockEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 8, false);
		}
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 3, true);
		}
	}
}
