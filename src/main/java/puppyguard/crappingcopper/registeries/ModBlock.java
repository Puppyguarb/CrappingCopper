package puppyguard.crappingcopper.registeries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import puppyguard.crappingcopper.Main;

public class ModBlock {

    public static final Block COMPRESSED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool());
    public static final Block HYPER_BLOCK = new Block(FabricBlockSettings.of(Material.REPAIR_STATION).strength((1.5f)).requiresTool());
    public static final Block TRANSCENDED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength((2.0f)).requiresTool());

    public static void register() {
        DualRegister(COMPRESSED_BLOCK,"compressed_block",Rarity.COMMON);
        DualRegister(HYPER_BLOCK,"hyper_block",Rarity.RARE);
        DualRegister(TRANSCENDED_BLOCK,"transcended_block",Rarity.EPIC);
    }

    //Registers both a block and an item for the block.
    private static void DualRegister(Block block, String id, Rarity rarity) {
        Registry.register(Registry.BLOCK, Main.identifier(id), block);
        Registry.register(Registry.ITEM, Main.identifier(id), new BlockItem(block,new FabricItemSettings().group(Main.ITEM_GROUP).rarity((rarity))));
    }

}
