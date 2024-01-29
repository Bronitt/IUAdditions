package com.aeternal.proxy;


import com.aeternal.Constants;
import com.aeternal.api.IModelRegister;

import com.aeternal.blocks.mechanism.TileBlockCreator;
import com.aeternal.integration.astralsorcery.AstralSorceryIntegration;
import com.aeternal.integration.divinerpg.DivinerpgIntegration;
import com.aeternal.integration.forestry.ForestryIntegration;
import com.aeternal.register.Register;



import com.denfop.integration.botania.BotaniaIntegration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy  {

    public void preInit(FMLPreInitializationEvent event) {

        if (Constants.AS_LOADED && Constants.AS_CONFIRM) {
            AstralSorceryIntegration.init();
        }
        if (Constants.FO_LOADED && Constants.FO_CONFIRM) {
            ForestryIntegration.init();
        }
        if (Constants.DIV_LOADED && Constants.DIV_CONFIRM) {
            DivinerpgIntegration.init();
        }
        if (Constants.BA_LOADED && Constants.BA_CONFIRM) {
           BotaniaIntegration.init();
        }
        Register.init();
    }



    public void init(FMLInitializationEvent event) {

        if (Loader.isModLoaded("astralsorcery")) {
            AstralSorceryIntegration.init();
        }
        if (Loader.isModLoaded("forestry")) {
        ForestryIntegration.init();
    }
        if (Loader.isModLoaded("divinerpg")) {
        DivinerpgIntegration.init();
    }
            /*if (Loader.isModLoaded("botania")) {
        BotaniaIntegration.init();
    }*/
        TileBlockCreator.instance.buildBlocks();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

//    public void registerRecipe() {

//        if (Config.BotaniaLoaded && Config.Botania) {
//            BotaniaIntegration.recipe();
//        }
//        if (Config.DraconicLoaded && Config.Draconic) {
//            DraconicIntegration.Recipes();
//        }
//        if (Config.AvaritiaLoaded && Config.Avaritia) {
//            AvaritiaIntegration.recipe();
//        }
//        if (Loader.isModLoaded("appliedenergistics2")) {
//            AEIntegration.init();
//        }
//        if (Loader.isModLoaded("thermalexpansion")) {
//            ThermalExpansionIntegration.init();
//        }
//        if (Loader.isModLoaded("opencomputers")) {
//            OCIntegration.init();
//        }

//    }

    /*private void writeRecipe() {
        net.minecraft.item.crafting.FurnaceRecipes recipes = net.minecraft.item.crafting.FurnaceRecipes.instance();
        final Map<ItemStack, ItemStack> map = recipes.getSmeltingList();
        ItemStack output;
        ItemStack input;
        final IInputHandler inputFactory = com.denfop.api.Recipes.inputFactory;

        for (Map.Entry<ItemStack, ItemStack> entry : map.entrySet()) {
            output = entry.getValue();
            input = entry.getKey();
            if (input.isEmpty()) {
                continue;
            }
            NBTTagCompound nbt = new NBTTagCompound();
            try {
                nbt.setFloat("experience", recipes.getSmeltingExperience(output));
            } catch (Exception e) {
                nbt.setFloat("experience", 0.1F);

            }
            *//*Recipes.recipes.addRecipe(
                    "furnace",
                    new BaseMachineRecipe(
                            new Input(
                                    inputFactory.getInput(input)
                            ),
                            new RecipeOutput(nbt, output)
                    )
            );*//*
        }
    }*/

    public boolean addIModelRegister(IModelRegister modelRegister) {
        return false;
    }







}
