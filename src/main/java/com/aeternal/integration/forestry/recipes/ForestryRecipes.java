package com.aeternal.integration.forestry.recipes;

import cofh.thermalexpansion.util.managers.machine.TransposerManager;
import binnie.extrabees.items.ItemHoneyComb;
import binnie.extrabees.modules.ModuleCore;
import com.aeternal.Constants;
import com.aeternal.IUAItem;
import com.denfop.tiles.mechanism.TileEntityFluidIntegrator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Mod;

import static com.denfop.recipes.CompressorRecipe.addcompressor;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID)
public class ForestryRecipes {

    private static final Fluid FORESTRY_HONEY = FluidRegistry.getFluid("for.honey");
    private static final Fluid IU_HONEY = FluidRegistry.getFluid("iufluidhoney");
    private static final Fluid WATER = FluidRegistry.WATER;

    public static void init() {
        FOCompressorRecipe();
        FOFluidIntegrator();
        if (Constants.TE_LOADED) {
            FOFluidTransposer();
        }
    }

    public static void FOCompressorRecipe() {

        addcompressor(ItemHoneyComb.VanillaComb.SIMMERING.get(), 32, new ItemStack(IUAItem.compressedHoneycomb, 1, 0));
        addcompressor(new ItemStack(ModuleCore.comb, 32, 82), new ItemStack(IUAItem.compressedHoneycomb, 1, 0));
        addcompressor(new ItemStack(ModuleCore.comb, 32, 21), new ItemStack(IUAItem.compressedHoneycomb, 1, 1));
        addcompressor(new ItemStack(ModuleCore.comb, 32, 28), new ItemStack(IUAItem.compressedHoneycomb, 1, 2));
        addcompressor(new ItemStack(ModuleCore.comb, 32, 81), new ItemStack(IUAItem.compressedHoneycomb, 1, 3));
        addcompressor(new ItemStack(ModuleCore.comb, 32, 14), new ItemStack(IUAItem.compressedHoneycomb, 1, 4));
        addcompressor(ItemHoneyComb.VanillaComb.DRIPPING.get(), 32, new ItemStack(IUAItem.compressedHoneycomb, 1, 5));

    }

    public static void FOFluidIntegrator() {

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 0), new ItemStack(IUAItem.honeyCrystal, 1, 0), new FluidStack(FORESTRY_HONEY, 2500), new FluidStack(WATER, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 0), new ItemStack(IUAItem.honeyCrystal, 1, 0), new FluidStack(IU_HONEY      , 2500), new FluidStack(WATER, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 1), new ItemStack(IUAItem.honeyCrystal, 1, 1), new FluidStack(FORESTRY_HONEY, 2500), new FluidStack(WATER, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 1), new ItemStack(IUAItem.honeyCrystal, 1, 1), new FluidStack(IU_HONEY      , 2500), new FluidStack(WATER, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 2), new ItemStack(IUAItem.honeyCrystal, 1, 2), new FluidStack(FORESTRY_HONEY, 2500), new FluidStack(WATER, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 2), new ItemStack(IUAItem.honeyCrystal, 1, 2), new FluidStack(IU_HONEY      , 2500), new FluidStack(WATER, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 3), new ItemStack(IUAItem.honeyCrystal, 1, 3), new FluidStack(FORESTRY_HONEY, 2500), new FluidStack(WATER, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 3), new ItemStack(IUAItem.honeyCrystal, 1, 3), new FluidStack(IU_HONEY      , 2500), new FluidStack(WATER, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 4), new ItemStack(IUAItem.honeyCrystal, 1, 4), new FluidStack(FORESTRY_HONEY, 2500), new FluidStack(WATER, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 4), new ItemStack(IUAItem.honeyCrystal, 1, 4), new FluidStack(IU_HONEY      , 2500), new FluidStack(WATER, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 5), new ItemStack(IUAItem.honeyCrystal, 1, 5), new FluidStack(FORESTRY_HONEY, 2500), new FluidStack(WATER, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 5), new ItemStack(IUAItem.honeyCrystal, 1, 5), new FluidStack(IU_HONEY      , 2500), new FluidStack(WATER, 2500));
    }

    public static void FOFluidTransposer() {
        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 0), new ItemStack(IUAItem.honeyCrystal, 1, 0), new FluidStack(FORESTRY_HONEY, 2500), false);
        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 0), new ItemStack(IUAItem.honeyCrystal, 1, 0), new FluidStack(IU_HONEY      , 2500), false);

        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 1), new ItemStack(IUAItem.honeyCrystal, 1, 1), new FluidStack(FORESTRY_HONEY, 2500), false);
        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 1), new ItemStack(IUAItem.honeyCrystal, 1, 1), new FluidStack(IU_HONEY      , 2500), false);

        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 2), new ItemStack(IUAItem.honeyCrystal, 1, 2), new FluidStack(FORESTRY_HONEY, 2500), false);
        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 2), new ItemStack(IUAItem.honeyCrystal, 1, 2), new FluidStack(IU_HONEY      , 2500), false);

        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 3), new ItemStack(IUAItem.honeyCrystal, 1, 3), new FluidStack(FORESTRY_HONEY, 2500), false);
        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 3), new ItemStack(IUAItem.honeyCrystal, 1, 3), new FluidStack(IU_HONEY      , 2500), false);

        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 4), new ItemStack(IUAItem.honeyCrystal, 1, 4), new FluidStack(FORESTRY_HONEY, 2500), false);
        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 4), new ItemStack(IUAItem.honeyCrystal, 1, 4), new FluidStack(IU_HONEY      , 2500), false);

        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 5), new ItemStack(IUAItem.honeyCrystal, 1, 5), new FluidStack(FORESTRY_HONEY, 2500), false);
        TransposerManager.addFillRecipe(800, new ItemStack(IUAItem.compressedHoneycomb, 1, 5), new ItemStack(IUAItem.honeyCrystal, 1, 5), new FluidStack(IU_HONEY      , 2500), false);
    }

}
