
package net.mcreator.swordsandsandals.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsArmors;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemVeteranArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:veteran_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:veteran_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:veteran_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:veteran_armorboots")
	public static final Item boots = null;
	public ItemVeteranArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 240);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("VETERAN_ARMOR", "swordsandsandals:antaresalpha_", 150, new int[]{2, 5, 6, 2}, 16,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelVeteranHelmet().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/veteranhelmetcorrected.png";
			}
		}.setUnlocalizedName("veteran_armorhelmet").setRegistryName("veteran_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelVeteranChestplate().Body;
				armorModel.bipedRightArm = new ModelVeteranChestplate().RightArm;
                armorModel.bipedLeftArm = new ModelVeteranChestplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/veteranchestplatetexture.png";
			}
		}.setUnlocalizedName("veteran_armorbody").setRegistryName("veteran_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelVeteranLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelVeteranLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/veteranleggins.png";
			}
		}.setUnlocalizedName("veteran_armorlegs").setRegistryName("veteran_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelMilitiaBootPoprawioneModel().LeftLeg;
				armorModel.bipedRightLeg = new ModelMilitiaBootPoprawioneModel().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/veteranbootstexture.png";
			}
		}.setUnlocalizedName("veteran_armorboots").setRegistryName("veteran_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:veteran_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:veteran_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:veteran_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:veteran_armorboots", "inventory"));
	}
	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelVeteranChestplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelVeteranChestplate() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 18, -1.0F, 11.3F, -2.5F, 2, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 16, -1.0F, 10.8F, -2.5F, 2, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 9.0F, -2.5F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 7.25F, -2.5F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 14, 39, -2.75F, -0.5F, -2.5F, 2, 2, 5, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 39, 0.75F, -0.5F, -2.5F, 2, 2, 5, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 5.5F, -2.5F, 1, 1, 1, 0.0F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 33, -3.5F, 5.3F, -2.5F, 5, 1, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -4.0F, 4.3F, -3.0F, 6, 1, 6, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 9, 39, -3.75F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 32, 16, -1.5F, 5.3F, -2.5F, 5, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 26, -2.0F, 4.3F, -3.0F, 6, 1, 6, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 18, 32, 2.75F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));
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

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelVeteranLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelVeteranLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 44, 42, -2.6F, 5.5F, -2.5F, 5, 1, 5, 0.0F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 44, 50, -2.4F, 5.5F, -2.5F, 5, 1, 5, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			RightLeg.render(f5);
			LeftLeg.render(f5);
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

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelVeteranHelmet extends ModelBase {
		private final ModelRenderer Head;
		public ModelVeteranHelmet() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 35, -3.5F, -9.0F, -3.5F, 7, 1, 7, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 26, -2.5F, -9.75F, -2.5F, 5, 1, 5, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 27, 22, -5.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 27, 19, 3.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 20, -5.25F, -9.5F, -1.0F, 2, 2, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 6, 32, -5.4F, -9.0F, -1.0F, 1, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 39, 4.4F, -9.0F, -1.0F, 1, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, 3.25F, -9.5F, -1.0F, 2, 2, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 27, 16, -5.5F, -10.0F, -1.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 26, 26, 3.5F, -10.0F, -1.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 15, 26, -5.5F, -11.0F, -0.5F, 1, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 26, 4.5F, -11.0F, -0.5F, 1, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 33, 28, -4.75F, -10.75F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 13, 33, 3.75F, -10.75F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 25, 33, -5.0F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 8, 47, 4.0F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 33, 22, -5.5F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 8, 49, 4.5F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 33, 19, -5.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 32, 4.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 33, 16, -5.25F, -12.25F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 29, 4.25F, -12.25F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 17, 33, -4.9F, -12.5F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 29, 3.9F, -12.5F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 17, 33, 4.0F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 30, 31, -4.0F, -9.5F, -1.0F, 1, 2, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 35, 3.0F, -9.5F, -1.0F, 1, 2, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 14, 26, -1.5F, -10.0F, -3.0F, 3, 1, 6, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 8, 45, -1.5F, -9.0F, -4.25F, 3, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 26, 29, -1.5F, -9.0F, 3.25F, 3, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 8, 43, -1.5F, -9.5F, -3.5F, 3, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 32, -1.5F, -9.5F, 2.5F, 3, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 4, -1.5F, -8.5F, -4.5F, 3, 3, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -1.5F, -8.5F, 3.5F, 3, 3, 1, 0.0F, false));
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

	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelMilitiaBootPoprawioneModel extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelMilitiaBootPoprawioneModel() {
			textureWidth = 32;
			textureHeight = 32;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 16, -1.6F, 11.25F, -2.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 13, 7, -2.1F, 8.5F, -1.0F, 4, 1, 3, 0.3F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 15, 15, -1.6F, 11.0F, -2.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 1, 8, -2.1F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 1, 1, -1.9F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 8, 14, -1.4F, 11.0F, -2.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 14, -1.4F, 11.25F, -2.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 13, 0, -1.9F, 8.5F, -1.0F, 4, 1, 3, 0.3F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			RightLeg.render(f5);
			LeftLeg.render(f5);
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
