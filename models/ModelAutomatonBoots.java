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