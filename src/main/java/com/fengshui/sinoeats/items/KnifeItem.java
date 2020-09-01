package com.fengshui.sinoeats.items;

import net.minecraft.item.Item;

public class KnifeItem extends Item {
    public KnifeItem(Properties properties) {
        super(properties);
    }

    //    @Override
//    public ItemStack getContainerItem(ItemStack stack) {
//        stack = stack.copy();
//        stack.setDamage(stack.getDamage()+1);
//        if (stack.getDamage() >= stack.getMaxDamage()) {
//            super.getContainerItem();
//        }
//        return stack;
//    }
}
