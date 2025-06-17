package net.sba.aigenmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sba.aigenmod.AigenMod;
import net.sba.aigenmod.entity.custom.JawqEntity;

public class ModEntities {
    public static final EntityType<JawqEntity> JAWQ = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(AigenMod.MOD_ID, "jawq"),
            EntityType.Builder.create(JawqEntity::new, SpawnGroup.CREATURE)
                    .dimensions(2.5f, 1.5f).build());


    public static void registerModEntities() {
        AigenMod.LOGGER.info("Registering Mod Entities for " + AigenMod.MOD_ID);
    }
}
