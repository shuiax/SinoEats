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

    public static final RegistryObject<Block> RICE_CROP = BLOCKS.register("rice_crop",
            () -> new RiceCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> PEPPER_CROP = BLOCKS.register("pepper_crop",
            () -> new PepperCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> TEA_CROP = BLOCKS.register("tea_crop",
            () -> new TeaCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> SOYBEAN_CROP = BLOCKS.register("soybean_crop",
            () -> new SoybeanCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop",
            () -> new TomatoCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    //grass, where seeds come from
    public static final RegistryObject<Block> WILD_PLANT = BLOCKS.register("wild_plant",
            () -> new WildPlantBushBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

    //bowl state
    public static final RegistryObject<Block> BOWL_BLOCK = BLOCKS.register("bowl_block",
            () -> new BowlBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)));

    //consumables
    public static final RegistryObject<Block> RICE_BLOCK = BLOCKS.register("rice_block",
            () -> new RiceBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(1f, 2.0f)
                    .sound(SoundType.CLOTH)));

}
