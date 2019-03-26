package com.tristen.mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TutorialOre extends BlockBase {

	public TutorialOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.1F);
		setResistance(15.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
