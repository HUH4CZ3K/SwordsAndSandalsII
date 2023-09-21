// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer Head;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 42, -4.0F, -7.0F, -4.5F, 8, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 39, -1.0F, -9.5F, -4.5F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 33, -1.25F, -9.0F, -4.5F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -0.75F, -9.0F, -4.5F, 2, 2, 1, 0.01F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 5, -0.5F, -10.0F, -4.5F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 30, -4.0F, -7.0F, 3.5F, 8, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 28, -4.0F, -9.0F, 3.0F, 8, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 26, -4.0F, -9.0F, -4.0F, 8, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 0, -2.5F, -10.0F, -4.0F, 5, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 3, -1.0F, -11.0F, -4.0F, 2, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 42, 17, 3.5F, -7.0F, -4.0F, 1, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 33, 3.0F, -9.0F, -4.0F, 1, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 24, -4.0F, -9.0F, -4.0F, 1, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 40, 8, -4.5F, -7.0F, -4.0F, 1, 1, 8, 0.0F, false));
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