package shinymew.MoreBows2.items;

import java.util.List;

import shinymew.MoreBows2.tabs.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemMoreBow extends ItemBow{
	
	private String info;
	
	public ItemMoreBow(String info){
		super();
		this.maxStackSize = 1;
		this.info = info;
		this.setCreativeTab(ModTabs.BowTab);
		this.bFull3D = true;
	}

    @Override
    public void addInformation(ItemStack itemstack, EntityPlayer player, List datalist, boolean bool) {
    	if(info != null) datalist.add(info);
    	else super.addInformation(itemstack, player, datalist, bool);
    }
	
}
