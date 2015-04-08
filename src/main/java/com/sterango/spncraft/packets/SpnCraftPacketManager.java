package com.sterango.spncraft.packets;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class SpnCraftPacketManager 

	{
		public static SimpleNetworkWrapper networkWrapper;
	    private static int packetId = 0;

		public static void register()
		{
			networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel("spncraft");
			
			registerPacket(PacketDevilTrap.Handler.class, PacketDevilTrap.class);
		}

	    private static <REQ extends IMessage, REPLY extends IMessage> void registerPacket(Class<? extends IMessageHandler<REQ, REPLY>> messageHandler, Class<REQ> requestMessageType)
	    {
	        networkWrapper.registerMessage(messageHandler, requestMessageType, packetId++, Side.CLIENT);
	        networkWrapper.registerMessage(messageHandler, requestMessageType, packetId++, Side.SERVER);
	    }
	}
