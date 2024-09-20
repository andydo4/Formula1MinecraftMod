package net.andrew.f1mod.client;

import net.andrew.f1mod.client.renderer.CarRenderer;
import net.andrew.f1mod.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.CAR_ENTITY, CarRenderer::new);
    }
}
