package com.stephenbechard.letsmodreboot;

import com.stephenbechard.letsmodreboot.handler.ConfigurationHandler;
import com.stephenbechard.letsmodreboot.init.ModBlocks;
import com.stephenbechard.letsmodreboot.init.ModItems;
import com.stephenbechard.letsmodreboot.proxy.IProxy;
import com.stephenbechard.letsmodreboot.reference.Reference;
import com.stephenbechard.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Stephen on 12/26/2015.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    // allows up to call back the Mod by a common Instance Name
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // network handling, mod configurations, items and blocks
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // register gui, crafting recipe
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent even)
    {
        // wrap up remaining items after other mods loads
        LogHelper.info("Post Initialization Complete!");
    }
}
