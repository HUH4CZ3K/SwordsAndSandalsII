package net.mcreator.swordsandsandals.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureMoltenRockEntityFalls extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureMoltenRockEntityFalls(ElementsSwordsandsandalsMod instance) {
		super(instance, 489);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MoltenRockEntityFalls!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
