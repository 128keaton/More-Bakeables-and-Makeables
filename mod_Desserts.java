package net.minecraft.src;

import java.util.Random;

import javax.swing.text.TabSet;

import net.minecraft.client.Minecraft;


public class mod_Desserts extends BaseMod
{

	public static final Block BlockBurntCake = (new BlockBurntCake(141, 121)).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("burntcake").disableStats().setRequiresSelfNotify();
	public static final Block BlockMelonCake = (new BlockMelonCake(142, 121)).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("meloncake").disableStats().setRequiresSelfNotify();
	public static final Block OrangeSapling = (new BlockOrangeSapling(143, 0 )).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("sapling").setRequiresSelfNotify();
	public static int BlockBurntCakeSide;
	public static int BlockBurntCakeInside;
	public static int OrangeLogBottom;
	public static int BlockBurntCakeBottom;
	public static int OrangeLogBottom2;
	public static int BlockMelonCakeSide;
	public static int BlockMelonCakeInside;

	public static int BlockMelonCakeBottom;
	public static final Block OrangeLog = (new BlockOrangeLog(139)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("OrangeLog").setRequiresSelfNotify();
	public static final Block OrangeLeaves = (new BlockOrangeLeaves(140,0)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setBlockName("OrangeLeaves").setRequiresSelfNotify();
	public static final Item muffinItem = new ItemFood(4001, 5, 1F, false).setItemName("Raw Muffin");
	public static final Item cookedmuffinItem = new ItemFood(4002, 20, 1F, false).setItemName("Epic Muffin");
	public static final Item cookiedoughItem = new ItemFood(4003, 4, 1F, false).setItemName("Cookie Dough");
	public static final Item cookieItem = new ItemFood(4004, 10, 1F, false).setItemName("Crispy Cookie");
	public static final Item bunItem = new ItemFood(4005, 10, 1F, false).setItemName("Yummy Bun");
	public static final Item muffinpaperItem = new Item(4006).setItemName("Paper Muffin Cup");
	public static final Item doughItem = new ItemFood(4007, 4, 1F, false).setItemName("Dough");
	public static final Item cakedoughItem = new ItemFood(4008, 4, 1F, false).setItemName("Cake Dough");
	public static final Item burntcakeItem = (new ItemReed(4009, mod_Desserts.BlockBurntCake)).setMaxStackSize(1).setIconCoord(13, 1).setItemName("burntcake");
	public static final Item jokebun = new ItemJokeBun(4010, 10, false).setItemName("Joke Bun");
	public static final Item burntcookie = new ItemFood(4011, 10, false).setItemName("Burnt Cookie");
	public static final Item sprinklemuffinItem = new ItemFood(4012, 5, 1F, false).setItemName("Raw Sprinkly Muffin");
	public static final Item cookedsprinklemuffinItem = new ItemFood(4013, 5, 1F, false).setItemName("Sprinkly Muffin :D");
	public static final Item sprinkleItem = new ItemFood(4014, 5, 1F, false).setItemName("Sprinkles");
	public static final Item sprinklecookieItem = new ItemFood(4015, 5, 1F, false).setItemName("Sprinkly Cookie");
	public static final Item meloncake = (new ItemReed(4016, mod_Desserts.BlockMelonCake)).setMaxStackSize(1).setIconCoord(13, 1).setItemName("meloncake");
	public static final Item orangeItem = new ItemFood(4017, 5, 1F, false).setItemName("Juicy Orange");
	public static final Item roastedchicken = new ItemFood(4018, 5, 1F, false).setItemName("Roasted Chicken");
	public static final Item orangejellyItem = new Item(4019).setItemName("Orange Marmalade");
	public static final Item sword = new ItemSOJ(4020, EnumToolMaterial.EMERALD).setItemName("Sword").setTabToDisplayOn(CreativeTabs.tabCombat);
	public static final Item jaffacake = new ItemFood(4021, 4, 1F, false).setItemName("Cake Dough");
	public static final Item brownie = new ItemFood(4022, 5, 1F, false).setItemName("brownie");
	public static final Item ball = new Item(4023).setItemName("ball");
	
	


    
    
public mod_Desserts()
   {
	ModLoader.setInGameHook(this, true, false);
        ModLoader.addName(muffinItem, "Raw Muffin");    
        ModLoader.addName(cookiedoughItem, "Raw Cookie Dough"); 
        ModLoader.addName(doughItem, "Raw Dough"); 
        ModLoader.addName(bunItem, "Bun"); 
        ModLoader.addName(muffinpaperItem, "Muffin Paper"); 
        ModLoader.addName(cookieItem, "Crispy Cookie"); 
        ModLoader.addName(cookedmuffinItem, "Cooked Muffin"); 
        ModLoader.addName(cakedoughItem, "Cake Dough"); 
        ModLoader.addName(burntcakeItem, "Burnt Cake"); 
        ModLoader.addName(jokebun, "Party Bun"); 
    	ModLoader.addName(BlockBurntCake, "Burnt Cake");
    	ModLoader.addName(burntcookie, "Burnt Cookie");
    	ModLoader.addName(sprinklemuffinItem, "Raw Sprinkly Muffin");
    	ModLoader.addName(cookedsprinklemuffinItem, "Sprinkly Muffin :D");
    	ModLoader.addName(sprinkleItem, "Sprinkles");
    	ModLoader.addName(sprinklecookieItem, "Sprinkly Cookie");
    	ModLoader.addName(OrangeLog, "Log of Orange Tree");
    	ModLoader.addName(jaffacake, "Jaffa Cake");
    	ModLoader.addName(OrangeSapling, "Orange Tree Sapling");
    	ModLoader.addName(orangeItem, "Orange");
    	ModLoader.addName(OrangeLeaves, "Leaves O' Orange Tree");
    	ModLoader.addName(orangejellyItem, "Orange Marmalade");
    	ModLoader.addName(sword, "Golden Sword Of Justice");
    	ModLoader.addName(meloncake, "Melon Cake");
    	ModLoader.addName(roastedchicken, "Roasted Chicken");
      	ModLoader.addName(brownie, "Double Choco O' Chocolate Brownie Deluxe");
    	ModLoader.addName(ball, "Choc O' Chocolate Ball");

    	ModLoader.registerBlock(BlockBurntCake);
    	ModLoader.registerBlock(BlockMelonCake);

    	
    	ModLoader.registerBlock(OrangeLog);
    	ModLoader.registerBlock(OrangeLeaves);
    	ModLoader.registerBlock(OrangeSapling);
   } 




public String Version()
{
  return "More Bakeables and Makeables 2.0";
}

public void load()
{
	
	BlockBurntCake.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/food/Cake/Cake.png");
	
	OrangeSapling.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/food/log/sapling.png");
	
	OrangeLog.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/food/log/logside.png");
	
	BlockBurntCakeInside = ModLoader.addOverride("/terrain.png", "/food/Cake/InsideCake.png");
	
	BlockBurntCakeBottom = ModLoader.addOverride("/terrain.png", "/food/Cake/BottomCake.png");
	
	BlockBurntCakeSide = ModLoader.addOverride("/terrain.png", "/food/Cake/SideCake.png");
	
	OrangeLogBottom = ModLoader.addOverride("/terrain.png", "/food/log/logbottom.png");
	
	BlockMelonCakeInside = ModLoader.addOverride("/terrain.png", "/food/Cake/InsideMelonCake.png");
	
	BlockMelonCakeBottom = ModLoader.addOverride("/terrain.png", "/food/Cake/BottomMelonCake.png");
	
	BlockMelonCakeSide = ModLoader.addOverride("/terrain.png", "/food/Cake/SideMelonCake.png");
	
	BlockMelonCake.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/food/Cake/TopMelonCake.png");
	
    muffinItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/RawChocolateMuffin.png");
	  
	  doughItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/Dough.png");
	  
	  cookieItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/Cookie.png");
	  
	  cookiedoughItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/CookieDough.png");
	  
	  muffinpaperItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/Paper.png");
	  
	  cookedmuffinItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/Muffin.png");
	  
	  cakedoughItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/CakeDough.png");
	  
	  burntcakeItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/BurntCake.png");
	  
	  jokebun.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/Partybun.png");
	  
	  sprinklemuffinItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/RawSprinkleMuffin.png");
	  
	  cookedsprinklemuffinItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/SprinkleMuffin.png");
	  
	  sprinkleItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/Sprinkles.png");
	  
	  sprinklecookieItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/SprinklyCookie.png");
	  jaffacake.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/jaffa.png");
	  
	  orangeItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/orange.png");
	  
	  sword.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/sword.png");
	  
	  meloncake.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/Cake/meloncake.png");
	  
	  roastedchicken.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/roastedchicken.png");
	  
	  brownie.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/brownie.png");
	  
	  ball.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/ball.png");
	  
	  orangejellyItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/jelly.png");
	
	
       ModLoader.addShapelessRecipe(new ItemStack(doughItem), new Object[]{
              Item.bucketMilk, Item.wheat, Item.egg, Item.sugar
       });
       
       
       
       ModLoader.addShapelessRecipe(new ItemStack(cookiedoughItem), new Object[]{
         mod_Desserts.doughItem, new ItemStack(Item.dyePowder, 1, 3)
    });
       
       
       
       ModLoader.addRecipe(new ItemStack(muffinpaperItem), new Object[]{
           "   ", "# #", " # ", Character.valueOf('#'), Item.paper
    });
       
       
       
       ModLoader.addRecipe(new ItemStack(muffinItem), new Object[]{
           " D ", " # ", "   ", Character.valueOf('#'), mod_Desserts.muffinpaperItem, Character.valueOf('D'), mod_Desserts.cookiedoughItem
    });
       
       ModLoader.addRecipe(new ItemStack(Block.planks, 4), new Object[]{
           "D", Character.valueOf('D'), OrangeLog
    });
       
       
       
  
       ModLoader.addShapelessRecipe(new ItemStack(cakedoughItem), new Object[]{
           mod_Desserts.doughItem, new ItemStack(Item.dyePowder, 1, 3), Item.bucketMilk, Item.wheat
    });
       
       
       
       
       ModLoader.addShapelessRecipe(new ItemStack(jokebun), new Object[]{
          mod_Desserts.bunItem, Block.tnt
    });
       
       
       
       
       ModLoader.addShapelessRecipe(new ItemStack(sprinkleItem), new Object[]{
           Item.seeds, Item.sugar
     });
       
       ModLoader.addShapelessRecipe(new ItemStack(orangejellyItem), new Object[]{
           orangeItem, Item.sugar
     });
       
       
       
       
       ModLoader.addShapelessRecipe(new ItemStack(sprinklecookieItem), new Object[]{
           sprinkleItem, Item.cookie
     });
       
       
       
       
       ModLoader.addRecipe(new ItemStack(sprinklemuffinItem), new Object[]{
           " S ", " D ", " # ", Character.valueOf('#'), mod_Desserts.muffinpaperItem, Character.valueOf('D'), mod_Desserts.cookiedoughItem,  Character.valueOf('S'), sprinkleItem
    });
       
       
       
       ModLoader.addRecipe(new ItemStack(jaffacake), new Object[]{
           "CCC", "COC", "SSS", Character.valueOf('C'),new ItemStack(Item.dyePowder, 1, 3), Character.valueOf('O'), mod_Desserts.orangejellyItem,  Character.valueOf('S'), doughItem
    });
       
       
       
       ModLoader.addRecipe(new ItemStack(sword), new Object[]{
           " D ", " G ", " S ", Character.valueOf('D'),Item.diamond, Character.valueOf('G'), Item.ingotGold,  Character.valueOf('S'), Item.stick
    });
       
       
       
       
       ModLoader.addRecipe(new ItemStack(meloncake), new Object[]{
           "CCC", "COC", "CCC", Character.valueOf('C'),cakedoughItem, Character.valueOf('O'), Block.melon, 
    });
       
       
       
       
       
       
       ModLoader.addRecipe(new ItemStack(brownie), new Object[]{
           "   ", "CCC", "BBB", Character.valueOf('C'), new ItemStack(Item.dyePowder, 1, 3), Character.valueOf('B'), ball,
    });
       
       
       
       ModLoader.addRecipe(new ItemStack(ball), new Object[]{
           " B ", "B B", " B ", Character.valueOf('B'),new ItemStack(Item.dyePowder, 1, 3), 
    });
       
       
       
       
       ModLoader.addSmelting(OrangeLog.blockID, new ItemStack(Item.coal, 1, 1), 0.1F);
       
       ModLoader.addSmelting(cookiedoughItem.shiftedIndex, new ItemStack(Item.cookie, 1), 0); 
       
       ModLoader.addSmelting(doughItem.shiftedIndex, new ItemStack(mod_Desserts.bunItem, 1), 0); 
       
       ModLoader.addSmelting(Item.cookie.shiftedIndex, new ItemStack(mod_Desserts.cookieItem, 1), 0);
       
       ModLoader.addSmelting(muffinItem.shiftedIndex, new ItemStack(mod_Desserts.cookedmuffinItem, 1), 0);
       
       ModLoader.addSmelting(cakedoughItem.shiftedIndex, new ItemStack(Item.cake, 1), 0);
       
       ModLoader.addSmelting(Item.cake.shiftedIndex, new ItemStack(burntcakeItem, 1), 0);
       
       
       ModLoader.addSmelting(mod_Desserts.cookieItem.shiftedIndex, new ItemStack(burntcookie, 1), 0);
       
       ModLoader.addSmelting(mod_Desserts.sprinklemuffinItem.shiftedIndex, new ItemStack(cookedsprinklemuffinItem, 1), 0);
       
       ModLoader.addSmelting(Item.chickenCooked.shiftedIndex, new ItemStack(roastedchicken, 1), 0);
}

public void generateSurface(World world, Random rand, int baseX, int baseZ)
{
  BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(baseX, baseZ);
  if((biome instanceof BiomeGenPlains) || (biome instanceof BiomeGenForest) || (biome instanceof BiomeGenHills))
  {
 for (int x = 0; x < 1; x++)
 {
   int Xcoord = baseX + rand.nextInt(16);
   int Zcoord = baseZ + rand.nextInt(16);
   int i = world.getHeightValue(Xcoord, Zcoord);
   new WorldGenOrangeTrees(true).generate(world, rand, Xcoord, i, Zcoord);
  }
}
}

public boolean onTickInGame(float f, Minecraft minecraft)
{
        if (ItemSOJ.counter > 0)
        {
                 ItemSOJ.counter --;
        }  
        return true;
}

@Override
public String getVersion() {
	// TODO Auto-generated method stub
	 return "More Bakeables and Makeables 2.0";
}




}
