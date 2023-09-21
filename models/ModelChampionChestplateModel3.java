// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelChampionChestplateModel3 extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer pioropuszlewy;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer pioropuszprawy;

	public ModelChampionChestplateModel3() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.4F, false));
		Body.cubeList.add(new ModelBox(Body, 31, 52, -4.0F, 12.0F, -2.0F, 8, 3, 4, 0.39F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 16, 0.25F, 1.5F, -2.75F, 3, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 23, 1.5F, 0.5F, -2.75F, 2, 1, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 50, 0, 3.75F, -1.0F, -1.5F, 3, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 50, -3.25F, 1.5F, -2.75F, 3, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 12, 3.75F, -1.0F, 1.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 32, -4.75F, -1.0F, -2.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 36, 0, -6.75F, -1.0F, -1.5F, 3, 1, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 8, -4.75F, -1.0F, 1.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 19, 3.75F, -1.0F, -2.5F, 1, 3, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 7, 54, -3.5F, 0.5F, -2.75F, 2, 1, 1, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 24, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 25, 54, 3.25F, 2.75F, -0.5F, 1, 2, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 20, 16, 2.75F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 53, -0.25F, -1.0F, -2.5F, 3, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 14, 53, -0.25F, -1.0F, 1.5F, 3, 1, 1, 0.0F, false));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 55, 4.25F, 2.0F, -0.5F, 1, 2, 1, 0.0F, false));

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, 1.5708F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 40, 25, -14.5F, -7.0F, -2.5F, 1, 2, 1, 0.0F, false));

		pioropuszlewy = new ModelRenderer(this);
		pioropuszlewy.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftArm.addChild(pioropuszlewy);
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 4, 55, 1.75F, -7.5F, -0.5F, 1, 2, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 44, 8, 3.75F, -7.5F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 40, 6, -0.25F, -4.0F, -0.5F, 2, 1, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 22, 52, 0.25F, -5.0F, -0.5F, 3, 1, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 7, 52, 0.75F, -6.0F, -0.5F, 3, 1, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 12, 55, 1.75F, -4.0F, -0.5F, 1, 2, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 0, 58, 2.75F, -7.0F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 27, 57, 3.75F, -6.0F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 0, 16, 0.75F, -8.5F, -0.5F, 1, 3, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 23, 57, 3.25F, -4.5F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszlewy.cubeList.add(new ModelBox(pioropuszlewy, 44, 13, 2.25F, -8.5F, -0.5F, 1, 1, 1, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 4, -2.75F, -1.0F, -2.5F, 3, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 20, 0, -3.75F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 8, 56, -5.25F, 2.0F, -0.5F, 1, 2, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 39, 31, -2.75F, -1.0F, 1.5F, 3, 1, 1, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 59, 0, -4.25F, 2.75F, -0.5F, 1, 2, 1, 0.0F, false));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(5.0F, 22.0F, 0.0F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, -1.5708F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 40, 28, 13.5F, -7.0F, -2.5F, 1, 2, 1, 0.0F, false));

		pioropuszprawy = new ModelRenderer(this);
		pioropuszprawy.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightArm.addChild(pioropuszprawy);
		setRotationAngle(pioropuszprawy, 0.0F, 3.1416F, 0.0F);
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 0, 55, 1.75F, -7.5F, -0.5F, 1, 2, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 19, 57, 3.75F, -7.5F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 21, 32, -0.25F, -4.0F, -0.5F, 2, 1, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 7, 52, 0.25F, -5.0F, -0.5F, 3, 1, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 15, 51, 0.75F, -6.0F, -0.5F, 3, 1, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 21, 54, 1.75F, -4.0F, -0.5F, 1, 2, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 27, 2.75F, -7.0F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 18, 3.75F, -6.0F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 0, 0, 0.75F, -8.5F, -0.5F, 1, 3, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 15, 3.25F, -4.5F, -0.5F, 1, 1, 1, 0.0F, false));
		pioropuszprawy.cubeList.add(new ModelBox(pioropuszprawy, 43, 11, 2.25F, -8.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
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