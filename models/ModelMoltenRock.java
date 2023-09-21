// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelMoltenRock extends ModelBase {
	private final ModelRenderer bb_main;

	public ModelMoltenRock() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 30, 44, -6.0F, -2.0F, -7.0F, 7, 2, 14, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 43, -6.0F, -3.0F, -7.0F, 8, 1, 14, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 34, 29, -6.0F, -4.0F, -7.0F, 9, 1, 14, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 15, -6.0F, -5.0F, -7.0F, 10, 1, 14, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 58, -7.0F, -9.0F, -6.0F, 1, 8, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 34, 15, -6.0F, -6.0F, -6.0F, 11, 1, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, -6.0F, -7.0F, -6.0F, 12, 1, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -10.0F, -6.0F, 13, 3, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 72, 50, -6.0F, -8.0F, -7.0F, 10, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 68, 22, -6.0F, -8.0F, 6.0F, 10, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 58, 44, 1.0F, -2.0F, -6.0F, 1, 2, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 68, 0, 2.0F, -3.0F, -6.0F, 1, 1, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 66, 58, 3.0F, -4.0F, -6.0F, 1, 1, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 66, 28, 4.0F, -5.0F, -6.0F, 1, 1, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 52, 60, 5.0F, -6.0F, -6.0F, 1, 1, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 38, 0, -5.0F, -12.0F, -5.0F, 11, 2, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 26, 60, 6.0F, -7.0F, -6.0F, 1, 1, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 46, 76, -5.0F, -10.0F, -7.0F, 10, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 46, 73, -5.0F, -10.0F, 6.0F, 10, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 60, 6.0F, -11.0F, -5.0F, 1, 1, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 14, 58, -6.0F, -11.0F, -5.0F, 1, 1, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 72, 54, -4.0F, -11.0F, -6.0F, 9, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 50, 13, -4.0F, -11.0F, 5.0F, 9, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 36, 73, 4.0F, -4.0F, -4.0F, 1, 1, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 18, 73, 5.0F, -5.0F, -4.0F, 1, 1, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 72, 41, 6.0F, -6.0F, -4.0F, 1, 1, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 70, 71, 3.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 68, 13, 2.0F, -2.0F, -4.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
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