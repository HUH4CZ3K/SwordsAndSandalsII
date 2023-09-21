// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelChampionArmor extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Helm;
	private final ModelRenderer piorogorne2;
	private final ModelRenderer piorogorne3;
	private final ModelRenderer piorogorne4;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightBoot;

	public ModelChampionArmor() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));

		Helm = new ModelRenderer(this);
		Helm.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.addChild(Helm);
		Helm.cubeList.add(new ModelBox(Helm, 32, 32, -3.0F, -33.0F, -3.0F, 6, 1, 6, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 32, 39, -2.0F, -33.5F, -3.0F, 4, 1, 6, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 28, 46, -0.5F, -34.0F, -2.0F, 1, 1, 4, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 44, 2, -3.0F, -33.0F, -3.5F, 6, 1, 1, 0.0F, false));
		Helm.cubeList.add(new ModelBox(Helm, 44, 0, -3.0F, -33.0F, 2.5F, 6, 1, 1, 0.0F, false));

		piorogorne2 = new ModelRenderer(this);
		piorogorne2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Helm.addChild(piorogorne2);
		setRotationAngle(piorogorne2, 0.0F, 3.1416F, 0.0F);

		piorogorne3 = new ModelRenderer(this);
		piorogorne3.setRotationPoint(2.0F, 0.0F, 0.0F);
		Helm.addChild(piorogorne3);
		setRotationAngle(piorogorne3, 0.0F, 3.1416F, 0.0F);
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 32, 43, -5.75F, -38.5F, -0.5F, 2, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 36, 16, -2.75F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 32, 32, -4.25F, -34.0F, -0.5F, 2, 4, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 0, 4, -7.25F, -36.0F, -0.5F, 3, 3, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 20, 18, -7.75F, -37.0F, -0.5F, 3, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 0, 48, -5.75F, -37.5F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 47, 47, -6.75F, -38.0F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 48, 4, -7.75F, -36.0F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 4, 48, -6.25F, -32.5F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 48, 6, -5.25F, -32.0F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 28, 32, -5.25F, -38.0F, -0.5F, 1, 2, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 40, 24, -4.25F, -36.0F, -0.5F, 1, 2, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 34, 46, -6.25F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
		piorogorne3.cubeList.add(new ModelBox(piorogorne3, 36, 18, 0.25F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));

		piorogorne4 = new ModelRenderer(this);
		piorogorne4.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Helm.addChild(piorogorne4);
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 12, 34, -5.75F, -38.5F, -0.5F, 2, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 12, 32, -2.75F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 24, 0, -4.25F, -34.0F, -0.5F, 2, 4, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 0, 0, -7.25F, -36.0F, -0.5F, 3, 3, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 20, 16, -7.75F, -37.0F, -0.5F, 3, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 44, 46, -5.75F, -37.5F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 46, 43, -6.75F, -38.0F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 30, 2, -6.25F, -33.0F, -0.5F, 2, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 46, 41, -7.75F, -36.0F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 40, 46, -6.25F, -32.5F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 46, 39, -5.25F, -32.0F, -0.5F, 1, 1, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 0, 32, -5.25F, -38.0F, -0.5F, 1, 2, 1, 0.0F, false));
		piorogorne4.cubeList.add(new ModelBox(piorogorne4, 0, 16, -4.25F, -36.0F, -0.5F, 1, 2, 1, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 24, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 16, 32, -2.0F, -1.0F, -2.0F, 4, 12, 4, 0.2F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 32, -2.0F, -1.0F, -2.0F, 4, 12, 4, 0.2F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 40, 16, 0.0F, -4.0F, -2.0F, 4, 4, 4, 0.25F, false));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(0.0F, 24.0F, 0.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 40, 16, -4.0F, -4.0F, -2.0F, 4, 4, 4, 0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Body.render(f5);
		RightLeg.render(f5);
		LeftLeg.render(f5);
		LeftBoot.render(f5);
		RightBoot.render(f5);
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