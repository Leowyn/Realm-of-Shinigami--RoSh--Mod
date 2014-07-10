package realmofshinigami;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by minecraft on 7/8/14.
 */
public class JadeStone extends Item {

    public JadeStone() {
        super();
        this.setUnlocalizedName("jadestone");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister i) {
        this.itemIcon = i.registerIcon("realmofshinigamimod:jadestone");


    }
}
