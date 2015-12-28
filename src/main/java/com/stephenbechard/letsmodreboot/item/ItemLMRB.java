package com.stephenbechard.letsmodreboot.item;

import com.stephenbechard.letsmodreboot.creativetab.CreativeTabLMRB;
import com.stephenbechard.letsmodreboot.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//disabled in 1.8 import net.minecraft.client.renderer.texture.IIconRegister;


/**
 * Created by Stephen on 12/26/2015.
 */
public class ItemLMRB extends Item
{
    public ItemLMRB()
    {
        super();
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    // disabled in 1.8
    // http://forum.feed-the-beast.com/threads/what-happened-to-iiconregister-in-1-8.101830/
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
