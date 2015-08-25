package shinymew.MoreBows2.init;

import net.minecraft.item.Item;
import shinymew.MoreBows2.items.ItemBedrockChisel;
import shinymew.MoreBows2.items.ItemCraftingItem;
import shinymew.MoreBows2.items.ItemCrystalBow;
import shinymew.MoreBows2.items.ItemDarknessBow;
import shinymew.MoreBows2.items.ItemEmeraldBow;
import shinymew.MoreBows2.items.ItemExplosiveBow;
import shinymew.MoreBows2.items.ItemFatigueBow;
import shinymew.MoreBows2.items.ItemFlameBow;
import shinymew.MoreBows2.items.ItemFrostBow;
import shinymew.MoreBows2.items.ItemGlassBow;
import shinymew.MoreBows2.items.ItemGoldBow;
import shinymew.MoreBows2.items.ItemHealingBow;
import shinymew.MoreBows2.items.ItemInfernoBow;
import shinymew.MoreBows2.items.ItemIronBow;
import shinymew.MoreBows2.items.ItemLapisBow;
import shinymew.MoreBows2.items.ItemLegiaBow;
import shinymew.MoreBows2.items.ItemLightningBow;
import shinymew.MoreBows2.items.ItemNauseaBow;
import shinymew.MoreBows2.items.ItemObsidianBow;
import shinymew.MoreBows2.items.ItemPoisonBow;
import shinymew.MoreBows2.items.ItemQuartzBow;
import shinymew.MoreBows2.items.ItemReinforcedBow;
import shinymew.MoreBows2.items.ItemRockheadBow;
import shinymew.MoreBows2.items.ItemSacredBow;
import shinymew.MoreBows2.items.ItemSteelBow;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	//Bows
		//Mew
		
		/*
		 * 
		 */
		
		public static Item ReinforcedBow = new ItemReinforcedBow(null).setUnlocalizedName("ReinforcedBow");
		public static Item IronBow = new ItemIronBow(null).setUnlocalizedName("IronBow");
		public static Item GoldBow = new ItemGoldBow(null).setUnlocalizedName("GoldBow");
		public static Item CrystalBow = new ItemCrystalBow(null).setUnlocalizedName("CrystalBow");
		public static Item EmeraldBow = new ItemEmeraldBow(null).setUnlocalizedName("EmeraldBow");
		public static Item FlameBow = new ItemFlameBow(null).setUnlocalizedName("FlameBow");
		public static Item FrostBow = new ItemFrostBow(null).setUnlocalizedName("FrostBow");
		public static Item ObsidianBow = new ItemObsidianBow(null).setUnlocalizedName("ObsidianBow");
		public static Item HealingBow = new ItemHealingBow(null).setUnlocalizedName("HealingBow");
		public static Item SteelBow = new ItemSteelBow(null).setUnlocalizedName("SteelBow");
		public static Item LegiaBow = new ItemLegiaBow(null).setUnlocalizedName("LegiaBow");
		public static Item GlassBow = new ItemGlassBow(null).setUnlocalizedName("GlassBow");
		public static Item PoisonBow = new ItemPoisonBow(null).setUnlocalizedName("PoisonBow");
		public static Item QuartzBow = new ItemQuartzBow(null).setUnlocalizedName("QuartzBow");
		public static Item LapisBow = new ItemLapisBow(null).setUnlocalizedName("LapisBow");
		public static Item DarknessBow = new ItemDarknessBow(null).setUnlocalizedName("DarknessBow");
		public static Item ExplosiveBow = new ItemExplosiveBow(null).setUnlocalizedName("ExplosiveBow");
		public static Item RockheadBow = new ItemRockheadBow(null).setUnlocalizedName("RockheadBow");
		public static Item NauseaBow = new ItemNauseaBow(null).setUnlocalizedName("NauseaBow");
		public static Item FatigueBow = new ItemFatigueBow(null).setUnlocalizedName("FatigueBow");
		//Zero
		public static Item LightningBow = new ItemLightningBow("Lightning").setUnlocalizedName("LightningBow"); //Strikes with lighting while rain
		public static Item SacredBow = new ItemSacredBow("Justice").setUnlocalizedName("SacredBow"); //Deals a lot of damage to monsters 
		public static Item InfernoBow = new ItemInfernoBow("Destruction").setUnlocalizedName("InfernoBow"); //Creates a big burst of fire around the target
	
	//Bow Materials
		public static Item LightningsShard = new ItemCraftingItem().setUnlocalizedName("LightningsShard").setTextureName("morebows2:" + "LightningsShard");
		public static Item CursedBlazeRod = new ItemCraftingItem().setUnlocalizedName("CursedBlazeRod").setTextureName("morebows2:" + "CursedBlazeRod");
		public static Item SacredIvory = new ItemCraftingItem().setUnlocalizedName("SacredIvory").setTextureName("morebows2:" + "SacredIvory");
		
		public static Item DarkQuartz = new ItemCraftingItem().setUnlocalizedName("DarkQuartz").setTextureName("morebows2:" + "DarkQuartz");
		public static Item RockheadShard = new ItemCraftingItem().setUnlocalizedName("RockheadShard").setTextureName("morebows2:" + "RockheadShard");
		public static Item SteelIngot = new ItemCraftingItem().setUnlocalizedName("SteelIngot").setTextureName("morebows2:" + "SteelIngot");
	//Other Tools
		public static Item BedrockChisel = new ItemBedrockChisel().setUnlocalizedName("BedrockChisel").setTextureName("morebows2:" + "BedrockChisel");

	public static void init () {
		
		//Bows
		GameRegistry.registerItem(ReinforcedBow, "ReinforcedBow");	
		GameRegistry.registerItem(IronBow, "IronBow");	
		GameRegistry.registerItem(GoldBow, "GoldBow");	
		GameRegistry.registerItem(CrystalBow, "CrystalBow");	
		GameRegistry.registerItem(EmeraldBow, "EmeraldBow");
		GameRegistry.registerItem(ObsidianBow, "ObsidianBow");
		GameRegistry.registerItem(FlameBow, "FlameBow");
		GameRegistry.registerItem(FrostBow, "FrostBow");
		GameRegistry.registerItem(HealingBow, "HealingBow");
		GameRegistry.registerItem(SteelBow, "SteelBow");
		GameRegistry.registerItem(LegiaBow, "LegiaBow");
		GameRegistry.registerItem(GlassBow, "GlassBow");
		GameRegistry.registerItem(PoisonBow, "PoisonBow");
		GameRegistry.registerItem(QuartzBow, "QuartzBow");
		GameRegistry.registerItem(LapisBow, "LapisBow");
		GameRegistry.registerItem(DarknessBow, "DarknessBow");
		GameRegistry.registerItem(ExplosiveBow, "ExplosiveBow");
		GameRegistry.registerItem(RockheadBow, "RockheadBow");
		GameRegistry.registerItem(NauseaBow, "NauseaBow");
		GameRegistry.registerItem(FatigueBow, "FatigueBow");
		GameRegistry.registerItem(LightningBow, "LightningBow");
		GameRegistry.registerItem(InfernoBow, "InfernoBow");
		GameRegistry.registerItem(SacredBow, "SacredBow");
		
		//Bow Materials
		GameRegistry.registerItem(RockheadShard, "RockheadShard");
		GameRegistry.registerItem(SteelIngot, "SteelIngot");
		GameRegistry.registerItem(DarkQuartz, "DarkQuartz");
		
		//Generated in dungeons
		GameRegistry.registerItem(LightningsShard, "LightningsShard");
		GameRegistry.registerItem(CursedBlazeRod, "CursedBlazeRod");
		GameRegistry.registerItem(SacredIvory, "SacredIvory");
		
		//Other tools
		GameRegistry.registerItem(BedrockChisel, "BedrockChisel");
	}
	
	
	
	
	
}
