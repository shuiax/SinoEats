package com.fengshui.sinoeats.blocks.voxelshape_models;

import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.stream.Stream;

public class BowlVX {

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 11),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 11),
            Block.makeCuboidShape(4, 3, 5, 5, 4, 6),
            Block.makeCuboidShape(4, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 12, 4, 12),
            Block.makeCuboidShape(4, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(6, 2, 11, 10, 3, 12),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 11),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 11),
            Block.makeCuboidShape(4, 3, 5, 5, 4, 6),
            Block.makeCuboidShape(4, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 12, 4, 12),
            Block.makeCuboidShape(4, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(6, 2, 11, 10, 3, 12),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 11),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 11),
            Block.makeCuboidShape(4, 3, 5, 5, 4, 6),
            Block.makeCuboidShape(4, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 12, 4, 12),
            Block.makeCuboidShape(4, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(6, 2, 11, 10, 3, 12),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 11),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 11),
            Block.makeCuboidShape(4, 3, 5, 5, 4, 6),
            Block.makeCuboidShape(4, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 12, 4, 12),
            Block.makeCuboidShape(4, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(6, 2, 11, 10, 3, 12),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

}
