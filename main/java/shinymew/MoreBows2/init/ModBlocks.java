package shinymew.MoreBows2.init;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shinymew.MoreBows2.blocks.BlockEnrichedBedrock;
import shinymew.MoreBows2.blocks.BlockMaterialBlock;
import shinymew.MoreBows2.blocks.BlockSpecialDrop;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Random rand = new Random();
	
	public static Block SteelBlock = new BlockMaterialBlock(Material.iron, 5.5F).setBlockName("SteelBlock").setBlockTextureName("morebows2:" + "SteelBlock");
	public static Block QuartzBlockDark = new BlockMaterialBlock(Material.iron, 1.0F).setBlockName("QuartzBlockDark").setBlockTextureName("morebows2:" + "QuartzBlockDark").setStepSound(Block.soundTypePiston);
	
	public static Block EnrichedBedrock = new BlockEnrichedBedrock().setBlockName("EnrichedBedrock").setBlockTextureName("morebows2:" + "EnrichedBedrock");
	
	public static void init ()

	{
		GameRegistry.registerBlock(SteelBlock, "SteelBlock");
		GameRegistry.registerBlock(QuartzBlockDark, "QuartzBlockDark");
		GameRegistry.registerBlock(EnrichedBedrock, "EnrichedBedrock");
	}
	
}
