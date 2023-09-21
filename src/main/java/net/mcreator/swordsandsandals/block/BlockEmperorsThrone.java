
package net.mcreator.swordsandsandals.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.Block;

import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsBlocks;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class BlockEmperorsThrone extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:emperors_throne")
	public static final Block block = null;
	public BlockEmperorsThrone(ElementsSwordsandsandalsMod instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("emperors_throne"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("swordsandsandals:emperors_throne", "inventory"));
	}
	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockHorizontal.FACING;
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("emperors_throne");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 3);
			setHardness(30F);
			setResistance(303494F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabSwordsAndSandalsBlocks.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(BlockHorizontal.FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0, 0, 0, 0, 0, 0).union(new AxisAlignedBB(16, 0, 16, 15, 0.406, 15));
				case NORTH :
					return new AxisAlignedBB(0, 0, 0, 0, 0, 0).union(new AxisAlignedBB(0, 0, 0, 1, 0.406, 1));
				case EAST :
					return new AxisAlignedBB(0, 0, 0, 0, 0, 0).union(new AxisAlignedBB(16, 0, 0, 15, 0.406, 1));
				case WEST :
					return new AxisAlignedBB(0, 0, 0, 0, 0, 0).union(new AxisAlignedBB(0, 0, 16, 1, 0.406, 15));
			}
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
