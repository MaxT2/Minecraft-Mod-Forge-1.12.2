package com.tristen.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TristoniumTab extends CreativeTabs {
	
	public TristoniumTab(String label){
		super("tristoniumtab");
	}
	
	public ItemStack getTabIconItem(){
//		return new ItemStack(ModItems.TRISTONIUM_INGOT);
		return new ItemStack(Items.IRON_INGOT);
	}

}
