// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelswashbucklerbootpoprawione extends ModelBase {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelswashbucklerbootpoprawione() {
		textureWidth = 32;
		textureHeight = 32;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 12, 0, -2.1F, 8.4F, -1.0F, 4, 1, 3, 0.3F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 11, 12, -2.1F, 10.3F, -2.75F, 4, 2, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 6, -2.1F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 16, 4, -1.6F, 10.725F, -3.5F, 3, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 16, 9, -1.6F, 11.3F, -3.5F, 3, 1, 1, 0.0F, false));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 13, 17, -1.1F, 11.3F, -4.0F, 2, 1, 1, 0.0F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 0, -1.9F, 10.0F, -2.0F, 4, 2, 4, 0.3F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 8, 16, -0.9F, 11.3F, -4.0F, 2, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 13, 15, -1.4F, 10.725F, -3.5F, 3, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 12, 6, -1.9F, 10.3F, -2.75F, 4, 2, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 16, -1.4F, 11.3F, -3.5F, 3, 1, 1, 0.0F, false));
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 12, -1.9F, 8.4F, -1.0F, 4, 1, 3, 0.3F, false));
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