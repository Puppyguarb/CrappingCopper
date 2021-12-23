package puppyguard.crappingcopper.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import puppyguard.crappingcopper.registeries.ModItem;

public class CompressedToolMaterial implements ToolMaterial {

    public static final CompressedToolMaterial INSTANCE = new CompressedToolMaterial(false);
    public static final CompressedToolMaterial HAMMER_INSTANCE = new CompressedToolMaterial(true);
    private int durability = 1250;
    private float miningSpeed = 8.0f;

    public CompressedToolMaterial(boolean isHammer) {
        //Only used for hammers, basically just gives them the same amount of durability as the other tools.
        if (isHammer) {
            durability *= 9;
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
        return 4.0f;
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
        return Ingredient.ofItems(ModItem.COMPRESSED_INGOT);
    }
}
