package com.fengshui.sinoeats.init;

import com.fengshui.sinoeats.Main;
import com.fengshui.sinoeats.blocks.*;
import com.fengshui.sinoeats.blocks.voxelshapes.ContainerFoodBlockShapes;
import com.fengshui.sinoeats.blocks.voxelshapes.CropsBlockShapes;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> RICE_CROP = BLOCKS.register("rice_crop",
            () -> new ModCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT), CropsBlockShapes.RICE_SHAPE));

    public static final RegistryObject<Block> PEPPER_CROP = BLOCKS.register("pepper_crop",
            () -> new ModCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT), CropsBlockShapes.PEPPER_SHAPE));

    public static final RegistryObject<Block> TEA_CROP = BLOCKS.register("tea_crop",
            () -> new ModCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT), CropsBlockShapes.TEA_SHAPE));

    public static final RegistryObject<Block> SOYBEAN_CROP = BLOCKS.register("soybean_crop",
            () -> new ModCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT), CropsBlockShapes.SOYBEAN_SHAPE));

    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop",
            () -> new ModCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT), CropsBlockShapes.TOMATO_SHAPE));

    //container blocks
    public static final RegistryObject<Block> BOWL_BLOCK = BLOCKS.register("bowl_block",
            () -> new BowlBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)));

    public static final RegistryObject<Block> CUP_BLOCK = BLOCKS.register("cup",
            () -> new CupBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5f, 2.0f)));

    public static final RegistryObject<Block> PORCELAIN_PLATE_BLOCK = BLOCKS.register("porcelain_plate",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f, 2.0f)));

    //placeable consumables

    public static final RegistryObject<Block> TEA_BLOCK = BLOCKS.register("tea",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5f, 2.0f),
                    CUP_BLOCK.get(), ContainerFoodBlockShapes.TEA_SHAPES));

    public static final RegistryObject<Block> SOYMILK_BLOCK = BLOCKS.register("soymilk",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5f, 2.0f),
                    CUP_BLOCK.get(), ContainerFoodBlockShapes.SOYMILK_SHAPES));

    public static final RegistryObject<Block> RICE_BLOCK = BLOCKS.register("rice",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)
                    , BOWL_BLOCK.get(), ContainerFoodBlockShapes.RICE_SHAPES));

    public static final RegistryObject<Block> CONGEE_BLOCK = BLOCKS.register("congee",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)
                    , BOWL_BLOCK.get(), ContainerFoodBlockShapes.CONGEE_SHAPES));

    public static final RegistryObject<Block> EGG_RICE_BLOCK = BLOCKS.register("egg_rice",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)
                    , BOWL_BLOCK.get(), ContainerFoodBlockShapes.EGG_RICE_SHAPES));

    public static final RegistryObject<Block> TOMATO_EGG_RICE_BLOCK = BLOCKS.register("tomato_egg_rice",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)
                    , BOWL_BLOCK.get(), ContainerFoodBlockShapes.TOMATO_EGG_RICE_SHAPES));

    public static final RegistryObject<Block> TOMATO_SOUP_BLOCK = BLOCKS.register("tomato_soup",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)
                    , BOWL_BLOCK.get(), ContainerFoodBlockShapes.TOMATO_SOUP_SHAPES));

    public static final RegistryObject<Block> MAPO_TOFU_BLOCK = BLOCKS.register("mapo_tofu",
            () -> new ContainerFoodBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1f, 2.0f)
                    , PORCELAIN_PLATE_BLOCK.get(), ContainerFoodBlockShapes.TOMATO_SOUP_SHAPES));
}
