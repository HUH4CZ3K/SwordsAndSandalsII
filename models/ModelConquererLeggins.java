// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelConquererLeggins extends ModelBase {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModelConquererLeggins() {
		textureWidth = 64;
		textureHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 16, -2.6F, 7.0F, -2.5F, 1, 3, 5, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 2, -1.6F, 7.0F, -2.5F, 3, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 23, 3, 1.4F, 7.0F, -2.5F, 1, 1, 5, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 0, -1.6F, 7.0F, 1.5F, 3, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 24, -2.85F, 6.0F, -2.0F, 1, 1, 4, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 12, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 29, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.26F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 29, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.26F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 8, -1.4F, 7.0F, 1.5F, 3, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 10, -1.4F, 7.0F, -2.5F, 3, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 23, 23, -2.4F, 7.0F, -2.5F, 1, 1, 5, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 9, 1.85F, 6.0F, -2.0F, 1, 1, 4, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 16, 0, 1.6F, 7.0F, -2.5F, 1, 3, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		RightLeg.render(f5);
		LeftLeg.render(f5);
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