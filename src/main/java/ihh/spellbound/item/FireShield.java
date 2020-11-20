package ihh.spellbound.item;

import ihh.spellbound.init.EffectInit;
import net.minecraft.potion.EffectInstance;

public final class FireShield extends AbstractBeneficialPotionSpell {
    public FireShield() {
        super(new EffectInstance(EffectInit.fire_shield, 1200));
    }

    @Override
    protected Time getTime() {
        return Time.ONE;
    }
}