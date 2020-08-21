package com.fengshui.sinoeats.items;

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
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
        if (entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode){
            return itemstack;
        }
        ((PlayerEntity)entityLiving).inventory.addItemStackToInventory(new ItemStack(Items.BOWL));
        return stack;
    }

}
