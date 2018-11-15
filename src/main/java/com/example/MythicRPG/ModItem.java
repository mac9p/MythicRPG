package com.example.MythicRPG;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static com.example.MythicRPG.Main.MODID;

public class ModItem extends Item {
    public static Item amethystSword;
    public static Item amethystAxe;
    public static Item amethystPickaxe;
    public static Item amethystHoe;
    public static Item amethystShovel;
    public static Item amethyst;
    public static Block amethystOre;
    public static ToolMaterial amethystMaterial = EnumHelper.addToolMaterial("amethystMaterial",3,1000,10.0f,4.0f,10);

    public ModItem(String itemName){
        this.setUnlocalizedName(itemName);
        this.setTextureName(MODID + ":" + itemName);
        this.setCreativeTab(CreativeTabs.tabMisc);

    }
}
