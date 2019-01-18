package drcoungrations.galaxyadventures;

import org.apache.logging.log4j.Logger;

import drcoungrations.galaxyadventures.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GeneralConstats.MODID, name = GeneralConstats.NAME, version = GeneralConstats.VERSION, acceptedMinecraftVersions = GeneralConstats.MC_VERSION)
public class GalaxyAdventuresMod {

	//Proxy
	@SidedProxy(clientSide = GeneralConstats.CLIENT, serverSide = GeneralConstats.SERVER)
	public static IProxy proxy;

	public static Logger logger;
	
	//Init_Stage
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("GeneralConstats.NAME" + "says hi!");
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
