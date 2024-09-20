package net.andrew.f1mod.registry;

import net.andrew.f1mod.entity.CarEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEntities {
    public static final EntityType<CarEntity> CAR_ENTITY = Registry.register(Registry.ENTITY_TYPE,
            new Identifier("f1mod", "car"), FabricEntityTypeBuilder.create(SpawnGroup.MISC, CarEntity::new).build());

    public static void register(){
        // Call this in ModMain to register entities
    }
}
