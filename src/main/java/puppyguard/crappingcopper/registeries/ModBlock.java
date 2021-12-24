package puppyguard.crappingcopper.registeries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import puppyguard.crappingcopper.Main;
import puppyguard.crappingcopper.block.CustomDoorBlock;

public class ModBlock {

    public static final Block COMPRESSED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().sounds(BlockSoundGroup.COPPER));
    public static final Block HYPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength((1.5f)).requiresTool().sounds(BlockSoundGroup.COPPER));
    public static final Block TRANSCENDED_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength((2.0f)).requiresTool().sounds(BlockSoundGroup.COPPER));
    public static final Block CRESCENT_DOOR = new CustomDoorBlock(FabricBlockSettings.of(Material.METAL).strength((2.0f)).requiresTool().sounds(BlockSoundGroup.COPPER).nonOpaque());

    public static void register() {

        //darkoak DARK_OAK_DOOR = register("dark_oak_door", new DoorBlock(Settings.of(Material.WOOD, DARK_OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
        //IRON_DOOR = register("iron_door", new DoorBlock(Settings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

        //There is no code that disables blocks because it causes issues without replacing json files during runtime,
        //so there's really no point.
        DualRegister(CRESCENT_DOOR, "crescent_door", Rarity.COMMON);
        DualRegister(COMPRESSED_BLOCK, "compressed_block", Rarity.COMMON);
        DualRegister(HYPER_BLOCK, "hyper_block", Rarity.RARE);
        DualRegister(TRANSCENDED_BLOCK, "transcended_block", Rarity.EPIC);

    }


    //Registers both a block and an item for the block.
    private static void DualRegister(Block block, String id, Rarity rarity) {
        Registry.register(Registry.BLOCK, Main.identifier(id), block);
        Registry.register(Registry.ITEM, Main.identifier(id), new BlockItem(block,new FabricItemSettings().group(Main.ITEM_GROUP).rarity((rarity))));
    }

}
