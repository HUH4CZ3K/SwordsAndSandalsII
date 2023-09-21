
package net.mcreator.swordsandsandals.potion;

import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.EntityLivingBase;

import net.mcreator.swordsandsandals.procedure.ProcedureRejuvinatePotionPotionStartedapplied;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class PotionRejuvinatePotion extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:rejuvinate_potion")
	public static final Potion potion = null;
	public PotionRejuvinatePotion(ElementsSwordsandsandalsMod instance) {
		super(instance, 533);
	}

	@Override
	public void initElements() {
		elements.potions.add(() -> new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		private final ResourceLocation potionIcon;
		public PotionCustom() {
			super(false, -11776);
			setBeneficial();
			setRegistryName("rejuvinate_potion");
			setPotionName("effect.rejuvinate_potion");
			potionIcon = new ResourceLocation("swordsandsandals:textures/mob_effect/rejuvinate_potion.png");
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(PotionEffect effect) {
			return false;
		}

		@Override
		public boolean shouldRenderHUD(PotionEffect effect) {
			return false;
		}

		@Override
		public void applyAttributesModifiersToEntity(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureRejuvinatePotionPotionStartedapplied.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
