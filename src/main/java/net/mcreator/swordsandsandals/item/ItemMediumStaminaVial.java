
package net.mcreator.swordsandsandals.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.swordsandsandals.procedure.ProcedureMediumStaminaVialFoodEaten;
import net.mcreator.swordsandsandals.creativetab.TabMagicItems;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemMediumStaminaVial extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:medium_stamina_vial")
	public static final Item block = null;
	public ItemMediumStaminaVial(ElementsSwordsandsandalsMod instance) {
		super(instance, 252);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("swordsandsandals:medium_stamina_vial", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(10, 0.5f, false);
			setUnlocalizedName("medium_stamina_vial");
			setRegistryName("medium_stamina_vial");
			setCreativeTab(TabMagicItems.tab);
			setMaxStackSize(1);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 4;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureMediumStaminaVialFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
