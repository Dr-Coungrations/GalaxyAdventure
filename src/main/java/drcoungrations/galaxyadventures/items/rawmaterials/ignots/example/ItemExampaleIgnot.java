package drcoungrations.galaxyadventures.items.rawmaterials.ignots.example;

import drcoungrations.galaxyadventures.GeneralConstats;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemExampaleIgnot extends Item {
	
	public ItemExampaleIgnot(String unlocalizedName, String registryName) {
        setUnlocalizedName(GeneralConstats.MODID + "." + "itemExample_ignot");
        setRegistryName("example_ignot_item");
        setCreativeTab(CreativeTabs.MISC);
    }

}
