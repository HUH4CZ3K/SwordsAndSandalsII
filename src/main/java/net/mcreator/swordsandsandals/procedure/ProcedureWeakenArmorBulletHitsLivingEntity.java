package net.mcreator.swordsandsandals.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Random;
import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureWeakenArmorBulletHitsLivingEntity extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureWeakenArmorBulletHitsLivingEntity(ElementsSwordsandsandalsMod instance) {
		super(instance, 564);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WeakenArmorBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			ItemStack _ist = ((entity instanceof EntityPlayer)
					? ((EntityPlayer) entity).inventory.armorInventory.get(((new Random()).nextInt((int) 3 + 1)))
					: ItemStack.EMPTY);
			if (_ist.attemptDamageItem((int) 100000, new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
	}
}
