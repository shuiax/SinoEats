package com.fengshui.sinoeats.items;

import com.fengshui.sinoeats.init.ItemList;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TeaItem extends Item {

    public TeaItem(Properties properties) {
        super(properties);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (!worldIn.isRemote){
            if(entityLiving.isPotionActive(Effects.SLOWNESS)){
                entityLiving.removePotionEffect(Effects.SLOWNESS);
            }
            if(entityLiving.isPotionActive(Effects.RESISTANCE)){
                entityLiving.removePotionEffect(Effects.RESISTANCE);
            }
            if(entityLiving.isPotionActive(Effects.ABSORPTION)){
                entityLiving.removePotionEffect(Effects.ABSORPTION);
            }
            if(entityLiving.isPotionActive(Effects.POISON)){
                entityLiving.removePotionEffect(Effects.POISON);
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
