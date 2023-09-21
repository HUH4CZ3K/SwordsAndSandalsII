package net.mcreator.swordsandsandals.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.potion.PotionRegenerate;
import net.mcreator.swordsandsandals.item.ItemRegenerate1;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureRegenerate1RightClickedInAir extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureRegenerate1RightClickedInAir(ElementsSwordsandsandalsMod instance) {
		super(instance, 536);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Regenerate1RightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemRegenerate1.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).swingArm(EnumHand.MAIN_HAND);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemRegenerate1.block, (int) (1)).getItem(), -1, (int) 1, null);
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemRegenerate1.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).swingArm(EnumHand.OFF_HAND);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemRegenerate1.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRegenerate.potion, (int) 240, (int) 1));
	}
}
