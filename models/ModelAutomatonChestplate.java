// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelAutomatonChestplate extends ModelBase {
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Body;

	public ModelAutomatonChestplate() {
		textureWidth = 64;
		textureHeight = 64;

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 39, -1.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 38, 38, 3.0F, -2.0F, -3.0F, 1, 2, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 36, 0, -1.0F, -1.5F, 2.0F, 4, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 28, 16, -1.0F, -1.5F, -3.0F, 4, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 32, -1.0F, -2.5F, -3.0F, 4, 1, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.35F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 32, 23, -3.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 28, 28, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 6, -3.0F, -1.5F, -3.0F, 4, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 3, -3.0F, -1.5F, 2.0F, 4, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 32, 16, -3.0F, -2.5F, -3.0F, 4, 1, 6, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 14, 33, -4.0F, -2.0F, -3.0F, 1, 2, 6, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 48, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.35F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 12, -4.25F, 0.0F, -2.5F, 3, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 14, 1.25F, 0.0F, -2.5F, 3, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 9, -2.0F, 3.0F, -3.0F, 4, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 30, -3.75F, 4.0F, -2.5F, 3, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 28, 0.75F, 4.0F, -2.5F, 3, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 12, 41, 0.5F, 5.0F, -2.5F, 3, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 12, 16, 1.0F, 1.0F, -2.5F, 3, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 41, -3.5F, 5.0F, -2.5F, 3, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 0, -4.0F, 1.0F, -2.5F, 3, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 44, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftArm.render(f5);
		RightArm.render(f5);
		Body.render(f5);
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