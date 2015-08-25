package shinymew.MoreBows2.items;

import net.minecraft.block.Block;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import shinymew.MoreBows2.init.ModBlocks;
import shinymew.MoreBows2.init.ModItems;
import shinymew.MoreBows2.tabs.ModTabs;

public class ItemBedrockChisel extends Item{
	
	public ItemBedrockChisel(){
		super();
		this.setMaxStackSize(1);
		this.setMaxDamage(12);
		this.setCreativeTab(ModTabs.MiscTab);
		this.setFull3D();
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float f1, float f2, float f3) {
		ItemStack shard = new ItemStack(ModItems.RockheadShard, world.rand.nextInt(8) == 0 ? 1 : 0);
		Block block = world.getBlock(x, y, z);
		if(block == Blocks.bedrock){
			itemstack.damageItem(1, player);
			world.setBlock(x, y, z, ModBlocks.EnrichedBedrock);
			world.playSoundAtEntity(player, "step.stone", 1.0F, 1.0F);
			if(!world.isRemote) world.spawnEntityInWorld(new EntityItem(world , player.posX + 0.5F, player.posY + 0.5F, player.posZ + 0.5F, shard));
			return true;
		}return super.onItemUse(itemstack, player, world, x, y, z, side, f1, f2, f3);
	}

}
