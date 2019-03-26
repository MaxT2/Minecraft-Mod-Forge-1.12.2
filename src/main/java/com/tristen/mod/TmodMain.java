package com.tristen.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Logger;

import com.tristen.mod.util.Reference;
import com.tristen.mod.init.ModSmelting;
import com.tristen.mod.proxy.CommonProxy;
import com.tristen.mod.tabs.TristoniumTab;
import com.tristen.mod.world.ModWorldGen;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TmodMain
{
	//global variables
	// custom creative tabs
	public static final CreativeTabs TRISTONIUM_TAB = new TristoniumTab("tristoniumtab");
	
	
	
	@Instance
	public static TmodMain instance;
	
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

