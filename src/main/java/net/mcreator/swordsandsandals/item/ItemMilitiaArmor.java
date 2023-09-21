
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
public class ItemMilitiaArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:militia_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:militia_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:militia_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:militia_armorboots")
	public static final Item boots = null;
	public ItemMilitiaArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 241);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MILITIA_ARMOR", "swordsandsandals:antaresalpha_", 28, new int[]{2, 4, 5, 2}, 14,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelMilitiaHelm().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/militiahelmtexture.png";
			}
		}.setUnlocalizedName("militia_armorhelmet").setRegistryName("militia_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelMilitiaChestplateModel().Body;
				armorModel.bipedRightArm = new ModelMilitiaChestplateModel().RightArm;
                armorModel.bipedLeftArm = new ModelMilitiaChestplateModel().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/militiachestolate2.png";
			}
		}.setUnlocalizedName("militia_armorbody").setRegistryName("militia_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelMilitiaLegginsxd().LeftLeg;
				armorModel.bipedRightLeg = new ModelMilitiaLegginsxd().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/militialeggins2.png";
			}
		}.setUnlocalizedName("militia_armorlegs").setRegistryName("militia_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
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
				return "swordsandsandals:textures/militiabootstexture.png";
			}
		}.setUnlocalizedName("militia_armorboots").setRegistryName("militia_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:militia_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:militia_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:militia_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:militia_armorboots", "inventory"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelMilitiaLegginsxd extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelMilitiaLegginsxd() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 24, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 24, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 12, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
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

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelMilitiaHelm extends ModelBase {
		private final ModelRenderer Head;
		public ModelMilitiaHelm() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 35, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -0.5F, -8.5F, -5.0F, 1, 6, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 0, -0.5F, -8.5F, 4.0F, 1, 3, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 26, 26, -0.5F, -9.0F, -4.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 22, 26, -0.5F, -9.0F, 3.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 26, -0.5F, -9.5F, -4.0F, 1, 1, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 0, -5.0F, -8.5F, -1.0F, 2, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 19, 3.0F, -8.5F, -1.0F, 2, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 22, -5.5F, -9.0F, -1.0F, 2, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, 3.5F, -9.0F, -1.0F, 2, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 18, 26, -5.5F, -9.25F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 3, 4.5F, -9.25F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 26, -6.0F, -9.5F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 5, 18, 5.0F, -9.5F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 5, 21, -6.0F, -9.5F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 4, 5.255F, -10.0F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 26, -6.25F, -10.0F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 14, 26, -6.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 5, 5.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 45, -3.4F, -8.75F, -3.5F, 7, 1, 7, 0.0F, false));
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

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelMilitiaChestplateModel extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelMilitiaChestplateModel() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 20, 0, -4.0F, 11.4F, -2.35F, 8, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 16, -1.5F, 10.55F, -2.75F, 3, 2, 1, 0.0F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
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
