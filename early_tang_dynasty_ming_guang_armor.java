// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class early_tang_dynasty_ming_guang_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "early_tang_dynasty_ming_guang_armor"), "main");
	private final ModelPart bipedHead;
	private final ModelPart bipedBody;
	private final ModelPart bipedRightArm;
	private final ModelPart bipedLeftArm;
	private final ModelPart bipedLeftLeg;
	private final ModelPart bipedRightLeg;

	public early_tang_dynasty_ming_guang_armor(ModelPart root) {
		this.bipedHead = root.getChild("bipedHead");
		this.bipedBody = root.getChild("bipedBody");
		this.bipedRightArm = root.getChild("bipedRightArm");
		this.bipedLeftArm = root.getChild("bipedLeftArm");
		this.bipedLeftLeg = root.getChild("bipedLeftLeg");
		this.bipedRightLeg = root.getChild("bipedRightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("bipedHead", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -8.9F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F))
		.texOffs(45, 97).addBox(-3.5F, -11.5F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.5F))
		.texOffs(25, 121).addBox(-2.5F, -14.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.2F))
		.texOffs(36, 0).addBox(-4.0F, -8.7F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.56F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead_r1 = bipedHead.addOrReplaceChild("armorHead_r1", CubeListBuilder.create().texOffs(54, 38).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(0.0F, -0.9F, 4.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone3_r1 = bipedHead.addOrReplaceChild("bone3_r1", CubeListBuilder.create().texOffs(25, 22).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.9F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create().texOffs(1, 52).mirror().addBox(-3.8F, 0.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1, 52).addBox(1.8F, 0.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 52).mirror().addBox(-3.5F, 3.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1, 52).addBox(1.5F, 3.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-4.0F, -0.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F))
		.texOffs(45, 20).addBox(-4.0F, -0.1F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(1.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bipedBody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 27).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.3F, -3.2F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r2 = bipedBody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 27).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.6F, 1.3F, -3.2F, 0.0F, 0.0F, 0.0436F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm", CubeListBuilder.create().texOffs(12, 32).addBox(-4.4F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r3 = bipedRightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 67).mirror().addBox(-11.3506F, -25.6599F, -2.5F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(19.713F, 5.7414F, 1.0F, 0.0F, 0.0F, -0.9425F));

		PartDefinition cube_r4 = bipedRightArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 67).mirror().addBox(-1.3774F, -0.672F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.8974F, -5.4169F, 0.0F, 0.0F, 0.0F, -1.2915F));

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(0.4F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r5 = bipedLeftArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 67).addBox(-0.6226F, -0.672F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.8974F, -5.4169F, 0.0F, 0.0F, 0.0F, 1.2915F));

		PartDefinition cube_r6 = bipedLeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 67).addBox(4.3506F, -25.6599F, -2.5F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.713F, 5.7414F, 1.0F, 0.0F, 0.0F, 0.9425F));

		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create().texOffs(0, 112).addBox(-1.9F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.86F))
		.texOffs(0, 99).addBox(-1.9F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.88F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition dontTouch_r1 = bipedLeftLeg.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-2.5F, -4.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.91F)).mirror(false), PartPose.offsetAndRotation(0.6F, 3.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create().texOffs(0, 59).addBox(-2.1F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.85F))
		.texOffs(0, 99).mirror().addBox(-2.1F, 6.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.89F)).mirror(false), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition dontTouch_r2 = bipedRightLeg.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(32, 50).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offsetAndRotation(-0.6F, 3.5F, 0.0F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bipedHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}