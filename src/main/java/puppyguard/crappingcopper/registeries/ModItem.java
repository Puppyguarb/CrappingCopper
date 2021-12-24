package puppyguard.crappingcopper.registeries;

import draylar.magna.item.HammerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import puppyguard.crappingcopper.Main;
import puppyguard.crappingcopper.item.*;
import puppyguard.crappingcopper.item.customitems.*;

public class ModItem {
    //Hammers
    public static final ToolItem COPPER_HAMMER = new HammerItem(CopperToolMaterial.INSTANCE,-1,-3.2f,new FabricItemSettings().group(Main.ITEM_GROUP),1);
    public static final ToolItem COMPRESSED_HAMMER = new HammerItem(CompressedToolMaterial.HAMMER_INSTANCE,1,-3.2f,new FabricItemSettings().group(Main.ITEM_GROUP),1);
    public static final ToolItem HYPER_HAMMER = new HammerItem(HyperToolMaterial.HAMMER_INSTANCE,1,-3.2f,new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE),2);
    public static final ToolItem TRANSCENDED_HAMMER = new HammerItem(TranscendedToolMaterial.HAMMER_INSTANCE,1,-3.2f,new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC),3);

    //Swords
    public static final ToolItem COMPRESSED_SWORD = new SwordItem(CompressedToolMaterial.INSTANCE,4,-2.4f, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final ToolItem HYPER_SWORD = new SwordItem(HyperToolMaterial.INSTANCE,3,-2.4f, new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final ToolItem TRANSCENDED_SWORD = new SwordItem(TranscendedToolMaterial.INSTANCE,3,-2.4f, new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));

    //Axes
    public static final ToolItem COMPRESSED_AXE = new CustomAxeItem(CompressedToolMaterial.INSTANCE,5,-3.2f, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final ToolItem HYPER_AXE = new CustomAxeItem(HyperToolMaterial.INSTANCE,5,-3.2f, new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final ToolItem TRANSCENDED_AXE = new CustomAxeItem(TranscendedToolMaterial.INSTANCE,5,-3.2f, new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));

    //Hoes
    public static final ToolItem COMPRESSED_HOE = new CustomHoeItem(CompressedToolMaterial.INSTANCE,-2,0.3f, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final ToolItem HYPER_HOE = new CustomHoeItem(HyperToolMaterial.INSTANCE,-6,1f, new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final ToolItem TRANSCENDED_HOE = new CustomHoeItem(TranscendedToolMaterial.INSTANCE,-12,1f, new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));

    //Shovels
    public static final ToolItem COMPRESSED_SHOVEL = new ShovelItem(CompressedToolMaterial.INSTANCE,-1,-2.6f, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final ToolItem HYPER_SHOVEL = new ShovelItem(HyperToolMaterial.INSTANCE,-2,-2.6f, new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final ToolItem TRANSCENDED_SHOVEL = new ShovelItem(TranscendedToolMaterial.INSTANCE,-8,-2.6f, new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));

    //Pickaxes
    public static final ToolItem COMPRESSED_PICKAXE = new CustomPickaxeItem(CompressedToolMaterial.INSTANCE,1,-2.8f, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final ToolItem HYPER_PICKAXE = new CustomPickaxeItem(HyperToolMaterial.INSTANCE,-1,-2.8f, new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final ToolItem TRANSCENDED_PICKAXE = new CustomPickaxeItem(TranscendedToolMaterial.INSTANCE,-7,-2.8f, new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(-1).rarity(Rarity.EPIC));

    //Ingots
    public static final Item COMPRESSED_INGOT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item HYPER_INGOT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));
    public static final Item TRANSCENDED_INGOT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).fireproof().rarity(Rarity.EPIC));

    //Copprification stacks
    public static final Item COPPER_STACK = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item COMPRESSED_STACK = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item HYPER_STACK = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).rarity(Rarity.RARE));

    //Misc
    public static final Item COPPER_FEATHER = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));

    public static void register() {

        //Misc
        if (Main.SETTINGS.enableCopperFeather) Registry.register(Registry.ITEM, Main.identifier("copper_feather"), COPPER_FEATHER);
        if (Main.SETTINGS.enableCopperHammer) Registry.register(Registry.ITEM, Main.identifier("copper_hammer"), COPPER_HAMMER);

        if (Main.SETTINGS.enableCompressedCopper) {
            //Compressed Items
            Registry.register(Registry.ITEM, Main.identifier("compressed_ingot"), COMPRESSED_INGOT);
            Registry.register(Registry.ITEM, Main.identifier("compressed_stack"), COMPRESSED_STACK);
            Registry.register(Registry.ITEM, Main.identifier("copper_stack"), COPPER_STACK);

            if (Main.SETTINGS.enableCompressedCopperTools) {
                Registry.register(Registry.ITEM, Main.identifier("compressed_sword"), COMPRESSED_SWORD);
                Registry.register(Registry.ITEM, Main.identifier("compressed_axe"), COMPRESSED_AXE);
                Registry.register(Registry.ITEM, Main.identifier("compressed_hoe"), COMPRESSED_HOE);
                Registry.register(Registry.ITEM, Main.identifier("compressed_shovel"), COMPRESSED_SHOVEL);
                Registry.register(Registry.ITEM, Main.identifier("compressed_pickaxe"), COMPRESSED_PICKAXE);
            }

            if (Main.SETTINGS.enableCompressedCopperHammer) Registry.register(Registry.ITEM, Main.identifier("compressed_hammer"), COMPRESSED_HAMMER);

            if (Main.SETTINGS.enableHyperDenseCopper) {
                //Hyper Items
                Registry.register(Registry.ITEM, Main.identifier("hyper_ingot"), HYPER_INGOT);
                Registry.register(Registry.ITEM, Main.identifier("hyper_stack"), HYPER_STACK);

                if (Main.SETTINGS.enableHyperDenseCopperTools) {
                    Registry.register(Registry.ITEM, Main.identifier("hyper_sword"), HYPER_SWORD);
                    Registry.register(Registry.ITEM, Main.identifier("hyper_axe"), HYPER_AXE);
                    Registry.register(Registry.ITEM, Main.identifier("hyper_hoe"), HYPER_HOE);
                    Registry.register(Registry.ITEM, Main.identifier("hyper_shovel"), HYPER_SHOVEL);
                    Registry.register(Registry.ITEM, Main.identifier("hyper_pickaxe"), HYPER_PICKAXE);
                }

                if (Main.SETTINGS.enableHyperDenseCopperHammer) Registry.register(Registry.ITEM, Main.identifier("hyper_hammer"), HYPER_HAMMER);

                if (Main.SETTINGS.enableTranscendedCopper) {
                    //Transcended Items
                    Registry.register(Registry.ITEM, Main.identifier("transcended_ingot"), TRANSCENDED_INGOT);

                    if (Main.SETTINGS.enableTranscendedCopperTools) {
                        Registry.register(Registry.ITEM, Main.identifier("transcended_sword"), TRANSCENDED_SWORD);
                        Registry.register(Registry.ITEM, Main.identifier("transcended_axe"), TRANSCENDED_AXE);
                        Registry.register(Registry.ITEM, Main.identifier("transcended_hoe"), TRANSCENDED_HOE);
                        Registry.register(Registry.ITEM, Main.identifier("transcended_shovel"), TRANSCENDED_SHOVEL);
                        Registry.register(Registry.ITEM, Main.identifier("transcended_pickaxe"), TRANSCENDED_PICKAXE);
                    }

                    if (Main.SETTINGS.enableTranscendedCopperHammer) Registry.register(Registry.ITEM, Main.identifier("transcended_hammer"), TRANSCENDED_HAMMER);
                }
            }
        }
    }
}
