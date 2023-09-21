
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

import net.mcreator.swordsandsandals.procedure.ProcedureAutomatonArmorLeggingsTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureAutomatonArmorHelmetTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureAutomatonArmorBootsTickEvent;
import net.mcreator.swordsandsandals.procedure.ProcedureAutomatonArmorBodyTickEvent;
import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsArmors;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemAutomatonArmor extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:automaton_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("swordsandsandals:automaton_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("swordsandsandals:automaton_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("swordsandsandals:automaton_armorboots")
	public static final Item boots = null;
	public ItemAutomatonArmor(ElementsSwordsandsandalsMod instance) {
		super(instance, 233);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AUTOMATON_ARMOR", "swordsandsandals:antaresalpha_", 475,
				new int[]{9, 19, 32, 12}, 22,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_diamond")),
				10f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new ModelAutomatonHelmet().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/automatonhelmettexture.png";
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
					ProcedureAutomatonArmorHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("automaton_armorhelmet").setRegistryName("automaton_armorhelmet").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedBody = new ModelAutomatonChestplate().Body;
				armorModel.bipedRightArm = new ModelAutomatonChestplate().RightArm;
                armorModel.bipedLeftArm = new ModelAutomatonChestplate().LeftArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/automatonchesttexture.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureAutomatonArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("automaton_armorbody").setRegistryName("automaton_armorbody").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelAutomatonLeggins().LeftLeg;
				armorModel.bipedRightLeg = new ModelAutomatonLeggins().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/automatonlegginstexture.png";
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
		}.setUnlocalizedName("automaton_armorlegs").setRegistryName("automaton_armorlegs").setCreativeTab(TabSwordsAndSandalsArmors.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new ModelAutomatonBoots().LeftBoot;
				armorModel.bipedRightLeg = new ModelAutomatonBoots().RightBoot;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "swordsandsandals:textures/automatonbootstexture.png";
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
		}.setUnlocalizedName("automaton_armorboots").setRegistryName("automaton_armorboots").setCreativeTab(TabSwordsAndSandalsArmors.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("swordsandsandals:automaton_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("swordsandsandals:automaton_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("swordsandsandals:automaton_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("swordsandsandals:automaton_armorboots", "inventory"));
	}
	// Made with Blockbench 4.6.4
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelAutomatonLeggins extends ModelBase {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelAutomatonLeggins() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.cubeList.add(new ModelBox(RightLeg, 16, 0, -2.6F, 7.0F, -2.0F, 1, 1, 4, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 0, -2.6F, 4.0F, -0.5F, 1, 2, 1, 0.0F, false));
			RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 14, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 5, 1.6F, 7.0F, -2.0F, 1, 1, 4, 0.0F, false));
			LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 0, 1.6F, 4.0F, -0.5F, 1, 2, 1, 0.0F, false));
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

	// Made with Blockbench 4.6.4
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelAutomatonBoots extends ModelBase {
		private final ModelRenderer RightBoot;
		private final ModelRenderer LeftBoot;
		public ModelAutomatonBoots() {
			textureWidth = 32;
			textureHeight = 32;
			RightBoot = new ModelRenderer(this);
			RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 6, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 6, 12, -1.0F, 9.0F, 2.0F, 2, 3, 1, 0.0F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 6, -3.0F, 9.0F, 0.0F, 1, 2, 1, 0.0F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 0, -3.0F, 9.5F, 1.0F, 1, 2, 1, 0.0F, false));
			RightBoot.cubeList.add(new ModelBox(RightBoot, 12, 2, -1.55F, 11.3F, -3.0F, 3, 1, 1, 0.0F, false));
			LeftBoot = new ModelRenderer(this);
			LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 12, 0, -1.45F, 11.3F, -3.0F, 3, 1, 1, 0.0F, false));
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 12, -1.0F, 9.0F, 2.0F, 2, 3, 1, 0.0F, false));
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 12, 12, 2.0F, 9.5F, 1.0F, 1, 2, 1, 0.0F, false));
			LeftBoot.cubeList.add(new ModelBox(LeftBoot, 12, 6, 2.0F, 9.0F, 0.0F, 1, 2, 1, 0.0F, false));
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

	// Made with Blockbench 4.6.4
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelAutomatonChestplate extends ModelBase {
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer Body;
		public ModelAutomatonChestplate() {
			textureWidth = 64;
			textureHeight = 64;
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 39, -1.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 38, 38, 3.0F, -2.0F, -3.0F, 1, 2, 6, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 36, 0, -1.0F, -1.5F, 2.0F, 4, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 16, -1.0F, -1.5F, -3.0F, 4, 2, 1, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 32, -1.0F, -2.5F, -3.0F, 4, 1, 6, 0.0F, false));
			LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.35F, false));
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.cubeList.add(new ModelBox(RightArm, 32, 23, -3.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 28, 28, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 40, 6, -3.0F, -1.5F, -3.0F, 4, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 40, 3, -3.0F, -1.5F, 2.0F, 4, 2, 1, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 32, 16, -3.0F, -2.5F, -3.0F, 4, 1, 6, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 14, 33, -4.0F, -2.0F, -3.0F, 1, 2, 6, 0.0F, false));
			RightArm.cubeList.add(new ModelBox(RightArm, 0, 48, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.35F, false));
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 12, -4.25F, 0.0F, -2.5F, 3, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 14, 1.25F, 0.0F, -2.5F, 3, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 9, -2.0F, 3.0F, -3.0F, 4, 2, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 30, -3.75F, 4.0F, -2.5F, 3, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 40, 28, 0.75F, 4.0F, -2.5F, 3, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 41, 0.5F, 5.0F, -2.5F, 3, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 12, 16, 1.0F, 1.0F, -2.5F, 3, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 20, 41, -3.5F, 5.0F, -2.5F, 3, 1, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 20, 0, -4.0F, 1.0F, -2.5F, 3, 3, 1, 0.0F, false));
			Body.cubeList.add(new ModelBox(Body, 0, 44, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.35F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			LeftArm.render(f5);
			RightArm.render(f5);
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

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelAutomatonHelmet extends ModelBase {
		private final ModelRenderer Head;
		public ModelAutomatonHelmet() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
			Head.cubeList.add(new ModelBox(Head, 32, 47, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 58, -4.0F, -7.0F, -4.5F, 8, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 55, -1.0F, -9.5F, -4.5F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 49, -1.25F, -9.0F, -4.5F, 1, 2, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 0, -0.75F, -9.0F, -4.5F, 2, 2, 1, 0.01F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 5, -0.5F, -10.0F, -4.5F, 1, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 46, -4.0F, -7.0F, 3.5F, 8, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 44, -4.0F, -9.0F, 3.0F, 8, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 42, -4.0F, -9.0F, -4.0F, 8, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 28, 46, -2.5F, -10.0F, -4.0F, 5, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 3, -1.0F, -11.0F, -4.0F, 2, 1, 1, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 10, 33, 3.5F, -7.0F, -4.0F, 1, 1, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 49, 3.0F, -9.0F, -4.0F, 1, 1, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 0, 40, -4.0F, -9.0F, -4.0F, 1, 1, 8, 0.0F, false));
			Head.cubeList.add(new ModelBox(Head, 8, 24, -4.5F, -7.0F, -4.0F, 1, 1, 8, 0.0F, false));
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
