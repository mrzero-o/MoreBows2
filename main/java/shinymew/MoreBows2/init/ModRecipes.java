package shinymew.MoreBows2.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init ()
	{
		//Recipes for bows
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ReinforcedBow, 1), new Object[] {
                    " $*", "#(*", " $*", '#', Items.stick, '*', Items.string, '$', Blocks.stone, '(', Items.bow });
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.ReinforcedBow, 1), new Object[]  {
                    "*$ ", "*(#", "*$ ", '#', Items.stick, '*', Items.string, '$', Blocks.stone, '(', Items.bow });
        
        GameRegistry.addRecipe(new ItemStack(ModItems.LapisBow, 1), new Object[]      {
                    " l*", " (*", " l*", '*', Items.string, 'l', Blocks.lapis_block, '(', ModItems.IronBow,});
        GameRegistry.addRecipe(new ItemStack(ModItems.LapisBow, 1), new Object[]{
                    "*l ", "*( ", "*l ", '*', Items.string, 'l', Blocks.lapis_block, '(', ModItems.IronBow,});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.IronBow, 1), new Object[]      {
            " $*", "$(*", " $*", '*', Items.string, '$', Items.iron_ingot, '(', ModItems.ReinforcedBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.IronBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', Items.iron_ingot, '(', ModItems.ReinforcedBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.GoldBow, 1), new Object[]{
                    " $*", "$(*", " $*", '*', Items.string, '$', Items.gold_ingot, '(', ModItems.LapisBow});
        GameRegistry.addRecipe(new ItemStack(ModItems.GoldBow, 1), new Object[]{
                    "*$ ", "*($", "*$ ", '*', Items.string, '$', Items.gold_ingot, '(', ModItems.LapisBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.CrystalBow, 1), new Object[]{
                    " $*", "I(*", " $*", '*', Items.string, '$', Items.diamond, 'I', Items.iron_ingot, '(', ModItems.GoldBow});
        GameRegistry.addRecipe(new ItemStack(ModItems.CrystalBow, 1), new Object[]{
                    "*$ ", "*(I", "*$ ", '*', Items.string, '$', Items.diamond, 'I', Items.iron_ingot, '(', ModItems.GoldBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.FlameBow, 1), new Object[]
                {"NB ", "GI ", "NB ",   'G', Items.gold_ingot, 'B', Items.blaze_rod,  'I', ModItems.IronBow, 'N',Blocks.netherrack});
        GameRegistry.addRecipe(new ItemStack(ModItems.FlameBow, 1), new Object[]
                {" NB", " GI", " NB",   'G', Items.gold_ingot, 'B', Items.blaze_rod, 'I', ModItems.IronBow, 'N', Blocks.netherrack});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldBow, 1), new Object[]
                {" ES", "EBS", " ES",   'S', Items.string, 'B', ModItems.CrystalBow,  'E', Blocks.emerald_block});
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldBow, 1), new Object[]
                {"SE ", "SBE", "SE ",   'S', Items.string, 'B', ModItems.CrystalBow,  'E', Blocks.emerald_block});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianBow, 1), new Object[]
        		{" OS", "OIS", " OS",	'O', Blocks.obsidian, 'S', Items.string, 'I', ModItems.IronBow});
        GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianBow, 1), new Object[]
        		{"SO ", "SIO", "SO ",	'O', Blocks.obsidian, 'S', Items.string, 'I', ModItems.IronBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.FrostBow, 1), new Object[]
        		{" CS", "CIS", " CS",	'C', Blocks.ice, 'S', Items.string, 'I', ModItems.IronBow});
        GameRegistry.addRecipe(new ItemStack(ModItems.FrostBow, 1), new Object[]
        		{"SC ", "SIC", "SC ",	'C', Blocks.ice, 'S', Items.string, 'I', ModItems.IronBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.HealingBow, 1), new Object[]
        		{" AS", "AES", " AS",	'A', Items.golden_apple, 'S', Items.string, 'E', ModItems.EmeraldBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.HealingBow, 1), new Object[]
        		{"SA ", "SEA", "SA ",	'A', Items.golden_apple, 'S', Items.string, 'E', ModItems.EmeraldBow });
        
        GameRegistry.addRecipe(new ItemStack(ModItems.GlassBow, 1), new Object[]
        		{" AS", "A S", " AS",	'A', Blocks.glass_pane, 'S', Items.string});
        GameRegistry.addRecipe(new ItemStack(ModItems.GlassBow, 1), new Object[]
        		{"SA ", "S A", "SA ",	'A', Blocks.glass_pane, 'S', Items.string})
        		;
        GameRegistry.addRecipe(new ItemStack(ModItems.LegiaBow, 1), new Object[]
        		{"SB ", "S I", "SB ",	'I', Items.iron_ingot, 'S', Items.string, 'B', ModItems.IronBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.LegiaBow, 1), new Object[]
        		{" BS", "I S", " BS",	'I', Items.iron_ingot, 'S', Items.string, 'B', ModItems.IronBow });
        
        GameRegistry.addRecipe(new ItemStack(ModItems.PoisonBow, 1), new Object[]
        		{" OS", "OIS", " OS",	'O', Items.fermented_spider_eye, 'S', Items.string, 'I', ModItems.ReinforcedBow});
        GameRegistry.addRecipe(new ItemStack(ModItems.PoisonBow, 1), new Object[]
        		{"SO ", "SIO", "SO ",	'O', Items.fermented_spider_eye, 'S', Items.string, 'I', ModItems.ReinforcedBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.DarknessBow, 1), new Object[]      {
            " $*", "$(*", " $*", '*', Items.string, '$', ModItems.DarkQuartz, '(', ModItems.IronBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.DarknessBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', ModItems.DarkQuartz, '(', ModItems.IronBow });
        
        GameRegistry.addRecipe(new ItemStack(ModItems.ExplosiveBow, 1), new Object[]      {
            " $*", "$(*", " $*", '*', Items.string, '$', Blocks.tnt, '(', ModItems.FlameBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.ExplosiveBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', Blocks.tnt, '(', ModItems.FlameBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.RockheadBow, 1), new Object[]      {
            " $*", "$(*", " $*", '*', Items.string, '$', ModItems.RockheadShard, '(', ModItems.ObsidianBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.RockheadBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', ModItems.RockheadShard, '(', ModItems.ObsidianBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.NauseaBow, 1), new Object[]{
        	"SBF", "SNB", "SBF", 'S', Items.string, 'B', Items.bone, 'F', Items.fermented_spider_eye, 'N', ModItems.PoisonBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.NauseaBow, 1), new Object[]{
        	"FBS", "BNS", "FBS", 'S', Items.string, 'B', Items.bone, 'F', Items.fermented_spider_eye, 'N', ModItems.PoisonBow });
        
        GameRegistry.addRecipe(new ItemStack(ModItems.FatigueBow, 1), new Object[]{
        	"SBF", "SNB", "SBF", 'S', Items.string, 'B', Items.bone, 'F', Blocks.soul_sand, 'N', ModItems.IronBow });
        GameRegistry.addRecipe(new ItemStack(ModItems.FatigueBow, 1), new Object[]{
        	"FBS", "BNS", "FBS", 'S', Items.string, 'B', Items.bone, 'F', Blocks.soul_sand, 'N', ModItems.IronBow });
        
        GameRegistry.addRecipe(new ItemStack(ModItems.SteelBow, 1), new Object[]{
            " $*", "$(*", " $*", '*', Items.string, '$', ModItems.SteelIngot, '(', ModItems.IronBow});
        GameRegistry.addRecipe(new ItemStack(ModItems.SteelBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', ModItems.SteelIngot, '(', ModItems.IronBow});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.QuartzBow, 1), new Object[]{
            " $*", "$(*", " $*", '*', Items.string, '$', Blocks.quartz_block, '(', ModItems.IronBow});
        GameRegistry.addRecipe(new ItemStack(ModItems.QuartzBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', Blocks.quartz_block, '(', ModItems.IronBow});
        //New bow recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.LightningBow, 1), new Object[]{
            " $*", "$(*", " $*", '*', Items.string, '$', ModItems.LightningsShard, '(', Items.bow});
        GameRegistry.addRecipe(new ItemStack(ModItems.LightningBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', ModItems.LightningsShard, '(', Items.bow});

        GameRegistry.addRecipe(new ItemStack(ModItems.InfernoBow, 1), new Object[]{
            " $*", "$(*", " $*", '*', Items.string, '$', ModItems.CursedBlazeRod, '(', Items.bow});
        GameRegistry.addRecipe(new ItemStack(ModItems.InfernoBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', ModItems.CursedBlazeRod, '(', Items.bow});

        GameRegistry.addRecipe(new ItemStack(ModItems.SacredBow, 1), new Object[]{
            " $*", "$(*", " $*", '*', Items.string, '$', ModItems.SacredIvory, '(', Items.bow});
        GameRegistry.addRecipe(new ItemStack(ModItems.SacredBow, 1), new Object[]{
            "*$ ", "*($", "*$ ", '*', Items.string, '$', ModItems.SacredIvory, '(', Items.bow});
        //Recipes for crafting ingredients 
        GameRegistry.addRecipe(new ItemStack(ModItems.DarkQuartz, 1), new Object[]
        		{" C ", "CDC", " C ",   'C', Items.coal, 'D', Items.quartz});
        
        GameRegistry.addRecipe(new ItemStack(ModItems.SteelIngot, 5), new Object[]
        		{"ICI", "CIC", "ICI",   'C', Items.coal, 'I', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.SteelBlock, 1), new Object[]
        		{"SSS", "SSS", "SSS",	'S', ModItems.SteelIngot});
    	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SteelIngot, 9), new Object[] {	ModBlocks.SteelBlock});

        GameRegistry.addRecipe(new ItemStack(ModItems.BedrockChisel, 1), new Object[]
        		{" S", "W ", 'S', ModBlocks.SteelBlock, 'W', Blocks.planks});
    	
	}
}

	
	
	
