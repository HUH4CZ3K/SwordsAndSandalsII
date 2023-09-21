// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelPeasentHelmet extends ModelBase {
	private final ModelRenderer Head;

	public ModelPeasentHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 3.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -1.0F, 8, 8, 8, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 18, 32, -4.0F, -8.0F, -1.0F, 8, 8, 8, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -3.5F, -9.25F, -0.5F, 7, 1, 7, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 21, 16, -2.5F, -10.25F, 0.5F, 5, 1, 5, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 0, -1.5F, -10.75F, 1.5F, 3, 1, 3, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 24, -4.75F, -7.25F, 0.5F, 1, 2, 5, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 23, 22, 3.75F, -7.25F, 0.5F, 1, 2, 5, 0.25F, false));
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