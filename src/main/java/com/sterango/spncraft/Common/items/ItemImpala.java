package com.sterango.spncraft.Common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.sterango.spncraft.Common.entitys.impala.EntityImpala;
import com.sterango.spncraft.main.SupernaturalCraft;

public class ItemImpala extends Item
{
	public int colour;

	public ItemImpala(int colour)
	{
		super();
		this.setUnlocalizedName("car_" + colour);
		this.colour = colour;
		this.setMaxStackSize(1);
		this.setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if (!player.capabilities.isCreativeMode)
		{
			--stack.stackSize;
		}

		if (!world.isRemote)
		{
			EntityImpala entityBasicCar = new EntityImpala(world, x, y + 1, z, colour, player.getCommandSenderName());
			entityBasicCar.rotationYaw = (float)((((MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90) - 90);
			world.spawnEntityInWorld(entityBasicCar); 
		}

		if(player.capabilities.isCreativeMode)
		{
			stack.stackSize--;
		}

		return true;
	}
}