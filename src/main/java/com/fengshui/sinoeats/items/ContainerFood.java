package com.fengshui.sinoeats.items;

import com.fengshui.sinoeats.init.BlockList;
import com.fengshui.sinoeats.init.ItemList;
import com.fengshui.sinoeats.util.KeyboardHelper;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class ContainerFood extends Item {
    private IItemProvider containerItem;
    private boolean negatesEffects;
    private Effect[] effectList;

    public ContainerFood(Properties properties, IItemProvider containerItem, boolean negatesEffects, Effect[] effectList) {
        super(properties);
        this.containerItem = containerItem;
        this.negatesEffects = negatesEffects;
        if(negatesEffects){
            this.effectList = effectList;
        }
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if(negatesEffects && !worldIn.isRemote()){
            for(int i = 0; i < effectList.length; i++){
                if(entityLiving.isPotionActive(effectList[i])){
                    entityLiving.removePotionEffect(effectList[i]);
                }
            }
        }
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode ){
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
