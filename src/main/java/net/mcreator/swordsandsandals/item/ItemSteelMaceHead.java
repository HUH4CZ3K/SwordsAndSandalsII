
package net.mcreator.swordsandsandals.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsParts;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemSteelMaceHead extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:steel_mace_head")
	public static final Item block = null;
	public ItemSteelMaceHead(ElementsSwordsandsandalsMod instance) {
		super(instance, 164);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("swordsandsandals:steel_mace_head", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("steel_mace_head");
			setRegistryName("steel_mace_head");
			setCreativeTab(TabSwordsAndSandalsParts.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
