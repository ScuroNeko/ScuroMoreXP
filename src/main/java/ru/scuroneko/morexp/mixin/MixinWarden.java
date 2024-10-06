package ru.scuroneko.morexp.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.scuroneko.morexp.Config;
import ru.scuroneko.morexp.ConfigHelper;
import ru.scuroneko.morexp.MoreXP;

@Mixin(Warden.class)
public class MixinWarden extends Mob {
    protected MixinWarden(EntityType<? extends Mob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    public void constructor(EntityType<? extends Monster> pEntityType, Level pLevel, CallbackInfo ci) {
        MoreXP.getLOGGER().debug("Hooked Warden.class");
        this.xpReward = ConfigHelper.getConfig().getWitherXp();
    }
}
