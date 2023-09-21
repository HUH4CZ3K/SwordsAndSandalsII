package net.mcreator.swordsandsandals.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureBoundlessEnergy2PotionStartedapplied extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureBoundlessEnergy2PotionStartedapplied(ElementsSwordsandsandalsMod instance) {
		super(instance, 529);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BoundlessEnergy2PotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getFoodStats().setFoodLevel((int) 20);
	}
}
