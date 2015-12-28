package com.stephenbechard.letsmodreboot.init;

import com.stephenbechard.letsmodreboot.block.BlockFlag;
import com.stephenbechard.letsmodreboot.block.BlockLMRB;
import com.stephenbechard.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Stephen on 12/27/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
