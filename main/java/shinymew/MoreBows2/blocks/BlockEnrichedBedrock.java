package shinymew.MoreBows2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEnrichedBedrock extends Block{

	public BlockEnrichedBedrock() {
		super(Material.rock);
		this.setBlockUnbreakable();
		this.setResistance(6000000.0F);
		this.setStepSound(Block.soundTypePiston);
		this.setCreativeTab(null);
		super.disableStats();
		
	}

}
