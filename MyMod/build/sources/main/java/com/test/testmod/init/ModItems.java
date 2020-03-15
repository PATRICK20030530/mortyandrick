package com.test.testmod.init;

import com.test.testmod.items.ItemKingPickaxe;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {
    public static ItemPickaxe itemking = new ItemKingPickaxe();

    public static void init(){
       ForgeRegistries.ITEMS.register(itemking);
    }

    public static void register(){
        registerinit(itemking);
    }
    
    public static void registerinit(Item item){
        ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }

}