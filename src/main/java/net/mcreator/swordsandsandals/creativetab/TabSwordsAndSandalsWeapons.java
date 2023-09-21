
package net.mcreator.swordsandsandals.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.swordsandsandals.item.ItemDaikatana;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class TabSwordsAndSandalsWeapons extends ElementsSwordsandsandalsMod.ModElement {
	public TabSwordsAndSandalsWeapons(ElementsSwordsandsandalsMod instance) {
		super(instance, 272);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabswordsandsandalsweapons") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDaikatana.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
