package shinymew.MoreBows2;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import shinymew.MoreBows2.handler.ArrowHandler;
import shinymew.MoreBows2.init.ModBlocks;
import shinymew.MoreBows2.init.ModItems;
import shinymew.MoreBows2.init.ModRecipes;
import shinymew.MoreBows2.world.ModDungeon;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = MoreBows2.MODID, name = "More Bows 2", version = MoreBows2.VERSION)
public class MoreBows2 
{
	
	public static final String MODID = "MoreBows2";
	public static final String VERSION = "1.2";

	@Mod.EventHandler
	public void preInit (FMLPreInitializationEvent event)
	{
		//Handlers
		MinecraftForge.EVENT_BUS.register(new ArrowHandler());
		//General initializations
		ModItems.init();
    	ModBlocks.init();
    	ModRecipes.init();
	}

	@Mod.EventHandler
	public void init (FMLInitializationEvent event)
	{
		ModDungeon.init();
	}
	
	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event)
	{
		
	}
}

		
		