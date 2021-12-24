package puppyguard.crappingcopper;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import puppyguard.crappingcopper.registeries.ModBlock;

public class ClientMain implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //Basically? Just makes the door's transparent bits be see through rather than black.
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.CRESCENT_DOOR, RenderLayer.getCutout());
    }
}
