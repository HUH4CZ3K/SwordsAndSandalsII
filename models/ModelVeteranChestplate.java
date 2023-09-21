// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelVeteranChestplate extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelVeteranChestplate() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
		Body.cubeList.add(new ModelBox(Body, 12, 18, -1.0F, 11.3F, -2.5F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 12, 16, -1.0F, 10.8F, -2.5F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 9.0F, -2.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 7.25F, -2.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 14, 39, -2.75F, -0.5F, -2.5F, 2, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 39, 0.75F, -0.5F, -2.5F, 2, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 5.5F, -2.5F, 1, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 33, -3.5F, 5.3F, -2.5F, 5, 1, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -4.0F, 4.3F, -3.0F, 6, 1, 6, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 9, 39, -3.75F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 32, 16, -1.5F, 5.3F, -2.5F, 5, 1, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 26, 26, -2.0F, 4.3F, -3.0F, 6, 1, 6, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 18, 32, 2.75F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));
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