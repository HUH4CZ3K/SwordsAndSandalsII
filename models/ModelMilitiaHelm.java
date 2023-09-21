// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelMilitiaHelm extends ModelBase {
	private final ModelRenderer Head;

	public ModelMilitiaHelm() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 35, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -0.5F, -8.5F, -5.0F, 1, 6, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 0, -0.5F, -8.5F, 4.0F, 1, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 26, 26, -0.5F, -9.0F, -4.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 22, 26, -0.5F, -9.0F, 3.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 26, -0.5F, -9.5F, -4.0F, 1, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 0, -5.0F, -8.5F, -1.0F, 2, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 19, 3.0F, -8.5F, -1.0F, 2, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 22, -5.5F, -9.0F, -1.0F, 2, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, 3.5F, -9.0F, -1.0F, 2, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 18, 26, -5.5F, -9.25F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 3, 4.5F, -9.25F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 10, 26, -6.0F, -9.5F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 5, 18, 5.0F, -9.5F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 5, 21, -6.0F, -9.5F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 4, 5.255F, -10.0F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 4, 26, -6.25F, -10.0F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 26, -6.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 5, 5.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 45, -3.4F, -8.75F, -3.5F, 7, 1, 7, 0.0F, false));
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