package com.tristen.mod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

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
