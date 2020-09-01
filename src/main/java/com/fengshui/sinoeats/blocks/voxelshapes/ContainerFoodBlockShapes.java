package com.fengshui.sinoeats.blocks.voxelshapes;

import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.stream.Stream;

public class ContainerFoodBlockShapes { //referenced from BlockList, used in ContainerFoodBlock

    private static final VoxelShape RICE_SHAPE = Stream.of(
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(6, 2, 11, 11, 3, 12),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 12),
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(5, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(5, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 12),
            Block.makeCuboidShape(10, 3, 11, 11, 4, 12),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(4, 3, 4, 5, 4, 6),
            Block.makeCuboidShape(5, 4, 10, 11, 4.75, 11),
            Block.makeCuboidShape(5, 4, 5, 11, 4.75, 6),
            Block.makeCuboidShape(6, 4, 4, 10, 4.75, 5),
            Block.makeCuboidShape(6, 4, 11, 10, 4.75, 12),
            Block.makeCuboidShape(4, 4, 6, 5, 4.75, 10),
            Block.makeCuboidShape(11, 4, 6, 12, 4.75, 10),
            Block.makeCuboidShape(10, 4.75, 6, 11, 5.25, 10),
            Block.makeCuboidShape(5, 4.75, 6, 6, 5.25, 10),
            Block.makeCuboidShape(6, 4.75, 5, 10, 5.25, 6),
            Block.makeCuboidShape(6, 4.75, 10, 10, 5.25, 11),
            Block.makeCuboidShape(6, 5.25, 6, 10, 5.65, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] RICE_SHAPES = new VoxelShape[]{RICE_SHAPE, RICE_SHAPE, RICE_SHAPE, RICE_SHAPE};

    private static final VoxelShape TOMATO_SOUP_SHAPE = Stream.of(
            Block.makeCuboidShape(5, 3, 8, 11, 3.5, 11),
            Block.makeCuboidShape(5, 3, 5, 11, 3.5, 8),
            Block.makeCuboidShape(6, 3, 4, 10, 3.5, 5),
            Block.makeCuboidShape(6, 3, 11, 10, 3.5, 12),
            Block.makeCuboidShape(4, 3, 6, 5, 3.5, 10),
            Block.makeCuboidShape(11, 3, 6, 12, 3.5, 10),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(6, 2, 11, 11, 3, 12),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 12),
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(5, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 11, 4, 12),
            Block.makeCuboidShape(5, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 12),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(4, 3, 4, 5, 4, 6)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] TOMATO_SOUP_SHAPES = new VoxelShape[]{TOMATO_SOUP_SHAPE, TOMATO_SOUP_SHAPE, TOMATO_SOUP_SHAPE, TOMATO_SOUP_SHAPE};


    public static final VoxelShape TEA_SHAPE = Stream.of(
            Block.makeCuboidShape(8.9, 0, 7.4, 9.200000000000001, 0.5, 8.6),
            Block.makeCuboidShape(7.4, 0, 6.799999999999999, 8.6, 0.5, 7.1),
            Block.makeCuboidShape(7.4, 0, 8.9, 8.6, 0.5, 9.200000000000001),
            Block.makeCuboidShape(6.799999999999999, 0, 7.4, 7.1, 0.5, 8.6),
            Block.makeCuboidShape(7.1, 0, 7.1, 8.9, 0.5, 8.9),
            Block.makeCuboidShape(6.800000000000001, 0, 8.600000000000001, 7.1, 4, 9.2),
            Block.makeCuboidShape(8.600000000000001, 0, 8.9, 9.2, 4, 9.2),
            Block.makeCuboidShape(8.9, 0, 6.800000000000001, 9.2, 4, 7.399999999999999),
            Block.makeCuboidShape(6.8, 0, 6.8, 7.3999999999999995, 4, 7.1),
            Block.makeCuboidShape(7.1, 0, 8.899999999999999, 7.399999999999999, 4, 9.2),
            Block.makeCuboidShape(8.899999999999999, 0, 8.600000000000001, 9.2, 4, 8.9),
            Block.makeCuboidShape(8.600000000000001, 0, 6.800000000000001, 8.9, 4, 7.100000000000001),
            Block.makeCuboidShape(6.8, 0, 7.1, 7.1000000000000005, 4, 7.399999999999999),
            Block.makeCuboidShape(7.1, 0, 6.5, 8.9, 4, 6.800000000000001),
            Block.makeCuboidShape(6.5, 0, 7.1, 6.800000000000001, 4, 8.9),
            Block.makeCuboidShape(7.1, 0, 9.2, 8.9, 4, 9.5),
            Block.makeCuboidShape(9.2, 0, 7.1, 9.5, 4, 8.9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] TEA_SHAPES = new VoxelShape[]{TEA_SHAPE, TEA_SHAPE, TEA_SHAPE, TEA_SHAPE};

    public static final VoxelShape SOYMILK_SHAPE = Stream.of(
            Block.makeCuboidShape(6.8, 0.5, 7.4, 7.1000000000000005, 3.5, 8.6),
            Block.makeCuboidShape(7.1, 0.5, 7.1, 7.4, 3.5, 8.9),
            Block.makeCuboidShape(7.4, 0.5, 6.800000000000001, 8.6, 3.5, 9.200000000000001),
            Block.makeCuboidShape(8.6, 0.5, 7.1, 8.9, 3.5, 8.9),
            Block.makeCuboidShape(8.9, 0.5, 7.4, 9.200000000000001, 3.5, 8.6),
            Block.makeCuboidShape(8.9, 0, 7.4, 9.200000000000001, 0.5, 8.6),
            Block.makeCuboidShape(7.4, 0, 6.799999999999999, 8.6, 0.5, 7.1),
            Block.makeCuboidShape(7.4, 0, 8.9, 8.6, 0.5, 9.200000000000001),
            Block.makeCuboidShape(6.799999999999999, 0, 7.4, 7.1, 0.5, 8.6),
            Block.makeCuboidShape(7.1, 0, 7.1, 8.9, 0.5, 8.9),
            Block.makeCuboidShape(6.800000000000001, 0, 8.600000000000001, 7.1, 4, 9.2),
            Block.makeCuboidShape(8.600000000000001, 0, 8.9, 9.2, 4, 9.2),
            Block.makeCuboidShape(8.9, 0, 6.800000000000001, 9.2, 4, 7.399999999999999),
            Block.makeCuboidShape(6.8, 0, 6.8, 7.3999999999999995, 4, 7.1),
            Block.makeCuboidShape(7.1, 0, 8.899999999999999, 7.399999999999999, 4, 9.2),
            Block.makeCuboidShape(8.899999999999999, 0, 8.600000000000001, 9.2, 4, 8.9),
            Block.makeCuboidShape(8.600000000000001, 0, 6.800000000000001, 8.9, 4, 7.100000000000001),
            Block.makeCuboidShape(6.8, 0, 7.1, 7.1000000000000005, 4, 7.399999999999999),
            Block.makeCuboidShape(7.1, 0, 6.5, 8.9, 4, 6.800000000000001),
            Block.makeCuboidShape(6.5, 0, 7.1, 6.800000000000001, 4, 8.9),
            Block.makeCuboidShape(7.1, 0, 9.2, 8.9, 4, 9.5),
            Block.makeCuboidShape(9.2, 0, 7.1, 9.5, 4, 8.9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] SOYMILK_SHAPES = new VoxelShape[]{SOYMILK_SHAPE, SOYMILK_SHAPE, SOYMILK_SHAPE, SOYMILK_SHAPE};

    public static final VoxelShape CONGEE_SHAPE = Stream.of(
            Block.makeCuboidShape(5, 3, 8, 11, 3.5, 11),
            Block.makeCuboidShape(5, 3, 5, 11, 3.5, 8),
            Block.makeCuboidShape(6, 3, 4, 10, 3.5, 5),
            Block.makeCuboidShape(6, 3, 11, 10, 3.5, 12),
            Block.makeCuboidShape(4, 3, 6, 5, 3.5, 10),
            Block.makeCuboidShape(11, 3, 6, 12, 3.5, 10),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(6, 2, 11, 11, 3, 12),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 12),
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(5, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 11, 4, 12),
            Block.makeCuboidShape(5, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 12),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(4, 3, 4, 5, 4, 6)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] CONGEE_SHAPES = new VoxelShape[]{CONGEE_SHAPE, CONGEE_SHAPE, CONGEE_SHAPE, CONGEE_SHAPE};

    public static final VoxelShape EGG_RICE_SHAPE = Stream.of(
            Block.makeCuboidShape(5, 4, 10, 11, 4.75, 11),
            Block.makeCuboidShape(5, 4, 5, 11, 4.75, 6),
            Block.makeCuboidShape(6, 4, 4, 10, 4.75, 5),
            Block.makeCuboidShape(6, 4, 11, 10, 4.75, 12),
            Block.makeCuboidShape(4, 4, 6, 5, 4.75, 10),
            Block.makeCuboidShape(11, 4, 6, 12, 4.75, 10),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(6, 2, 11, 11, 3, 12),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 12),
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(5, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 11, 4, 12),
            Block.makeCuboidShape(5, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 12),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(4, 3, 4, 5, 4, 6),
            Block.makeCuboidShape(9, 4.3, 3.9000000000000004, 9.75, 4.8, 4.65),
            Block.makeCuboidShape(7, 4.8, 4.9, 8.75, 5.3, 5.65),
            Block.makeCuboidShape(4.95, 4.8, 8.2, 6.15, 5.3, 9.7),
            Block.makeCuboidShape(5.9, 5.25, 6.5, 7.2, 5.75, 7.5),
            Block.makeCuboidShape(7.9, 5.25, 6.9, 8.9, 5.75, 8.3),
            Block.makeCuboidShape(8, 4.75, 11, 9, 4.85, 11.75),
            Block.makeCuboidShape(9.5, 4.75, 10, 10.5, 4.85, 10.75),
            Block.makeCuboidShape(7.25, 5.65, 9, 8.25, 5.75, 9.75),
            Block.makeCuboidShape(10.6, 4.25, 7, 11.35, 5.35, 8.3),
            Block.makeCuboidShape(6, 5.25, 6, 10, 5.65, 10),
            Block.makeCuboidShape(10, 4.75, 6, 11, 5.25, 10),
            Block.makeCuboidShape(5, 4.75, 6, 6, 5.25, 10),
            Block.makeCuboidShape(6, 4.75, 5, 10, 5.25, 6),
            Block.makeCuboidShape(6, 4.75, 10, 10, 5.25, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] EGG_RICE_SHAPES = new VoxelShape[]{EGG_RICE_SHAPE, EGG_RICE_SHAPE, EGG_RICE_SHAPE, EGG_RICE_SHAPE};

    public static final VoxelShape TOMATO_EGG_RICE_SHAPE = Stream.of(
            Block.makeCuboidShape(5, 4, 10, 11, 4.75, 11),
            Block.makeCuboidShape(5, 4, 5, 11, 4.75, 6),
            Block.makeCuboidShape(6, 4, 4, 10, 4.75, 5),
            Block.makeCuboidShape(6, 4, 11, 10, 4.75, 12),
            Block.makeCuboidShape(4, 4, 6, 5, 4.75, 10),
            Block.makeCuboidShape(11, 4, 6, 12, 4.75, 10),
            Block.makeCuboidShape(6.661111111111111, 4.75, 4.222222222222221, 7.661111111111111, 4.85, 4.972222222222221),
            Block.makeCuboidShape(6.911111111111111, 4.8, 10.322222222222221, 8.661111111111111, 5.3, 11.072222222222221),
            Block.makeCuboidShape(4.511111111111111, 4.8, 6.272222222222222, 5.711111111111112, 5.3, 7.772222222222222),
            Block.makeCuboidShape(6.461111111111112, 5.25, 8.472222222222221, 7.761111111111111, 5.75, 9.472222222222221),
            Block.makeCuboidShape(8.761111111111111, 5.25, 6.672222222222221, 10.261111111111111, 5.85, 8.072222222222221),
            Block.makeCuboidShape(9, 4.3, 3.9000000000000004, 9.75, 4.8, 4.65),
            Block.makeCuboidShape(7, 4.8, 4.9, 8.75, 5.3, 5.65),
            Block.makeCuboidShape(4.95, 4.8, 8.2, 6.15, 5.3, 9.7),
            Block.makeCuboidShape(6.9, 5.25, 6.9, 7.9, 5.75, 8.3),
            Block.makeCuboidShape(8, 4.75, 11, 9, 4.85, 11.75),
            Block.makeCuboidShape(9.5, 4.75, 10, 10.5, 4.85, 10.75),
            Block.makeCuboidShape(8.25, 5.65, 9, 9.25, 5.75, 9.75),
            Block.makeCuboidShape(10.6, 4.25, 7, 11.35, 5.35, 8.3),
            Block.makeCuboidShape(6, 5.25, 6, 10, 5.65, 10),
            Block.makeCuboidShape(10, 4.75, 6, 11, 5.25, 10),
            Block.makeCuboidShape(5, 4.75, 6, 6, 5.25, 10),
            Block.makeCuboidShape(6, 4.75, 5, 10, 5.25, 6),
            Block.makeCuboidShape(6, 4.75, 10, 10, 5.25, 11),
            Block.makeCuboidShape(6, 0, 6, 10, 1, 10),
            Block.makeCuboidShape(6, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(6, 1, 5, 10, 2, 6),
            Block.makeCuboidShape(5, 1, 6, 6, 2, 10),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 10),
            Block.makeCuboidShape(10, 2, 10, 11, 3, 11),
            Block.makeCuboidShape(4, 2, 6, 5, 3, 10),
            Block.makeCuboidShape(6, 2, 4, 10, 3, 5),
            Block.makeCuboidShape(11, 2, 6, 12, 3, 10),
            Block.makeCuboidShape(6, 2, 11, 11, 3, 12),
            Block.makeCuboidShape(10, 2, 5, 11, 3, 6),
            Block.makeCuboidShape(5, 2, 5, 6, 3, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 3, 11),
            Block.makeCuboidShape(11, 3, 10, 12, 4, 12),
            Block.makeCuboidShape(6, 3, 3, 10, 4, 4),
            Block.makeCuboidShape(3, 3, 6, 4, 4, 10),
            Block.makeCuboidShape(12, 3, 6, 13, 4, 10),
            Block.makeCuboidShape(6, 3, 12, 10, 4, 13),
            Block.makeCuboidShape(11, 3, 5, 12, 4, 6),
            Block.makeCuboidShape(5, 3, 4, 6, 4, 5),
            Block.makeCuboidShape(10, 3, 11, 11, 4, 12),
            Block.makeCuboidShape(5, 3, 11, 6, 4, 12),
            Block.makeCuboidShape(4, 3, 10, 5, 4, 12),
            Block.makeCuboidShape(10, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(4, 3, 4, 5, 4, 6)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape[] TOMATO_EGG_RICE_SHAPES = new VoxelShape[]{TOMATO_EGG_RICE_SHAPE, TOMATO_EGG_RICE_SHAPE, TOMATO_EGG_RICE_SHAPE, TOMATO_EGG_RICE_SHAPE};

}
