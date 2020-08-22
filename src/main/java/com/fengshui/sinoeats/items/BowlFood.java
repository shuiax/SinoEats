package com.fengshui.sinoeats.items;

import com.fengshui.sinoeats.init.ItemList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class BowlFood extends Item {
    public BowlFood(Properties properties) {
        super(properties);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode ){
            ((PlayerEntity)entityLiving).inventory.addItemStackToInventory(new ItemStack(Items.BOWL));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

}
