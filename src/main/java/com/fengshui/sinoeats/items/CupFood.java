package com.fengshui.sinoeats.items;

import com.fengshui.sinoeats.init.ItemList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class CupFood extends Item {
    public CupFood(Properties properties) {
        super(properties);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
<<<<<<< HEAD
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode){
            ((PlayerEntity) entityLiving).inventory.addItemStackToInventory(new ItemStack(ItemList.CUP.get()));
=======
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode ){
            ((PlayerEntity)entityLiving).inventory.addItemStackToInventory(new ItemStack(ItemList.CUP.get()));
>>>>>>> f123f108fe4bf553e1c7067683f9c315105eb736
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

}
