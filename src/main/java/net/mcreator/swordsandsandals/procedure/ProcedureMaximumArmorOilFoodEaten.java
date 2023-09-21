package net.mcreator.swordsandsandals.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.item.ItemMaximumBottle;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureMaximumArmorOilFoodEaten extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureMaximumArmorOilFoodEaten(ElementsSwordsandsandalsMod instance) {
		super(instance, 581);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MaximumArmorOilFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)).setItemDamage((int) 0);
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)).setItemDamage((int) 0);
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)).setItemDamage((int) 0);
		(((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)).setItemDamage((int) 0);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemMaximumBottle.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
