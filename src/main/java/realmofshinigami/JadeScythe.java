package realmofshinigami;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by minecraft on 7/8/14.
 */
public class JadeScythe extends ItemSword {
    public JadeScythe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("jadescythe");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister i) {
        this.itemIcon = i.registerIcon("realmofshinigamimod:leowynsscythe");
    }
}


