
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

import net.mcreator.swordsandsandals.procedure.ProcedureChampionArmorLeggingsTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureChampionArmorHelmetTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureChampionArmorBootsTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureChampionArmorBodyTickEvent;
import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsArmors;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemChampionArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:champion_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:champion_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:champion_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:champion_armorboots")
	public static final Item boots = null;
	public ItemChampionArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 232);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CHAMPION_ARMOR", "swordsandsandals:test", 750, new int[]{11, 22, 35, 13}, 26,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				10f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelChampionHelmet3().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/cht4.png";
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
					ProcedureChampionArmorHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("champion_armorhelmet").setRegistryName("champion_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelChampionChestplateModel3().Body;
				armorModel.bipedRightArm = new ModelChampionChestplateModel3().RightArm;
                armorModel.bipedLeftArm = new ModelChampionChestplateModel3().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/championchestplatetexture5.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureChampionArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("champion_armorbody").setRegistryName("champion_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
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
				return "swordsandsandals:textures/championlegginstexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureChampionArmorLeggingsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("champion_armorlegs").setRegistryName("champion_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
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
				return "swordsandsandals:textures/championbootstexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureChampionArmorBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("champion_armorboots").setRegistryName("champion_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:champion_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:champion_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:champion_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:champion_armorboots", "inventory"));
	}
	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelChampionChestplateModel3 extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;
		private final ModelRenderer pioropuszlewy;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer pioropuszprawy;
		public ModelChampionChestplateModel3() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.4F, false));
			Body.cubeList.add(new ModelBox(Body, 31, 52, -4.0F, 12.0F, -2.0F, 8, 3, 4, 0.39F, false));
			Body.cubeList.add(new ModelBox(Body, 36, 16, 0.25F, 1.5F, -2.75F, 3, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 23, 1.5F, 0.5F, -2.75F, 2, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 50, 0, 3.75F, -1.0F, -1.5F, 3, 1, 3, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 50, -3.25F, 1.5F, -2.75F, 3, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 12, 3.75F, -1.0F, 1.5F, 1, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 32, -4.75F, -1.0F, -2.5F, 1, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 36, 0, -6.75F, -1.0F, -1.5F, 3, 1, 3, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 8, -4.75F, -1.0F, 1.5F, 1, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 19, 3.75F, -1.0F, -2.5F, 1, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 7, 54, -3.5F, 0.5F, -2.75F, 2, 1, 1, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 25, 54, 3.25F, 2.75F, -0.5F, 1, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 16, 2.75F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 53, -0.25F, -1.0F, -2.5F, 3, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 14, 53, -0.25F, -1.0F, 1.5F, 3, 1, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 55, 4.25F, 2.0F, -0.5F, 1, 2, 1, 0.0F, false));
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, 0.0F, 0.0F, 1.5708F);
			LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 40, 25, -14.5F, -7.0F, -2.5F, 1, 2, 1, 0.0F, false));
			pioropuszlewy = new ModelRenderer(this);
			pioropuszlewy.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftArm.addChild(pioropuszlewy);
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 4, 55, 1.75F, -7.5F, -0.5F, 1, 2, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 44, 8, 3.75F, -7.5F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 40, 6, -0.25F, -4.0F, -0.5F, 2, 1, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 22, 52, 0.25F, -5.0F, -0.5F, 3, 1, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 7, 52, 0.75F, -6.0F, -0.5F, 3, 1, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 12, 55, 1.75F, -4.0F, -0.5F, 1, 2, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 0, 58, 2.75F, -7.0F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 27, 57, 3.75F, -6.0F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 0, 16, 0.75F, -8.5F, -0.5F, 1, 3, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 23, 57, 3.25F, -4.5F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 44, 13, 2.25F, -8.5F, -0.5F, 1, 1, 1, 0.0F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 40, 4, -2.75F, -1.0F, -2.5F, 3, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 20, 0, -3.75F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 8, 56, -5.25F, 2.0F, -0.5F, 1, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 39, 31, -2.75F, -1.0F, 1.5F, 3, 1, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 59, 0, -4.25F, 2.75F, -0.5F, 1, 2, 1, 0.0F, false));
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(5.0F, 22.0F, 0.0F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, 0.0F, 0.0F, -1.5708F);
			RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 40, 28, 13.5F, -7.0F, -2.5F, 1, 2, 1, 0.0F, false));
			pioropuszprawy = new ModelRenderer(this);
			pioropuszprawy.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightArm.addChild(pioropuszprawy);
			setRotationAngle(pioropuszprawy, 0.0F, 3.1416F, 0.0F);
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 0, 55, 1.75F, -7.5F, -0.5F, 1, 2, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 19, 57, 3.75F, -7.5F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 21, 32, -0.25F, -4.0F, -0.5F, 2, 1, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 7, 52, 0.25F, -5.0F, -0.5F, 3, 1, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 15, 51, 0.75F, -6.0F, -0.5F, 3, 1, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 21, 54, 1.75F, -4.0F, -0.5F, 1, 2, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 27, 2.75F, -7.0F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 18, 3.75F, -6.0F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 0, 0, 0.75F, -8.5F, -0.5F, 1, 3, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 15, 3.25F, -4.5F, -0.5F, 1, 1, 1, 0.0F, false));
			pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 11, 2.25F, -8.5F, -0.5F, 1, 1, 1, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Body.render(f5);
			LeftArm.render(f5);
			RightArm.render(f5);
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

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelChampionHelmet3 extends ModelBase {
		private final ModelRenderer Head;
		private final ModelRenderer Helm;
		private final ModelRenderer piorogorne2;
		private final ModelRenderer piorogorne3;
		private final ModelRenderer piorogorne4;
		private final ModelRenderer Body;
		public ModelChampionHelmet3() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 48, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.4F, false));
			Helm = new ModelRenderer(this);
			Helm.setRotationPoint(0.0F, 24.0F, 0.0F);
			Head.addChild(Helm);
			Helm.cubeList.add(new ModelBox(Helm, 32, 32, -3.0F, -33.0F, -3.0F, 6, 1, 6, 0.0F, false));
			Helm.cubeList.add(new ModelBox(Helm, 32, 39, -2.0F, -33.5F, -3.0F, 4, 1, 6, 0.0F, false));
			Helm.cubeList.add(new ModelBox(Helm, 28, 46, -0.5F, -34.0F, -2.0F, 1, 1, 4, 0.0F, false));
			Helm.cubeList.add(new ModelBox(Helm, 50, 58, -3.0F, -33.0F, -3.5F, 6, 1, 1, 0.0F, false));
			Helm.cubeList.add(new ModelBox(Helm, 50, 56, -3.0F, -33.0F, 2.5F, 6, 1, 1, 0.0F, false));
			piorogorne2 = new ModelRenderer(this);
			piorogorne2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Helm.addChild(piorogorne2);
			setRotationAngle(piorogorne2, 0.0F, 3.1416F, 0.0F);
			piorogorne3 = new ModelRenderer(this);
			piorogorne3.setRotationPoint(2.0F, 0.0F, 0.0F);
			Helm.addChild(piorogorne3);
			setRotationAngle(piorogorne3, 0.0F, 3.1416F, 0.0F);
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 32, 43, -5.75F, -38.5F, -0.5F, 2, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 12, 36, -2.75F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 32, 32, -4.25F, -34.0F, -0.5F, 2, 4, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 0, 4, -7.25F, -36.0F, -0.5F, 3, 3, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 20, 18, -7.75F, -37.0F, -0.5F, 3, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 0, 48, -5.75F, -37.5F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 47, 47, -6.75F, -38.0F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 54, 60, -7.75F, -36.0F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 4, 48, -6.25F, -32.5F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 54, 62, -5.25F, -32.0F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 28, 32, -5.25F, -38.0F, -0.5F, 1, 2, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 4, 32, -4.25F, -36.0F, -0.5F, 1, 2, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 34, 46, -6.25F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
			piorogorne3.cubeList.add(new ModelBox(piorogorne3, 36, 18, 0.25F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
			piorogorne4 = new ModelRenderer(this);
			piorogorne4.setRotationPoint(-2.0F, 0.0F, 0.0F);
			Helm.addChild(piorogorne4);
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 12, 34, -5.75F, -38.5F, -0.5F, 2, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 12, 32, -2.75F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 24, 0, -4.25F, -34.0F, -0.5F, 2, 4, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 0, 0, -7.25F, -36.0F, -0.5F, 3, 3, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 20, 16, -7.75F, -37.0F, -0.5F, 3, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 44, 46, -5.75F, -37.5F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 46, 43, -6.75F, -38.0F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 30, 2, -6.25F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 46, 41, -7.75F, -36.0F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 40, 46, -6.25F, -32.5F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 46, 39, -5.25F, -32.0F, -0.5F, 1, 1, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 0, 32, -5.25F, -38.0F, -0.5F, 1, 2, 1, 0.0F, false));
			piorogorne4.cubeList.add(new ModelBox(piorogorne4, 0, 16, -4.25F, -36.0F, -0.5F, 1, 2, 1, 0.0F, false));
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			Head.render(f5);
			Body.render(f5);
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
