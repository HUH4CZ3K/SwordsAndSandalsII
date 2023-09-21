package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.entity.EntityMoltenRock;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureMoltenDeadBulletHitsBlock extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureMoltenDeadBulletHitsBlock(ElementsSwordsandsandalsMod instance) {
		super(instance, 487);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MoltenDeadBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MoltenDeadBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MoltenDeadBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MoltenDeadBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, (y + 10), z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, (y + 9), (z + 3), world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, (y + 8), (z - 3), world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles((x - 3), (y + 8), z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles((x + 3), (y + 7), z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles((x + 3), (y + 11), (z - 3), world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles((x + 3), (y + 11), (z + 3), world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles((x - 3), (y + 7), (z + 3), world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityMoltenRock.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles((x - 3), (y + 10), (z - 3), world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
