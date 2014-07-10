package realmofshinigami;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by minecraft on 7/10/14.
 */
public class Silver extends Item {
    public Silver() {
        super();
        this.setUnlocalizedName("silver");
        this.setCreativeTab(CreativeTabs.tabMaterials);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister i) {
        this.itemIcon = i.registerIcon("realmofshinigamimod:SilverIngot");
    }


}