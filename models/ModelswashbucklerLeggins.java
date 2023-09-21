// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelswashbucklerLeggins extends ModelBase {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModelswashbucklerLeggins() {
		textureWidth = 64;
		textureHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 30, 0, -2.0F, 0.0F, -2.0F, 4, 2, 4, 0.3F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 10, 0, -2.4F, 2.3F, -2.3F, 1, 3, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 61, -0.725F, 5.5F, -2.5F, 2, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 61, -1.225F, 5.5F, -2.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 58, 61, -1.225F, 5.0F, -2.5F, 1, 1, 2, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 56, 61, -0.725F, 5.0F, -2.5F, 2, 1, 2, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 48, 0, -2.0F, 0.0F, -2.0F, 4, 2, 4, 0.3F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 9, 0, 1.4F, 2.3F, -2.3F, 1, 3, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 58, 61, 0.225F, 5.0F, -2.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 58, 61, 0.225F, 5.5F, -2.5F, 1, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 56, 61, -1.275F, 5.5F, -2.5F, 2, 1, 2, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 56, 61, -1.275F, 5.0F, -2.5F, 2, 1, 2, 0.0F, false));
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