// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelCutpurseCheastplatemodelnowu extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelCutpurseCheastplatemodelnowu() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 12, 32, 1.5F, 10.5F, -3.0F, 2, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 16, -1.25F, 10.5F, -2.75F, 2, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 0, -3.5F, 11.24F, -2.35F, 7, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 60, 0, 2.0F, 9.5F, -3.0F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 10, 7, -1.0F, 2.0F, -1.0F, 2, 1, 2, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 16, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 32, 32, -3.5F, 2.0F, -2.5F, 5, 5, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 57, -3.5F, -1.0F, -2.5F, 5, 2, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -1.5F, 5.0F, -3.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -1.5F, 3.0F, -3.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -1.5F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -1.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 0.0F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 0.0F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -3.0F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 1.0F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, -0.5F, -2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 1.0F, -0.5F, -2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -3.0F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -1.5F, 5.0F, 2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -1.5F, 3.0F, 2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, 5.0F, -0.5F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, 3.0F, -0.5F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 1.0F, 3.0F, -0.5F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 1.0F, 5.0F, -0.5F, 1, 1, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 44, 46, -1.5F, 2.0F, -2.5F, 5, 5, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -2.0F, 3.0F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 3.0F, 5.0F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 2.0F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 3.0F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -2.0F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 3.0F, -0.5F, -2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -2.0F, -0.5F, -2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 3.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 2.0F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.5F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.5F, 3.0F, -3.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.5F, 3.0F, 2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 3.0F, 3.0F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.5F, 5.0F, -3.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -2.0F, 5.0F, -0.5F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 57, -1.5F, -1.0F, -2.5F, 5, 2, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, 0.5F, 5.0F, 2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));
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