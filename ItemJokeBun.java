package net.minecraft.src;
public class ItemJokeBun extends ItemFood
{
public ItemJokeBun(int i, int j, boolean B)
{
super(i, j, B);
}
public ItemStack onFoodEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer)
{
entityPlayer.getFoodStats().addStats(this);
                world.playSoundAtEntity(entityPlayer, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
itemStack.stackSize--;
        
entityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 10 * 20, 6));
entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10 * 20, 6));
entityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10 * 20, 6));
entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 10 * 20, 6));
entityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 10 * 20, 6));
entityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 10 * 20, 6));
return itemStack;
}
}