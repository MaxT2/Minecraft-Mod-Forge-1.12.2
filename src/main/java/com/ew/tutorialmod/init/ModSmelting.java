package com.ew.tutorialmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
	public static void init(){
		
		GameRegistry.addSmelting(ModBlocks.TRISTONIUM_ORE, new ItemStack(ModItems.TRISTONIUM_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.TUTORIAL_ORE, new ItemStack(ModItems.TUTORIAL_INGOT, 1), 1.0F);
	}

}
