package net.mcreator.swordsandsandals.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.item.ItemMaximumBottle;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureMaximumHealthPotionFoodEaten extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureMaximumHealthPotionFoodEaten(ElementsSwordsandsandalsMod instance) {
		super(instance, 582);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MaximumHealthPotionFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).setHealth((float) 20);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemMaximumBottle.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
