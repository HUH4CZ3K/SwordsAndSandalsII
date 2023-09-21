
package net.mcreator.swordsandsandals.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.swordsandsandals.item.ItemMoltenDead;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class TabMagicItems extends ElementsSwordsandsandalsMod.ModElement {
	public TabMagicItems(ElementsSwordsandsandalsMod instance) {
		super(instance, 491);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmagic_items") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemMoltenDead.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
