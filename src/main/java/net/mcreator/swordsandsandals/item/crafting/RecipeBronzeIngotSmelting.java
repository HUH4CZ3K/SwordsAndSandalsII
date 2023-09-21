
package net.mcreator.swordsandsandals.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.swordsandsandals.item.ItemBronzeIngot;
import net.mcreator.swordsandsandals.block.BlockBronzeOre;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class RecipeBronzeIngotSmelting extends ElementsSwordsandsandalsMod.ModElement {
	public RecipeBronzeIngotSmelting(ElementsSwordsandsandalsMod instance) {
		super(instance, 264);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBronzeOre.block, (int) (1)), new ItemStack(ItemBronzeIngot.block, (int) (1)), 1F);
	}
}
