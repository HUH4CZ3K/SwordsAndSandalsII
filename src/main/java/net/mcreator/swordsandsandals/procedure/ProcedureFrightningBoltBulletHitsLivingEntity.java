package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureFrightningBoltBulletHitsLivingEntity extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureFrightningBoltBulletHitsLivingEntity(ElementsSwordsandsandalsMod instance) {
		super(instance, 511);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FrightningBoltBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FrightningBoltBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FrightningBoltBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FrightningBoltBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FrightningBoltBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, (int) 5, (int) 2));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 1), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 1), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z - 1), false));
	}
}
