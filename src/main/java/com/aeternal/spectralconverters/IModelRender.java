package com.aeternal.spectralconverters;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IModelRender extends IModelRegister {

    @SideOnly(Side.CLIENT)
    void registerModels();

}
