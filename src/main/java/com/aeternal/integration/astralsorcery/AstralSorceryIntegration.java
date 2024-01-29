package com.aeternal.integration.astralsorcery;

import com.aeternal.items.IUAItemBase;
import net.minecraft.item.Item;

public class AstralSorceryIntegration {
    public static Item astralstarmetal_plate;
    public static Item stellar_capacitor;
    public static Item stellar_soic;
    public static Item stellar_qfp;
    public static Item stellar_circuit;
    public static Item stellar_core;
    public static Item iridium_stellar;
    public static Item iridium_reinforced_stellar;
    public static Item iridium_dense_stellar;
    public static Item iridium_advanced_stellar;


    public static void init() {
        astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
        stellar_capacitor = new IUAItemBase("stellar_capacitor");
        stellar_soic = new IUAItemBase("stellar_soic");
        stellar_qfp = new IUAItemBase("stellar_qfp");
        stellar_core = new IUAItemBase("stellar_core");
        iridium_stellar = new IUAItemBase("iridium_stellar");
        iridium_reinforced_stellar = new IUAItemBase("iridium_reinforced_stellar");
        iridium_dense_stellar = new IUAItemBase("iridium_dense_stellar");
        iridium_advanced_stellar = new IUAItemBase("iridium_advanced_stellar");
        stellar_circuit = new IUAItemBase("stellar_circuit");

    }




    /*public static void addcompressor(ItemStack input, ItemStack output) {

        final IInputHandler input1 = Recipes.inputFactory;
        com.denfop.api.Recipes.recipes.addRecipe(
                "compressor",
                new BaseMachineRecipe(
                        new Input(
                                input1.getInput(input)
                        ),
                        new RecipeOutput(null, output)
                )
        );


    }*/

}
