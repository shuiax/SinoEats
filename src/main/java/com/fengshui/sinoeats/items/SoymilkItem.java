package com.fengshui.sinoeats.items;

import com.fengshui.sinoeats.init.ItemList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SoymilkItem extends Item {

    public SoymilkItem(Properties properties) {
        super(properties);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (!worldIn.isRemote){
            if(entityLiving.isPotionActive(Effects.NAUSEA)){
                entityLiving.removePotionEffect(Effects.NAUSEA);
            }
            if(entityLiving.isPotionActive(Effects.HUNGER)){
                entityLiving.removePotionEffect(Effects.HUNGER);
            }
            if(entityLiving.isPotionActive(Effects.SPEED)){
                entityLiving.removePotionEffect(Effects.SPEED);
            }
            if(entityLiving.isPotionActive(Effects.STRENGTH)){
                entityLiving.removePotionEffect(Effects.STRENGTH);
            }
        }
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode){
            ((PlayerEntity) entityLiving).inventory.addItemStackToInventory(new ItemStack(ItemList.CUP.get()));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

}
