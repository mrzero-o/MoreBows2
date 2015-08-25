package shinymew.MoreBows2.handler;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ArrowHandler {
	
	@SubscribeEvent
	public void livingAttacked(LivingAttackEvent event){
		 if(event.source instanceof EntityDamageSourceIndirect && ((EntityDamageSourceIndirect)event.source).getSourceOfDamage() instanceof EntityArrow){
			 //Parameters
			 EntityArrow arrow = (EntityArrow)((EntityDamageSourceIndirect)event.source).getSourceOfDamage();
			 EntityLivingBase arrowTarget = event.entityLiving;
			 World world = event.entityLiving.worldObj;
			 
			 //Freeze
			 if(arrow.getEntityData().hasKey("MB2IsArrowFreezing") && arrow.getEntityData().getBoolean("MB2IsArrowFreezing")){
				 arrowTarget.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 300, 1));}
		 	 //Poison
			 if(arrow.getEntityData().hasKey("MB2IsArrowPoisonous") && arrow.getEntityData().getBoolean("MB2IsArrowPoisonous")){
				 arrowTarget.addPotionEffect(new PotionEffect(Potion.poison.getId(), 100, 1));}
			 //Healing
			 if(arrow.getEntityData().hasKey("MB2IsArrowHealing") && arrow.getEntityData().getBoolean("MB2IsArrowHealing")){
				 arrowTarget.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 20, 3));
				 arrowTarget.addPotionEffect(new PotionEffect(Potion.heal.getId(), 20, 4));}
			 //Weakness
			 if(arrow.getEntityData().hasKey("MB2IsArrowWeakening") && arrow.getEntityData().getBoolean("MB2IsArrowWeakening")){
				 arrowTarget.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 300, 1));}
			 //Blindness
			 if(arrow.getEntityData().hasKey("MB2IsArrowBlinding") && arrow.getEntityData().getBoolean("MB2IsArrowBlinding")){
				 arrowTarget.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 100, 0));}
		 	 //Nausea
		 	 if(arrow.getEntityData().hasKey("MB2IsArrowNauseating") && arrow.getEntityData().getBoolean("MB2IsArrowNauseating")){
		 		 arrowTarget.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 200, 0));}
		 	 //Mining Fatigue
			 if(arrow.getEntityData().hasKey("MB2IsArrowFatigating") && arrow.getEntityData().getBoolean("MB2IsArrowFatigating")){
				 arrowTarget.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 600, 1));}
			 //Explosion
			 if(arrow.getEntityData().hasKey("MB2IsArrowExplosive") && arrow.getEntityData().getBoolean("MB2IsArrowExplosive")){
				 world.createExplosion(arrow, arrowTarget.posX, arrowTarget.posY, arrowTarget.posZ, 1.3F, false);
				 float f4 = MathHelper.sqrt_double(arrow.motionX * arrow.motionX + arrow.motionZ * arrow.motionZ);
				 if (f4 > 0.0F) arrowTarget.addVelocity(arrow.motionX * 0.6000000238418579D / f4, 0.05D, arrow.motionZ * 0.6000000238418579D / f4);  
				 arrow.setDead();}
			 //Lightning
			 if(arrow.getEntityData().hasKey("MB2IsArrowElectric") && arrow.getEntityData().getBoolean("MB2IsArrowElectric")){
				 if(!world.isRemote && world.isRaining()){
					 world.lastLightningBolt = 2;
					 world.spawnEntityInWorld(new EntityLightningBolt(world, (int)arrowTarget.posX, (int)arrowTarget.posY, (int)arrowTarget.posZ));
				 }
			 }
			 //Judgment
			 if(arrow.getEntityData().hasKey("MB2IsArrowSacred") && arrow.getEntityData().getBoolean("MB2IsArrowSacred")){
				 if(arrowTarget.isCreatureType(EnumCreatureType.monster, false) || arrowTarget.isEntityUndead()){
					 int extraDamage = (world.rand.nextInt(2) + 3) * 6;	
					 arrowTarget.attackEntityFrom(new DamageSource("MB2Exorcism").setDamageBypassesArmor().setMagicDamage(), extraDamage);
			 		 arrowTarget.hurtResistantTime = 0;
			 		 if (arrowTarget.getHealth() <= 0.0F) arrow.setDead();}}
		 	 //Inferno
		 	 if(arrow.getEntityData().hasKey("MB2IsArrowInfernal") && arrow.getEntityData().getBoolean("MB2IsArrowInfernal")) {
		 		world.newExplosion(arrowTarget, arrowTarget.posX, arrowTarget.posY, arrowTarget.posZ, 2.6F, true, true);
		 		AxisAlignedBB box = AxisAlignedBB.getBoundingBox(arrow.posX - 3, arrow.posY - 3, arrow.posZ - 3, arrow.posX + 3, arrow.posY + 3, arrow.posZ + 3);
		 		List entities = world.getEntitiesWithinAABB(Entity.class, box);
		 		for(int i = 0; i < entities.size(); i++){
		 			((Entity)entities.get(i)).setFire(8);
		 		}}
		 	 //No resistant time //This is used for the Legia Bow so the arrows dont bounce off
			 if(arrow.getEntityData().hasKey("MB2IsArrowMortal") && arrow.getEntityData().getBoolean("MB2IsArrowMortal")){
				 if(arrowTarget.hurtResistantTime > 0) {
					arrowTarget.hurtResistantTime = 0;
					arrowTarget.attackEntityFrom(DamageSource.causeArrowDamage(arrow, arrow.shootingEntity), (float)arrow.getDamage());
				 	arrow.setDead();}}
		 	 }
	}
}