package shinymew.MoreBows2.world;

import shinymew.MoreBows2.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ModDungeon {
    
	public static void init(){
		
		/*
		 * This is where items are added to dungeon chests
		 */
		
		//Blacksmith
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(ModItems.SteelIngot, 0, 1, 3, 9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(ModItems.SteelIngot, 0, 1, 2, 6));
		
		//Stronghold
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(ModItems.SacredIvory, 0, 1, 4, 10));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(ModItems.SacredIvory, 0, 1, 4, 10));
		
		//Pyramid
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(ModItems.CursedBlazeRod, 0, 1, 3, 6));

		//Jungle Temple
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(ModItems.LightningsShard, 0, 1, 5, 8));
		
	}
	
}
