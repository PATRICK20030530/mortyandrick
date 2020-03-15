package com.test.testmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemKingPickaxe extends ItemPickaxe {
    public static final Item.ToolMaterial itemking = EnumHelper.addToolMaterial("itemking", 3, 322100, 32.0F, 100.0F, 30);
    public ItemKingPickaxe(){
        super(itemking);
        setUnlocalizedName("itemking");
        setRegistryName("itemking");
        setCreativeTab(CreativeTabs.COMBAT);
        setMaxStackSize(1);
    }
}