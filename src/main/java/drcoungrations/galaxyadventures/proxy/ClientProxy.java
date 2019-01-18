package drcoungrations.galaxyadventures.proxy;

import drcoungrations.galaxyadventures.GeneralConstats;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		OBJLoader.INSTANCE.addDomain(GeneralConstats.MODID);

	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {

	}


}
