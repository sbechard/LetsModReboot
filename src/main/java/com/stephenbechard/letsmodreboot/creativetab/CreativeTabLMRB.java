package com.stephenbechard.letsmodreboot.creativetab;

import com.stephenbechard.letsmodreboot.init.ModItems;
import com.stephenbechard.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Stephen on 12/27/2015.
 */
public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleleaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Let's Mod Reboot";
        }
    };
}
