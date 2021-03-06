package com.tristen.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.tristen.mod.blocks.TristoniumBlock;
import com.tristen.mod.blocks.TristoniumOre;
import com.tristen.mod.blocks.TutorialOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//basic block with no properties
//	public static final Block TRISTONIUM_BLOCK = new BlockBase("tristonium_block", Material.IRON );
	

	public static final Block TRISTONIUM_BLOCK = new TristoniumBlock("tristonium_block", Material.IRON );
	public static final Block TRISTONIUM_ORE = new TristoniumOre("tristonium_ore", Material.ROCK);
	public static final Block TUTORIAL_ORE = new TutorialOre("tutorial_ore", Material.ROCK);
}


