package puppyguard.crappingcopper;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import puppyguard.crappingcopper.config.CrappingCopperConfig;
import puppyguard.crappingcopper.registeries.*;

public class Main implements ModInitializer {

    public static final String MOD_ID = "crappingcopper";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final CrappingCopperConfig.Settings SETTINGS = AutoConfig.register(CrappingCopperConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig().SETTINGS;

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "creative_tab"))
            .icon(() -> new ItemStack(Items.COPPER_INGOT))
            .build();

    @Override
    public void onInitialize() {
        //Register the items & blocks of the mod.
        ModArmor.register();
        ModBlock.register();
        ModItem.register();

    }

    //Clever little method for using identifiers
    public static Identifier identifier(String id) {
        return new Identifier(MOD_ID, id);
    }
}
