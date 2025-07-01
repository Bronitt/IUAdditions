//package com.aeternal.spectralconverters.recipes;
//
//import com.aeternal.Constants;
//import com.aeternal.Core;
//import com.brandon3055.draconicevolution.DEFeatures;
//import com.denfop.IUItem;
//import com.denfop.api.Recipes;
//
//import com.powerutils.PowerUtils;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//
//
//
//public class SCRecipes {
//    private static int getPermalloyMeta() {
//        try {
//            Class<?> typesClass = Class.forName("com.denfop.items.resource.alloys.ItemAlloysPlate$Types");
//            Object[] enumConstants = typesClass.getEnumConstants();
//
//            for (Object constant : enumConstants) {
//                if (constant.toString().equals("permalloy")) {
//                    return (int) typesClass.getMethod("getId").invoke(constant);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace(); // Log the issue
//        }
//
//        return 0; // Fallback meta value (you may want to throw or return -1 instead)
//    }
//
//   static ItemStack spectralconverter = new ItemStack( Core.itemSpectralPowerConverter);
//    static ItemStack rfconverter = new ItemStack(PowerUtils.itemPowerConverter);
//    static ItemStack permalloyPlate = new ItemStack(IUItem.alloysplate, 1, getPermalloyMeta());
//    static ItemStack advSpectralBox = new ItemStack(IUItem.adv_spectral_box);
//    static ItemStack wyvernCore = new ItemStack(DEFeatures.wyvernCore);
//    static ItemStack wyvernEnergyCore = new ItemStack(DEFeatures.wyvernEnergyCore);
//
//
//
//    public static void Init() {
//            Recipes.recipe.addRecipe(spectralconverter,
//                    "PCP",
//                    "BRB",
//                    "PEP",
//
//                    ('P'), rfconverter,
//                    ('R'), rfconverter,
//                    ('B'), advSpectralBox,
//                    ('C'), wyvernCore,
//                    ('E'), wyvernEnergyCore
//            );
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
