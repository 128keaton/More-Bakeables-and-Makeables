package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.BlockLeavesBase;
import net.minecraft.src.ColorizerFoliage;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.StatList;
import net.minecraft.src.World;

public class BlockOrangeLeaves extends BlockLeavesBase{
	
	int fancy = ModLoader.addOverride("/terrain.png", "/food/log/leaves.png");
	int fast = ModLoader.addOverride("/terrain.png", "/food/log/leaves.png");
	
	   private int baseIndexInPNG;
	   int[] adjacentTreeBlocks;


	   protected BlockOrangeLeaves(int var1, int var2) {
	      super(var1, var2, Material.leaves, false);
	      this.baseIndexInPNG = var2;
	      this.setTickRandomly(true);
	      this.setCreativeTab(CreativeTabs.tabDeco);
	   }

	 /*  public int getBlockColor() {
	      double var1 = 0.5D;
	      double var3 = 1.0D;
	      return ColorizerFoliage.getFoliageColor(var1, var3);
	   }

	   public int getRenderColor(int var1) {
	      return (var1 & 1) == 1?ColorizerFoliage.getFoliageColorPine():((var1 & 2) == 2?ColorizerFoliage.getFoliageColorBirch():ColorizerFoliage.getFoliageColorBasic());
	   }

	   public int colorMultiplier(IBlockAccess var1, int var2, int var3, int var4) {
	      int var5 = var1.getBlockMetadata(var2, var3, var4);
	      return (var5 & 1) == 1?ColorizerFoliage.getFoliageColorPine():((var5 & 2) == 2?ColorizerFoliage.getFoliageColorBirch():var1.getWorldChunkManager().getBiomeGenAt(var2, var4).getFoliageColorAtCoords(var1, var2, var3, var4));
	   }*/

	   public void onBlockRemoval(World var1, int var2, int var3, int var4) {
	      byte var5 = 1;
	      int var6 = var5 + 1;
	      if(var1.checkChunksExist(var2 - var6, var3 - var6, var4 - var6, var2 + var6, var3 + var6, var4 + var6)) {
	         for(int var7 = -var5; var7 <= var5; ++var7) {
	            for(int var8 = -var5; var8 <= var5; ++var8) {
	               for(int var9 = -var5; var9 <= var5; ++var9) {
	                  int var10 = var1.getBlockId(var2 + var7, var3 + var8, var4 + var9);
	                  if(var10 == mod_Desserts.OrangeSapling.blockID) {
	                     int var11 = var1.getBlockMetadata(var2 + var7, var3 + var8, var4 + var9);
	                     var1.setBlockMetadata(var2 + var7, var3 + var8, var4 + var9, var11 | 8);
	                  }
	               }
	            }
	         }
	      }

	   }

	   public void updateTick(World var1, int var2, int var3, int var4, World par1World, int par2, int par3, int par4, Random par5Random, Random var5) {
		   if (!par1World.isRemote) {
	         int var6 = var1.getBlockMetadata(var2, var3, var4);
	         if((var6 & 8) != 0 && (var6 & 4) == 0) {
	            byte var7 = 4;
	            int var8 = var7 + 1;
	            byte var9 = 32;
	            int var10 = var9 * var9;
	            int var11 = var9 / 2;
	            if(this.adjacentTreeBlocks == null) {
	               this.adjacentTreeBlocks = new int[var9 * var9 * var9];
	            }

	            int var12;
	            if(var1.checkChunksExist(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
	               int var13;
	               int var14;
	               int var15;
	               for(var12 = -var7; var12 <= var7; ++var12) {
	                  for(var13 = -var7; var13 <= var7; ++var13) {
	                     for(var14 = -var7; var14 <= var7; ++var14) {
	                        var15 = var1.getBlockId(var2 + var12, var3 + var13, var4 + var14);
	                        if(var15 == mod_Desserts.OrangeLog.blockID) {
	                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
	                        } else if(var15 == mod_Desserts.OrangeLeaves.blockID) {
	                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
	                        } else {
	                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
	                        }
	                     }
	                  }
	               }

	               for(var12 = 1; var12 <= 4; ++var12) {
	                  for(var13 = -var7; var13 <= var7; ++var13) {
	                     for(var14 = -var7; var14 <= var7; ++var14) {
	                        for(var15 = -var7; var15 <= var7; ++var15) {
	                           if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11] == var12 - 1) {
	                              if(this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
	                                 this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
	                              }

	                              if(this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
	                                 this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
	                              }

	                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] == -2) {
	                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] = var12;
	                              }

	                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] == -2) {
	                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] = var12;
	                              }

	                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] == -2) {
	                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] = var12;
	                              }

	                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] == -2) {
	                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] = var12;
	                              }
	                           }
	                        }
	                     }
	                  }
	               }
	            }

	            var12 = this.adjacentTreeBlocks[var11 * var10 + var11 * var9 + var11];
	            if(var12 >= 0) {
	               var1.setBlockMetadata(var2, var3, var4, var6 & -9);
	            } else {
	               this.removeLeaves(var1, var2, var3, var4);
	            }
	         }

	      }
	   }

	   private void removeLeaves(World var1, int var2, int var3, int var4) {
	      this.dropBlockAsItem(var1, var2, var3, var4, var1.getBlockMetadata(var2, var3, var4), 0);
	      var1.setBlockWithNotify(var2, var3, var4, 0);
	   }

	   public int quantityDropped(Random var1) {
	      return var1.nextInt(20) == 0?1:0;
	   }

	   public int idDropped(int var1, Random random, int var3) {
		  if(random.nextInt(3) == 0)
			  return mod_Desserts.orangeItem.shiftedIndex;
		
	      return mod_Desserts.OrangeSapling.blockID;
	   }

	   public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
	    {
	        if (!par1World.isRemote && par2EntityPlayer.getCurrentEquippedItem() != null && par2EntityPlayer.getCurrentEquippedItem().itemID == Item.shears.shiftedIndex)
	        {
	            par2EntityPlayer.addStat(StatList.mineBlockStatArray[this.blockID], 1);
	            this.dropBlockAsItem_do(par1World, par3, par4, par5, new ItemStack(mod_Desserts.orangeItem.shiftedIndex, 1, par6 & 3));
	        }
	        else
	        {
	            super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
	        }
	    }

	   protected int damageDropped(int var1) {
	      return var1 & 3;
	   }

	   /*public boolean isOpaqueCube() {
	      return !this.graphicsLevel;
	   }*/

	   public int getBlockTextureFromSideAndMetadata(int var1, int var2) {
	      
	    	  return fast;
	      
	   }

	   /*public void setGraphicsLevel(boolean var1) {
	      this.graphicsLevel = var1;
	      this.blockIndexInTexture = this.baseIndexInPNG + (var1?0:1);
	   }*/

	   public void onEntityWalking(World var1, int var2, int var3, int var4, Entity var5) {
	      super.onEntityWalking(var1, var2, var3, var4, var5);
	   }
	}
