// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelHopliteHelm extends ModelBase {
	private final ModelRenderer Head;

	public ModelHopliteHelm() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 33, -3.5F, -9.0F, -3.5F, 7, 1, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 4, -1.0F, -8.5F, -4.5F, 2, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -1.0F, -8.5F, 3.5F, 2, 3, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 22, -1.0F, -9.5F, -3.5F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -1.0F, -9.5F, 2.5F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 14, 26, -1.0F, -10.0F, -3.0F, 2, 1, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 20, -1.0F, -9.0F, -4.25F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 18, -1.0F, -9.0F, 3.225F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 26, -2.5F, -9.75F, -2.5F, 5, 1, 5, 0.0F, false));
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