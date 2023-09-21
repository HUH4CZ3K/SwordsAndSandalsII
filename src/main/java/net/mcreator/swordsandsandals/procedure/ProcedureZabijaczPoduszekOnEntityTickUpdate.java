package net.mcreator.swordsandsandals.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureZabijaczPoduszekOnEntityTickUpdate extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureZabijaczPoduszekOnEntityTickUpdate(ElementsSwordsandsandalsMod instance) {
		super(instance, 454);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ZabijaczPoduszekOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WITHER, (int) 60, (int) 1));
	}
}
