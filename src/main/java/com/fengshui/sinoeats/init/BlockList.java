package com.fengshui.sinoeats.init;

import com.fengshui.sinoeats.Main;
import com.fengshui.sinoeats.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final DeferredRegister<Block> NO_ITEM_BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> RICE_CROP = NO_ITEM_BLOCKS.register("rice_crop",
            () -> new RiceCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> PEPPER_CROP = NO_ITEM_BLOCKS.register("pepper_crop",
            () -> new PepperCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> TEA_CROP = NO_ITEM_BLOCKS.register("tea_crop",
            () -> new TeaCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> SOYBEAN_CROP = NO_ITEM_BLOCKS.register("soybean_crop",
            () -> new SoybeanCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> TOMATO_CROP = NO_ITEM_BLOCKS.register("tomato_crop",
            () -> new TomatoCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
}
