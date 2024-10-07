package ru.scuroneko.morexp.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.scuroneko.morexp.ConfigHelper;

@Mixin(WitherBoss.class)
public class MixinWitherBoss extends Mob {
    protected MixinWitherBoss(EntityType<? extends Mob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    public void constructor(EntityType pEntityType, Level pLevel, CallbackInfo ci) {
        this.xpReward = ConfigHelper.getConfig().getWitherXp();
    }
}
