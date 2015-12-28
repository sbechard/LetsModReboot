package com.stephenbechard.letsmodreboot.init;

import com.stephenbechard.letsmodreboot.item.ItemLMRB;
import com.stephenbechard.letsmodreboot.item.ItemMapleLeaf;
import com.stephenbechard.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Stephen on 12/26/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}
