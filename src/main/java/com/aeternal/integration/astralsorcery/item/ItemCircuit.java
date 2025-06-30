/*
package com.aeternal.integration.astralsorcery.item;

import java.util.Locale;
import javax.annotation.Nonnull;


import com.aeternal.api.item.IMetaItem;
import com.aeternal.api.item.ItemIUA;
import com.aeternal.integration.astralsorcery.item.enums.CircuitAS;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemCircuit extends ItemIUA implements IMetaItem {

    public ItemCircuit() {
        super();
        setHasSubtypes(true);
    }

    @Override
    public String getTexture(int meta) {
        return CircuitAS.values()[meta].getName() + "Circuit";
    }

    @Override
    public int getVariants() {
        return CircuitAS.values().length;
    }

    @Override
    public void getSubItems(@Nonnull CreativeTabs tabs, @Nonnull NonNullList<ItemStack> itemList) {
        if (isInCreativeTab(tabs)) {
            for (int counter = 0; counter < CircuitAS.values().length; counter++) {
                itemList.add(new ItemStack(this, 1, counter));
            }
        }
    }

    @Nonnull
    @Override
    public String getUnlocalizedName(ItemStack item) {
        if (item.getItemDamage() <= CircuitAS.values().length - 1) {
            return "item." + CircuitAS.values()[item.getItemDamage()].getName().toLowerCase(Locale.ROOT) + "Circuit";
        }
        return "Invalid";
    }
}*/
