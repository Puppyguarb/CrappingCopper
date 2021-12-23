package puppyguard.crappingcopper.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import puppyguard.crappingcopper.registeries.ModItem;

public class CompressedArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {3, 6, 8, 3};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};
    private static final int DURABILITY_MOD = 33;
    private static final int ENCHANTABILITY = 22;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * DURABILITY_MOD;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return ENCHANTABILITY;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItem.COMPRESSED_INGOT);
    }

    @Override
    public String getName() {
        return "compressed";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
