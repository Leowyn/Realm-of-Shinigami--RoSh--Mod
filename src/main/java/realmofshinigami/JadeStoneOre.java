package realmofshinigami;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

import static net.minecraft.block.material.Material.*;

/**
 * Created by minecraft on 7/8/14.
 */
public class JadeStoneOre extends BlockOre {

    public JadeStoneOre() {
        super();
        this.setBlockName("jadestoneore");
        this.setCreativeTab(CreativeTabs.tabBlock);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister i) {
        this.blockIcon = i.registerIcon("realmofshinigamimod:JadeOre");
    }

    @Override
    public Item getItemDropped(int metadata, Random r, int fortune) {
         return Crafting.jadeStone;
    }
}
