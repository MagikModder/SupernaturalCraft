package com.sterango.spncraft.packets;

import com.sterango.spncraft.DevilTrap.DevilTrapManager;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class PacketDevilTrap implements IMessage
{
	private boolean storming;

	public PacketDevilTrap()
	{
	}

	public PacketDevilTrap(boolean storming)
	{
		this.storming = storming;
	}

    public void fromBytes(ByteBuf buf)
    {
        storming = buf.readBoolean();
    }

    public void toBytes(ByteBuf buf)
    {
        buf.writeBoolean(storming);
    }

    public static class Handler implements IMessageHandler<PacketDevilTrap, IMessage>
    {
        public IMessage onMessage(PacketDevilTrap message, MessageContext ctx)
        {
        	DevilTrapManager.setStorming(message.storming);
        	
            if(ctx.side.isServer())
            {
                SpnCraftPacketManager.networkWrapper.sendToDimension(new PacketDevilTrap(message.storming), 0);
            
            
            return null;
        }
			return message;
    }
}
}