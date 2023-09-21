// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelRetariusHelmet extends ModelBase {
	private final ModelRenderer Head;

	public ModelRetariusHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 48, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.35F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 3, -5.0F, -6.0F, -5.0F, 2, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 20, 18, -6.0F, -6.0F, -4.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 20, 16, 5.0F, -6.0F, -4.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 27, 6, -3.0F, -6.5F, -5.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 5, -2.0F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 3, 1.0F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 6, -1.0F, -7.5F, -5.0F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 51, -0.5F, -10.0F, -4.0F, 1, 2, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 23, 17, -0.5F, -12.0F, 2.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 51, -0.5F, -9.0F, 4.0F, 1, 5, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -0.5F, -7.0F, 5.0F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 24, -0.5F, -11.0F, -4.0F, 1, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 35, -0.5F, -13.0F, -4.0F, 1, 2, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 43, -0.5F, -14.0F, -4.0F, 1, 1, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 27, 4, 2.0F, -6.5F, -5.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 61, 3.5F, -5.5F, -3.0F, 3, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 54, -6.5F, -5.5F, -3.0F, 3, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 16, -6.5F, -4.5F, 1.0F, 3, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 8, 19, 3.5F, -4.5F, 1.0F, 3, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 61, -7.0F, -5.0F, -1.0F, 3, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 51, 4.0F, -5.0F, -1.0F, 3, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 48, -6.0F, -4.0F, 3.0F, 12, 1, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 33, -5.0F, -4.0F, 5.0F, 10, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, 3.0F, -6.0F, -5.0F, 2, 1, 2, 0.0F, false));
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