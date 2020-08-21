package com.fengshui.sinoeats.init;

import com.fengshui.sinoeats.Main;
import com.fengshui.sinoeats.blocks.RiceCropsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3.0f)));

    public static final DeferredRegister<Block> NO_ITEM_BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> RICE_CROP = NO_ITEM_BLOCKS.register("rice_crop",
            () -> new RiceCropsBlock(Block.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
}
