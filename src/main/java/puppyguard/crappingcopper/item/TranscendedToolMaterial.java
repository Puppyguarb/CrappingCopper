package puppyguard.crappingcopper.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TranscendedToolMaterial implements ToolMaterial {

    public static final TranscendedToolMaterial INSTANCE = new TranscendedToolMaterial();
    public static final TranscendedToolMaterial HAMMER_INSTANCE = INSTANCE;

    @Override
    public int getDurability() {
        return 1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0f;
    }

    @Override
    public float getAttackDamage() {
        return 15.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
