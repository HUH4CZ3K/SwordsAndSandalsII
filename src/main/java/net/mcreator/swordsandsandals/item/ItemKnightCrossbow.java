
package net.mcreator.swordsandsandals.item;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.init.Items;
import net.minecraft.init.Enchantments;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.swordsandsandals.procedure.ProcedureKnightCrossbowRangedItemUsed;
import net.mcreator.swordsandsandals.procedure.ProcedureKnightCrossbowBulletHitsBlock;
import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsWeapons;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemKnightCrossbow extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:knight_crossbow")
	public static final Item block = null;
	public static final int ENTITYID = 19;
	public ItemKnightCrossbow(ElementsSwordsandsandalsMod instance) {
		super(instance, 459);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new RangedItem());
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityArrowCustom.class)
				.id(new ResourceLocation("swordsandsandals", "entitybulletknight_crossbow"), ENTITYID).name("entitybulletknight_crossbow")
				.tracker(64, 1, true).build());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("swordsandsandals:knight_crossbow", "inventory"));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> {
			return new RenderCustom(renderManager);
		});
	}
	public static class RangedItem extends Item {
		public RangedItem() {
			super();
			setMaxDamage(2256);
			setFull3D();
			setUnlocalizedName("knight_crossbow");
			setRegistryName("knight_crossbow");
			maxStackSize = 1;
			setCreativeTab(TabSwordsAndSandalsWeapons.tab);
		}

		@Override
		public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
			if (!world.isRemote && entityLivingBase instanceof EntityPlayerMP) {
				EntityPlayerMP entity = (EntityPlayerMP) entityLivingBase;
				int slotID = -1;
				for (int i = 0; i < entity.inventory.mainInventory.size(); i++) {
					ItemStack stack = entity.inventory.mainInventory.get(i);
					if (stack != null && stack.getItem() == new ItemStack(Items.ARROW, (int) (1)).getItem()
							&& stack.getMetadata() == new ItemStack(Items.ARROW, (int) (1)).getMetadata()) {
						slotID = i;
						break;
					}
				}
				if (entity.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, itemstack) > 0
						|| slotID != -1) {
					float power = 2f;
					EntityArrowCustom entityarrow = new EntityArrowCustom(world, entity);
					entityarrow.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, power * 2, 0);
					entityarrow.setSilent(true);
					entityarrow.setIsCritical(true);
					entityarrow.setDamage(9);
					entityarrow.setKnockbackStrength(1);
					itemstack.damageItem(1, entity);
					int x = (int) entity.posX;
					int y = (int) entity.posY;
					int z = (int) entity.posZ;
					world.playSound((EntityPlayer) null, (double) x, (double) y, (double) z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
									.getObject(new ResourceLocation(("swordsandsandals:strzalzkuszy"))),
							SoundCategory.NEUTRAL, 1, 1f / (itemRand.nextFloat() * 0.5f + 1f) + (power / 2));
					if (entity.capabilities.isCreativeMode) {
						entityarrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
					} else {
						if (new ItemStack(Items.ARROW, (int) (1)).isItemStackDamageable()) {
							ItemStack stack = entity.inventory.getStackInSlot(slotID);
							if (stack.attemptDamageItem(1, itemRand, entity)) {
								stack.shrink(1);
								stack.setItemDamage(0);
							}
						} else {
							entity.inventory.clearMatchingItems(new ItemStack(Items.ARROW, (int) (1)).getItem(), -1, 1, null);
						}
					}
					if (!world.isRemote)
						world.spawnEntity(entityarrow);
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("entity", entity);
						$_dependencies.put("itemstack", itemstack);
						ProcedureKnightCrossbowRangedItemUsed.executeProcedure($_dependencies);
					}
				}
			}
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
			entity.setActiveHand(hand);
			return new ActionResult(EnumActionResult.SUCCESS, entity.getHeldItem(hand));
		}

		@Override
		public EnumAction getItemUseAction(ItemStack itemstack) {
			return EnumAction.BOW;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 72000;
		}
	}

	public static class EntityArrowCustom extends EntityTippedArrow {
		public EntityArrowCustom(World a) {
			super(a);
		}

		public EntityArrowCustom(World worldIn, double x, double y, double z) {
			super(worldIn, x, y, z);
		}

		public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
			super(worldIn, shooter);
		}

		@Override
		protected void arrowHit(EntityLivingBase entity) {
			super.arrowHit(entity);
			entity.setArrowCountInEntity(entity.getArrowCountInEntity() - 1);
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			World world = this.world;
			Entity entity = (Entity) shootingEntity;
			if (this.inGround) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureKnightCrossbowBulletHitsBlock.executeProcedure($_dependencies);
				}
				this.world.removeEntity(this);
			}
		}
	}

	public static class RenderCustom extends Render {
		private static final ResourceLocation texture = new ResourceLocation("swordsandsandals:textures/arrow3dtexture.png");
		public RenderCustom(RenderManager renderManager) {
			super(renderManager);
			shadowSize = 0.1f;
		}

		@Override
		public void doRender(Entity bullet, double d, double d1, double d2, float f, float f1) {
			bindEntityTexture(bullet);
			GL11.glPushMatrix();
			GL11.glTranslatef((float) d, (float) d1, (float) d2);
			GL11.glRotatef(f, 0, 90, 0);
			GL11.glRotatef(0f - bullet.prevRotationPitch - (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1, 0, 0);
			ModelBase model = new Modelarrowmodel();
			model.render(bullet, 0, 0, 0, 0, 0, 0.0625f);
			GL11.glPopMatrix();
		}

		@Override
		protected ResourceLocation getEntityTexture(Entity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelarrowmodel extends ModelBase {
		private final ModelRenderer group;
		public Modelarrowmodel() {
			textureWidth = 32;
			textureHeight = 32;
			group = new ModelRenderer(this);
			group.setRotationPoint(0.0F, 8.0F, 0.0F);
			group.cubeList.add(new ModelBox(group, 6, 4, 0.0F, -3.0F, -7.0F, 0, 3, 2, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 5, 0.0F, -4.0F, 5.0F, 0, 2, 3, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 8, 8, 0.0F, -2.0F, -8.0F, 0, 1, 1, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 3, -0.5F, -1.0F, 7.0F, 1, 2, 0, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 3, 0.5F, -1.5F, 5.0F, 2, 0, 3, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 2, -0.5F, -1.5F, -8.0F, 1, 0, 1, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 7, 3, -2.5F, -2.0F, 7.0F, 2, 1, 0, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 3, 0.0F, -1.0F, 5.0F, 0, 2, 3, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 5, 0, -1.5F, -1.5F, -7.0F, 3, 0, 2, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 0, -2.5F, -1.5F, 5.0F, 2, 0, 3, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 7, 2, 0.5F, -2.0F, 7.0F, 2, 1, 0, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 6, 8, 0.0F, -1.0F, 4.0F, 0, 1, 1, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 0, -0.5F, -2.0F, -5.0F, 1, 1, 13, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 0, -1.5F, -1.5F, 4.0F, 1, 0, 1, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 1, 0.5F, -1.5F, 4.0F, 1, 0, 1, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 0, 4, 0.0F, -3.0F, 4.0F, 0, 1, 1, 0.0F, false));
			group.cubeList.add(new ModelBox(group, 7, 4, -0.5F, -4.0F, 7.0F, 1, 2, 0, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			group.render(f5);
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
