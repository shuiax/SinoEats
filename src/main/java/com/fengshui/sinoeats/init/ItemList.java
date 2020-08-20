package com.fengshui.sinoeats.init;

import com.fengshui.sinoeats.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> MODDING_TOOL = ITEMS.register("modding_tool",
            () -> new Item(new Item.Properties().group(Main.MOD_TAB)));

    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_crop",
            () -> new BlockItem(BlockList.RICE_CROP.get(),
                    new Item.Properties().group(Main.MOD_TAB)));

}