package com.test.testmod.proxy;

import com.test.testmod.init.ModItems;

public class ClientProxy implements CommonProxy{
    public void init(){
        ModItems.register();
    }
}