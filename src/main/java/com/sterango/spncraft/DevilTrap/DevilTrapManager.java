package com.sterango.spncraft.DevilTrap;

public class DevilTrapManager 
{
	private static boolean storming;
	
	public static boolean isDustStormInProgress()
	{
		return true;
	}
	
	public static void setStorming(boolean storming)
	{
		DevilTrapManager.storming = storming;
	}
}
