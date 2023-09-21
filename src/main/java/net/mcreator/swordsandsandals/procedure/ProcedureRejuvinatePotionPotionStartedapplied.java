package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureRejuvinatePotionPotionStartedapplied extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureRejuvinatePotionPotionStartedapplied(ElementsSwordsandsandalsMod instance) {
		super(instance, 532);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RejuvinatePotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RejuvinatePotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RejuvinatePotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RejuvinatePotionPotionStartedapplied!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RejuvinatePotionPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("swordsandsandals:rejuvinate")),
				SoundCategory.NEUTRAL, (float) 2, (float) 1);
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).setHealth((float) 20);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getFoodStats().setFoodLevel((int) 20);
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)).setItemDamage((int) 0);
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)).setItemDamage((int) 0);
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)).setItemDamage((int) 0);
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)).setItemDamage((int) 0);
	}
}
