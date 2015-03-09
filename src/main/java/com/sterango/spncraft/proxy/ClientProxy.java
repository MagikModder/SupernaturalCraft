package com.sterango.spncraft.proxy;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelWolf;

import com.sterango.spncraft.mobs.EntityAngel;
import com.sterango.spncraft.mobs.EntityBobby;
import com.sterango.spncraft.mobs.EntityCastiel;
import com.sterango.spncraft.mobs.EntityCrowley;
import com.sterango.spncraft.mobs.EntityDean;
import com.sterango.spncraft.mobs.EntityDeanDemon;
import com.sterango.spncraft.mobs.EntityDemon;
import com.sterango.spncraft.mobs.EntityDjinn;
import com.sterango.spncraft.mobs.EntityHellHound;
import com.sterango.spncraft.mobs.EntityLeviathan;
import com.sterango.spncraft.mobs.EntitySam;
import com.sterango.spncraft.mobs.EntityWIW;
import com.sterango.spncraft.mobs.RenderAngel;
import com.sterango.spncraft.mobs.RenderBobby;
import com.sterango.spncraft.mobs.RenderCastiel;
import com.sterango.spncraft.mobs.RenderCrowley;
import com.sterango.spncraft.mobs.RenderDean;
import com.sterango.spncraft.mobs.RenderDeanDemon;
import com.sterango.spncraft.mobs.RenderDemon;
import com.sterango.spncraft.mobs.RenderDjinn;
import com.sterango.spncraft.mobs.RenderHellHound;
import com.sterango.spncraft.mobs.RenderLeviathan;
import com.sterango.spncraft.mobs.RenderSam;
import com.sterango.spncraft.mobs.RenderWIW;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

@Override
public void registerRenderers() {
RenderingRegistry.registerEntityRenderingHandler(EntityAngel.class, new RenderAngel(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityDemon.class, new RenderDemon(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityBobby.class, new RenderBobby(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityCastiel.class, new RenderCastiel(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityCrowley.class, new RenderCrowley(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityDean.class, new RenderDean(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityDjinn.class, new RenderDjinn(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityLeviathan.class, new RenderLeviathan(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityHellHound.class, new RenderHellHound(new ModelWolf(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntitySam.class, new RenderSam(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityWIW.class, new RenderWIW());
RenderingRegistry.registerEntityRenderingHandler(EntityDeanDemon.class, new RenderDeanDemon(new ModelBiped(), 0.5F));
}
}