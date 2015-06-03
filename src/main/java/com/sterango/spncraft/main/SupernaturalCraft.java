package com.sterango.spncraft.main;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.sterango.spncraft.Client.proxy.CommonProxy;
import com.sterango.spncraft.Client.world.gen.WorldGen;
import com.sterango.spncraft.Common.blocks.SaltBlock;
import com.sterango.spncraft.Common.blocks.SaltOre;
import com.sterango.spncraft.Common.blocks.SilverBlock;
import com.sterango.spncraft.Common.blocks.SilverOre;
import com.sterango.spncraft.Common.entitys.mobs.EntityAngel;
import com.sterango.spncraft.Common.entitys.mobs.EntityBobby;
import com.sterango.spncraft.Common.entitys.mobs.EntityCastiel;
import com.sterango.spncraft.Common.entitys.mobs.EntityCrowley;
import com.sterango.spncraft.Common.entitys.mobs.EntityDean;
import com.sterango.spncraft.Common.entitys.mobs.EntityDeanDemon;
import com.sterango.spncraft.Common.entitys.mobs.EntityDemon;
import com.sterango.spncraft.Common.entitys.mobs.EntityDjinn;
import com.sterango.spncraft.Common.entitys.mobs.EntityHellHound;
import com.sterango.spncraft.Common.entitys.mobs.EntityLeviathan;
import com.sterango.spncraft.Common.entitys.mobs.EntitySam;
import com.sterango.spncraft.Common.entitys.mobs.EntityWIW;
import com.sterango.spncraft.Common.items.AngelBlade;
import com.sterango.spncraft.Common.items.Colt;
import com.sterango.spncraft.Common.items.DemonKnife;
import com.sterango.spncraft.Common.items.DevilsTrap;
import com.sterango.spncraft.Common.items.FirstBlade;
import com.sterango.spncraft.Common.items.ModItems;
import com.sterango.spncraft.Common.items.PurgatoryBlade;
import com.sterango.spncraft.Common.items.SaltItem;
import com.sterango.spncraft.Common.items.Soul;
import com.sterango.spncraft.Common.items.Stake;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid =  SupernaturalCraft.MODID, version =  SupernaturalCraft.VERSION)
public class SupernaturalCraft
{

    public static final String MODID = "SupernaturalCraft";
    public static final String VERSION = "3.5";
    @Instance(MODID)
    public static SupernaturalCraft instance; 
    
  
    @SidedProxy(clientSide="com.sterango.spncraft.proxy.ClientProxy", serverSide="com.sterango.spncraft.proxy.CommonProxy")
    public static CommonProxy proxy;
    
//MOBS 
    
    //Mobs - Register Eggs/Entity
    public static void registerEntity(Class entityClass, String name)
    {
    int entityID = EntityRegistry.findGlobalUniqueEntityId();
    long seed = name.hashCode();
    Random rand = new Random(seed);
    int primaryColor = rand.nextInt() * 16777215;
    int secondaryColor = rand.nextInt() * 16777215;

    EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
    EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
    EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }

  		
    public static Item getCarDrop(int colour)
	{
		switch (colour) 
		{
		case 0:
			return null;
		
		}
		return null;
	}
  		
    
    public static Block SaltBlock;
	 public static Block SaltOre;
	 public static Block SilverBlock;
	 public static Block  SilverOre;
	 public static Item JohnsJournal;
	 public static Block DevilsTrap;
	 public static Item PurifiedBlood;
	 public static Item LambsBlood;
	 public static Item Bible;
	 public static Item BookOfSpells;
	 public static Item BookOfShadows;
	 public static Item Amulet;
	 public static Item DemonBlood;
	 public static Item EMFMeter;
	 public static Item Ectoplasm;
	 public static Item HolyOil;
	 public static Item DTablet;
	 public static Item LeviathanBlood;
	 public static Item ATablet;
	 public static Item LTablet;
	 public static Item RoadSalt;
	 public static Block SaltLine;
	 public static Item Sulfur;
	 public static Item WordofGod;
	 public static Item Salt;
	 public static Item AngelBlood;
	 public static Item Goblet;
	 public static Item HexBag;
	 public static Item AngelBlade;
	 public static Item DeathsRing;
	 public static Item DemonKnife;
	 public static Item FaminesRing;
	 public static Item HornOfTruth;
	 public static Item PestilencesRing;
	 public static Item PurgatoryBlade;
	 public static Item PurgatoryPortalBlade;
	 public static Item RabbitsFoot;
	 public static Item WoodenStake;
	 public static Item WarsRing;
	 public static Item ColtAmmo;
	 public static Item Colt;
	 public static Item Silver;
	 public static Item Soul;
	 public static Item FirstBlade;
	 public static Item AntiPossessionTattoo;
	 public static Item DeadMansBlood;
	 public static Item SupernaturalBooks;
	  public static CreativeTabs tabSupernaturalCraft = new CreativeTabsSupernaturalCraft("SupernaturalCraft");
	  static ToolMaterial StakeToolMaterial = EnumHelper.addToolMaterial("StakeToolMaterial", 2, 750, 7, 16.0F, 20);
	  static ToolMaterial PurgatoryToolMaterial = EnumHelper.addToolMaterial("PurgatoryToolMaterial", 2, 750, 7, 66.0F, 20);
	  static ToolMaterial DemonToolMaterial = EnumHelper.addToolMaterial("DemonToolMaterial", 2, 750, 7, 36.0F, 20);
	  static ToolMaterial FirstBladeToolMaterial = EnumHelper.addToolMaterial("FirstBladeToolMaterial", 2, 750, 7, 76.0F, 20);
	  static ToolMaterial AngelBladeToolMaterial = EnumHelper.addToolMaterial("AngelBladeToolMaterial", 2, 750, 7, 36.0F, 20);
	  public static IWorldGenerator gen = new WorldGen();
	  
	  @EventHandler
	  public void preInit(FMLPreInitializationEvent event)
	  {
		 
		  GameRegistry.registerWorldGenerator(gen, 1 /*This is the importance at which to generate the contents of the file, leave it at 1*/);
		  
		  //Mobs - Register the Mobs
		  registerEntity(EntityAngel.class, "entityAngel");
		  registerEntity(EntityDemon.class, "entityDemon");
		  registerEntity(EntityCastiel.class, "entityCastiel");
		  registerEntity(EntityLeviathan.class, "entityLeviathan");
		    registerEntity(EntityCrowley.class, "entityCrowley");
		    registerEntity(EntityDean.class, "entityDean");
		    registerEntity(EntityBobby.class, "entityBobby");
		    registerEntity(EntityHellHound.class, "entityHellHound");
		    registerEntity(EntityDeanDemon.class, "entityDeanDemon");
		    registerEntity(EntitySam.class, "entitySam");
		    registerEntity(EntityWIW.class, "entityWIW");
		   registerEntity(EntityDjinn.class, "entityDjinn");

		    
		    EntityRegistry.addSpawn(EntityAngel.class, 20, 20, 20, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityDemon.class, 20, 20, 20, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityBobby.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntitySam.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityDean.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityCastiel.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityCrowley.class, 1, 1, 1, EnumCreatureType.monster);
		   EntityRegistry.addSpawn(EntityDeanDemon.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityDjinn.class, 10, 9, 3, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityHellHound.class, 10, 9, 3, EnumCreatureType.monster);
		   EntityRegistry.addSpawn(EntityLeviathan.class, 7, 5, 3, EnumCreatureType.monster);
		   EntityRegistry.addSpawn(EntityWIW.class, 6, 5, 4, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntitySam.class, 1, 1, 1, EnumCreatureType.monster);

		    
		    proxy.registerRenderers();
		    
		    SaltBlock = new SaltBlock().setBlockName("SaltBlock").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setHardness(10.0F);
		    GameRegistry.registerBlock(SaltBlock, SaltBlock.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "SaltBlock").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		    
		    
		   
		    

			
			SaltOre = new SaltOre().setBlockName("SaltOre").setHardness(3.0F).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(SaltOre, SaltOre.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "SaltOre").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	//Silver Block
			
			SilverBlock = new SilverBlock().setBlockName("SilverBlock").setHardness(10.0F).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(SilverBlock, SilverBlock.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "SilverBlock").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	//Silver Ore		
			
			SilverOre = new SilverOre().setBlockName("SilverOre").setHardness(3.0F).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(SilverOre, SilverOre.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "SilverOre").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	//Devil's Trap		
			
			DevilsTrap = new DevilsTrap().setBlockName("DevilsTrap").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(DevilsTrap, DevilsTrap.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "DevilsTrap").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	
			
			
			//Silver
			Silver = new ModItems().setUnlocalizedName("Silver").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Silver").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerItem(Silver, Silver.getUnlocalizedName().substring(5));
		

//Soul
				Soul = new Soul().setUnlocalizedName("Soul").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Soul").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(Soul, Soul.getUnlocalizedName().substring(5));
//Purified Blood		
		
		PurifiedBlood = new ModItems().setUnlocalizedName("PurifiedBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "PurifiedBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(PurifiedBlood, PurifiedBlood.getUnlocalizedName().substring(5));
//Lamb's Blood		
		
		LambsBlood = new ModItems().setUnlocalizedName("LambsBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "LambsBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(LambsBlood, LambsBlood.getUnlocalizedName().substring(5));
//Dead Man's Blood		
	
		DeadMansBlood = new ModItems().setUnlocalizedName("DeadMansBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "DeadMansBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DeadMansBlood, DeadMansBlood.getUnlocalizedName().substring(5));
//Demon's Blood		
		DemonBlood = new ModItems().setUnlocalizedName("DemonBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "DemonBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DemonBlood, DemonBlood.getUnlocalizedName().substring(5));		
//Angel Blood		
				AngelBlood = new ModItems().setUnlocalizedName("AngelBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "AngelBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(AngelBlood, AngelBlood.getUnlocalizedName().substring(5));
//	LeviathanBlood	
		LeviathanBlood = new ModItems().setUnlocalizedName("LeviathanBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "LeviathanBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(LeviathanBlood, LeviathanBlood.getUnlocalizedName().substring(5));
//Anti-Possession Tattoo		
				AntiPossessionTattoo = new ModItems().setUnlocalizedName("AntiPossessionTattoo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "AntiPossessionTattoo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(AntiPossessionTattoo, AntiPossessionTattoo.getUnlocalizedName().substring(5));
//Bible			
		Bible = new ModItems().setUnlocalizedName("Bible").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Bible").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Bible, Bible.getUnlocalizedName().substring(5));
//Book Of Spells		
		
		BookOfSpells = new ModItems().setUnlocalizedName("BookOfSpells").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "BookOfSpells").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(BookOfSpells, BookOfSpells.getUnlocalizedName().substring(5));
//Book Of Shadows		
		BookOfShadows = new ModItems().setUnlocalizedName("BookOfShadows").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "BookOfShadows").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(BookOfShadows, BookOfShadows.getUnlocalizedName().substring(5));
//John's Journal
		JohnsJournal = new ModItems().setUnlocalizedName("JohnsJournal").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "JohnsJournal").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(JohnsJournal, JohnsJournal.getUnlocalizedName().substring(5));
//Dean's Amulet		
		Amulet = new ModItems().setUnlocalizedName("Amulet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Amulet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Amulet, Amulet.getUnlocalizedName().substring(5));

//EMF Meter		
		EMFMeter = new ModItems().setUnlocalizedName("EMFMeter").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "EMFMeter").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(EMFMeter, EMFMeter.getUnlocalizedName().substring(5));
//Ectoplasm		
		Ectoplasm = new ModItems().setUnlocalizedName("Ectoplasm").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Ectoplasm").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Ectoplasm, Ectoplasm.getUnlocalizedName().substring(5));
//Holy Oil		
		HolyOil = new ModItems().setUnlocalizedName("HolyOil").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "HolyOil").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(HolyOil, HolyOil.getUnlocalizedName().substring(5));
//Key to OZ		
		Item KeytoOz;
		KeytoOz = new ModItems().setUnlocalizedName("KeytoOz").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "KeytoOz").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(KeytoOz, KeytoOz.getUnlocalizedName().substring(5));
//Demon Tablet		
		DTablet = new ModItems().setUnlocalizedName("DTablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "DTablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DTablet, DTablet.getUnlocalizedName().substring(5));
//Angel Tablet		
		ATablet = new ModItems().setUnlocalizedName("ATablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "ATablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(ATablet, ATablet.getUnlocalizedName().substring(5));
//Leviathan Tablet		
		LTablet = new ModItems().setUnlocalizedName("LTablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "LTablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(LTablet, LTablet.getUnlocalizedName().substring(5));
//Salt		
				Salt = new SaltItem().setUnlocalizedName("Salt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Salt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(Salt, Salt.getUnlocalizedName().substring(5));
//Sulfur		
		Sulfur = new ModItems().setUnlocalizedName("Sulfur").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Sulfur").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Sulfur, Sulfur.getUnlocalizedName().substring(5));
//Supernatural Books		
		
	SupernaturalBooks = new ModItems().setUnlocalizedName("SupernaturalBooks").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "SupernaturalBooks").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(SupernaturalBooks, SupernaturalBooks.getUnlocalizedName().substring(5));
//Word of God		
		WordofGod = new ModItems().setUnlocalizedName("WordofGod").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "ATablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(WordofGod, WordofGod.getUnlocalizedName().substring(5));

//Goblet of Blood		
		
		Goblet = new ModItems().setUnlocalizedName("Goblet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "GobletOfBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Goblet, Goblet.getUnlocalizedName().substring(5));
//Hexbag		
		HexBag = new ModItems().setUnlocalizedName("HexBag").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "HexBag").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(HexBag, HexBag.getUnlocalizedName().substring(5));
//Angel Blade		
		AngelBlade = new AngelBlade(AngelBladeToolMaterial).setUnlocalizedName("AngelBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "AngelBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(AngelBlade, AngelBlade.getUnlocalizedName().substring(5));
//Death's Ring		
		DeathsRing = new ModItems().setUnlocalizedName("DeathsRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "DeathsRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DeathsRing, DeathsRing.getUnlocalizedName().substring(5));
//Demon Killing Knife		
		DemonKnife = new DemonKnife(DemonToolMaterial).setUnlocalizedName("DemonKnife").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "DemonBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DemonKnife, DemonKnife.getUnlocalizedName().substring(5));
//Famine's Ring		
		FaminesRing = new ModItems().setUnlocalizedName("FaminesRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "FaminesRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(FaminesRing, FaminesRing.getUnlocalizedName().substring(5));
//Horn of Truth		
		HornOfTruth = new ModItems().setUnlocalizedName("HornOfTruth").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "HornOfTruth").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(HornOfTruth, HornOfTruth.getUnlocalizedName().substring(5));
//Pestilence's Ring		
		PestilencesRing = new ModItems().setUnlocalizedName("PestilencesRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "PestilencesRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(PestilencesRing, PestilencesRing.getUnlocalizedName().substring(5));
//Purgatory Blade		
		PurgatoryBlade = new PurgatoryBlade(PurgatoryToolMaterial).setUnlocalizedName("PurgatoryBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "PurgatoryBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(PurgatoryBlade, PurgatoryBlade.getUnlocalizedName().substring(5));
//Rabbit's Foot		
		RabbitsFoot = new ModItems().setUnlocalizedName("RabbitsFoot").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "RabbitsFoot").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(RabbitsFoot, RabbitsFoot.getUnlocalizedName().substring(5));
//Wooden Stake		
		WoodenStake = new Stake(StakeToolMaterial).setUnlocalizedName("WoodenStake").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Stake").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(WoodenStake, WoodenStake.getUnlocalizedName().substring(5));

//War's Ring		
		WarsRing = new ModItems().setUnlocalizedName("WarsRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "WarsRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(WarsRing, WarsRing.getUnlocalizedName().substring(5));
//Colt
		Colt = new Colt().setUnlocalizedName("Colt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Colt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Colt, Colt.getUnlocalizedName().substring(5));
		
//Colt Ammo		
		ColtAmmo = new ModItems().setUnlocalizedName("ColtAmmo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "ColtAmmo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(ColtAmmo, ColtAmmo.getUnlocalizedName().substring(5));
//First Blade
		
		FirstBlade = new FirstBlade(FirstBladeToolMaterial).setUnlocalizedName("FirstBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "FirstBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(FirstBlade, FirstBlade.getUnlocalizedName().substring(5));
	 
	  //Recipes
		Recipes.addRecipes();
	  
	  
	  }
	
	}

    		
    		
    		
    			

    
  			 



