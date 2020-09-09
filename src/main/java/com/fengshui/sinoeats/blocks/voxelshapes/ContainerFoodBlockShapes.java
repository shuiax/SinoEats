package com.fengshui.sinoeats.blocks.voxelshapes;

import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.stream.Stream;

public class ContainerFoodBlockShapes { //referenced from BlockList, used in ContainerFoodBlock

    private static final VoxelShape RICE_SHAPE = Stream.of(
            Block.makeCuboidShape(3, 0, 3, 13, 5.7, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] RICE_SHAPES = new VoxelShape[]{RICE_SHAPE, RICE_SHAPE, RICE_SHAPE, RICE_SHAPE};

    private static final VoxelShape TOMATO_SOUP_SHAPE = Stream.of(
            Block.makeCuboidShape(3, 0, 3, 13, 4, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] TOMATO_SOUP_SHAPES = new VoxelShape[]{TOMATO_SOUP_SHAPE, TOMATO_SOUP_SHAPE, TOMATO_SOUP_SHAPE, TOMATO_SOUP_SHAPE};

    public static final VoxelShape TEA_SHAPE = Stream.of(
            Block.makeCuboidShape(6.5, 0, 6.5, 9.5, 4, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] TEA_SHAPES = new VoxelShape[]{TEA_SHAPE, TEA_SHAPE, TEA_SHAPE, TEA_SHAPE};

    public static final VoxelShape SOYMILK_SHAPE = Stream.of(
            Block.makeCuboidShape(6.5, 0, 6.5, 9.5, 4, 9.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] SOYMILK_SHAPES = new VoxelShape[]{SOYMILK_SHAPE, SOYMILK_SHAPE, SOYMILK_SHAPE, SOYMILK_SHAPE};

    public static final VoxelShape CONGEE_SHAPE = Stream.of(
            Block.makeCuboidShape(3, 0, 3, 13, 4, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] CONGEE_SHAPES = new VoxelShape[]{CONGEE_SHAPE, CONGEE_SHAPE, CONGEE_SHAPE, CONGEE_SHAPE};

    public static final VoxelShape EGG_RICE_SHAPE = Stream.of(
            Block.makeCuboidShape(3, 0, 3, 13, 5.75, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] EGG_RICE_SHAPES = new VoxelShape[]{EGG_RICE_SHAPE, EGG_RICE_SHAPE, EGG_RICE_SHAPE, EGG_RICE_SHAPE};

    public static final VoxelShape TOMATO_EGG_RICE_SHAPE = Stream.of(
            Block.makeCuboidShape(3, 0, 3, 13, 5.85, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] TOMATO_EGG_RICE_SHAPES = new VoxelShape[]{TOMATO_EGG_RICE_SHAPE, TOMATO_EGG_RICE_SHAPE, TOMATO_EGG_RICE_SHAPE, TOMATO_EGG_RICE_SHAPE};

    public static final VoxelShape MAPO_TOFU_SHAPE = Stream.of(
            Block.makeCuboidShape(2, 0, 2, 14, 2.5, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] MAPO_TOFU_SHAPES = new VoxelShape[]{MAPO_TOFU_SHAPE, MAPO_TOFU_SHAPE, MAPO_TOFU_SHAPE, MAPO_TOFU_SHAPE};

}
