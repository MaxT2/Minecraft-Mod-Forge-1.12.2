package com.ew.tutorialmod.tabs;

import com.ew.tutorialmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TristoniumTab extends CreativeTabs {
	
	public TristoniumTab(String label){
		super("tristoniumtab");
		this.setBackgroundImageName("tristoniumtab.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(ModItems.TRISTONIUM_INGOT);
	}

}
