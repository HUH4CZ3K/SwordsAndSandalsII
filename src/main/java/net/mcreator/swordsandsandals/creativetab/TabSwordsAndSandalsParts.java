
package net.mcreator.swordsandsandals.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.swordsandsandals.item.ItemDaikatanaBladePart1;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class TabSwordsAndSandalsParts extends ElementsSwordsandsandalsMod.ModElement {
	public TabSwordsAndSandalsParts(ElementsSwordsandsandalsMod instance) {
		super(instance, 271);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabswordsandsandalsparts") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDaikatanaBladePart1.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
