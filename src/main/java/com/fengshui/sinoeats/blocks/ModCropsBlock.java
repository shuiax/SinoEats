package com.fengshui.sinoeats.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class ModCropsBlock extends CropsBlock {

    private VoxelShape[] shapes;

    public ModCropsBlock(Properties builder, VoxelShape[] shapes) {
        super(builder);
        this.shapes = shapes;
    }

    @Override
    protected IItemProvider getSeedsItem() {
       return this.asItem();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return shapes[state.get(this.getAgeProperty())];
    }

}
