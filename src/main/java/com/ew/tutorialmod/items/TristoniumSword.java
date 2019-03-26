package com.ew.tutorialmod.items;

import com.ew.tutorialmod.util.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiScreenEvent.PotionShiftEvent;
import scala.reflect.api.Positions;

public class TristoniumSword extends ItemSword{

	public TristoniumSword(ToolMaterial material) {
		super(material);
		
	}
	
	
	
@Override
public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
//	playerIn.addPotionEffect(new PotionEffect());
	return super.onItemRightClick(worldIn, playerIn, handIn);
}

}
