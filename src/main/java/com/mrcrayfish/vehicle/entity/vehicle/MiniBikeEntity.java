package com.mrcrayfish.vehicle.entity.vehicle;

import com.mrcrayfish.vehicle.client.EntityRaytracer.IEntityRaytraceable;
import com.mrcrayfish.vehicle.entity.EngineType;
import com.mrcrayfish.vehicle.entity.MotorcycleEntity;
import com.mrcrayfish.vehicle.init.ModEntities;
import com.mrcrayfish.vehicle.init.ModSounds;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

/**
 * Author: MrCrayfish
 */
public class MiniBikeEntity extends MotorcycleEntity implements IEntityRaytraceable
{
    public MiniBikeEntity(EntityType<? extends MiniBikeEntity> type, World worldIn)
    {
        super(type, worldIn);
        this.setMaxSpeed(18F);
        this.setTurnSensitivity(12);
        this.setFuelCapacity(15000F);
        this.setFuelConsumption(0.375F);
    }

    @Override
    public SoundEvent getMovingSound()
    {
        return ModSounds.GO_KART_ENGINE_MONO.get();
    }

    @Override
    public SoundEvent getRidingSound()
    {
        return ModSounds.GO_KART_ENGINE_STEREO.get();
    }

    @Override
    public EngineType getEngineType()
    {
        return EngineType.SMALL_MOTOR;
    }

    @Override
    public float getMinEnginePitch()
    {
        return 0.5F;
    }

    @Override
    public float getMaxEnginePitch()
    {
        return 1.8F;
    }

    @Override
    public boolean shouldShowEngineSmoke()
    {
        return true;
    }

    @Override
    public Vec3d getEngineSmokePosition()
    {
        return new Vec3d(0, 0.55, 0);
    }

    @Override
    public boolean canBeColored()
    {
        return true;
    }

    @Override
    public boolean shouldRenderEngine()
    {
        return true;
    }

    @Override
    public boolean shouldRenderFuelPort()
    {
        return false;
    }

    @Override
    public boolean isLockable()
    {
        return false;
    }
}
