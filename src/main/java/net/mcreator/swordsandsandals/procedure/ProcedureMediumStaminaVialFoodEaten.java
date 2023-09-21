package net.mcreator.swordsandsandals.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.item.ItemMediumBottle;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureMediumStaminaVialFoodEaten extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureMediumStaminaVialFoodEaten(ElementsSwordsandsandalsMod instance) {
		super(instance, 561);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MediumStaminaVialFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemMediumBottle.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
