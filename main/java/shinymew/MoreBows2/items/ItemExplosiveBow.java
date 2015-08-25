package shinymew.MoreBows2.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import org.lwjgl.opengl.GL11;

import shinymew.MoreBows2.init.ModItems;
import shinymew.MoreBows2.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemExplosiveBow extends ItemMoreBow {

	    @SideOnly(Side.CLIENT)
	    private IIcon[] iconArray;
	    private static final String __OBFID = "CL_00001777";

	    
		public static IIcon ExplosiveBow;
		public static IIcon ExplosiveBow1;
		public static IIcon ExplosiveBow2;
		public static IIcon ExplosiveBow3;
	    
	    
	public ItemExplosiveBow(String info) {
		super(info);
		this.maxStackSize = 1;
		this.setMaxDamage(120);
		this.setCreativeTab(ModTabs.BowTab);
		this.bFull3D = true;
	}
	
	 public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_)
	    {
	        int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;

	        ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        j = event.charge;

	        boolean flag = p_77615_3_.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, p_77615_1_) > 0;

	        if (flag || p_77615_3_.inventory.hasItem(Items.arrow))
	        {
	            float f = (float)j / 17.0F;
	            f = (f * f + f * 2.0F) / 3.0F;

	            if ((double)f < 0.1D)
	            {
	                return;
	            }

	            if (f > 1.0F)
	            {
	                f = 1.0F;
	            }

	            EntityArrow entityarrow = new EntityArrow(p_77615_2_, p_77615_3_, f * 2.0F);

	            if (f == 1.0F)
	            {
	                entityarrow.setIsCritical(true);
	            }

	            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, p_77615_1_);

	            if (k > 0)
	            {
	            	entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
	            }

	            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, p_77615_1_);

	            if (l > 0)
	            {
	                entityarrow.setKnockbackStrength(l);
	            }

	            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, p_77615_1_) > 0)
	            {
	                entityarrow.setFire(100);
	            }

	            p_77615_1_.damageItem(1, p_77615_3_);
	            p_77615_2_.playSoundAtEntity(p_77615_3_, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

	            if (flag)
	            {
	                entityarrow.canBePickedUp = 2;
	            }
	            else
	            {
	                p_77615_3_.inventory.consumeInventoryItem(Items.arrow);
	            }

	            if (!p_77615_2_.isRemote)
	            {
	                p_77615_2_.spawnEntityInWorld(entityarrow);
	                entityarrow.getEntityData().setBoolean("MB2IsArrowExplosive", true);
	                entityarrow.setDamage(entityarrow.getDamage() * 1.15D);
	            }
	        }
	    }

	    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
	    {
	        return p_77654_1_;
	    }
	    
	    public int getMaxItemUseDuration(ItemStack p_77626_1_)
	    {
	        return 72000;
	    }
	   
	    public EnumAction getItemUseAction(ItemStack p_77661_1_)
	    {
	        return EnumAction.bow;
	    }

	    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
	    {
	        ArrowNockEvent event = new ArrowNockEvent(p_77659_3_, p_77659_1_);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return event.result;
	        }

	        if (p_77659_3_.capabilities.isCreativeMode || p_77659_3_.inventory.hasItem(Items.arrow))
	        {
	            p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
	        }

	        return p_77659_1_;
	    }

	    public int getItemEnchantability()
	    {
	        return 1;
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IIconRegister p_94581_1_)
	    {
	        this.itemIcon = p_94581_1_.registerIcon("morebows2:" + "ExplosiveBow");
	        
	        
	        ExplosiveBow = p_94581_1_.registerIcon("morebows2:" + "ExplosiveBow");
	        ExplosiveBow1 = p_94581_1_.registerIcon("morebows2:" + "ExplosiveBow2");
	        ExplosiveBow2 = p_94581_1_.registerIcon("morebows2:" + "ExplosiveBow3");
	        ExplosiveBow3 = p_94581_1_.registerIcon("morebows2:" + "ExplosiveBow4");		
	        
	    }

	    public IIcon getIcon(ItemStack itemStack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) 
		{	
			if(Minecraft.getMinecraft().gameSettings.thirdPersonView != 0)
			{
	            GL11.glTranslatef(0.0F, -0.6F, -0.025F);
		        GL11.glRotatef(-17.0F, 0.0F, 0.0F, 1.0F);
		        GL11.glRotatef(14.0F, 1.0F, 0.0F, 0.0F);
		        GL11.glRotatef(4.5F, 0.0F, 1.0F, 0.0F);
			}
			
			if (player.getItemInUse() == null) return this.itemIcon;
			int var8 = itemStack.getMaxItemUseDuration() - useRemaining;
			if (var8 >= 17)
			{		
				if(this == ModItems.ExplosiveBow)
				{
					return ExplosiveBow3;
				}
	
				}
			
			if (var8 > 12)
			{
				if(this == ModItems.ExplosiveBow)
				{
					return ExplosiveBow2;
				}
				
	
				}
				
			if (var8 > 0)
			{
				if(this == ModItems.ExplosiveBow)
				{
					return ExplosiveBow1;
				}
				
			
			}
			return this.itemIcon;
		}



}
