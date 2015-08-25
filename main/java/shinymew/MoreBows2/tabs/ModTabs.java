package shinymew.MoreBows2.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import shinymew.MoreBows2.init.ModItems;

public class ModTabs {
	
	
	public static CreativeTabs BowTab = new CreativeTabs("MoreBowsTab") {
		public Item getTabIconItem () {
			return ModItems.CrystalBow;
		}
	};
	
	
	public static CreativeTabs MiscTab = new CreativeTabs("MoreBowsMiscTab") {
		public Item getTabIconItem () {
			return ModItems.SteelIngot;
		}};

}
