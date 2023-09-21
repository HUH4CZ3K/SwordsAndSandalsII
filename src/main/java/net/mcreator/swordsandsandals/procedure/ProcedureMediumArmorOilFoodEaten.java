package net.mcreator.swordsandsandals.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.item.ItemSmallBottle;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Random;
import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureMediumArmorOilFoodEaten extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureMediumArmorOilFoodEaten(ElementsSwordsandsandalsMod instance) {
		super(instance, 558);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MediumArmorOilFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			ItemStack _ist = ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY);
			if (_ist.attemptDamageItem(
					(int) (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY))
							.getMaxDamage()) / (-2)),
					new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
		{
			ItemStack _ist = ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY);
			if (_ist.attemptDamageItem(
					(int) (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY))
							.getMaxDamage()) / (-2)),
					new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
		{
			ItemStack _ist = ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY);
			if (_ist.attemptDamageItem(
					(int) (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY))
							.getMaxDamage()) / (-2)),
					new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
		{
			ItemStack _ist = ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY);
			if (_ist.attemptDamageItem(
					(int) (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY))
							.getMaxDamage()) / (-2)),
					new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemSmallBottle.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
