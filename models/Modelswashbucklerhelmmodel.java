// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelswashbucklerhelmmodel extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer bb_main;

	public Modelswashbucklerhelmmodel() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.15F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 8, -4.0F, -9.3F, -4.0F, 8, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F, false));
		Head.cubeList.add(new ModelBox(Head, 24, 0, -3.5F, -10.0F, -3.5F, 7, 1, 7, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 33, 17, -4.3F, -23.7F, 0.3F, 1, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 27, 27, -4.3F, -23.7F, -4.3F, 2, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 17, 2.3F, -23.7F, -4.3F, 2, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 32, 3.3F, -23.7F, 0.3F, 1, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 32, -3.7F, -23.7F, 3.3F, 7, 1, 1, 0.0F, false));
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