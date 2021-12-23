package puppyguard.crappingcopper.registeries;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import puppyguard.crappingcopper.Main;
import puppyguard.crappingcopper.armor.*;

public class ModArmor {

    public static final ArmorMaterial COMPRESSED_ARMOR_MATERIAL = new CompressedArmorMaterial();
    public static final Item COMPRESSED_HELMET = new ArmorItem(COMPRESSED_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item COMPRESSED_CHESTPLATE = new ArmorItem(COMPRESSED_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item COMPRESSED_LEGGINGS = new ArmorItem(COMPRESSED_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item COMPRESSED_BOOTS = new ArmorItem(COMPRESSED_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Main.ITEM_GROUP));

    public static final ArmorMaterial HYPER_ARMOR_MATERIAL = new HyperArmorMaterial();
    public static final Item HYPER_HELMET = new ArmorItem(HYPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final Item HYPER_CHESTPLATE = new ArmorItem(HYPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final Item HYPER_LEGGINGS = new ArmorItem(HYPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final Item HYPER_BOOTS = new ArmorItem(HYPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));

    public static final ArmorMaterial TRANSCENDED_ARMOR_MATERIAL = new TranscendedArmorMaterial();
    public static final Item TRANSCENDED_HELMET = new ArmorItem(TRANSCENDED_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));
    public static final Item TRANSCENDED_CHESTPLATE = new ArmorItem(TRANSCENDED_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));
    public static final Item TRANSCENDED_LEGGINGS = new ArmorItem(TRANSCENDED_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));
    public static final Item TRANSCENDED_BOOTS = new ArmorItem(TRANSCENDED_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));

    public static void register() {
        //Compressed armor.
        Registry.register(Registry.ITEM, Main.identifier("compressed_helmet"), COMPRESSED_HELMET);
        Registry.register(Registry.ITEM, Main.identifier("compressed_chestplate"), COMPRESSED_CHESTPLATE);
        Registry.register(Registry.ITEM, Main.identifier("compressed_leggings"), COMPRESSED_LEGGINGS);
        Registry.register(Registry.ITEM, Main.identifier("compressed_boots"), COMPRESSED_BOOTS);

        //Hyper armor.
        Registry.register(Registry.ITEM, Main.identifier("hyper_helmet"), HYPER_HELMET);
        Registry.register(Registry.ITEM, Main.identifier("hyper_chestplate"), HYPER_CHESTPLATE);
        Registry.register(Registry.ITEM, Main.identifier("hyper_leggings"), HYPER_LEGGINGS);
        Registry.register(Registry.ITEM, Main.identifier("hyper_boots"), HYPER_BOOTS);

        //Transcended armor.
        Registry.register(Registry.ITEM, Main.identifier("transcended_helmet"), TRANSCENDED_HELMET);
        Registry.register(Registry.ITEM, Main.identifier("transcended_chestplate"), TRANSCENDED_CHESTPLATE);
        Registry.register(Registry.ITEM, Main.identifier("transcended_leggings"), TRANSCENDED_LEGGINGS);
        Registry.register(Registry.ITEM, Main.identifier("transcended_boots"), TRANSCENDED_BOOTS);
    }
}
