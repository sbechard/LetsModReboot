package com.stephenbechard.letsmodreboot.block;

import com.stephenbechard.letsmodreboot.creativetab.CreativeTabLMRB;

/**
 * Created by Stephen on 12/27/2015.
 */
public class BlockFlag extends BlockLMRB
{
    public BlockFlag()
    {
        super();
        this.setBlockName("flag");
        this.setBlockTextureName("flag");
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypePiston);
        this.setLightLevel(0.5F);
    }
}
