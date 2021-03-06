package realmofshinigami;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by minecraft on 7/8/14.
 */
@Mod(modid = "realmofshinigamimod", version = "1.0", name = "Realm of Shinigami Mod")
public class Crafting {
    public static JadeScythe scythe;
    public static JadeStone jadeStone;
    public static BoneScythe scythebone;
    public static Silver ingotsilver;
    public static JadeStoneOre jadeore;

    @Mod.EventHandler
    public void load(FMLInitializationEvent e) {
        Item.ToolMaterial jadeStoneMaterial = EnumHelper.addToolMaterial("gemjade", 2, 1000, 4.0F, 46.0F, 25);
        Item.ToolMaterial ingotsilverMaterial = EnumHelper.addToolMaterial("silver", 1, 700, 3.0F, 10.0F, 23);
        jadeStone = new JadeStone();
        scythe = new JadeScythe(jadeStoneMaterial);
        scythebone = new BoneScythe(ingotsilverMaterial);
        ingotsilver = new Silver();
        jadeore = new JadeStoneOre();
        jadeore.setHardness(5.0f);
        jadeore.setResistance(500.0f);
        GameRegistry.registerBlock(jadeore, "JadeStoneOre");
        GameRegistry.registerItem(scythebone, "bonescythe");
        GameRegistry.registerItem(scythe, "jadescythe");
        GameRegistry.registerItem(jadeStone, "jadestone");
        GameRegistry.addShapedRecipe(new ItemStack(scythe),
                "JII",
                "S  ",
                "G  ",
                'G', Items.gold_ingot, 'S', Items.stick, 'J', jadeStone, 'I', Items.iron_ingot);
        GameRegistry.registerItem(ingotsilver, "silver");
        GameRegistry.addShapedRecipe(new ItemStack(scythebone),
                "BSS",
                "B  ",
                "B  ",
                'B', Items.bone, 'S', ingotsilver);
        //GameRegistry.addShapedRecipe(new ItemStack(YellowCandle),
               // " S ",
                //" C ",
                //" C ",
                //'S', Items.string, 'C', new ItemStack(Blocks.stained_hardened_clay,1,4));


    }
}
