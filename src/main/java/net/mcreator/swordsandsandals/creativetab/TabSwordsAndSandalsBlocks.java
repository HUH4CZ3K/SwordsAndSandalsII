
package net.mcreator.swordsandsandals.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.swordsandsandals.block.BlockCarbinBlock;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class TabSwordsAndSandalsBlocks extends ElementsSwordsandsandalsMod.ModElement {
	public TabSwordsAndSandalsBlocks(ElementsSwordsandsandalsMod instance) {
		super(instance, 269);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabswordsandsandalsblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockCarbinBlock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
