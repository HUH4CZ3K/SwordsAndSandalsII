// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelarrowmodel extends ModelBase {
	private final ModelRenderer group;

	public Modelarrowmodel() {
		textureWidth = 32;
		textureHeight = 32;

		group = new ModelRenderer(this);
		group.setRotationPoint(0.0F, 8.0F, 0.0F);
		group.cubeList.add(new ModelBox(group, 6, 4, 0.0F, -3.0F, -7.0F, 0, 3, 2, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 5, 0.0F, -4.0F, 5.0F, 0, 2, 3, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 8, 8, 0.0F, -2.0F, -8.0F, 0, 1, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 3, -0.5F, -1.0F, 7.0F, 1, 2, 0, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 3, 0.5F, -1.5F, 5.0F, 2, 0, 3, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 2, -0.5F, -1.5F, -8.0F, 1, 0, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 7, 3, -2.5F, -2.0F, 7.0F, 2, 1, 0, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 3, 0.0F, -1.0F, 5.0F, 0, 2, 3, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 5, 0, -1.5F, -1.5F, -7.0F, 3, 0, 2, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 0, -2.5F, -1.5F, 5.0F, 2, 0, 3, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 7, 2, 0.5F, -2.0F, 7.0F, 2, 1, 0, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 6, 8, 0.0F, -1.0F, 4.0F, 0, 1, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 0, -0.5F, -2.0F, -5.0F, 1, 1, 13, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 0, -1.5F, -1.5F, 4.0F, 1, 0, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 1, 0.5F, -1.5F, 4.0F, 1, 0, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 4, 0.0F, -3.0F, 4.0F, 0, 1, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 7, 4, -0.5F, -4.0F, 7.0F, 1, 2, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group.render(f5);
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