
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

import net.mcreator.swordsandsandals.procedure.ProcedureConquererArmorHelmetTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureConquererArmorBodyTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureAutomatonArmorLeggingsTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureAutomatonArmorBootsTickEvent;
import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsArmors;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemConquererArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:conquerer_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:conquerer_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:conquerer_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:conquerer_armorboots")
	public static final Item boots = null;
	public ItemConquererArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 234);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CONQUERER_ARMOR", "swordsandsandals:antaresalpha_", 450,
				new int[]{8, 17, 30, 10}, 20,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				9.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelConquererHelmet().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/conquererhelmettexture.png";
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
					ProcedureConquererArmorHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("conquerer_armorhelmet").setRegistryName("conquerer_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelConquererChestplate().Body;
				armorModel.bipedRightArm = new ModelConquererChestplate().RightArm;
                armorModel.bipedLeftArm = new ModelConquererChestplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/conquererchestplatetexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureConquererArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("conquerer_armorbody").setRegistryName("conquerer_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelConquererLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelConquererLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/conquererlegginstexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureAutomatonArmorLeggingsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("conquerer_armorlegs").setRegistryName("conquerer_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelConquererBoots().LeftBoot;
				armorModel.bipedRightLeg = new ModelConquererBoots().RightBoot;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/conquererbootstexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureAutomatonArmorBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("conquerer_armorboots").setRegistryName("conquerer_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:conquerer_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:conquerer_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:conquerer_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:conquerer_armorboots", "inventory"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelConquererBoots extends ModelBase {
		private final ModelRenderer RightBoot;
		private final ModelRenderer LeftBoot;
		public ModelConquererBoots() {
			textureWidth = 32;
			textureHeight = 32;
			RightBoot = new ModelRenderer(this);
			RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 6, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 6, 12, -1.0F, 9.0F, 2.0F, 2, 3, 1, 0.0F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 12, 2, -1.55F, 11.3F, -3.0F, 3, 1, 1, 0.0F, false));
			LeftBoot = new ModelRenderer(this);
			LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 12, 0, -1.45F, 11.3F, -3.0F, 3, 1, 1, 0.0F, false));
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 12, -1.0F, 9.0F, 2.0F, 2, 3, 1, 0.0F, false));
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

	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelConquererChestplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public ModelConquererChestplate() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 13, 38, -4.25F, 2.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 34, 26, -4.25F, 2.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 32, 20, 3.25F, 2.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 26, 0, 3.25F, 2.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 36, 33, -3.75F, 4.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 34, 0, -2.5F, 7.0F, -2.5F, 5, 5, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 30, 33, -3.75F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 33, 2.75F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 10, 2.75F, 4.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 37, 14, -4.75F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 34, 29, -4.75F, 0.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 17, 32, 3.75F, 0.0F, 2.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 8, 32, 3.75F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 24, 7, -5.75F, -1.0F, -3.0F, 2, 1, 6, 0.0F, false));
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

	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelConquererLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelConquererLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 16, -2.6F, 7.0F, -2.5F, 1, 3, 5, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 2, -1.6F, 7.0F, -2.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 23, 3, 1.4F, 7.0F, -2.5F, 1, 1, 5, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 0, -1.6F, 7.0F, 1.5F, 3, 1, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 24, -2.85F, 6.0F, -2.0F, 1, 1, 4, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 12, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 29, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.26F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 29, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.26F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 8, -1.4F, 7.0F, 1.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 10, -1.4F, 7.0F, -2.5F, 3, 1, 1, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 23, 23, -2.4F, 7.0F, -2.5F, 1, 1, 5, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 9, 1.85F, 6.0F, -2.0F, 1, 1, 4, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 0, 1.6F, 7.0F, -2.5F, 1, 3, 5, 0.0F, false));
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
	public static class ModelConquererHelmet extends ModelBase {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		public ModelConquererHelmet() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 24, 0, -3.5F, -9.0F, -3.5F, 7, 1, 7, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 32, -3.0F, -10.0F, -3.0F, 6, 2, 6, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 10, -1.0F, -9.0F, -4.25F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 32, -1.0F, -10.0F, -4.0F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 24, 4, -1.0F, -10.0F, 3.0F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 8, -1.0F, -9.0F, 3.25F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 6, -1.0F, -11.0F, -0.5F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 14, -1.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 16, -1.5F, -18.0F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -1.75F, -17.0F, -0.5F, 1, 5, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 12, 0.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 18, 0.5F, -18.0F, -0.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 4, 0, 0.75F, -17.0F, -0.5F, 1, 5, 1, 0.0F, false));
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 16, -1.0F, -10.0F, -4.0F, 2, 1, 1, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 18, -1.0F, -10.0F, -4.0F, 2, 1, 1, 0.0F, false));
			cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 0, -1.0F, -9.0F, 3.25F, 2, 1, 1, 0.0F, false));
			cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 2, -1.0F, -9.0F, -4.25F, 2, 1, 1, 0.0F, false));
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
