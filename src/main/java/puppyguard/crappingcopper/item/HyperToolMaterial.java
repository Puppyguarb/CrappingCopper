package puppyguard.crappingcopper.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import puppyguard.crappingcopper.registeries.ModItem;

public class HyperToolMaterial implements ToolMaterial {

    public static final HyperToolMaterial INSTANCE = new HyperToolMaterial(false);
    public static final HyperToolMaterial HAMMER_INSTANCE = new HyperToolMaterial(true);
    private int durability = 3000;
    private float miningSpeed = 12.0f;

    public HyperToolMaterial(boolean isHammer) {
        //Only used for hammers, basically just gives them the same amount of durability as the other tools.
        if (isHammer) {
            durability*=9;
            miningSpeed -= 2.0f;
        }
    }

    @Override
    public int getDurability() { return durability;    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return 6.0f;
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
        return Ingredient.ofItems(ModItem.HYPER_INGOT);
    }
}
