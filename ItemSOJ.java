package net.minecraft.src;

public class ItemSOJ extends Item
{
	
	private int weaponDamage;
    private final EnumToolMaterial toolMaterial;
    
    
	public static int counter = 0;
    public ItemSOJ(int i, EnumToolMaterial par2EnumToolMaterial)
    {
                    
    	 super(i);
         this.toolMaterial = par2EnumToolMaterial;
         this.maxStackSize = 1;
         this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
         this.setTabToDisplayOn(CreativeTabs.tabCombat);
         this.weaponDamage = 4 + par2EnumToolMaterial.getDamageVsEntity();
    }
    
    public boolean func_77660_a(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving)
    {
        if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
        {
            par1ItemStack.damageItem(2, par7EntityLiving);
        }

        return true;
    }
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }

    
    public int getDamageVsEntity(Entity par1Entity)
    {
        return this.weaponDamage;
    }
    
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }
    
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block.blockID == Block.web.blockID;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return this.toolMaterial.getEnchantability();
    }

    public String func_77825_f()
    {
        return this.toolMaterial.toString();
    }
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
    
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    	if (itemstack.getItemDamage() == 0 && counter == 0)
        { MovingObjectPosition movingobjectposition = entityplayer.rayTrace(250.0D, 1.0F);
        if(movingobjectposition == null)
        {
                                        return itemstack;
        }
   
        double x = movingobjectposition.blockX + 0.5D;
        double y = movingobjectposition.blockY + 0.5D;
        double z = movingobjectposition.blockZ + 0.5D;
                                    EntityLightningBolt entitybolt = new EntityLightningBolt(world, x, y, z);
                                    world.spawnEntityInWorld(entitybolt);
                                    counter = 5;
                                    
                                                                    itemstack.setItemDamage(0);
                                                                                                    }
                                    return itemstack;
    }
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
                                    if(itemstack.getItemDamage() > 0)
                                    {
                                                                    itemstack.damageItem(-1, (EntityLiving)entity);
                                    }
    }
}
