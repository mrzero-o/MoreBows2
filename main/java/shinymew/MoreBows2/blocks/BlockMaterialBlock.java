package shinymew.MoreBows2.blocks;

import shinymew.MoreBows2.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMaterialBlock extends Block {

	public BlockMaterialBlock(Material mat, float hardness) {
		super(mat);
		this.setHardness(hardness);
		this.setResistance(hardness * 1.5F + 1F);
		this.setCreativeTab(ModTabs.MiscTab);
	}


	}


