
package net.mcreator.swordsandsandals.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.BossInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.model.ModelBiped;

import net.mcreator.swordsandsandals.procedure.ProcedureEmperorAntaresOnEntityTickUpdate;
import net.mcreator.swordsandsandals.procedure.ProcedureEmperorAntaresEntityDies;
import net.mcreator.swordsandsandals.item.ItemEmperorsArmor;
import net.mcreator.swordsandsandals.item.ItemBladeOfTheEmpire;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class EntityEmperorAntares extends ElementsSwordsandsandalsMod.ModElement {
	public static final int ENTITYID = 7;
	public static final int ENTITYID_RANGED = 8;
	public EntityEmperorAntares(ElementsSwordsandsandalsMod instance) {
		super(instance, 439);
	}

	@Override
	public void initElements() {
		elements.entities.add(
				() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("swordsandsandals", "emperor_antares"), ENTITYID)
						.name("emperor_antares").tracker(64, 3, true).egg(-4325121, -65536).build());
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
			RenderBiped customRender = new RenderBiped(renderManager, new ModelBiped(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("swordsandsandals:textures/antarestexturegoly.png");
				}
			};
			customRender.addLayer(new net.minecraft.client.renderer.entity.layers.LayerBipedArmor(customRender) {
				protected void initArmor() {
					this.modelLeggings = new ModelBiped(0.5f);
					this.modelArmor = new ModelBiped(1);
				}
			});
			return customRender;
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 10000;
			this.isImmuneToFire = false;
			setNoAI(!true);
			enablePersistence();
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(ItemBladeOfTheEmpire.block, (int) (1)));
			this.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(ItemEmperorsArmor.helmet, (int) (1)));
			this.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(ItemEmperorsArmor.body, (int) (1)));
			this.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(ItemEmperorsArmor.legs, (int) (1)));
			this.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(ItemEmperorsArmor.boots, (int) (1)));
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false, false));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBhaargleYarg.EntityCustom.class, false, false));
			this.tasks.addTask(3, new EntityAIAttackMelee(this, 1.2, true));
			this.targetTasks.addTask(4, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(5, new EntityAIWander(this, 1));
			this.tasks.addTask(6, new EntityAILookIdle(this));
			this.tasks.addTask(7, new EntityAISwimming(this));
			this.tasks.addTask(8, new EntityAIOpenDoor(this, true));
			this.tasks.addTask(9, new EntityAIOpenDoor(this, false));
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
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("swordsandsandals:antareshurtvoice"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("swordsandsandals:antaresdeath"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
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
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureEmperorAntaresEntityDies.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onEntityUpdate() {
			super.onEntityUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureEmperorAntaresOnEntityTickUpdate.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0D);
		}

		@Override
		public boolean isNonBoss() {
			return false;
		}
		private final BossInfoServer bossInfo = new BossInfoServer(this.getDisplayName(), BossInfo.Color.PURPLE, BossInfo.Overlay.PROGRESS);
		@Override
		public void addTrackingPlayer(EntityPlayerMP player) {
			super.addTrackingPlayer(player);
			this.bossInfo.addPlayer(player);
		}

		@Override
		public void removeTrackingPlayer(EntityPlayerMP player) {
			super.removeTrackingPlayer(player);
			this.bossInfo.removePlayer(player);
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		}
	}
}
