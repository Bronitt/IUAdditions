package com.aeternal.proxy;

import com.aeternal.Constants;
import com.aeternal.api.IModelRegister;
import com.aeternal.integration.astralsorcery.recipes.ASRecipes;
import com.aeternal.integration.astralsorcery.tile.AstralSorceryIntegration;
import com.aeternal.integration.divinerpg.DivinerpgIntegration;
import com.aeternal.integration.divinerpg.recipes.DIVRecipes;
import com.aeternal.integration.forestry.ForestryIntegration;
import com.aeternal.integration.forestry.recipes.ForestryRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.aeternal.integration.astralsorcery.recipes.ASRecipes.*;


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
/*        if (Constants.BA_LOADED && Constants.BA_CONFIRM) {
           BotaniaIntegration.init();
        }*/

    }

    public void init(FMLInitializationEvent event) {
        if (Constants.AS_LOADED && Constants.AS_CONFIRM) {

            //TODO: fix this
         //   ASRecipes.ASBaseRecipe();
            ASRecipes.ASCompressorRecipe();
            ASRecipes.MicrochipRecipe();
            ASRecipes.ASDoubleMolecularRecipe();
            ASRecipes.InitConstellationRecipes();
        }
        if (Constants.DIV_LOADED && Constants.DIV_CONFIRM) {
            //TODO: fix this
        //   DIVRecipes.DIVBaseRecipe();
           DIVRecipes.MicrochipRecipe();
           DIVRecipes.DIVCompressorRecipe();
           DIVRecipes.DIVRollingRecipe();
        }
        if (Constants.FO_LOADED && Constants.BINNIE_LOADED && Constants.FO_CONFIRM) {
            ForestryRecipes.FOCompressorRecipe();
        }
    }

    public void postInit(FMLPostInitializationEvent event) {

    }


    public boolean addIModelRegister(IModelRegister modelRegister) {
        return false;
    }


}
