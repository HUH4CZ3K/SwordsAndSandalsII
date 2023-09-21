
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
public class ItemPeasentArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:peasent_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:peasent_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:peasent_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:peasent_armorboots")
	public static final Item boots = null;
	public ItemPeasentArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 244);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PEASENT_ARMOR", "swordsandsandals:antaresalpha_", 10, new int[]{1, 2, 3, 1}, 8,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelPeasantHelm().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/new_armor_preasant.png";
			}
		}.setUnlocalizedName("peasent_armorhelmet").setRegistryName("peasent_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelPeasantLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelPeasantLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/.png";
			}
		}.setUnlocalizedName("peasent_armorlegs").setRegistryName("peasent_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelPeasantBootpoprawione().LeftLeg;
				armorModel.bipedRightLeg = new ModelPeasantBootpoprawione().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/peasantboottexture.png";
			}
		}.setUnlocalizedName("peasent_armorboots").setRegistryName("peasent_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:peasent_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:peasent_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:peasent_armorboots", "inventory"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelPeasantLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelPeasantLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-6.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 32, 3.0F, 0.0F, -2.0F, 4, 11, 4, 0.2F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 11, 4, 0.2F, false));
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

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelPeasantCheastplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelPeasantCheastplate() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 12, 32, 1.5F, 10.5F, -3.0F, 2, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 20, 0, 1.25F, 2.75F, -2.75F, 2, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, 1.75F, 4.25F, -2.75F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 2, 2.0F, 9.5F, -3.0F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 20, 16, -1.25F, 10.5F, -2.75F, 2, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 36, 0, -3.5F, 11.24F, -2.35F, 7, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 16, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 32, 32, -3.5F, 2.0F, -2.5F, 5, 1, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 32, 32, -3.5F, 3.25F, -2.5F, 5, 1, 5, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 32, 32, -1.5F, 2.0F, -2.5F, 5, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 32, 32, -1.5F, 3.25F, -2.5F, 5, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
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
	public static class ModelPeasantBootpoprawione extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelPeasantBootpoprawione() {
			textureWidth = 32;
			textureHeight = 32;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 14, 14, -1.6F, 11.0F, -2.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 1, 8, -2.1F, 10.0F, -2.0F, 4, 2, 4, 0.25F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 14, 1, -2.6F, 11.0F, -1.5F, 1, 1, 3, 0.0F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 1, 1, -1.9F, 10.0F, -2.0F, 4, 2, 4, 0.25F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 6, 14, -1.4F, 11.0F, -2.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 14, 8, 1.6F, 11.0F, -1.5F, 1, 1, 3, 0.0F, false));
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

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelPeasantHelm extends ModelBase {
		private final ModelRenderer Head;
		public ModelPeasantHelm() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 16, -3.5F, -9.25F, -3.5F, 7, 1, 7, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 0, -1.5F, -10.75F, -1.5F, 3, 1, 3, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 0, -1.5F, -9.75F, -1.5F, 3, 1, 3, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 24, -4.75F, -7.75F, -2.5F, 1, 2, 5, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 23, 22, 3.75F, -7.75F, -2.5F, 1, 2, 5, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 21, 16, -2.5F, -10.25F, -2.5F, 5, 1, 5, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
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
