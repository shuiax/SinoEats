package com.fengshui.sinoeats;

import com.fengshui.sinoeats.init.BlockList;
import com.fengshui.sinoeats.init.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main
{
    public static Main instance;
    public static final String MOD_ID = "sinoeats";
    public static final ItemGroup MOD_TAB = new Main.ModItemGroup("mod_group");
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        instance = this;
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ItemList.ITEMS.register(modEventBus);
        BlockList.BLOCKS.register(modEventBus);
        BlockList.NO_ITEM_BLOCKS.register(modEventBus);
    }

    @SubscribeEvent
    public static void createBlockItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(MOD_TAB);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

    }

    private void setup(final FMLCommonSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockList.RICE_CROP.get(), RenderType.getCutout());
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static class ModItemGroup extends ItemGroup {

        public ModItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemList.MODDING_TOOL.get());
        }

    }

}
