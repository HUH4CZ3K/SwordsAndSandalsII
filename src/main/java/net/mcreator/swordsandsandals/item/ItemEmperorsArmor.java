
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

import net.mcreator.swordsandsandals.procedure.ProcedureEmperorsArmorLeggingsTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureEmperorsArmorHelmetTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureEmperorsArmorBootsTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureEmperorsArmorBodyTickEvent;
import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsArmors;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemEmperorsArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:emperorsarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:emperorsarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:emperorsarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:emperorsarmorboots")
	public static final Item boots = null;
	public ItemEmperorsArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 231);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMPERORSARMOR", "swordsandsandals:mperors__2", 1000, new int[]{12, 24, 39, 15},
				12, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_gold")),
				10f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelHelmOfAges().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/helmofages.png";
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
					ProcedureEmperorsArmorHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("emperorsarmorhelmet").setRegistryName("emperorsarmorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelEmperorsChestplate().Body;
				armorModel.bipedRightArm = new ModelEmperorsChestplate().RightArm;
                armorModel.bipedLeftArm = new ModelEmperorsChestplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/emperorschestplatetexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureEmperorsArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("emperorsarmorbody").setRegistryName("emperorsarmorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
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
				return "swordsandsandals:textures/emperorslegginstexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureEmperorsArmorLeggingsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("emperorsarmorlegs").setRegistryName("emperorsarmorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
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
				return "swordsandsandals:textures/emperorsbootstexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureEmperorsArmorBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("emperorsarmorboots").setRegistryName("emperorsarmorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:emperorsarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:emperorsarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:emperorsarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:emperorsarmorboots", "inventory"));
	}
	// Made with Blockbench 4.8.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelEmperorsChestplate extends ModelBase {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer RightArm_r1;
		private final ModelRenderer LeftArm;
		private final ModelRenderer LeftArm_r1;
		public ModelEmperorsChestplate() {
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
			RightArm.cubeList.add(new ModelBox(RightArm, 29, 33, -4.0F, -2.0F, -2.5F, 1, 2, 5, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -1.0F, -2.5F, -3.0F, 1, 3, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 7, -3.0F, -2.0F, -3.0F, 2, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 24, 3, -3.0F, -2.0F, 2.0F, 2, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 28, 14, -1.0F, -2.5F, 2.0F, 1, 3, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 38, 26, -4.25F, 2.75F, -0.5F, 1, 2, 1, 0.0F, false));
			RightArm_r1 = new ModelRenderer(this);
			RightArm_r1.setRotationPoint(5.0F, 22.0F, 0.0F);
			RightArm.addChild(RightArm_r1);
			setRotationAngle(RightArm_r1, 0.0F, 0.0F, -1.5708F);
			RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 39, 22, 12.5F, -7.0F, -2.5F, 1, 2, 1, 0.0F, false));
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 26, 0.0F, -3.5F, -3.0F, 1, 1, 6, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 0, 1.0F, -2.0F, -3.0F, 2, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 12, 16, 1.0F, -2.0F, 2.0F, 2, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 14, 1.0F, -3.0F, -2.5F, 2, 1, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 17, 33, 3.0F, -2.0F, -2.5F, 1, 2, 5, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, 0.0F, -2.5F, -3.0F, 1, 3, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.0F, -2.5F, 2.0F, 1, 3, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 33, 3.25F, 2.75F, -0.5F, 1, 2, 1, 0.0F, false));
			LeftArm_r1 = new ModelRenderer(this);
			LeftArm_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
			LeftArm.addChild(LeftArm_r1);
			setRotationAngle(LeftArm_r1, 0.0F, 0.0F, 1.5708F);
			LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 38, 29, -13.5F, -7.0F, -2.5F, 1, 2, 1, 0.0F, false));
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
	public static class ModelHelmOfAges extends ModelBase {
		private final ModelRenderer Head;
		private final ModelRenderer bb_main;
		public ModelHelmOfAges() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.15F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 39, -4.0F, -9.3F, -4.0F, 8, 1, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 40, -3.5F, -10.0F, -3.5F, 7, 1, 7, 0.0F, false));
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			Head.addChild(bb_main);
			bb_main.cubeList.add(new ModelBox(bb_main, 20, 59, -4.3F, -23.7F, 0.3F, 1, 1, 4, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 56, -4.3F, -23.7F, -4.3F, 2, 1, 5, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 50, 56, 2.3F, -23.7F, -4.3F, 2, 1, 5, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 35, 59, 3.3F, -23.7F, 0.3F, 1, 1, 4, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 62, -3.7F, -23.7F, 3.3F, 7, 1, 1, 0.0F, false));
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
