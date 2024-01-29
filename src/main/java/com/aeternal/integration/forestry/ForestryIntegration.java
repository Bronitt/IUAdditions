package com.aeternal.integration.forestry;

import com.denfop.blocks.BlockTileEntity;
import com.denfop.items.IUItemBase;
import net.minecraft.item.Item;

public class ForestryIntegration {

    public static Item shimmeringhoneycomb_compressed;
    public static Item radioactivehoneycomb_compressed;
    public static Item venomoushoneycomb_compressed;
    public static Item certushoneycomb_compressed;
    public static Item statichoneycomb_compressed;
    public static Item drippinghoneycomb_compressed;
    public static Item shimmering_crystal;
    public static Item radioactive_crystal;
    public static Item venomous_crystal;
    public static Item certus_crystal;
    public static Item static_crystal;
    public static Item dripping_crystal;
    public static Item shimmering_plate;
    public static Item radioactive_plate;
    public static Item venomous_plate;
    public static Item certus_plate;
    public static Item static_plate;
    public static Item dripping_plate;
    public static Item refractive_plate;
    public static Item shimmering_glass;
    public static Item radioactive_glass;
    public static Item venomous_glass;
    public static Item certus_glass;
    public static Item static_glass;
    public static Item dripping_glass;
    public static Item refractive_glass;

    public static void init() {
        shimmeringhoneycomb_compressed = new IUItemBase("shimmeringhoneycomb_compressed");
        radioactivehoneycomb_compressed = new IUItemBase("radioactivehoneycomb_compressed");
        venomoushoneycomb_compressed = new IUItemBase("venomoushoneycomb_compressed");
        certushoneycomb_compressed = new IUItemBase("certushoneycomb_compressed");
        statichoneycomb_compressed = new IUItemBase("statichoneycomb_compressed");
        drippinghoneycomb_compressed = new IUItemBase("drippinghoneycomb_compressed");
        shimmering_crystal = new IUItemBase("shimmering_crystal");
        radioactive_crystal = new IUItemBase("radioactive_crystal");
        venomous_crystal = new IUItemBase("venomous_crystal");
        certus_crystal = new IUItemBase("certus_crystal");
        static_crystal = new IUItemBase("static_crystal");
        dripping_crystal = new IUItemBase("dripping_crystal");
        shimmering_plate = new IUItemBase("shimmering_plate");
        radioactive_plate = new IUItemBase("radioactive_plate");
        venomous_plate = new IUItemBase("venomous_plate");
        certus_plate = new IUItemBase("certus_plate");
        static_plate = new IUItemBase("static_plate");
        dripping_plate = new IUItemBase("dripping_plate");
        refractive_plate = new IUItemBase("refractive_plate");
        shimmering_glass = new IUItemBase("shimmering_glass");
        radioactive_glass = new IUItemBase("radioactive_glass");
        venomous_glass = new IUItemBase("venomous_glass");
        certus_glass = new IUItemBase("certus_glass");
        static_glass = new IUItemBase("static_glass");
        dripping_glass = new IUItemBase("dripping_glass");
        refractive_glass = new IUItemBase("refractive_glass");
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
