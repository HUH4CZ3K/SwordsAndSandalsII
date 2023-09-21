// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelConquererHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelConquererHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 24, 0, -3.5F, -9.0F, -3.5F, 7, 1, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 32, -3.0F, -10.0F, -3.0F, 6, 2, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 10, -1.0F, -9.0F, -4.25F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 32, -1.0F, -10.0F, -4.0F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 4, -1.0F, -10.0F, 3.0F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 8, -1.0F, -9.0F, 3.25F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 6, -1.0F, -11.0F, -0.5F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 14, -1.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -1.5F, -18.0F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -1.75F, -17.0F, -0.5F, 1, 5, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 12, 0.5F, -12.0F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 18, 0.5F, -18.0F, -0.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 0, 0.75F, -17.0F, -0.5F, 1, 5, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 16, -1.0F, -10.0F, -4.0F, 2, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 18, -1.0F, -10.0F, -4.0F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 0, -1.0F, -9.0F, 3.25F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 2, -1.0F, -9.0F, -4.25F, 2, 1, 1, 0.0F, false));
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