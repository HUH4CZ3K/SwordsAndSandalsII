
package net.mcreator.swordsandsandals.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.swordsandsandals.item.ItemChampionArmor;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class TabSwordsAndSandalsArmors extends ElementsSwordsandsandalsMod.ModElement {
	public TabSwordsAndSandalsArmors(ElementsSwordsandsandalsMod instance) {
		super(instance, 273);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabswordsandsandalsarmors") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemChampionArmor.body, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
