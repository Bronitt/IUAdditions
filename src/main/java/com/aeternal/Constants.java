package com.aeternal;

import net.minecraftforge.fml.common.Loader;

public class Constants {

    public static final String MOD_ID = "iuadditions";
    public static final String MOD_NAME = "IU:Additions";
    public static final String MOD_VERSION = "1.0";
    public static final String MOD_DEPS = "after:industrialupgrade;after:astralsorcery;after:forestry;after:divinerpg;after:botania;after:thaumcraft";

    public static final String MOD_CERTIFICATE = "";
    public static final String TEXTURES = "iuadditions";
    public static final String TEXTURES_ITEMS = "iuadditions:textures/items/";
    public static final String ABBREVIATION = "iuadditions";

    public static final boolean BA_LOADED = Loader.isModLoaded("botania");
    public static final boolean AS_LOADED = Loader.isModLoaded("astralsorcery");
    public static final boolean DIV_LOADED = Loader.isModLoaded("divinerpg");
    public static final boolean FO_LOADED = Loader.isModLoaded("forestry");

    public static final boolean BA_CONFIRM = Config.BotaniaConfirmed;
    public static final boolean AS_CONFIRM = Config.AstralConfirmed;
    public static final boolean DIV_CONFIRM = Config.DivineConfirmed;
    public static final boolean FO_CONFIRM = Config.ForestryConfirmed;
}
