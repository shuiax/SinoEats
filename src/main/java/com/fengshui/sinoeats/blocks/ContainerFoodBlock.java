package com.fengshui.sinoeats.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.stream.Stream;

public class ContainerFoodBlock extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    private VoxelShape[] shapes;
    private Block containerBlock;

    public ContainerFoodBlock(Properties properties, Block containerBlock, VoxelShape[] shapes) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        this.containerBlock = containerBlock;
        this.shapes = shapes;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            default:
                return shapes[0];
            case WEST:
                return shapes[1];
            case SOUTH:
                return shapes[2];
            case EAST:
                return shapes[3];
        }
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

    @Override //try to reduce number of particles?? there seems to be so much???
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        Item item = state.getBlock().asItem();
        Food food = item.getFood();
        if (food == null) {
            return ActionResultType.PASS;
        }
        ItemStack itemStack = new ItemStack(item);

        if (player.canEat(food.canEatWhenFull()) || player.isCreative()) {
            if(food.isFastEating()){}
            if (!itemStack.isEmpty() && player.isHandActive()) {
                int useDuration = itemStack.getUseDuration(); //try to make it take time to eat
                if (itemStack.getUseAction() == UseAction.DRINK) {
                    player.playSound(SoundEvents.ENTITY_GENERIC_DRINK, 0.5F, player.world.rand.nextFloat() * 0.1F + 0.9F);
                }
                if (itemStack.getUseAction() == UseAction.EAT) {
                    this.addItemParticles(itemStack, 1, player);
                    player.playSound(SoundEvents.ENTITY_GENERIC_EAT, 0.5F + 0.5F * (float) player.world.rand.nextInt(2), (player.world.rand.nextFloat() - player.world.rand.nextFloat()) * 0.2F + 1.0F);
                }
            }
            itemStack.onItemUseFinish(worldIn, player);
            player.onFoodEaten(worldIn, itemStack);
            state.removedByPlayer(worldIn, pos, player, false, worldIn.getFluidState(pos));
            BlockState bowlState = containerBlock.getDefaultState();
            worldIn.setBlockState(pos, bowlState);
            return ActionResultType.CONSUME;
        }
        return ActionResultType.PASS;
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(state.getBlock().asItem());
    }

    private void addItemParticles(ItemStack stack, int count, PlayerEntity player) { //copied from LivingEntity class
        for(int i = 0; i < count; ++i) {
            Vec3d vec3d = new Vec3d(((double)player.world.rand.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            vec3d = vec3d.rotatePitch(-player.rotationPitch * ((float)Math.PI / 180F));
            vec3d = vec3d.rotateYaw(-player.rotationYaw * ((float)Math.PI / 180F));
            double d0 = (double)(-player.world.rand.nextFloat()) * 0.6D - 0.3D;
            Vec3d vec3d1 = new Vec3d(((double)player.world.rand.nextFloat() - 0.5D) * 0.3D, d0, 0.6D);
            vec3d1 = vec3d1.rotatePitch(-player.rotationPitch * ((float)Math.PI / 180F));
            vec3d1 = vec3d1.rotateYaw(-player.rotationYaw * ((float)Math.PI / 180F));
            vec3d1 = vec3d1.add(player.getPosX(), player.getPosYEye(), player.getPosZ());
            if (player.world instanceof ServerWorld) //Forge: Fix MC-2518 spawnParticle is nooped on server, need to use server specific variant
                ((ServerWorld)player.world).spawnParticle(new ItemParticleData(ParticleTypes.ITEM, stack), vec3d1.x, vec3d1.y, vec3d1.z, 1, vec3d.x, vec3d.y + 0.05D, vec3d.z, 0.0D);
            else
                player.world.addParticle(new ItemParticleData(ParticleTypes.ITEM, stack), vec3d1.x, vec3d1.y, vec3d1.z, vec3d.x, vec3d.y + 0.05D, vec3d.z);
        }

    }


}
