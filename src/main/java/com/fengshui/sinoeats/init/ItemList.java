package com.fengshui.sinoeats.init;

import com.fengshui.sinoeats.Main;
import com.fengshui.sinoeats.items.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> MODDING_TOOL = ITEMS.register("modding_tool",
            () -> new ModdingToolItem(new Item.Properties().group(Main.TAB)));

    public static final RegistryObject<Item> CUP = ITEMS.register("cup",
            () -> new Item(new Item.Properties().group(Main.TAB)));

    //crops

    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_crop",
            () -> new BlockItem(BlockList.RICE_CROP.get(),
                    new Item.Properties().group(Main.TAB)));

    public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_crop",
            () -> new BlockItem(BlockList.PEPPER_CROP.get(),
                    new Item.Properties().group(Main.TAB)));

    public static final RegistryObject<Item> TEA_SEEDS = ITEMS.register("tea_crop",
            () -> new BlockItem(BlockList.TEA_CROP.get(),
                    new Item.Properties().group(Main.TAB)));
    
    public static final RegistryObject<Item> SOYBEAN_CROP = ITEMS.register("soybean_crop",
            () -> new BlockItem(BlockList.SOYBEAN_CROP.get(),
                    new Item.Properties().group(Main.TAB)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_crop",
            () -> new BlockItem(BlockList.TOMATO_CROP.get(),
                    new Item.Properties().group(Main.TAB)));

    //ingredients
  
    public static final RegistryObject<Item> RAW_RICE = ITEMS.register("raw_rice",
            () -> new Item(new Item.Properties().group(Main.TAB)));

    public static final RegistryObject<Item> TEA_LEAF = ITEMS.register("tea_leaf",
            () -> new Item(new Item.Properties().group(Main.TAB)));

    //consumable products

    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper",
            () -> new Item(new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(1).saturation(0.2f).fastToEat().setAlwaysEdible()
                            .effect(new EffectInstance(Effects.SPEED, 40, 1), 0.7f).build())));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new TomatoItem(new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(4).saturation(3.0f).build())));

    //container foods

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new BlockContainerFood(BlockList.RICE_BLOCK.get(),new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(5).saturation(6f).build()), Items.BOWL, false, null));

    public static final RegistryObject<Item> TEA = ITEMS.register("tea",
            () -> new ContainerFood(new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(2).saturation(7f).fastToEat().setAlwaysEdible().build()), CUP.get(), true,
                    new Effect[]{Effects.SLOWNESS, Effects.RESISTANCE, Effects.ABSORPTION, Effects.POISON, Effects.STRENGTH, Effects.SPEED}));

    public static final RegistryObject<Item> SOYMILK = ITEMS.register("soymilk",
            () -> new ContainerFood(new Item.Properties().group(Main.TAB).containerItem(CUP.get())
                    .food(new Food.Builder().hunger(3).saturation(7f).fastToEat().setAlwaysEdible().build()), CUP.get(), true,
                    new Effect[]{Effects.NAUSEA, Effects.HUNGER, Effects.STRENGTH, Effects.SPEED}));

    //crafted foods

    public static final RegistryObject<Item> TOFU = ITEMS.register("tofu",
            () -> new Item(new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(4).saturation(3.0f).build())));

    public static final RegistryObject<Item> TOMATO_SOUP = ITEMS.register("tomato_soup",
            () -> new ContainerFood(new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(6).saturation(4.0f).build()), Items.BOWL, false, null));

    public static final RegistryObject<Item> FRIED_RICE = ITEMS.register("fried_rice",
            () -> new ContainerFood(new Item.Properties().group(Main.TAB)
                    .food(new Food.Builder().hunger(7).saturation(6f).build()), Items.BOWL, false, null));

    //testing out BowlBlock, remember to delete later
    public static final RegistryObject<Item> BOWL_BLOCK = ITEMS.register("bowl_block",
            () -> new BlockItem(BlockList.BOWL_BLOCK.get(),  new Item.Properties().group(Main.TAB)));

}
