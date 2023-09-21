// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelConquererChestplate extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelConquererChestplate() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
		Body.cubeList.add(new ModelBox(Body, 13, 38, -4.25F, 2.0F, -3.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 26, -4.25F, 2.0F, 2.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 32, 20, 3.25F, 2.0F, 2.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 26, 0, 3.25F, 2.0F, -3.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 33, -3.75F, 4.0F, -3.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 0, -2.5F, 7.0F, -2.5F, 5, 5, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 30, 33, -3.75F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 33, 2.75F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 10, 2.75F, 4.0F, -3.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 37, 14, -4.75F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 34, 29, -4.75F, 0.0F, 2.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 17, 32, 3.75F, 0.0F, 2.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 8, 32, 3.75F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 7, -5.75F, -1.0F, -3.0F, 2, 1, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 0, 3.75F, -1.0F, -3.0F, 2, 1, 6, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -1.0F, -3.5F, -3.0F, 1, 1, 6, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 8, 32, -3.0F, -3.0F, -2.5F, 2, 1, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 29, 33, -4.0F, -2.5F, -2.5F, 1, 2, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 33, -5.0F, -2.75F, -2.0F, 1, 1, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 17, 35, -5.0F, -1.75F, 1.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 8, 35, -5.0F, -1.75F, -2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -1.0F, -2.5F, -3.0F, 1, 3, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 7, -3.0F, -2.0F, -3.0F, 2, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 3, -3.0F, -2.0F, 2.0F, 2, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 28, 14, -1.0F, -2.5F, 2.0F, 1, 3, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 41, -3.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 26, 0.0F, -3.5F, -3.0F, 1, 1, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 41, -1.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 0, 1.0F, -2.0F, -3.0F, 2, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 12, 16, 1.0F, -2.0F, 2.0F, 2, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 14, 1.0F, -3.0F, -2.5F, 2, 1, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 17, 33, 3.0F, -2.5F, -2.5F, 1, 2, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 45, 19, 4.0F, -2.75F, -2.0F, 1, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 46, 35, 4.0F, -1.75F, -2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 46, 38, 4.0F, -1.75F, 1.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, 0.0F, -2.5F, -3.0F, 1, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.0F, -2.5F, 2.0F, 1, 3, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
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