package com.fengshui.sinoeats;

import com.fengshui.sinoeats.client.RenderTomatoFactory;
import com.fengshui.sinoeats.init.BlockList;
import com.fengshui.sinoeats.init.EntityList;
import com.fengshui.sinoeats.init.ItemList;
import net.minecraft.block.ComposterBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main{
    public static Main instance;
    public static final String MOD_ID = "sinoeats";
    public static final ItemGroup TAB = new Main.ModItemGroup("mod_group");
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ItemList.ITEMS.register(modEventBus);
        BlockList.BLOCKS.register(modEventBus);
        EntityList.ENTITY_TYPES.register(modEventBus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        compostInit();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockList.RICE_CROP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.PEPPER_CROP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.TEA_CROP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.SOYBEAN_CROP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.TOMATO_CROP.get(), RenderType.getCutout());
        RenderingRegistry.registerEntityRenderingHandler(EntityList.TOMATO.get(), new RenderTomatoFactory());
    }

    private void compostInit(){
        ComposterBlock.CHANCES.put(ItemList.TOMATO.get(), 0.65F);
        ComposterBlock.CHANCES.put(ItemList.PEPPER.get(), 0.65F);
        ComposterBlock.CHANCES.put(ItemList.TEA_LEAF.get(), 0.5F);
        ComposterBlock.CHANCES.put(ItemList.TOMATO_SEEDS.get(), 0.3F);
        ComposterBlock.CHANCES.put(ItemList.RICE_SEEDS.get(), 0.3F);
        ComposterBlock.CHANCES.put(ItemList.PEPPER_SEEDS.get(), 0.3F);
        ComposterBlock.CHANCES.put(ItemList.TEA_SEEDS.get(), 0.3F);
        ComposterBlock.CHANCES.put(ItemList.SOYBEAN_SEEDS.get(), 0.3F);
    }

    public static class ModItemGroup extends ItemGroup {

        public ModItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemList.RICE.get());
        }

    }

}
