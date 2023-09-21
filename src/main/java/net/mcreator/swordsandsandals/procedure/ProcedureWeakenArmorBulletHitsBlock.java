package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.swordsandsandals.item.ItemWeakenArmor;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureWeakenArmorBulletHitsBlock extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureWeakenArmorBulletHitsBlock(ElementsSwordsandsandalsMod instance) {
		super(instance, 563);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WeakenArmorBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WeakenArmorBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WeakenArmorBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WeakenArmorBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemWeakenArmor.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.spawnEntity(entityToSpawn);
		}
	}
}
