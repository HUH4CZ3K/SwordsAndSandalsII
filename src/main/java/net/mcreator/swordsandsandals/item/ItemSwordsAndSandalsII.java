
package net.mcreator.swordsandsandals.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.swordsandsandals.creativetab.TabSwordsAndSandalsItems;
import net.mcreator.swordsandsandals.ElementsSwordsandsandalsMod;

@ElementsSwordsandsandalsMod.ModElement.Tag
public class ItemSwordsAndSandalsII extends ElementsSwordsandsandalsMod.ModElement {
	@GameRegistry.ObjectHolder("swordsandsandals:swords_and_sandals_ii")
	public static final Item block = null;
	public ItemSwordsAndSandalsII(ElementsSwordsandsandalsMod instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("swordsandsandals:swords_and_sandals_ii", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("swords_and_sandals_ii", ElementsSwordsandsandalsMod.sounds.get(new ResourceLocation("swordsandsandals:soundtrack1")));
			setUnlocalizedName("swords_and_sandals_ii");
			setRegistryName("swords_and_sandals_ii");
			setCreativeTab(TabSwordsAndSandalsItems.tab);
		}
	}
}
