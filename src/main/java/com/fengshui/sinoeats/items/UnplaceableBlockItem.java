package com.fengshui.sinoeats.items;

import com.fengshui.sinoeats.util.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;

public class UnplaceableBlockItem extends BlockItem {

    public UnplaceableBlockItem(Block blockIn, Properties builder) {
        super(blockIn, builder);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) { //doesn't place to keep consistent w/ bowl
        return ActionResultType.PASS;
    }
}
