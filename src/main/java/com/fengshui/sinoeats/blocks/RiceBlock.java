package com.fengshui.sinoeats.blocks;


import com.fengshui.sinoeats.blocks.voxelshape_models.BowlVX;
import com.fengshui.sinoeats.init.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class RiceBlock extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(5, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 4, 11, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 11, 4, 12),
            Block.makeCuboidShape(5, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 12),
            Block.makeCuboidShape(4, 3, 4, 5, 4, 6),
            Block.makeCuboidShape(11, 3, 4, 12, 4, 6),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 12),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(6, 2, 11, 10, 3, 12),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10),
            Block.makeCuboidShape(4, 4, 6, 12, 4.75, 10),
            Block.makeCuboidShape(5, 4, 10, 11, 4.75, 11),
            Block.makeCuboidShape(5, 4, 5, 11, 4.75, 6),
            Block.makeCuboidShape(6, 4, 4, 10, 4.75, 5),
            Block.makeCuboidShape(6, 4, 11, 10, 4.75, 12),
            Block.makeCuboidShape(6, 4.75, 5, 10, 5.25, 11),
            Block.makeCuboidShape(10, 4.75, 6, 11, 5.25, 10),
            Block.makeCuboidShape(5, 4.75, 6, 6, 5.25, 10),
            Block.makeCuboidShape(6, 5.25, 6, 10, 5.65, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public RiceBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        Item item = state.getBlock().asItem();
        Food food = item.getFood();
        if (food == null) {
            return ActionResultType.PASS;
        }
        ItemStack itemStack = new ItemStack(item);

        if (player.canEat(food.canEatWhenFull()) || player.isCreative()) {
            itemStack.onItemUseFinish(worldIn, player);
            player.onFoodEaten(worldIn, itemStack);
            state.removedByPlayer(worldIn, pos, player, false, worldIn.getFluidState(pos));

            BlockState bowlState = BlockList.BOWL_BLOCK.get().getDefaultState();
            worldIn.setBlockState(pos, bowlState);

            return ActionResultType.CONSUME;
        }
        return ActionResultType.PASS;
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(Items.BOWL);
    }


}
