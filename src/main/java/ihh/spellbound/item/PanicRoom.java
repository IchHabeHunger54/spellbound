package ihh.spellbound.item;

import ihh.spellbound.block.Util;
import ihh.spellbound.config.SpellTimeConfig;
import ihh.spellbound.init.BlockInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeConfigSpec;

public final class PanicRoom extends AbstractSelfSpell {
    @Override
    protected boolean use(ItemStack stack, LivingEntity target, ServerWorld world) {
        boolean b = false;
        for (int w = -2; w < 3; w++)
            for (int h = -2; h < 3; h++)
                b = Util.replaceAirBlock(world, new BlockPos(target.getPositionVec().add(w, 3, h)), BlockInit.DECAYING_BEDROCK.get()) || b;
        for (int w = -2; w < 3; w++)
            for (int h = -2; h < 3; h++)
                b = Util.replaceAirBlock(world, new BlockPos(target.getPositionVec().add(w, -1, h)), BlockInit.DECAYING_BEDROCK.get()) || b;
        for (int w = -3; w < 4; w++)
            for (int h = 0; h < 3; h++) {
                b = Util.replaceAirBlock(world, new BlockPos(target.getPositionVec().add(w, h, 3)), BlockInit.DECAYING_BEDROCK.get()) || b;
                b = Util.replaceAirBlock(world, new BlockPos(target.getPositionVec().add(-3, h, w)), BlockInit.DECAYING_BEDROCK.get()) || b;
                b = Util.replaceAirBlock(world, new BlockPos(target.getPositionVec().add(w, h, -3)), BlockInit.DECAYING_BEDROCK.get()) || b;
                b = Util.replaceAirBlock(world, new BlockPos(target.getPositionVec().add(3, h, w)), BlockInit.DECAYING_BEDROCK.get()) || b;
            }
        return b;
    }

    @Override
    protected ForgeConfigSpec.IntValue getTimeConfig() {
        return SpellTimeConfig.PANIC_ROOM;
    }
}
