package com.stephenbechard.letsmodreboot.client.gui;

import com.stephenbechard.letsmodreboot.handler.ConfigurationHandler;
import com.stephenbechard.letsmodreboot.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Stephen on 12/26/2015.
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
           new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
           Reference.MOD_ID,
           false,
           false,
           GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
