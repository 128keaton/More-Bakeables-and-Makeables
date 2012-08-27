package net.minecraft.src;
import net.minecraft.client.Minecraft;
import java.util.Random;

public class mod_Bakery extends BaseMod
{

	public static final Item fertilizer = (new ItemFertilizer(4024)).setItemName("bonemeal");

public String Version()
{
  return "More Bakeables and Makeables 2.0";
}

@Override
public String getVersion() {
	
	return "More Bakeables and Makeables 2.0";
}
public void generateSurface(World world, Random rand, int y, int z)
{
 
  for(int a= 0; a < 5; a++)//for each individual structure you would need one of these
  {
   int randPosX = y + rand.nextInt(10); //just the seed coordinates for the tower
   int randPosY = rand.nextInt(90);
   int randPosZ = z + rand.nextInt(10);
   (new WorldGenBakery()).generate(world, rand, randPosX, randPosY, randPosZ);
  }
}
protected Minecraft mc;
private World world;
private static int create = 0;

public void load() {
	mc = ModLoader.getMinecraftInstance();
	  ModLoader.setInGameHook(this, true, false);
	
	ModLoader.addName(fertilizer, "WonderGro Fertilizer");
fertilizer.iconIndex = ModLoader.addOverride("/gui/items.png", "/food/fertilizer.png");
	  
}


}
