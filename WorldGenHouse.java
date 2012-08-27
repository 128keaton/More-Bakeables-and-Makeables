/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOLv0.1 ***
*/

package net.minecraft.src;
import java.util.Random;

public class WorldGenHouse extends WorldGenerator
{
	public WorldGenHouse() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		int spawnBlockID = 4;
		if(world.getBlockId(i, j, k) != spawnBlockID || world.getBlockId(i, j + 1, k) != 0 || world.getBlockId(i + 12, j, k) != spawnBlockID || world.getBlockId(i + 12, j, k + 12) != spawnBlockID || world.getBlockId(i, j, k + 12) != spawnBlockID || world.getBlockId(i + 12, j + 1, k) != 0 || world.getBlockId(i + 12, j + 1, k + 12) != 0 || world.getBlockId(i, j + 1, k + 12) != 0)
		{
			return false;
		}

		world.setBlock(i + 2, j + 0, k + 4, 4);
		world.setBlock(i + 2, j + 0, k + 5, 4);
		world.setBlock(i + 2, j + 0, k + 6, 4);
		world.setBlock(i + 2, j + 0, k + 7, 4);
		world.setBlock(i + 2, j + 0, k + 8, 4);
		world.setBlock(i + 2, j + 0, k + 9, 4);
		world.setBlock(i + 2, j + 1, k + 4, 17);
		world.setBlockMetadata(i + 2, j + 1, k + 4, 1);
		world.setBlock(i + 2, j + 1, k + 5, 5);
		world.setBlock(i + 2, j + 1, k + 6, 5);
		world.setBlock(i + 2, j + 1, k + 7, 5);
		world.setBlock(i + 2, j + 1, k + 8, 5);
		world.setBlock(i + 2, j + 1, k + 9, 17);
		world.setBlockMetadata(i + 2, j + 1, k + 9, 1);
		world.setBlock(i + 2, j + 2, k + 4, 17);
		world.setBlockMetadata(i + 2, j + 2, k + 4, 1);
		world.setBlock(i + 2, j + 2, k + 5, 5);
		world.setBlock(i + 2, j + 2, k + 6, 5);
		world.setBlock(i + 2, j + 2, k + 7, 5);
		world.setBlock(i + 2, j + 2, k + 8, 5);
		world.setBlock(i + 2, j + 2, k + 9, 17);
		world.setBlockMetadata(i + 2, j + 2, k + 9, 1);
		world.setBlock(i + 2, j + 3, k + 4, 17);
		world.setBlockMetadata(i + 2, j + 3, k + 4, 1);
		world.setBlock(i + 2, j + 3, k + 5, 5);
		world.setBlock(i + 2, j + 3, k + 6, 5);
		world.setBlock(i + 2, j + 3, k + 7, 5);
		world.setBlock(i + 2, j + 3, k + 8, 5);
		world.setBlock(i + 2, j + 3, k + 9, 17);
		world.setBlockMetadata(i + 2, j + 3, k + 9, 1);
		world.setBlock(i + 2, j + 4, k + 4, 17);
		world.setBlockMetadata(i + 2, j + 4, k + 4, 1);
		world.setBlock(i + 2, j + 4, k + 5, 5);
		world.setBlock(i + 2, j + 4, k + 6, 5);
		world.setBlock(i + 2, j + 4, k + 7, 5);
		world.setBlock(i + 2, j + 4, k + 8, 5);
		world.setBlock(i + 2, j + 4, k + 9, 17);
		world.setBlockMetadata(i + 2, j + 4, k + 9, 1);
		world.setBlock(i + 2, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 2, j + 5, k + 2, 2);
		world.setBlock(i + 2, j + 5, k + 3, 5);
		world.setBlock(i + 2, j + 5, k + 4, 17);
		world.setBlockMetadata(i + 2, j + 5, k + 4, 1);
		world.setBlock(i + 2, j + 5, k + 5, 5);
		world.setBlock(i + 2, j + 5, k + 6, 5);
		world.setBlock(i + 2, j + 5, k + 7, 5);
		world.setBlock(i + 2, j + 5, k + 8, 5);
		world.setBlock(i + 2, j + 5, k + 9, 17);
		world.setBlockMetadata(i + 2, j + 5, k + 9, 1);
		world.setBlock(i + 2, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 2, j + 6, k + 3, 2);
		world.setBlock(i + 2, j + 6, k + 4, 17);
		world.setBlockMetadata(i + 2, j + 6, k + 4, 1);
		world.setBlock(i + 2, j + 6, k + 5, 102);
		world.setBlock(i + 2, j + 6, k + 6, 5);
		world.setBlock(i + 2, j + 6, k + 7, 5);
		world.setBlock(i + 2, j + 6, k + 8, 102);
		world.setBlock(i + 2, j + 6, k + 9, 17);
		world.setBlockMetadata(i + 2, j + 6, k + 9, 1);
		world.setBlock(i + 2, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 2, j + 7, k + 4, 2);
		world.setBlock(i + 2, j + 7, k + 5, 5);
		world.setBlock(i + 2, j + 7, k + 6, 5);
		world.setBlock(i + 2, j + 7, k + 7, 5);
		world.setBlock(i + 2, j + 7, k + 8, 5);
		world.setBlock(i + 2, j + 7, k + 9, 53);
		world.setBlockMetadata(i + 2, j + 7, k + 9, 3);
		world.setBlock(i + 2, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 2, j + 8, k + 5, 2);
		world.setBlock(i + 2, j + 8, k + 6, 5);
		world.setBlock(i + 2, j + 8, k + 7, 5);
		world.setBlock(i + 2, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 2, j + 8, k + 8, 3);
		world.setBlock(i + 2, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 2, j + 9, k + 6, 2);
		world.setBlock(i + 2, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 2, j + 9, k + 7, 3);
		world.setBlock(i + 3, j + 0, k + 4, 4);
		world.setBlock(i + 3, j + 0, k + 5, 4);
		world.setBlock(i + 3, j + 0, k + 6, 4);
		world.setBlock(i + 3, j + 0, k + 7, 4);
		world.setBlock(i + 3, j + 0, k + 8, 4);
		world.setBlock(i + 3, j + 0, k + 9, 4);
		world.setBlock(i + 3, j + 1, k + 4, 5);
		world.setBlock(i + 3, j + 1, k + 5, 5);
		world.setBlock(i + 3, j + 1, k + 6, 5);
		world.setBlock(i + 3, j + 1, k + 7, 5);
		world.setBlock(i + 3, j + 1, k + 8, 5);
		world.setBlock(i + 3, j + 1, k + 9, 5);
		world.setBlock(i + 3, j + 2, k + 4, 5);
		world.setBlock(i + 3, j + 2, k + 6, 53);
		world.setBlockMetadata(i + 3, j + 2, k + 6, 2);
		world.setBlock(i + 3, j + 2, k + 7, 5);
		world.setBlock(i + 3, j + 2, k + 8, 5);
		world.setBlock(i + 3, j + 2, k + 9, 5);
		world.setBlock(i + 3, j + 3, k + 4, 5);
		world.setBlock(i + 3, j + 3, k + 7, 53);
		world.setBlockMetadata(i + 3, j + 3, k + 7, 2);
		world.setBlock(i + 3, j + 3, k + 8, 5);
		world.setBlock(i + 3, j + 3, k + 9, 5);
		world.setBlock(i + 3, j + 4, k + 4, 5);
		world.setBlock(i + 3, j + 4, k + 8, 53);
		world.setBlockMetadata(i + 3, j + 4, k + 8, 2);
		world.setBlock(i + 3, j + 4, k + 9, 5);
		world.setBlock(i + 3, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 3, j + 5, k + 2, 2);
		world.setBlock(i + 3, j + 5, k + 3, 5);
		world.setBlock(i + 3, j + 5, k + 9, 5);
		world.setBlock(i + 3, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 3, j + 6, k + 3, 2);
		world.setBlock(i + 3, j + 6, k + 9, 5);
		world.setBlock(i + 3, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 3, j + 7, k + 4, 2);
		world.setBlock(i + 3, j + 7, k + 9, 53);
		world.setBlockMetadata(i + 3, j + 7, k + 9, 3);
		world.setBlock(i + 3, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 3, j + 8, k + 5, 2);
		world.setBlock(i + 3, j + 8, k + 6, 5);
		world.setBlock(i + 3, j + 8, k + 7, 5);
		world.setBlock(i + 3, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 3, j + 8, k + 8, 3);
		world.setBlock(i + 3, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 3, j + 9, k + 6, 2);
		world.setBlock(i + 3, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 3, j + 9, k + 7, 3);
		world.setBlock(i + 4, j + 0, k + 4, 4);
		world.setBlock(i + 4, j + 0, k + 5, 4);
		world.setBlock(i + 4, j + 0, k + 6, 4);
		world.setBlock(i + 4, j + 0, k + 7, 4);
		world.setBlock(i + 4, j + 0, k + 8, 4);
		world.setBlock(i + 4, j + 0, k + 9, 4);
		world.setBlock(i + 4, j + 1, k + 4, 5);
		world.setBlock(i + 4, j + 1, k + 5, 53);
		world.setBlockMetadata(i + 4, j + 1, k + 5, 1);
		world.setBlock(i + 4, j + 1, k + 6, 54);
		world.setBlockMetadata(i + 4, j + 1, k + 6, 5);
		world.setBlock(i + 4, j + 1, k + 7, 58);
		world.setBlock(i + 4, j + 1, k + 8, 61);
		world.setBlockMetadata(i + 4, j + 1, k + 8, 5);
		world.setBlock(i + 4, j + 1, k + 9, 5);
		world.setBlock(i + 4, j + 2, k + 4, 5);
		world.setBlock(i + 4, j + 2, k + 8, 61);
		world.setBlockMetadata(i + 4, j + 2, k + 8, 5);
		world.setBlock(i + 4, j + 2, k + 9, 5);
		world.setBlock(i + 4, j + 3, k + 4, 5);
		world.setBlock(i + 4, j + 3, k + 9, 5);
		world.setBlock(i + 4, j + 4, k + 4, 5);
		world.setBlock(i + 4, j + 4, k + 5, 5);
		world.setBlock(i + 4, j + 4, k + 6, 5);
		world.setBlock(i + 4, j + 4, k + 7, 5);
		world.setBlock(i + 4, j + 4, k + 8, 5);
		world.setBlock(i + 4, j + 4, k + 9, 5);
		world.setBlock(i + 4, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 4, j + 5, k + 2, 2);
		world.setBlock(i + 4, j + 5, k + 3, 5);
		world.setBlock(i + 4, j + 5, k + 4, 85);
		world.setBlock(i + 4, j + 5, k + 5, 85);
		world.setBlock(i + 4, j + 5, k + 6, 85);
		world.setBlock(i + 4, j + 5, k + 7, 85);
		world.setBlock(i + 4, j + 5, k + 9, 5);
		world.setBlock(i + 4, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 4, j + 6, k + 3, 2);
		world.setBlock(i + 4, j + 6, k + 9, 5);
		world.setBlock(i + 4, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 4, j + 7, k + 4, 2);
		world.setBlock(i + 4, j + 7, k + 9, 53);
		world.setBlockMetadata(i + 4, j + 7, k + 9, 3);
		world.setBlock(i + 4, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 4, j + 8, k + 5, 2);
		world.setBlock(i + 4, j + 8, k + 6, 5);
		world.setBlock(i + 4, j + 8, k + 7, 5);
		world.setBlock(i + 4, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 4, j + 8, k + 8, 3);
		world.setBlock(i + 4, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 4, j + 9, k + 6, 2);
		world.setBlock(i + 4, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 4, j + 9, k + 7, 3);
		world.setBlock(i + 5, j + 0, k + 4, 4);
		world.setBlock(i + 5, j + 0, k + 5, 4);
		world.setBlock(i + 5, j + 0, k + 6, 4);
		world.setBlock(i + 5, j + 0, k + 7, 4);
		world.setBlock(i + 5, j + 0, k + 8, 4);
		world.setBlock(i + 5, j + 0, k + 9, 4);
		world.setBlock(i + 5, j + 0, k + 10, 4);
		world.setBlock(i + 5, j + 1, k + 4, 5);
		world.setBlock(i + 5, j + 1, k + 9, 4);
		world.setBlock(i + 5, j + 1, k + 10, 4);
		world.setBlock(i + 5, j + 2, k + 4, 102);
		world.setBlock(i + 5, j + 2, k + 9, 4);
		world.setBlock(i + 5, j + 2, k + 10, 4);
		world.setBlock(i + 5, j + 3, k + 4, 102);
		world.setBlock(i + 5, j + 3, k + 9, 4);
		world.setBlock(i + 5, j + 3, k + 10, 4);
		world.setBlock(i + 5, j + 4, k + 4, 5);
		world.setBlock(i + 5, j + 4, k + 5, 5);
		world.setBlock(i + 5, j + 4, k + 6, 5);
		world.setBlock(i + 5, j + 4, k + 7, 5);
		world.setBlock(i + 5, j + 4, k + 8, 5);
		world.setBlock(i + 5, j + 4, k + 9, 5);
		world.setBlock(i + 5, j + 4, k + 10, 4);
		world.setBlock(i + 5, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 5, j + 5, k + 2, 2);
		world.setBlock(i + 5, j + 5, k + 3, 5);
		world.setBlock(i + 5, j + 5, k + 4, 54);
		world.setBlockMetadata(i + 5, j + 5, k + 4, 3);
		world.setBlock(i + 5, j + 5, k + 9, 5);
		world.setBlock(i + 5, j + 5, k + 10, 4);
		world.setBlock(i + 5, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 5, j + 6, k + 3, 2);
		world.setBlock(i + 5, j + 6, k + 9, 5);
		world.setBlock(i + 5, j + 6, k + 10, 4);
		world.setBlock(i + 5, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 5, j + 7, k + 4, 2);
		world.setBlock(i + 5, j + 7, k + 9, 53);
		world.setBlockMetadata(i + 5, j + 7, k + 9, 3);
		world.setBlock(i + 5, j + 7, k + 10, 4);
		world.setBlock(i + 5, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 5, j + 8, k + 5, 2);
		world.setBlock(i + 5, j + 8, k + 6, 5);
		world.setBlock(i + 5, j + 8, k + 7, 5);
		world.setBlock(i + 5, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 5, j + 8, k + 8, 3);
		world.setBlock(i + 5, j + 8, k + 10, 4);
		world.setBlock(i + 5, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 5, j + 9, k + 6, 2);
		world.setBlock(i + 5, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 5, j + 9, k + 7, 3);
		world.setBlock(i + 5, j + 9, k + 10, 4);
		world.setBlock(i + 6, j + 0, k + 4, 4);
		world.setBlock(i + 6, j + 0, k + 5, 4);
		world.setBlock(i + 6, j + 0, k + 6, 4);
		world.setBlock(i + 6, j + 0, k + 7, 4);
		world.setBlock(i + 6, j + 0, k + 8, 4);
		world.setBlock(i + 6, j + 0, k + 9, 4);
		world.setBlock(i + 6, j + 0, k + 10, 87);
		world.setBlock(i + 6, j + 0, k + 11, 4);
		world.setBlock(i + 6, j + 1, k + 4, 5);
		world.setBlock(i + 6, j + 1, k + 10, 51);
		world.setBlockMetadata(i + 6, j + 1, k + 10, 15);
		world.setBlock(i + 6, j + 1, k + 11, 4);
		world.setBlock(i + 6, j + 2, k + 4, 5);
		world.setBlock(i + 6, j + 2, k + 11, 4);
		world.setBlock(i + 6, j + 3, k + 4, 5);
		world.setBlock(i + 6, j + 3, k + 9, 4);
		world.setBlock(i + 6, j + 3, k + 11, 4);
		world.setBlock(i + 6, j + 4, k + 4, 5);
		world.setBlock(i + 6, j + 4, k + 5, 5);
		world.setBlock(i + 6, j + 4, k + 6, 5);
		world.setBlock(i + 6, j + 4, k + 7, 5);
		world.setBlock(i + 6, j + 4, k + 8, 5);
		world.setBlock(i + 6, j + 4, k + 9, 4);
		world.setBlock(i + 6, j + 4, k + 11, 4);
		world.setBlock(i + 6, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 6, j + 5, k + 2, 2);
		world.setBlock(i + 6, j + 5, k + 3, 5);
		world.setBlock(i + 6, j + 5, k + 4, 54);
		world.setBlockMetadata(i + 6, j + 5, k + 4, 3);
		world.setBlock(i + 6, j + 5, k + 7, 26);
		world.setBlock(i + 6, j + 5, k + 8, 26);
		world.setBlockMetadata(i + 6, j + 5, k + 8, 8);
		world.setBlock(i + 6, j + 5, k + 9, 4);
		world.setBlock(i + 6, j + 5, k + 11, 4);
		world.setBlock(i + 6, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 6, j + 6, k + 3, 2);
		world.setBlock(i + 6, j + 6, k + 9, 4);
		world.setBlock(i + 6, j + 6, k + 11, 4);
		world.setBlock(i + 6, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 6, j + 7, k + 4, 2);
		world.setBlock(i + 6, j + 7, k + 9, 4);
		world.setBlock(i + 6, j + 7, k + 11, 4);
		world.setBlock(i + 6, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 6, j + 8, k + 5, 2);
		world.setBlock(i + 6, j + 8, k + 6, 5);
		world.setBlock(i + 6, j + 8, k + 7, 5);
		world.setBlock(i + 6, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 6, j + 8, k + 8, 3);
		world.setBlock(i + 6, j + 8, k + 9, 4);
		world.setBlock(i + 6, j + 8, k + 11, 4);
		world.setBlock(i + 6, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 6, j + 9, k + 6, 2);
		world.setBlock(i + 6, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 6, j + 9, k + 7, 3);
		world.setBlock(i + 6, j + 9, k + 9, 4);
		world.setBlock(i + 6, j + 9, k + 11, 4);
		world.setBlock(i + 7, j + 0, k + 3, 109);
		world.setBlockMetadata(i + 7, j + 0, k + 3, 2);
		world.setBlock(i + 7, j + 0, k + 4, 4);
		world.setBlock(i + 7, j + 0, k + 5, 4);
		world.setBlock(i + 7, j + 0, k + 6, 4);
		world.setBlock(i + 7, j + 0, k + 7, 4);
		world.setBlock(i + 7, j + 0, k + 8, 4);
		world.setBlock(i + 7, j + 0, k + 9, 4);
		world.setBlock(i + 7, j + 0, k + 10, 87);
		world.setBlock(i + 7, j + 0, k + 11, 4);
		world.setBlock(i + 7, j + 1, k + 10, 51);
		world.setBlockMetadata(i + 7, j + 1, k + 10, 15);
		world.setBlock(i + 7, j + 1, k + 11, 4);
		world.setBlock(i + 7, j + 2, k + 11, 4);
		world.setBlock(i + 7, j + 3, k + 4, 5);
		world.setBlock(i + 7, j + 3, k + 9, 4);
		world.setBlock(i + 7, j + 3, k + 11, 4);
		world.setBlock(i + 7, j + 4, k + 4, 5);
		world.setBlock(i + 7, j + 4, k + 5, 5);
		world.setBlock(i + 7, j + 4, k + 6, 5);
		world.setBlock(i + 7, j + 4, k + 7, 5);
		world.setBlock(i + 7, j + 4, k + 8, 5);
		world.setBlock(i + 7, j + 4, k + 9, 4);
		world.setBlock(i + 7, j + 4, k + 11, 4);
		world.setBlock(i + 7, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 7, j + 5, k + 2, 2);
		world.setBlock(i + 7, j + 5, k + 3, 5);
		world.setBlock(i + 7, j + 5, k + 7, 26);
		world.setBlock(i + 7, j + 5, k + 8, 26);
		world.setBlockMetadata(i + 7, j + 5, k + 8, 8);
		world.setBlock(i + 7, j + 5, k + 9, 4);
		world.setBlock(i + 7, j + 5, k + 11, 4);
		world.setBlock(i + 7, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 7, j + 6, k + 3, 2);
		world.setBlock(i + 7, j + 6, k + 9, 4);
		world.setBlock(i + 7, j + 6, k + 11, 4);
		world.setBlock(i + 7, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 7, j + 7, k + 4, 2);
		world.setBlock(i + 7, j + 7, k + 9, 4);
		world.setBlock(i + 7, j + 7, k + 11, 4);
		world.setBlock(i + 7, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 7, j + 8, k + 5, 2);
		world.setBlock(i + 7, j + 8, k + 6, 5);
		world.setBlock(i + 7, j + 8, k + 7, 5);
		world.setBlock(i + 7, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 7, j + 8, k + 8, 3);
		world.setBlock(i + 7, j + 8, k + 9, 4);
		world.setBlock(i + 7, j + 8, k + 11, 4);
		world.setBlock(i + 7, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 7, j + 9, k + 6, 2);
		world.setBlock(i + 7, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 7, j + 9, k + 7, 3);
		world.setBlock(i + 7, j + 9, k + 9, 4);
		world.setBlock(i + 7, j + 9, k + 11, 4);
		world.setBlock(i + 8, j + 0, k + 4, 4);
		world.setBlock(i + 8, j + 0, k + 5, 4);
		world.setBlock(i + 8, j + 0, k + 6, 4);
		world.setBlock(i + 8, j + 0, k + 7, 4);
		world.setBlock(i + 8, j + 0, k + 8, 4);
		world.setBlock(i + 8, j + 0, k + 9, 4);
		world.setBlock(i + 8, j + 0, k + 10, 4);
		world.setBlock(i + 8, j + 1, k + 4, 5);
		world.setBlock(i + 8, j + 1, k + 6, 54);
		world.setBlockMetadata(i + 8, j + 1, k + 6, 4);
		world.setBlock(i + 8, j + 1, k + 7, 54);
		world.setBlockMetadata(i + 8, j + 1, k + 7, 4);
		world.setBlock(i + 8, j + 1, k + 9, 4);
		world.setBlock(i + 8, j + 1, k + 10, 4);
		world.setBlock(i + 8, j + 2, k + 4, 5);
		world.setBlock(i + 8, j + 2, k + 9, 4);
		world.setBlock(i + 8, j + 2, k + 10, 4);
		world.setBlock(i + 8, j + 3, k + 4, 5);
		world.setBlock(i + 8, j + 3, k + 9, 4);
		world.setBlock(i + 8, j + 3, k + 10, 4);
		world.setBlock(i + 8, j + 4, k + 4, 5);
		world.setBlock(i + 8, j + 4, k + 5, 5);
		world.setBlock(i + 8, j + 4, k + 6, 5);
		world.setBlock(i + 8, j + 4, k + 7, 5);
		world.setBlock(i + 8, j + 4, k + 8, 5);
		world.setBlock(i + 8, j + 4, k + 9, 5);
		world.setBlock(i + 8, j + 4, k + 10, 4);
		world.setBlock(i + 8, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 8, j + 5, k + 2, 2);
		world.setBlock(i + 8, j + 5, k + 3, 5);
		world.setBlock(i + 8, j + 5, k + 9, 5);
		world.setBlock(i + 8, j + 5, k + 10, 4);
		world.setBlock(i + 8, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 8, j + 6, k + 3, 2);
		world.setBlock(i + 8, j + 6, k + 9, 5);
		world.setBlock(i + 8, j + 6, k + 10, 4);
		world.setBlock(i + 8, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 8, j + 7, k + 4, 2);
		world.setBlock(i + 8, j + 7, k + 9, 53);
		world.setBlockMetadata(i + 8, j + 7, k + 9, 3);
		world.setBlock(i + 8, j + 7, k + 10, 4);
		world.setBlock(i + 8, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 8, j + 8, k + 5, 2);
		world.setBlock(i + 8, j + 8, k + 6, 5);
		world.setBlock(i + 8, j + 8, k + 7, 5);
		world.setBlock(i + 8, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 8, j + 8, k + 8, 3);
		world.setBlock(i + 8, j + 8, k + 10, 4);
		world.setBlock(i + 8, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 8, j + 9, k + 6, 2);
		world.setBlock(i + 8, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 8, j + 9, k + 7, 3);
		world.setBlock(i + 8, j + 9, k + 10, 4);
		world.setBlock(i + 9, j + 0, k + 4, 4);
		world.setBlock(i + 9, j + 0, k + 5, 4);
		world.setBlock(i + 9, j + 0, k + 6, 4);
		world.setBlock(i + 9, j + 0, k + 7, 4);
		world.setBlock(i + 9, j + 0, k + 8, 4);
		world.setBlock(i + 9, j + 0, k + 9, 4);
		world.setBlock(i + 9, j + 1, k + 4, 17);
		world.setBlockMetadata(i + 9, j + 1, k + 4, 1);
		world.setBlock(i + 9, j + 1, k + 5, 4);
		world.setBlock(i + 9, j + 1, k + 6, 4);
		world.setBlock(i + 9, j + 1, k + 7, 4);
		world.setBlock(i + 9, j + 1, k + 8, 4);
		world.setBlock(i + 9, j + 1, k + 9, 17);
		world.setBlockMetadata(i + 9, j + 1, k + 9, 1);
		world.setBlock(i + 9, j + 2, k + 4, 17);
		world.setBlockMetadata(i + 9, j + 2, k + 4, 1);
		world.setBlock(i + 9, j + 2, k + 5, 102);
		world.setBlock(i + 9, j + 2, k + 6, 5);
		world.setBlock(i + 9, j + 2, k + 7, 5);
		world.setBlock(i + 9, j + 2, k + 8, 102);
		world.setBlock(i + 9, j + 2, k + 9, 17);
		world.setBlockMetadata(i + 9, j + 2, k + 9, 1);
		world.setBlock(i + 9, j + 3, k + 4, 17);
		world.setBlockMetadata(i + 9, j + 3, k + 4, 1);
		world.setBlock(i + 9, j + 3, k + 5, 102);
		world.setBlock(i + 9, j + 3, k + 6, 5);
		world.setBlock(i + 9, j + 3, k + 7, 5);
		world.setBlock(i + 9, j + 3, k + 8, 102);
		world.setBlock(i + 9, j + 3, k + 9, 17);
		world.setBlockMetadata(i + 9, j + 3, k + 9, 1);
		world.setBlock(i + 9, j + 4, k + 4, 17);
		world.setBlockMetadata(i + 9, j + 4, k + 4, 1);
		world.setBlock(i + 9, j + 4, k + 5, 5);
		world.setBlock(i + 9, j + 4, k + 6, 5);
		world.setBlock(i + 9, j + 4, k + 7, 5);
		world.setBlock(i + 9, j + 4, k + 8, 5);
		world.setBlock(i + 9, j + 4, k + 9, 17);
		world.setBlockMetadata(i + 9, j + 4, k + 9, 1);
		world.setBlock(i + 9, j + 5, k + 2, 53);
		world.setBlockMetadata(i + 9, j + 5, k + 2, 2);
		world.setBlock(i + 9, j + 5, k + 3, 5);
		world.setBlock(i + 9, j + 5, k + 4, 17);
		world.setBlockMetadata(i + 9, j + 5, k + 4, 1);
		world.setBlock(i + 9, j + 5, k + 5, 5);
		world.setBlock(i + 9, j + 5, k + 6, 5);
		world.setBlock(i + 9, j + 5, k + 7, 5);
		world.setBlock(i + 9, j + 5, k + 8, 5);
		world.setBlock(i + 9, j + 5, k + 9, 17);
		world.setBlockMetadata(i + 9, j + 5, k + 9, 1);
		world.setBlock(i + 9, j + 6, k + 3, 53);
		world.setBlockMetadata(i + 9, j + 6, k + 3, 2);
		world.setBlock(i + 9, j + 6, k + 4, 17);
		world.setBlockMetadata(i + 9, j + 6, k + 4, 1);
		world.setBlock(i + 9, j + 6, k + 5, 102);
		world.setBlock(i + 9, j + 6, k + 6, 5);
		world.setBlock(i + 9, j + 6, k + 7, 5);
		world.setBlock(i + 9, j + 6, k + 8, 102);
		world.setBlock(i + 9, j + 6, k + 9, 17);
		world.setBlockMetadata(i + 9, j + 6, k + 9, 1);
		world.setBlock(i + 9, j + 7, k + 4, 53);
		world.setBlockMetadata(i + 9, j + 7, k + 4, 2);
		world.setBlock(i + 9, j + 7, k + 5, 5);
		world.setBlock(i + 9, j + 7, k + 6, 5);
		world.setBlock(i + 9, j + 7, k + 7, 5);
		world.setBlock(i + 9, j + 7, k + 8, 5);
		world.setBlock(i + 9, j + 7, k + 9, 53);
		world.setBlockMetadata(i + 9, j + 7, k + 9, 3);
		world.setBlock(i + 9, j + 8, k + 5, 53);
		world.setBlockMetadata(i + 9, j + 8, k + 5, 2);
		world.setBlock(i + 9, j + 8, k + 6, 5);
		world.setBlock(i + 9, j + 8, k + 7, 5);
		world.setBlock(i + 9, j + 8, k + 8, 53);
		world.setBlockMetadata(i + 9, j + 8, k + 8, 3);
		world.setBlock(i + 9, j + 9, k + 6, 53);
		world.setBlockMetadata(i + 9, j + 9, k + 6, 2);
		world.setBlock(i + 9, j + 9, k + 7, 53);
		world.setBlockMetadata(i + 9, j + 9, k + 7, 3);
		world.setBlockWithNotify(i + 6, j + 2, k + 5, 50);
		world.setBlockMetadata(i + 6, j + 2, k + 5, 3);
		world.setBlockWithNotify(i + 7, j + 1, k + 4, 64);
		world.setBlockMetadata(i + 7, j + 1, k + 4, 1);
		world.setBlockWithNotify(i + 7, j + 2, k + 4, 64);
		world.setBlockMetadata(i + 7, j + 2, k + 4, 8);
		world.setBlockWithNotify(i + 8, j + 2, k + 5, 50);
		world.setBlockMetadata(i + 8, j + 2, k + 5, 3);

		return true;
	}
}