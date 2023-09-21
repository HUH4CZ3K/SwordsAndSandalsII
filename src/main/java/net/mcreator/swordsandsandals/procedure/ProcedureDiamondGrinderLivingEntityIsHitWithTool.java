package net.mcreator.swordsandsandals.procedure;

import net.minecraft.item.ItemStack;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureDiamondGrinderLivingEntityIsHitWithTool extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureDiamondGrinderLivingEntityIsHitWithTool(ElementsSwordsandsandalsMod instance) {
		super(instance, 601);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure DiamondGrinderLivingEntityIsHitWithTool!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).setItemDamage((int) ((((itemstack)).getItemDamage()) - 2));
	}
}
