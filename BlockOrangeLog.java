package net.minecraft.src;

import java.util.Random;

import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockLeaves, 
//            EntityPlayer

public class BlockOrangeLog extends Block
{
	


	int top = ModLoader.addOverride("/terrain.png", "/food/log/logbottom.png");
	int side = ModLoader.addOverride("/terrain.png", "/food/log/logbottom.png");
	public static Minecraft mc = ModLoader.getMinecraftInstance();
	
    protected 
    BlockOrangeLog(int i)
    {
        super(i, Material.wood);
        
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }

    public int idDropped(int i, Random random, int j, World var1, EntityPlayer entityplayer, int var2, int var3, int var4, int var5, int var6)
    {
    	if (var1.isRemote && entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.axeGold.shiftedIndex)
        {
            entityplayer.addStat(StatList.mineBlockStatArray[this.blockID], 1);
            this.dropBlockAsItem_do(var1, var3, var4, var5, new ItemStack(mod_Desserts.OrangeSapling.blockID, 1, var6 & 3));
        }
    	
    	
    		
        return mod_Desserts.OrangeLog.blockID;
    }

    public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l, int var2, int var3, int var4, int var5, int var6)
    {
    	
    	if (world.isRemote && entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.axeGold.shiftedIndex)
        {
            entityplayer.addStat(StatList.mineBlockStatArray[this.blockID], 1);
            this.dropBlockAsItem_do(world, var3, var4, var5, new ItemStack(mod_Desserts.OrangeSapling.blockID, 1, var6 & 3));
        }
    	
    	
    		
        
        super.harvestBlock(world, entityplayer, i, j, k, l);
    }
    
        
    public int getBlockTextureFromSide(int i)
    {
    	return i == 1 ? mod_Desserts.OrangeLogBottom : (i == 0 ? mod_Desserts.OrangeLogBottom : (mod_Desserts.OrangeLog.blockIndexInTexture));
    }
    
    public void onBlockRemoval(World var1, int var2, int var3, int var4, EntityPlayer entityplayer) {
        byte var5 = 4;
        int var6 = var5 + 1;
        if (var1.isRemote && entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.axeGold.shiftedIndex)
        {
            entityplayer.addStat(StatList.mineBlockStatArray[this.blockID], 1);
            this.dropBlockAsItem_do(var1, var3, var4, var5, new ItemStack(mod_Desserts.OrangeSapling.blockID, 1, var6 & 3));
        }
        if(var1.checkChunksExist(var2 - var6, var3 - var6, var4 - var6, var2 + var6, var3 + var6, var4 + var6)) {
           for(int var7 = -var5; var7 <= var5; ++var7) {
              for(int var8 = -var5; var8 <= var5; ++var8) {
                 for(int var9 = -var5; var9 <= var5; ++var9) {
                    int var10 = var1.getBlockId(var2 + var7, var3 + var8, var4 + var9);
                    if(var10 == mod_Desserts.OrangeLeaves.blockID) {
                       int var11 = var1.getBlockMetadata(var2 + var7, var3 + var8, var4 + var9);
                       if((var11 & 8) == 0) {
                          var1.setBlockMetadata(var2 + var7, var3 + var8, var4 + var9, var11 | 8);
                       }
                    }
                 }
              }
           }
        }

     }
   
}