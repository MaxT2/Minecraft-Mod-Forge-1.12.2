package com.tristen.mod.items;


import com.tristen.mod.TmodMain;
import com.tristen.mod.init.ModItems;
import com.tristen.mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name){
		setUnlocalizedName(name); //set unlocalized name
		setRegistryName(name); // set registry name
		setCreativeTab(TmodMain.TRISTONIUM_TAB); // set creative tab
		
		// tell minecraft this is an item
		ModItems.ITEMS.add(this); // add this item to mod items list
	}
	
	@Override
	public void registerModels() {
		TmodMain.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

