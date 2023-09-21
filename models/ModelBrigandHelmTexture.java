// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelBrigandHelmTexture extends ModelBase {
	private final ModelRenderer Head;

	public ModelBrigandHelmTexture() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -0.5F, -9.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 0, -3.4F, -8.75F, -3.5F, 7, 1, 7, 0.0F, false));
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