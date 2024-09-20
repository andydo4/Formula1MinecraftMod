package net.andrew.f1mod.client.renderer;

import net.andrew.f1mod.F1Mod;
import net.andrew.f1mod.client.model.F1Car;
import net.andrew.f1mod.entity.CarEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;

public class CarRenderer extends EntityRenderer<CarEntity>{
    private final F1Car model;

    public CarRenderer(EntityRendererFactory.Context context){
        super(context);
        this.model = new F1Car();
    }

    public void render(CarEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light){
        matrices.push();
        matrices.translate(0.0D,0.0D,0.0D);
        matrices.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(180-entity.getYaw()));
        Vec3d pos = entity.getPos();
        matrices.translate(pos.x, pos.y, pos.z);

        model.render(matrices, vertexConsumers.getBuffer(model.getLayer(getTexture(entity))), light, 0, 1.0F, 1.0F, 1.0F, 1.0F);
        matrices.pop();

        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(CarEntity entity) {
        return new Identifier("f1mod", "textures/entity/MclarenF1Car.png");
    }
}
