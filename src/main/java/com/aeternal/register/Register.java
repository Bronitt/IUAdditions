
package com.aeternal.register;


import com.aeternal.Constants;
import com.aeternal.IUAItem;
import com.aeternal.blocks.mechanism.BlockTestPanel;

import com.aeternal.integration.astralsorcery.AstralSorceryIntegration;
import com.aeternal.items.IUAItemBase;

import com.denfop.blocks.TileBlockCreator;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Register {
    public Register() {
    }

    public static void init() {

        ItemStack[] stack;
        if (Constants.AS_LOADED && Constants.AS_CONFIRM) {
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.stellar_capacitor = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.stellar_soic = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.stellar_qfp = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
            AstralSorceryIntegration.astralstarmetal_plate = new IUAItemBase("astralstarmetal_plate");
        }
        IUAItem.blocktest = TileBlockCreator.instance.create(BlockTestPanel.class);
    }
    
    public static <T extends Item> T registerItem(T item, ResourceLocation rl) {
        item.setRegistryName(rl);
        return registerItem(item);
    }

    public static <T extends Item> T registerItem(T item) {
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    public static <T extends Block> T registerBlock(T item, ResourceLocation rl) {
        item.setRegistryName(rl);
        return registerBlock(item);
    }

    public static <T extends Block> T registerBlock(T item) {
        ForgeRegistries.BLOCKS.register(item);
        return item;
    }


}
