package net.mcreator.swordsandsandals.procedure;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;

@Mod.EventBusSubscriber
public class ProcedureColossusEffectPotionStartedapplied {

    private static final float SCALE_FACTOR = 1.5f;
    private static final Potion COLUSSUS_EFFECT = Potion.getPotionFromResourceLocation("swordsandsandals:colossus_effect");

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;
        World world = player.world;

        if (!world.isRemote && event.phase == TickEvent.Phase.START) {
            AxisAlignedBB boundingBox = player.getEntityBoundingBox();
            double width = boundingBox.maxX - boundingBox.minX;
            double height = boundingBox.maxY - boundingBox.minY;

            double newWidth = width * SCALE_FACTOR;
            double newHeight = height * SCALE_FACTOR;

            double widthDiff = (newWidth - width) / 2;
            double heightDiff = newHeight - height;

            boundingBox = new AxisAlignedBB(
                    boundingBox.minX - widthDiff,
                    boundingBox.minY,
                    boundingBox.minZ - widthDiff,
                    boundingBox.maxX + widthDiff,
                    boundingBox.minY + newHeight,
                    boundingBox.maxZ + widthDiff
            );

            player.setEntityBoundingBox(boundingBox);
        }
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        // Ta metoda mo¿e pozostaæ pusta, poniewa¿ logika zosta³a przeniesiona do eventu.
    }

    public static class RenderPlayerColossus extends RenderPlayer {
        public RenderPlayerColossus(RenderManager renderManager, boolean useSmallArms) {
            super(renderManager, useSmallArms);
        }

        @Override
        public void doRender(AbstractClientPlayer entity, double x, double y, double z, float entityYaw, float partialTicks) {
            // SprawdŸ, czy postaæ ma aktywny efekt
            if (entity.isPotionActive(COLUSSUS_EFFECT)) {
                // Zastosuj skalowanie
                net.minecraft.client.renderer.GlStateManager.pushMatrix();
                net.minecraft.client.renderer.GlStateManager.scale(SCALE_FACTOR, SCALE_FACTOR, SCALE_FACTOR);

                // Renderuj postaæ
                super.doRender(entity, x, y, z, entityYaw, partialTicks);

                // Przywróæ poprzedni¹ transformacjê
                net.minecraft.client.renderer.GlStateManager.popMatrix();
            } else {
                // Jeœli efekt nie jest aktywny, renderuj postaæ normalnie
                super.doRender(entity, x, y, z, entityYaw, partialTicks);
            }
        }
    }
}


