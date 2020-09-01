package com.fengshui.sinoeats.blocks;


import com.fengshui.sinoeats.init.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class CupBlock extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(8.9, 0, 7.4, 9.200000000000001, 0.5, 8.6),
            Block.makeCuboidShape(7.4, 0, 6.799999999999999, 8.6, 0.5, 7.1),
            Block.makeCuboidShape(7.4, 0, 8.9, 8.6, 0.5, 9.200000000000001),
            Block.makeCuboidShape(6.799999999999999, 0, 7.4, 7.1, 0.5, 8.6),
            Block.makeCuboidShape(7.1, 0, 7.1, 8.9, 0.5, 8.9),
            Block.makeCuboidShape(6.8, 0, 7.1, 7.1000000000000005, 4, 7.399999999999999),
            Block.makeCuboidShape(6.800000000000001, 0, 8.600000000000001, 7.1, 4, 9.2),
            Block.makeCuboidShape(8.600000000000001, 0, 8.9, 9.2, 4, 9.2),
            Block.makeCuboidShape(8.9, 0, 6.800000000000001, 9.2, 4, 7.399999999999999),
            Block.makeCuboidShape(6.8, 0, 6.8, 7.3999999999999995, 4, 7.1),
            Block.makeCuboidShape(7.1, 0, 8.899999999999999, 7.399999999999999, 4, 9.2),
            Block.makeCuboidShape(8.899999999999999, 0, 8.600000000000001, 9.2, 4, 8.9),
            Block.makeCuboidShape(8.600000000000001, 0, 6.800000000000001, 8.9, 4, 7.100000000000001),
            Block.makeCuboidShape(7.1, 0, 6.5, 8.9, 4, 6.800000000000001),
            Block.makeCuboidShape(6.5, 0, 7.1, 6.800000000000001, 4, 8.9),
            Block.makeCuboidShape(7.1, 0, 9.2, 8.9, 4, 9.5),
            Block.makeCuboidShape(9.2, 0, 7.1, 9.5, 4, 8.9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public CupBlock(Properties properties) {
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

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(ItemList.CUP.get());
    }

}
