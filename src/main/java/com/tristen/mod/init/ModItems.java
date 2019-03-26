package com.tristen.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.ew.tutorialmod.items.ItemBase;
import com.ew.tutorialmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	// list of minecraft items
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Material
	public static ToolMaterial TRISTONIUM_MATERIAL = EnumHelper.addToolMaterial("tristoniumMaterial", 3, 2000, 10.0F, 8.0F, 15);
	
	// Items
	public static final Item TUTORIAL_INGOT = new ItemBase("tutorial_ingot");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item TRISTONIUM_INGOT = new ItemBase("tristonium_ingot");
	
	//tools
	public static final ItemSword TRISTONIUM_SWORD = new ToolSword("tristonium_sword",TRISTONIUM_MATERIAL);
	public static final ItemSword TUTORIAL_SWORD = new ToolSword("tutorial_sword",TRISTONIUM_MATERIAL);

}
