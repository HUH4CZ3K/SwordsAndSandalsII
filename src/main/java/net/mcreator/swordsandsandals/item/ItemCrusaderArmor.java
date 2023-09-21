
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
public class ItemCrusaderArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:crusader_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:crusader_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:crusader_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:crusader_armorboots")
	public static final Item boots = null;
	public ItemCrusaderArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 236);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CRUSADER_ARMOR", "swordsandsandals:test", 300, new int[]{6, 12, 17, 8}, 15,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_chain")), 7f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelCrusaderHelmet().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/crusaderhelmettexture.png";
			}
		}.setUnlocalizedName("crusader_armorhelmet").setRegistryName("crusader_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelCrusaderChestplate().Body;
				armorModel.bipedRightArm = new ModelCrusaderChestplate().RightArm;
				armorModel.bipedLeftArm = new ModelCrusaderChestplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/crusaderchestplatetexture.png";
			}
		}.setUnlocalizedName("crusader_armorbody").setRegistryName("crusader_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelCrusaderLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelCrusaderLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/crusaderlegginstexture.png";
			}
		}.setUnlocalizedName("crusader_armorlegs").setRegistryName("crusader_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelChampionBoots().LeftBoot;
				armorModel.bipedRightLeg = new ModelChampionBoots().RightBoot;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/crusaderbootstexture.png";
			}
		}.setUnlocalizedName("crusader_armorboots").setRegistryName("crusader_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:crusader_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:crusader_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:crusader_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:crusader_armorboots", "inventory"));
	}
	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelCrusaderHelmet extends ModelBase {
		private final ModelRenderer Head;
		public ModelCrusaderHelmet() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 48, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -4.0F, -9.0F, -4.0F, 8, 2, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -1.0F, -9.5F, -1.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 3, -1.0F, -13.5F, 0.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 31, -1.0F, -12.0F, -1.0F, 2, 1, 4, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 26, -2.0F, -13.0F, -1.0F, 4, 1, 4, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 0, -1.0F, -11.5F, 3.0F, 2, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -1.0F, -11.0F, 1.0F, 2, 1, 2, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 16, 26, -2.0F, -12.5F, 3.0F, 4, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 19, -1.0F, -11.0F, 4.0F, 2, 3, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 16, 30, -2.0F, -12.0F, 4.0F, 4, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 12, 47, -2.0F, -10.0F, 5.0F, 4, 3, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 16, 28, -2.0F, -11.0F, 5.0F, 4, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 47, -1.5F, -10.5F, -1.5F, 3, 1, 3, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 36, -1.5F, -11.0F, -1.5F, 3, 1, 3, 0.0F, false));
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
	public static class ModelCrusaderLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelCrusaderLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 24, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 12, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F, false));
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
	public static class ModelCrusaderChestplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer Body_r1;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelCrusaderChestplate() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.4F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 16, -4.0F, 0.0F, -2.39F, 8, 6, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 32, -3.5F, 11.9F, -2.4F, 7, 3, 1, 0.0F, false));
			Body_r1 = new ModelRenderer(this);
			Body_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body.addChild(Body_r1);
			setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 40, 23, -3.0F, -3.0F, -2.5F, 4, 1, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 48, -3.5F, -3.0F, -2.5F, 1, 1, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 12, 48, -4.5F, -1.0F, -2.5F, 1, 1, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 31, 51, -3.5F, -0.5F, -3.0F, 4, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 19, 51, -3.0F, -1.0F, -3.5F, 4, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 7, 51, -3.0F, -1.0F, 2.5F, 4, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 2, -4.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 51, 29, -3.5F, -0.5F, 2.0F, 4, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 19, 48, -3.0F, -2.0F, -3.0F, 4, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 7, 48, -3.0F, -2.0F, 2.0F, 4, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 44, 29, -4.0F, -2.0F, -2.5F, 1, 2, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 40, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 16, 55, -3.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 32, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 43, 43, -1.0F, -3.0F, -2.5F, 4, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 43, 49, -1.0F, -2.0F, -3.0F, 4, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 52, -1.0F, -1.0F, -3.5F, 4, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 0, -0.5F, -0.5F, -3.0F, 4, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 51, 31, -0.5F, -0.5F, 2.0F, 4, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 2, -1.0F, -1.0F, 2.5F, 4, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 31, 48, -1.0F, -2.0F, 2.0F, 4, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 48, 3.0F, -2.0F, -2.5F, 1, 2, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 36, 48, 3.5F, -1.0F, -2.5F, 1, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 36, 2.5F, -3.0F, -2.5F, 1, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 18, 3.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, 3.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 55, -1.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
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
	public static class ModelChampionBoots extends ModelBase {
		private final ModelRenderer RightBoot;
		private final ModelRenderer LeftBoot;
		public ModelChampionBoots() {
			textureWidth = 32;
			textureHeight = 32;
			RightBoot = new ModelRenderer(this);
			RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 6, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 12, 0, -1.55F, 9.0F, 2.0F, 3, 3, 1, 0.0F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 6, -0.55F, 8.5F, 3.0F, 1, 3, 1, 0.0F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 12, 6, -1.55F, 11.3F, -3.0F, 3, 1, 1, 0.0F, false));
			LeftBoot = new ModelRenderer(this);
			LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 8, 12, -1.45F, 11.3F, -3.0F, 3, 1, 1, 0.0F, false));
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 12, -1.45F, 9.0F, 2.0F, 3, 3, 1, 0.0F, false));
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 0, -0.45F, 8.5F, 3.0F, 1, 3, 1, 0.0F, false));
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 0, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			RightBoot.render(f5);
			LeftBoot.render(f5);
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
