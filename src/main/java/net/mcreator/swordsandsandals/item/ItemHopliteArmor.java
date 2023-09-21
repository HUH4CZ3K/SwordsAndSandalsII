
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
public class ItemHopliteArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:hoplite_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:hoplite_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:hoplite_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:hoplite_armorboots")
	public static final Item boots = null;
	public ItemHopliteArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 239);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HOPLITE_ARMOR", "swordsandsandals:antaresalpha_", 175, new int[]{2, 5, 6, 3}, 16,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelHopliteHelm().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/hoplitehelmettexture.png";
			}
		}.setUnlocalizedName("hoplite_armorhelmet").setRegistryName("hoplite_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelHopliteChestplateModel().Body;
				armorModel.bipedRightArm = new ModelHopliteChestplateModel().RightArm;
                armorModel.bipedLeftArm = new ModelHopliteChestplateModel().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/hoplitechestplatetexture.png";
			}
		}.setUnlocalizedName("hoplite_armorbody").setRegistryName("hoplite_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelHopliteLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelHopliteLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/hoplitelegginstexture.png";
			}
		}.setUnlocalizedName("hoplite_armorlegs").setRegistryName("hoplite_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
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
				return "swordsandsandals:textures/hoplitebootstexture.png";
			}
		}.setUnlocalizedName("hoplite_armorboots").setRegistryName("hoplite_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:hoplite_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:hoplite_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:hoplite_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:hoplite_armorboots", "inventory"));
	}
	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelHopliteLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelHopliteLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 11, -1.175F, 6.85F, -2.65F, 2, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 8, 5, -1.175F, 7.0F, -2.5F, 2, 3, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 0, -2.4F, 2.0F, -2.3F, 1, 3, 1, 0.0F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 11, -0.975F, 6.85F, -2.65F, 2, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 6, -0.975F, 7.0F, -2.5F, 2, 3, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, 1.4F, 2.0F, -2.3F, 1, 3, 1, 0.0F, false));
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
	public static class ModelHopliteHelm extends ModelBase {
		private final ModelRenderer Head;
		public ModelHopliteHelm() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 33, -3.5F, -9.0F, -3.5F, 7, 1, 7, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 4, -1.0F, -8.5F, -4.5F, 2, 3, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -1.0F, -8.5F, 3.5F, 2, 3, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 22, -1.0F, -9.5F, -3.5F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -1.0F, -9.5F, 2.5F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 14, 26, -1.0F, -10.0F, -3.0F, 2, 1, 6, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 20, -1.0F, -9.0F, -4.25F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 18, -1.0F, -9.0F, 3.225F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 26, -2.5F, -9.75F, -2.5F, 5, 1, 5, 0.0F, false));
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

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelHopliteChestplateModel extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelHopliteChestplateModel() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.29F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 16, -0.5F, 9.0F, -2.5F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 2, -0.5F, 7.25F, -2.5F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 16, -1.0F, 10.8F, -2.5F, 2, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 18, -1.0F, 11.3F, -2.5F, 2, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 5.5F, -2.5F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 48, 12, 0.0F, 12.0F, -2.0F, 4, 4, 4, 0.31F, false));
			Body.cubeList.add(new ModelBox(Body, 48, 0, -4.0F, 12.0F, -2.0F, 4, 4, 4, 0.31F, false));
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
			LeftArm.cubeList.add(new ModelBox(LeftArm, 18, 32, 2.75F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 26, -2.0F, 4.3F, -3.0F, 6, 1, 6, 0.0F, false));
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
