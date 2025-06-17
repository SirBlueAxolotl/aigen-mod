package net.sba.aigenmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModel;
import net.sba.aigenmod.entity.ModEntities;
import net.sba.aigenmod.entity.client.JawqModel;
import net.sba.aigenmod.entity.client.JawqRenderer;

public class AigenModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(JawqModel.JAWQ, JawqModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.JAWQ, JawqRenderer::new);
    }
}
