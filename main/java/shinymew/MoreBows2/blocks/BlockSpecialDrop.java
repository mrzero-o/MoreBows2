package shinymew.MoreBows2.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockSpecialDrop extends BlockMaterialBlock{
	
	private Item itemDropped;
	private int itemDroppedQuantity;

	public BlockSpecialDrop(Material mat, float hardness, Item drop, int quantity) {
		super(mat, hardness);
		this.itemDropped = drop;
		this.itemDroppedQuantity = quantity;
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return itemDropped;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		return itemDroppedQuantity;
	}
}
