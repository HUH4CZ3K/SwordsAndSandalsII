// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelCrusaderChestplate extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ModelCrusaderChestplate() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.4F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 16, -4.0F, 0.0F, -2.39F, 8, 6, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 32, -3.5F, 11.9F, -2.4F, 7, 3, 1, 0.0F, false));

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 23, -3.0F, -3.0F, -2.5F, 4, 1, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 48, -3.5F, -3.0F, -2.5F, 1, 1, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 12, 48, -4.5F, -1.0F, -2.5F, 1, 1, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 31, 51, -3.5F, -0.5F, -3.0F, 4, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 19, 51, -3.0F, -1.0F, -3.5F, 4, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 7, 51, -3.0F, -1.0F, 2.5F, 4, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 2, -4.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -4.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 51, 29, -3.5F, -0.5F, 2.0F, 4, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 19, 48, -3.0F, -2.0F, -3.0F, 4, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 7, 48, -3.0F, -2.0F, 2.0F, 4, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 44, 29, -4.0F, -2.0F, -2.5F, 1, 2, 5, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 16, 55, -3.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 32, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 43, 43, -1.0F, -3.0F, -2.5F, 4, 1, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 43, 49, -1.0F, -2.0F, -3.0F, 4, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 52, -1.0F, -1.0F, -3.5F, 4, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 0, -0.5F, -0.5F, -3.0F, 4, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 51, 31, -0.5F, -0.5F, 2.0F, 4, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 52, 2, -1.0F, -1.0F, 2.5F, 4, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 31, 48, -1.0F, -2.0F, 2.0F, 4, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 48, 3.0F, -2.0F, -2.5F, 1, 2, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 36, 48, 3.5F, -1.0F, -2.5F, 1, 1, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 48, 36, 2.5F, -3.0F, -2.5F, 1, 1, 5, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 18, 3.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, 3.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 55, -1.0F, 10.0F, -2.0F, 4, 1, 4, 0.0F, false));
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