
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
public class ItemRetariusArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:retarius_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:retarius_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:retarius_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:retarius_armorboots")
	public static final Item boots = null;
	public ItemRetariusArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 237);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RETARIUS_ARMOR", "swordsandsandals:antaresalpha_", 75, new int[]{3, 6, 8, 3}, 12,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_chain")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelRetariusHelmet().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/retariushelmettexture.png";
			}
		}.setUnlocalizedName("retarius_armorhelmet").setRegistryName("retarius_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelRetariusChestplate().Body;
				armorModel.bipedRightArm = new ModelRetariusChestplate().RightArm;
                armorModel.bipedLeftArm = new ModelRetariusChestplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/retariuschestplatetexture.png";
			}
		}.setUnlocalizedName("retarius_armorbody").setRegistryName("retarius_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelswashbucklerLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelswashbucklerLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/retariuslegginstexture.png";
			}
		}.setUnlocalizedName("retarius_armorlegs").setRegistryName("retarius_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new Modelswashbucklerbootpoprawione().LeftLeg;
				armorModel.bipedRightLeg = new Modelswashbucklerbootpoprawione().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/retariusbootstexture.png";
			}
		}.setUnlocalizedName("retarius_armorboots").setRegistryName("retarius_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:retarius_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:retarius_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:retarius_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:retarius_armorboots", "inventory"));
	}
	// Made with Blockbench 4.7.4
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelRetariusChestplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelRetariusChestplate() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 16, -1.0F, 11.05F, -2.5F, 2, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 18, -1.0F, 11.55F, -2.5F, 2, 1, 1, 0.0F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 9, 39, -3.75F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 34, 0.0F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 34, -1.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 34, -3.0F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 18, 32, 2.75F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 34, -1.0F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 34, 2.0F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 34, 0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
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

	// Made with Blockbench 4.5.2
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelswashbucklerLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelswashbucklerLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 30, 0, -2.0F, 0.0F, -2.0F, 4, 2, 4, 0.3F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 0, -2.4F, 2.3F, -2.3F, 1, 3, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 61, -0.725F, 5.5F, -2.5F, 2, 1, 2, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 61, -1.225F, 5.5F, -2.5F, 1, 1, 2, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 61, -1.225F, 5.0F, -2.5F, 1, 1, 2, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 61, -0.725F, 5.0F, -2.5F, 2, 1, 2, 0.0F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 48, 0, -2.0F, 0.0F, -2.0F, 4, 2, 4, 0.3F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 9, 0, 1.4F, 2.3F, -2.3F, 1, 3, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 58, 61, 0.225F, 5.0F, -2.5F, 1, 1, 2, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 58, 61, 0.225F, 5.5F, -2.5F, 1, 1, 2, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 56, 61, -1.275F, 5.5F, -2.5F, 2, 1, 2, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 56, 61, -1.275F, 5.0F, -2.5F, 2, 1, 2, 0.0F, false));
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

	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelswashbucklerbootpoprawione extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelswashbucklerbootpoprawione() {
			textureWidth = 32;
			textureHeight = 32;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 0, -2.1F, 8.4F, -1.0F, 4, 1, 3, 0.3F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 11, 12, -2.1F, 10.3F, -2.75F, 4, 2, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 6, -2.1F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 16, 4, -1.6F, 10.725F, -3.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 16, 9, -1.6F, 11.3F, -3.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 13, 17, -1.1F, 11.3F, -4.0F, 2, 1, 1, 0.0F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -1.9F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 8, 16, -0.9F, 11.3F, -4.0F, 2, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 13, 15, -1.4F, 10.725F, -3.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 6, -1.9F, 10.3F, -2.75F, 4, 2, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 16, -1.4F, 11.3F, -3.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 12, -1.9F, 8.4F, -1.0F, 4, 1, 3, 0.3F, false));
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

	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelRetariusHelmet extends ModelBase {
		private final ModelRenderer Head;
		public ModelRetariusHelmet() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 48, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.35F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 3, -5.0F, -6.0F, -5.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 20, 18, -6.0F, -6.0F, -4.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 20, 16, 5.0F, -6.0F, -4.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 27, 6, -3.0F, -6.5F, -5.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 5, -2.0F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 3, 1.0F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 6, -1.0F, -7.5F, -5.0F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 51, -0.5F, -10.0F, -4.0F, 1, 2, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 23, 17, -0.5F, -12.0F, 2.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 51, -0.5F, -9.0F, 4.0F, 1, 5, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -0.5F, -7.0F, 5.0F, 1, 3, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 24, -0.5F, -11.0F, -4.0F, 1, 1, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 35, -0.5F, -13.0F, -4.0F, 1, 2, 6, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 43, -0.5F, -14.0F, -4.0F, 1, 1, 4, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 27, 4, 2.0F, -6.5F, -5.0F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 14, 61, 3.5F, -5.5F, -3.0F, 3, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 14, 54, -6.5F, -5.5F, -3.0F, 3, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 8, 16, -6.5F, -4.5F, 1.0F, 3, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 8, 19, 3.5F, -4.5F, 1.0F, 3, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 61, -7.0F, -5.0F, -1.0F, 3, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 14, 51, 4.0F, -5.0F, -1.0F, 3, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 48, -6.0F, -4.0F, 3.0F, 12, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 33, -5.0F, -4.0F, 5.0F, 10, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, 3.0F, -6.0F, -5.0F, 2, 1, 2, 0.0F, false));
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
