package com.aeternal;

import com.aeternal.blocks.mechanism.TileBlockCreator;
import com.aeternal.proxy.CommonProxy;
import com.aeternal.tabs.TabCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"ALL", "UnnecessaryFullyQualifiedName"})
@Mod.EventBusSubscriber
@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, dependencies = Constants.MOD_DEPS, version = Constants.MOD_VERSION, acceptedMinecraftVersions = "[1.12,1.12.2]")
public final class Core {

    public static final CreativeTabs IUATab = new TabCore(0, "IU:AdditionsTab");

    public static final List<ItemStack> list = new ArrayList<>();

    public static Logger log;
    @SidedProxy(clientSide = "com.aeternal.proxy.ClientProxy", serverSide = "com.aeternal.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance("iuadds")
    public static com.aeternal.Core instance;



    public static ResourceLocation getIdentifier(final String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }

    @Mod.EventHandler
    public void load(final FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        com.aeternal.Core.log = event.getModLog();
        new TileBlockCreator();
    }

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        proxy.init(event);
        //       proxy.registerRecipe();


    }



    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        proxy.postInit(event);

    }
}











