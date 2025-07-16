//---This code is a part of the original IU(Industrial Upgrade) code: https://github.com/ZelGimi/industrialupgrade. Project: https://www.curseforge.com/minecraft/mc-mods/industrial-upgrade.
//---The rights to this code belong to their original authors.---///
//---The usage and modification of it are a subject to the license of the original souce code and discretion of it's author.---///

package com.aeternal.integration.forestry.recipes;

import binnie.extrabees.items.ItemHoneyComb;
import binnie.extrabees.modules.ModuleCore;
import com.aeternal.IUAItem;
import com.denfop.IUItem;
import com.denfop.api.Recipes;
import com.denfop.tiles.mechanism.TileEntityFluidIntegrator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import static com.aeternal.integration.forestry.ForestryIntegration.*;
import static com.denfop.recipes.CompressorRecipe.addcompressor;


public class ForestryRecipes {

    public static void init() {
        FOCompressorRecipe();
        FOFluidIntegrator();
    }

    static ItemStack iridiumIndustrial = new ItemStack( IUItem.crafting_elements,1,285);
    static ItemStack enrichedSunnarium = new ItemStack( IUItem.sunnarium,1,1);
    public static void FOBaseRecipe() {
        Recipes.recipe.addRecipe(plate_shimmering,
                "CIC",
                "ISI",
                "CIC",

                ('C'), crystal_shimmering,
                ('I'), iridiumIndustrial,
                ('S'), enrichedSunnarium
        );

        Recipes.recipe.addRecipe(plate_radioactive,
                "CIC",
                "ISI",
                "CIC",

                ('C'), crystal_radioactive,
                ('I'), iridiumIndustrial,
                ('S'), enrichedSunnarium
        );

        Recipes.recipe.addRecipe(plate_venomous,
                "CIC",
                "ISI",
                "CIC",

                ('C'), crystal_venomous,
                ('I'), iridiumIndustrial,
                ('S'), enrichedSunnarium
        );

        Recipes.recipe.addRecipe(plate_certus,
                "CIC",
                "ISI",
                "CIC",

                ('C'), crystal_certus,
                ('I'), iridiumIndustrial,
                ('S'), enrichedSunnarium
        );

        Recipes.recipe.addRecipe(plate_static,
                "CIC",
                "ISI",
                "CIC",

                ('C'), crystal_static,
                ('I'), iridiumIndustrial,
                ('S'), enrichedSunnarium
        );

        Recipes.recipe.addRecipe(plate_dripping,
                "CIC",
                "ISI",
                "CIC",

                ('C'), crystal_dripping,
                ('I'), iridiumIndustrial,
                ('S'), enrichedSunnarium
        );

        /*Recipes.recipe.addRecipe(plate_refractive,
                "CIC",
                "ISI",
                "CIC",

                ('C'), crystal_dripping,
                ('I'), iridiumIndustrial,
                ('S'), enrichedSunnarium
        );*/
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
        Fluid forestryHoney = FluidRegistry.getFluid("for.honey");
        Fluid iuHoney = FluidRegistry.getFluid("iufluidhoney");
        Fluid water = FluidRegistry.WATER;
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 0), new ItemStack(IUAItem.honeyCrystal, 1, 0), new FluidStack(forestryHoney, 2500), new FluidStack(water, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 0), new ItemStack(IUAItem.honeyCrystal, 1, 0), new FluidStack(iuHoney      , 2500), new FluidStack(water, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 1), new ItemStack(IUAItem.honeyCrystal, 1, 1), new FluidStack(forestryHoney, 2500), new FluidStack(water, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 1), new ItemStack(IUAItem.honeyCrystal, 1, 1), new FluidStack(iuHoney      , 2500), new FluidStack(water, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 2), new ItemStack(IUAItem.honeyCrystal, 1, 2), new FluidStack(forestryHoney, 2500), new FluidStack(water, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 2), new ItemStack(IUAItem.honeyCrystal, 1, 2), new FluidStack(iuHoney      , 2500), new FluidStack(water, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 3), new ItemStack(IUAItem.honeyCrystal, 1, 3), new FluidStack(forestryHoney, 2500), new FluidStack(water, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 3), new ItemStack(IUAItem.honeyCrystal, 1, 3), new FluidStack(iuHoney      , 2500), new FluidStack(water, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 4), new ItemStack(IUAItem.honeyCrystal, 1, 4), new FluidStack(forestryHoney, 2500), new FluidStack(water, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 4), new ItemStack(IUAItem.honeyCrystal, 1, 4), new FluidStack(iuHoney      , 2500), new FluidStack(water, 2500));

        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 5), new ItemStack(IUAItem.honeyCrystal, 1, 5), new FluidStack(forestryHoney, 2500), new FluidStack(water, 2500));
        TileEntityFluidIntegrator.addRecipe(new ItemStack(IUAItem.compressedHoneycomb, 1, 5), new ItemStack(IUAItem.honeyCrystal, 1, 5), new FluidStack(iuHoney      , 2500), new FluidStack(water, 2500));
    }


}
