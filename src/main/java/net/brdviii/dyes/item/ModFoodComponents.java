package net.brdviii.dyes.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder().nutrition(3).saturationModifier(0.15f).snack().build();
    public static final FoodComponent BLUEBERRIES_COOKIE = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(3.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 400, 1), 0.15f)
            .snack()
            .build();
    public static final FoodComponent SWEETBERRIES_COOKIE = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(3.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 0.15f)
            .snack()
            .build();
}
