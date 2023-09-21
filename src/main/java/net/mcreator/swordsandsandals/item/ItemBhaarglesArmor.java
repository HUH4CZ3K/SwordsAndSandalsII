
package net.mcreator.swordsandsandals.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.swordsandsandals.procedure.ProcedureBhaarglesArmorHelmetTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureBhaarglesArmorBodyTickEvent;
import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsArmors;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemBhaarglesArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:bhaargles_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:bhaargles_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:bhaargles_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:bhaargles_armorboots")
	public static final Item boots = null;
	public ItemBhaarglesArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 235);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BHAARGLES_ARMOR", "swordsandsandals:antaresalpha_", 700, new int[]{0, 0, 17, 1},
				25,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				9.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelBhaargles_Circlet().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/bhaargles_circlet.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureBhaarglesArmorHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("bhaargles_armorhelmet").setRegistryName("bhaargles_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelBhaargles_Chesplate().Body;
				armorModel.bipedRightArm = new ModelBhaargles_Chesplate().RightArm;
                armorModel.bipedLeftArm = new ModelBhaargles_Chesplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/bhaargleyargs_chestplate_texture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureBhaarglesArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("bhaargles_armorbody").setRegistryName("bhaargles_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:bhaargles_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:bhaargles_armorbody", "inventory"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelBhaargles_Chesplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelBhaargles_Chesplate() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 22, 51, -2.5F, 0.0F, -2.5F, 5, 3, 2, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 13, 38, -4.25F, 2.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 34, 26, -4.25F, 2.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 17, 60, 2.0F, -0.5F, -2.5F, 2, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 32, 20, 3.25F, 2.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 54, 7, 3.5F, -2.0F, -2.0F, 1, 1, 4, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 60, -5.0F, -2.5F, -1.5F, 1, 1, 3, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 26, 0, 3.25F, 2.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 40, -0.5F, 0.0F, -2.75F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 58, 57, 4.5F, -3.5F, -1.0F, 1, 1, 2, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 53, 4.0F, -2.5F, -1.5F, 1, 1, 3, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 50, 13, 2.0F, -1.5F, -2.5F, 2, 1, 5, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 36, 33, -3.75F, 4.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 34, 0, -2.5F, 7.0F, -2.5F, 5, 5, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 30, 33, -3.75F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 33, 2.75F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 10, 2.75F, 4.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 54, 0, -4.5F, -2.0F, -2.0F, 1, 1, 4, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 44, 60, -4.0F, -0.5F, -2.5F, 2, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 37, 14, -4.75F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 34, 29, -4.75F, 0.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 17, 32, 3.75F, 0.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 8, 32, 3.75F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 20, 41, -2.5F, -1.0F, -2.5F, 5, 1, 5, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 7, -5.75F, -1.0F, -3.0F, 2, 1, 6, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 50, 27, -4.0F, -1.5F, -2.5F, 2, 1, 5, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 58, 61, -5.5F, -3.5F, -1.0F, 1, 1, 2, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 0, 3.75F, -1.0F, -3.0F, 2, 1, 6, 0.0F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -1.0F, -3.5F, -3.0F, 1, 1, 6, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 8, 32, -3.0F, -3.0F, -2.5F, 2, 1, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 29, 33, -4.0F, -2.5F, -2.5F, 1, 2, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 33, -5.0F, -2.75F, -2.0F, 1, 1, 4, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 17, 35, -5.0F, -1.75F, 1.0F, 1, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 8, 35, -5.0F, -1.75F, -2.0F, 1, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -1.0F, -2.5F, -3.0F, 1, 3, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 7, -3.0F, -2.0F, -3.0F, 2, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 3, -3.0F, -2.0F, 2.0F, 2, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 28, 14, -1.0F, -2.5F, 2.0F, 1, 3, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 41, -3.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 26, 0.0F, -3.5F, -3.0F, 1, 1, 6, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 41, -1.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 0, 1.0F, -2.0F, -3.0F, 2, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 12, 16, 1.0F, -2.0F, 2.0F, 2, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 14, 1.0F, -3.0F, -2.5F, 2, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 17, 33, 3.0F, -2.5F, -2.5F, 1, 2, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 45, 19, 4.0F, -2.75F, -2.0F, 1, 1, 4, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 46, 35, 4.0F, -1.75F, -2.0F, 1, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 46, 38, 4.0F, -1.75F, 1.0F, 1, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, 0.0F, -2.5F, -3.0F, 1, 3, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.0F, -2.5F, 2.0F, 1, 3, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Body.render(f5);
			RightArm.render(f5);
			LeftArm.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelBhaargles_Circlet extends ModelBase {
		private final ModelRenderer Head;
		public ModelBhaargles_Circlet() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Head.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}
}
