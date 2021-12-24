package puppyguard.crappingcopper.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;


public class CustomDoorBlock extends DoorBlock {
    public CustomDoorBlock(Settings settings) {
        super(settings);
    }

    private int getOpenSoundEventId() {
        //Metal door open sound.
        return 1011;
    }

    private int getCloseSoundEventId() {
        //Metal door close sound.
        return 1005;
    }
    //Overridden literally just so the sound is metal instead of wood.
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        state = (BlockState)state.cycle(OPEN);
        world.setBlockState(pos, state, 10);
        world.syncWorldEvent(player, (Boolean)state.get(OPEN) ? this.getCloseSoundEventId() : this.getOpenSoundEventId(), pos, 0);
        world.emitGameEvent(player, this.isOpen(state) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
        return ActionResult.success(world.isClient);
    }
}
