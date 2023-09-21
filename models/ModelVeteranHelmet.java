// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelVeteranHelmet extends ModelBase {
	private final ModelRenderer Head;

	public ModelVeteranHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 35, -3.5F, -9.0F, -3.5F, 7, 1, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 26, -2.5F, -9.75F, -2.5F, 5, 1, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 27, 22, -5.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 27, 19, 3.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 20, -5.25F, -9.5F, -1.0F, 2, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 6, 32, -5.4F, -9.0F, -1.0F, 1, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 39, 4.4F, -9.0F, -1.0F, 1, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, 3.25F, -9.5F, -1.0F, 2, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 27, 16, -5.5F, -10.0F, -1.0F, 2, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 26, 26, 3.5F, -10.0F, -1.0F, 2, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 15, 26, -5.5F, -11.0F, -0.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 26, 4.5F, -11.0F, -0.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 28, -4.75F, -10.75F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 13, 33, 3.75F, -10.75F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 25, 33, -5.0F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 47, 4.0F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 22, -5.5F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 49, 4.5F, -11.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 19, -5.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 10, 32, 4.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 16, -5.25F, -12.25F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 29, 4.25F, -12.25F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 17, 33, -4.9F, -12.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 29, 3.9F, -12.5F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 17, 33, 4.0F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 30, 31, -4.0F, -9.5F, -1.0F, 1, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 35, 3.0F, -9.5F, -1.0F, 1, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 26, -1.5F, -10.0F, -3.0F, 3, 1, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 45, -1.5F, -9.0F, -4.25F, 3, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 26, 29, -1.5F, -9.0F, 3.25F, 3, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 43, -1.5F, -9.5F, -3.5F, 3, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 32, -1.5F, -9.5F, 2.5F, 3, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 4, -1.5F, -8.5F, -4.5F, 3, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -1.5F, -8.5F, 3.5F, 3, 3, 1, 0.0F, false));
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