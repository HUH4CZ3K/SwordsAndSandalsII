
package net.mcreator.swordsandsandals.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsWeapons;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Set;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemMorningStar extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:morning_star")
	public static final Item block = null;
	public ItemMorningStar(ElementsSwordsandsandalsMod instance) {
		super(instance, 221);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("morning_star").setRegistryName("morning_star").setCreativeTab(TabSwordsAndSandalsWeapons.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("swordsandsandals:morning_star", "inventory"));
	}
	private static class ItemToolCustom extends ItemTool {
		private static final Set<Block> effective_items_set = com.google.common.collect.Sets
				.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN,
						Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("MORNING_STAR", 2, 1064, 7f, 26f, 18), effective_items_set);
			this.attackDamage = 26f;
			this.attackSpeed = -3f;
		}

		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}
	}
}
