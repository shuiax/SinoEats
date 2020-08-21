package com.fengshui.sinoeats.init;

import com.fengshui.sinoeats.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> MODDING_TOOL = ITEMS.register("modding_tool",
            () -> new Item(new Item.Properties().group(Main.TAB)));

    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_crop",
            () -> new BlockItem(BlockList.RICE_CROP.get(),
                    new Item.Properties().group(Main.TAB)));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(6).saturation(1.2f).build())));


}
