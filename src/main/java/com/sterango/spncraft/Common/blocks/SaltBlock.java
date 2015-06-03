package com.sterango.spncraft.Common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SaltBlock extends Block {

public SaltBlock() {
	super(Material.iron);
	setHarvestLevel("pickaxe",0);
}

}