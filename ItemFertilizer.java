package net.minecraft.src;
public class ItemFertilizer extends Item
{
public ItemFertilizer(int x)
{
super(x);
setMaxStackSize(1);
this.setTabToDisplayOn(CreativeTabs.tabMaterials);
}


public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
{
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6))
        {
                return false;
        }
        if (par3World.getBlockId(par4, par5, par6) == mod_Desserts.OrangeSapling.blockID)
        {
                if (!par3World.isRemote)
                {
                        ((BlockOrangeSapling)mod_Desserts.OrangeSapling).growTree(par3World, par4, par5, par6, par3World.rand);
                        par1ItemStack.stackSize--;
                }
                return true;
        }
        return false;
}

}