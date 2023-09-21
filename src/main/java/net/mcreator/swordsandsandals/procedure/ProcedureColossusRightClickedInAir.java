package net.mcreator.swordsandsandals.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.potion.PotionColossusEffect;
import net.mcreator.swordsandsandals.item.ItemColossus;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureColossusRightClickedInAir extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureColossusRightClickedInAir(ElementsSwordsandsandalsMod instance) {
		super(instance, 605);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ColossusRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemColossus.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).swingArm(EnumHand.MAIN_HAND);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemColossus.block, (int) (1)).getItem(), -1, (int) 1, null);
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemColossus.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).swingArm(EnumHand.OFF_HAND);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemColossus.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionColossusEffect.potion, (int) 400, (int) 0, (false), (false)));
	}
}
