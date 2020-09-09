package com.fengshui.sinoeats.blocks.voxelshapes;

import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.stream.Stream;

public class ContainerBlockShapes {

    public static final VoxelShape BOWL_SHAPE = Stream.of(
            Block.makeCuboidShape(3, 0, 3, 13, 4, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape CUP_SHAPE = Stream.of(
            Block.makeCuboidShape(6.5, 0, 6.5, 9.5, 4, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape PLATE_SHAPE = Stream.of(
            Block.makeCuboidShape(2, 0, 2, 14, 1.8, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

}
