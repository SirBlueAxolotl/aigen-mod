package net.sba.aigenmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.sba.aigenmod.AigenMod;
import net.sba.aigenmod.entity.custom.JawqEntity;

public class JawqModel<T extends JawqEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer JAWQ = new EntityModelLayer(Identifier.of(AigenMod.MOD_ID, "jawq"), "main");

    private final ModelPart jawq;
    private final ModelPart lowerbody;
    private final ModelPart midbody;
    private final ModelPart upperbody;
    private final ModelPart head;

    public JawqModel(ModelPart root) {
        this.jawq = root.getChild("jawq");
        this.lowerbody = this.jawq.getChild("lowerbody");
        this.midbody = this.lowerbody.getChild("midbody");
        this.upperbody = this.midbody.getChild("upperbody");
        this.head = this.upperbody.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData jawq = modelPartData.addChild("jawq", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 8.0F, 48.0F));

        ModelPartData lowerbody = jawq.addChild("lowerbody", ModelPartBuilder.create().uv(40, 40).cuboid(-6.0F, -6.0F, -7.0F, 12.0F, 12.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 59).cuboid(-5.0F, -5.0F, -2.0F, 10.0F, 10.0F, 4.0F, new Dilation(0.0F))
                .uv(44, 83).cuboid(0.0F, -11.0F, -7.0F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(48, 93).cuboid(0.0F, -10.0F, -2.0F, 0.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, -39.0F));

        ModelPartData tail = lowerbody.addChild("tail", ModelPartBuilder.create().uv(40, 22).cuboid(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 10.0F, new Dilation(0.0F))
                .uv(76, 20).cuboid(0.0F, -9.0F, 0.0F, 0.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 2.0F));

        ModelPartData tail2 = tail.addChild("tail2", ModelPartBuilder.create().uv(44, 0).cuboid(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 10.0F, new Dilation(0.0F))
                .uv(56, 79).cuboid(0.0F, -8.0F, 0.0F, 0.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 10.0F));

        ModelPartData tail3 = tail2.addChild("tail3", ModelPartBuilder.create().uv(28, 69).cuboid(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 10.0F, new Dilation(0.0F))
                .uv(76, 79).cuboid(0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 10.0F));

        ModelPartData tail4 = tail3.addChild("tail4", ModelPartBuilder.create().uv(0, 73).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 10.0F, new Dilation(0.0F))
                .uv(80, 4).cuboid(0.0F, -6.0F, 0.0F, 0.0F, 5.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 10.0F));

        ModelPartData leftleg = lowerbody.addChild("leftleg", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 0.0F, 0.5F));

        ModelPartData ull = leftleg.addChild("ull", ModelPartBuilder.create().uv(74, 52).cuboid(0.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData lll = ull.addChild("lll", ModelPartBuilder.create().uv(74, 48).cuboid(0.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, 0.0F, 0.0F));

        ModelPartData lf = lll.addChild("lf", ModelPartBuilder.create().uv(92, 71).cuboid(0.0F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, 0.0F, 0.0F));

        ModelPartData rightleg = lowerbody.addChild("rightleg", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 0.5F));

        ModelPartData url = rightleg.addChild("url", ModelPartBuilder.create().uv(56, 75).cuboid(-16.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData lrl = url.addChild("lrl", ModelPartBuilder.create().uv(76, 0).cuboid(-16.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-16.0F, 0.0F, 0.0F));

        ModelPartData rf = lrl.addChild("rf", ModelPartBuilder.create().uv(94, 35).cuboid(-5.0F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-16.0F, 0.0F, 0.0F));

        ModelPartData midbody = lowerbody.addChild("midbody", ModelPartBuilder.create().uv(0, 22).cuboid(-7.0F, -6.5F, -7.0F, 13.0F, 13.0F, 7.0F, new Dilation(0.0F))
                .uv(16, 93).cuboid(-0.5F, -11.5F, -7.0F, 0.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 0.0F, -7.0F));

        ModelPartData upperbody = midbody.addChild("upperbody", ModelPartBuilder.create().uv(68, 57).cuboid(-6.0F, -6.0F, -10.0F, 12.0F, 12.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-7.0F, -7.0F, -8.0F, 14.0F, 14.0F, 8.0F, new Dilation(0.0F))
                .uv(0, 85).cuboid(0.0F, -12.0F, -8.0F, 0.0F, 5.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, 0.0F, -7.0F));

        ModelPartData rightarm = upperbody.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(-7.0F, 0.0F, -6.5F));

        ModelPartData ura = rightarm.addChild("ura", ModelPartBuilder.create().uv(44, 16).cuboid(-16.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData lra = ura.addChild("lra", ModelPartBuilder.create().uv(56, 71).cuboid(-16.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-16.0F, 0.0F, 0.0F));

        ModelPartData rh = lra.addChild("rh", ModelPartBuilder.create().uv(30, 93).cuboid(-5.0F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-16.0F, 0.0F, 0.0F));

        ModelPartData leftarm = upperbody.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.pivot(7.0F, 0.0F, -7.0F));

        ModelPartData ula = leftarm.addChild("ula", ModelPartBuilder.create().uv(74, 40).cuboid(0.0F, -1.0F, -0.5F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData lla = ula.addChild("lla", ModelPartBuilder.create().uv(74, 44).cuboid(0.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, 0.0F, 0.5F));

        ModelPartData lh = lla.addChild("lh", ModelPartBuilder.create().uv(76, 35).cuboid(0.0F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, 0.0F, 0.0F));

        ModelPartData head = upperbody.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -10.0F));

        ModelPartData head2 = head.addChild("head2", ModelPartBuilder.create().uv(24, 83).cuboid(-4.0F, -4.0F, -2.0F, 8.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cranium = head2.addChild("cranium", ModelPartBuilder.create().uv(0, 42).cuboid(-5.0F, -5.0F, -7.0F, 10.0F, 10.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

        ModelPartData jaw = cranium.addChild("jaw", ModelPartBuilder.create().uv(34, 57).cuboid(-5.0F, 0.0F, -7.0F, 10.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void setAngles(JawqEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(JawqAnimations.WALK, limbSwing, limbSwingAmount, 0.5f, 0.5f);
        this.updateAnimation(entity.idleAnimationState, JawqAnimations.IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        jawq.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return jawq;
    }
}
