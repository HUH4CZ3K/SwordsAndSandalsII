
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
public class ItemBrigandArmour extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:brigand_armourhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:brigand_armourbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:brigand_armourlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:brigand_armourboots")
	public static final Item boots = null;
	public ItemBrigandArmour(ElementsSwordsandsandalsMod instance) {
		super(instance, 242);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BRIGAND_ARMOUR", "swordsandsandals:antaresalpha_", 25, new int[]{1, 3, 4, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelBrigandHelmTexture().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/brigandhelmtexture.png";
			}
		}.setUnlocalizedName("brigand_armourhelmet").setRegistryName("brigand_armourhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelBrigandChestplate().Body;
				armorModel.bipedRightArm = new ModelBrigandChestplate().RightArm;
                armorModel.bipedLeftArm = new ModelBrigandChestplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/brigandchestplatetexture.png";
			}
		}.setUnlocalizedName("brigand_armourbody").setRegistryName("brigand_armourbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelChampionLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelChampionLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/brigandlegginstexture.png";
			}
		}.setUnlocalizedName("brigand_armourlegs").setRegistryName("brigand_armourlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelBrigandBootpoprawione().LeftLeg;
				armorModel.bipedRightLeg = new ModelBrigandBootpoprawione().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/brigandboottexture.png";
			}
		}.setUnlocalizedName("brigand_armourboots").setRegistryName("brigand_armourboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:brigand_armourhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:brigand_armourbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:brigand_armourlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:brigand_armourboots", "inventory"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelBrigandHelmTexture extends ModelBase {
		private final ModelRenderer Head;
		public ModelBrigandHelmTexture() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -0.5F, -9.5F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 0, -3.4F, -8.75F, -3.5F, 7, 1, 7, 0.0F, false));
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
	public static class ModelBrigandBootpoprawione extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelBrigandBootpoprawione() {
			textureWidth = 32;
			textureHeight = 32;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 30, -1.6F, 11.5F, -2.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 14, 14, -1.6F, 11.0F, -2.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 1, 8, -2.1F, 10.0F, -2.0F, 4, 2, 4, 0.25F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 1, 1, -1.9F, 10.0F, -2.0F, 4, 2, 4, 0.25F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 6, 14, -1.4F, 11.0F, -2.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 30, -1.4F, 11.5F, -2.5F, 3, 1, 1, 0.0F, false));
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
	public static class ModelChampionLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelChampionLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 24, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.26F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 24, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 12, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.26F, false));
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

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelBrigandChestplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelBrigandChestplate() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.29F, false));
			Body.cubeList.add(new ModelBox(Body, 20, 0, -1.0F, 10.55F, -2.5F, 2, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 12.0F, -2.5F, 1, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 24, -4.0F, 11.5F, -2.35F, 8, 1, 1, 0.0F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 6, -3.0F, -2.0F, -2.0F, 4, 2, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 0, -3.0F, 5.0F, -2.0F, 4, 2, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 52, 62, -3.0F, 9.0F, -2.0F, 4, 0, 0, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 10, 32, -3.0F, 2.0F, -2.0F, 4, 2, 1, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -3.0F, 2.0F, 1.0F, 4, 2, 1, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 52, 58, 0.0F, 0.5F, -2.0F, 0, 1, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 57, 60, -1.5F, 7.5F, -2.0F, 0, 1, 0, 0.3F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 51, 58, 0.0F, 0.5F, -2.0F, 0, 1, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 29, -1.0F, 2.0F, -2.0F, 4, 2, 1, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 59, 1.5F, 7.5F, -2.0F, 0, 1, 0, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 62, -1.0F, 9.0F, -2.0F, 4, 0, 0, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 18, -1.0F, -2.0F, -2.0F, 4, 2, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 26, -1.0F, 2.0F, 1.0F, 4, 2, 1, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 12, -1.0F, 5.0F, -2.0F, 4, 2, 4, 0.3F, false));
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
}
