package com.fengshui.sinoeats.items;

import com.fengshui.sinoeats.init.ItemList;
import com.fengshui.sinoeats.util.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockContainerFood extends BlockItem {
    private IItemProvider containerItem;
    private boolean negatesEffects;
    private Effect[] effectList;
    private boolean placed;

    public BlockContainerFood(Block blockIn, Properties builder, IItemProvider containerItem, boolean negatesEffects, Effect[] effectList) {
        super(blockIn, builder);
        this.containerItem = containerItem;
        this.negatesEffects = negatesEffects;
        if(negatesEffects){
            this.effectList = effectList;
        }
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        if(KeyboardHelper.isHoldingShift()){
            return super.onItemUse(context);
        }
        return ActionResult.resultConsume(this).getType();
    }

    @Override
    protected boolean onBlockPlaced(BlockPos pos, World worldIn, @Nullable PlayerEntity player, ItemStack stack, BlockState state) {
        placed = true;
        return super.onBlockPlaced(pos, worldIn, player, stack, state);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if(negatesEffects && !worldIn.isRemote()){
            for(int i = 0; i < effectList.length; i++){
                if(entityLiving.isPotionActive(effectList[i])){
                    entityLiving.removePotionEffect(effectList[i]);
                }
            }
        }
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode && !placed){
            ((PlayerEntity)entityLiving).inventory.addItemStackToInventory(new ItemStack(containerItem));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        if(containerItem.equals(ItemList.CUP.get())) return stack.getItem().isFood() ? UseAction.DRINK : UseAction.NONE;
        return stack.getItem().isFood() ? UseAction.EAT : UseAction.NONE;
    }
}
