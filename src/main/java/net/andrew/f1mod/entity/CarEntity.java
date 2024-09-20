package net.andrew.f1mod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class CarEntity extends Entity {

    private double speed = 0.0;

    public CarEntity(EntityType<?> type, World world){
        super(type, world);
    }

    @Override
    public void tick(){
        super.tick();

        if(this.getControllingPassenger() instanceof PlayerEntity player){
            if(player.isSneaking()){
                speed = 0.1;
            }
            else{
                speed = 0.5;
            }
        }
        moveCar();
    }

    private void moveCar(){
        Vec3d motion = this.getVelocity();
        this.setVelocity(motion.add(0, 0, speed));
    }

    public void onCollision(BlockPos blockPos){

    }

    @Override
    protected void initDataTracker() {
        // Track data
    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        // read custom data
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        // write custom data
    }
}
