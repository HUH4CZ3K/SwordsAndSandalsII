
package net.mcreator.swordsandsandals.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.swordsandsandals.procedure.ProcedureMoltenRockPlayerCollidesWithThisEntity;
import net.mcreator.swordsandsandals.procedure.ProcedureMoltenRockEntityDies2;
import net.mcreator.swordsandsandals.procedure.ProcedureMoltenRockEntityDies;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Random;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class EntityMoltenRock extends ElementsSwordsandsandalsMod.ModElement {
	public static final int ENTITYID = 16;
	public static final int ENTITYID_RANGED = 17;
	public EntityMoltenRock(ElementsSwordsandsandalsMod instance) {
		super(instance, 247);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("swordsandsandals", "molten_rock"), ENTITYID).name("molten_rock").tracker(64, 3, true).build());
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new ModelMoltenRock(), 0f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("swordsandsandals:textures/moltenrocktexture.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(1f, 1f);
			experienceValue = 0;
			this.isImmuneToFire = true;
			setNoAI(!true);
			enablePersistence();
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected boolean canDespawn() {
			return false;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public void fall(float l, float d) {
			super.fall(l, d);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureMoltenRockEntityDies.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof EntityArrow)
				return false;
			if (source.getImmediateSource() instanceof EntityPotion)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.LIGHTNING_BOLT)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void onDeath(DamageSource source) {
			super.onDeath(source);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureMoltenRockEntityDies2.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onCollideWithPlayer(EntityPlayer entity) {
			super.onCollideWithPlayer(entity);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				ProcedureMoltenRockPlayerCollidesWithThisEntity.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(100D);
		}

		public void onLivingUpdate() {
			super.onLivingUpdate();
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Random random = this.rand;
			if (true)
				for (int l = 0; l < 4; ++l) {
					double d0 = (i + random.nextFloat());
					double d1 = (j + random.nextFloat());
					double d2 = (k + random.nextFloat());
					int i1 = random.nextInt(2) * 2 - 1;
					double d3 = (random.nextFloat() - 0.5D) * 0.5D;
					double d4 = (random.nextFloat() - 0.5D) * 0.5D;
					double d5 = (random.nextFloat() - 0.5D) * 0.5D;
					world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, d0, d1, d2, d3, d4, d5);
				}
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelMoltenRock extends ModelBase {
		private final ModelRenderer bb_main;
		public ModelMoltenRock() {
			textureWidth = 128;
			textureHeight = 128;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 30, 44, -6.0F, -2.0F, -7.0F, 7, 2, 14, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 43, -6.0F, -3.0F, -7.0F, 8, 1, 14, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 34, 29, -6.0F, -4.0F, -7.0F, 9, 1, 14, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 15, -6.0F, -5.0F, -7.0F, 10, 1, 14, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 58, -7.0F, -9.0F, -6.0F, 1, 8, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 34, 15, -6.0F, -6.0F, -6.0F, 11, 1, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, -6.0F, -7.0F, -6.0F, 12, 1, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -10.0F, -6.0F, 13, 3, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 72, 50, -6.0F, -8.0F, -7.0F, 10, 3, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 68, 22, -6.0F, -8.0F, 6.0F, 10, 3, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 58, 44, 1.0F, -2.0F, -6.0F, 1, 2, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 68, 0, 2.0F, -3.0F, -6.0F, 1, 1, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 66, 58, 3.0F, -4.0F, -6.0F, 1, 1, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 66, 28, 4.0F, -5.0F, -6.0F, 1, 1, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 52, 60, 5.0F, -6.0F, -6.0F, 1, 1, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 38, 0, -5.0F, -12.0F, -5.0F, 11, 2, 10, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 26, 60, 6.0F, -7.0F, -6.0F, 1, 1, 12, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 46, 76, -5.0F, -10.0F, -7.0F, 10, 2, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 46, 73, -5.0F, -10.0F, 6.0F, 10, 2, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 40, 60, 6.0F, -11.0F, -5.0F, 1, 1, 10, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 14, 58, -6.0F, -11.0F, -5.0F, 1, 1, 10, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 72, 54, -4.0F, -11.0F, -6.0F, 9, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 50, 13, -4.0F, -11.0F, 5.0F, 9, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 36, 73, 4.0F, -4.0F, -4.0F, 1, 1, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 18, 73, 5.0F, -5.0F, -4.0F, 1, 1, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 72, 41, 6.0F, -6.0F, -4.0F, 1, 1, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 70, 71, 3.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 68, 13, 2.0F, -2.0F, -4.0F, 1, 1, 8, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			bb_main.render(f5);
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
