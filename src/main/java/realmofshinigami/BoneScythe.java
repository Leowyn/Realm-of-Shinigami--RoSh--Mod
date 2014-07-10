package realmofshinigami;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by minecraft on 7/8/14.
 */
public class BoneScythe extends ItemSword {
    public BoneScythe(ToolMaterial ingotsilverMaterial) {
        super(ingotsilverMaterial);
        this.setUnlocalizedName("bonescythe");
        this.setCreativeTab(CreativeTabs.tabCombat);

    }

    @SideOnly(cpw.mods.fml.relauncher.Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister i) {
        this.itemIcon = i.registerIcon("realmofshinigamimod:bonescythe");
    }
}
