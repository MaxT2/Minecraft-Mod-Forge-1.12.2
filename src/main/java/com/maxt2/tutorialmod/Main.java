package com.maxt2.tutorialmod;

import com.maxt2.tutorialmod.init.ModSmelting;
import com.maxt2.tutorialmod.proxy.CommonProxy;
import com.maxt2.tutorialmod.tabs.TristoniumTab;
import com.maxt2.tutorialmod.util.Reference;
import com.maxt2.tutorialmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	//global variables
	public static final CreativeTabs TRISTONIUM_TAB = new TristoniumTab("tristoniumtab");
	
	
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	

    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {

    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	ModSmelting.init();
    }
    
    @EventHandler
    public void PostInit(FMLInitializationEvent event){
    	
    	
    }
    
}

