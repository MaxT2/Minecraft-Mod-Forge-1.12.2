package com.tristen.mod.blocks;



import com.tristen.mod.TmodMain;
import com.tristen.mod.init.ModBlocks;
import com.tristen.mod.init.ModItems;
import com.tristen.mod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	
	public BlockBase(String name, Material material) {
		
		super(material); // call super method
		setUnlocalizedName(name); //set unlocalized name
		setRegistryName(name); // set registry name
		setCreativeTab(TmodMain.TRISTONIUM_TAB); // set creative tab
		
		ModBlocks.BLOCKS.add(this); // have to add to blocks list
		// blocks have to be both a block and an item
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		TmodMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	

}
