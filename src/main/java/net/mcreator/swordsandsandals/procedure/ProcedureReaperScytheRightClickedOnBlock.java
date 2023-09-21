package net.mcreator.swordsandsandals.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;

import net.mcreator.swordsandsandals.item.ItemReaperScythe;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Random;
import java.util.Map;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ProcedureReaperScytheRightClickedOnBlock extends ElementsSwordsandsandalsMod.ModElement {
	public ProcedureReaperScytheRightClickedOnBlock(ElementsSwordsandsandalsMod instance) {
		super(instance, 586);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ReaperScytheRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure ReaperScytheRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ReaperScytheRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ReaperScytheRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ReaperScytheRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ReaperScytheRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.GRASS)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = Blocks.FARMLAND.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemReaperScythe.block, (int) (1)).getItem())) {
				if (entity instanceof EntityLivingBase) {
					((EntityLivingBase) entity).swingArm(EnumHand.MAIN_HAND);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setItemDamage(0);
					}
				}
			} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemReaperScythe.block, (int) (1)).getItem())) {
				if (entity instanceof EntityLivingBase) {
					((EntityLivingBase) entity).swingArm(EnumHand.OFF_HAND);
				}
				{
					ItemStack _ist = (itemstack);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setItemDamage(0);
					}
				}
			}
		}
	}
}
