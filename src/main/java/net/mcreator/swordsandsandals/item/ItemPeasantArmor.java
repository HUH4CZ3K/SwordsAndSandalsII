
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
public class ItemPeasantArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:peasant_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:peasant_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:peasant_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:peasant_armorboots")
	public static final Item boots = null;
	public ItemPeasantArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 245);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PEASANT_ARMOR", "swordsandsandals:antaresalpha_", 50, new int[]{1, 2, 3, 1}, 8,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_leather")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelPeasantCheastplate().Body;
				armorModel.bipedRightArm = new ModelPeasantCheastplate().RightArm;
                armorModel.bipedLeftArm = new ModelPeasantCheastplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/peasentchestplatetexture.png";
			}
		}.setUnlocalizedName("peasant_armorbody").setRegistryName("peasant_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:peasant_armorbody", "inventory"));
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
}
