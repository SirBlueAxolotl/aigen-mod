package net.sba.aigenmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.sba.aigenmod.AigenMod;
import net.sba.aigenmod.entity.custom.JawqEntity;

public class JawqRenderer extends MobEntityRenderer<JawqEntity, JawqModel<JawqEntity>> {

    public JawqRenderer(EntityRendererFactory.Context context) {
        super(context, new JawqModel<>(context.getPart(JawqModel.JAWQ)), 0.95f);
    }

    @Override
    public Identifier getTexture(JawqEntity entity) {
        return Identifier.of(AigenMod.MOD_ID, "textures/entity/jawq/jawq.png");
    }

    @Override
    public void render(JawqEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1.0f, 1.0f, 1.0f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
