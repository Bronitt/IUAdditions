package com.aeternal.proxy;

import com.denfop.api.IModelRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;

public class ClientProxy extends CommonProxy {

    public static final ArrayList<IModelRegister> modelList = new ArrayList<>();
    //
    private final Minecraft mc = Minecraft.getMinecraft();
    private GuiScreen gui;

    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

    }


    public EntityPlayer getPlayerInstance() {
        return this.mc.player;
    }




/*    public void registerRecipe() {
        super.registerRecipe();

    }*/



    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);

    }

    public boolean addIModelRegister(IModelRegister modelRegister) {
        return modelList.add(modelRegister);
    }

}
