
package net.mcreator.swordsandsandals.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.swordsandsandals.item.ItemSaphire;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class TabSwordsAndSandalsItems extends ElementsSwordsandsandalsMod.ModElement {
	public TabSwordsAndSandalsItems(ElementsSwordsandsandalsMod instance) {
		super(instance, 270);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabswordsandsandalsitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemSaphire.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
