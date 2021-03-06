package ihh.spellbound.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRendersAsItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.entity.PartEntity;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nonnull;

public abstract class SpellProjectile extends ThrowableEntity implements IRendersAsItem {
    public SpellProjectile(EntityType<? extends ThrowableEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void onImpact(@Nonnull RayTraceResult result) {
        super.onImpact(result);
        if (!world.isRemote) {
            if (result instanceof EntityRayTraceResult && ((EntityRayTraceResult) result).getEntity() instanceof LivingEntity && !(((EntityRayTraceResult) result).getEntity() instanceof ArmorStandEntity)) {
                affectEntity((EntityRayTraceResult) result);
                affectBlock(new BlockRayTraceResult(result.getHitVec(), Direction.UP, ((EntityRayTraceResult) result).getEntity().getPosition().down(), false));
                remove();
            }
            if (result instanceof BlockRayTraceResult) {
                affectBlock((BlockRayTraceResult) result);
                remove();
            }
        }
    }

    protected abstract void affectBlock(BlockRayTraceResult result);

    protected abstract void affectEntity(EntityRayTraceResult result);

    @Override
    protected void registerData() {
    }

    @Override
    public Entity getEntity() {
        return super.getEntity();
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        super.deserializeNBT(nbt);
    }

    @Override
    public CompoundNBT serializeNBT() {
        return super.serializeNBT();
    }

    @Override
    public boolean shouldRiderSit() {
        return false;
    }

    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return getItem();
    }

    @Override
    public boolean canRiderInteract() {
        return false;
    }

    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return false;
    }

    @Override
    public EntityClassification getClassification(boolean forSpawnCount) {
        return EntityClassification.MISC;
    }

    @Override
    public boolean isMultipartEntity() {
        return false;
    }

    @Override
    public PartEntity<?>[] getParts() {
        return null;
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap) {
        return super.getCapability(cap);
    }

    @Nonnull
    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
