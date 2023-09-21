// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelBrigandChestplate extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelBrigandChestplate() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.29F, false));
		Body.cubeList.add(new ModelBox(Body, 20, 0, -1.0F, 10.55F, -2.5F, 2, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, 12.0F, -2.5F, 1, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 24, 24, -4.0F, 11.5F, -2.35F, 8, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 6, -3.0F, -2.0F, -2.0F, 4, 2, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 0, -3.0F, 5.0F, -2.0F, 4, 2, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 62, -3.0F, 9.0F, -2.0F, 4, 0, 0, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 32, -3.0F, 2.0F, -2.0F, 4, 2, 1, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -3.0F, 2.0F, 1.0F, 4, 2, 1, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 52, 58, 0.0F, 0.5F, -2.0F, 0, 1, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 57, 60, -1.5F, 7.5F, -2.0F, 0, 1, 0, 0.3F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 51, 58, 0.0F, 0.5F, -2.0F, 0, 1, 4, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 29, -1.0F, 2.0F, -2.0F, 4, 2, 1, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 58, 59, 1.5F, 7.5F, -2.0F, 0, 1, 0, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 62, -1.0F, 9.0F, -2.0F, 4, 0, 0, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 18, -1.0F, -2.0F, -2.0F, 4, 2, 4, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 26, -1.0F, 2.0F, 1.0F, 4, 2, 1, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 12, -1.0F, 5.0F, -2.0F, 4, 2, 4, 0.3F, false));
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