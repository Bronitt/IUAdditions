package com.aeternal.api.recipe;

import com.denfop.recipe.InputItemStack;
import com.denfop.tiles.mechanism.dual.heat.TileAlloySmelter;
import net.minecraft.item.ItemStack;

public class RecipeHelper {

    public static void addAlloySmelter(ItemStack input0, ItemStack input1, ItemStack output, int temp) {
        TileAlloySmelter.addAlloysmelter(new InputItemStack(input0), new InputItemStack(input1), output, temp);
    }

    public static void addUpgradeKitManufacturer() {

    }


}
