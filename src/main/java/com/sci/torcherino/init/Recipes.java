package com.sci.torcherino.init;

import com.sci.torcherino.Torcherino;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * @author sci4me
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public final class Recipes {

    public static void init() {
        if (Torcherino.overPoweredRecipe) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.torcherino), new Object[]{"XCX", "CTC", "XCX", 'C', Items.clock, 'T', Blocks.torch});
            GameRegistry.addRecipe(new ItemStack(ModBlocks.inverseTorcherino), new Object[]{"XCX", "CTC", "XCX", 'C', Items.clock, 'T', Blocks.redstone_torch});
        } else {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.torcherino), new Object[]{"SCS", "CTC", "SCS", 'C', Items.clock, 'S', Items.nether_star, 'T', Blocks.torch});
            GameRegistry.addRecipe(new ItemStack(ModBlocks.inverseTorcherino), new Object[]{"SCS", "CTC", "SCS", 'C', Items.clock, 'S', Items.nether_star, 'T', Blocks.redstone_torch});
        }

        if (Torcherino.compressedTorcherino) {
            GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedTorcherino), new Object[]{"ttt", "ttt", "ttt", 't', ModBlocks.torcherino});
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.torcherino, 9), ModBlocks.compressedTorcherino);
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedTorcherino), ModBlocks.compressedInverseTorcherino);

            GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedInverseTorcherino), new Object[]{"ttt", "ttt", "ttt", 't', ModBlocks.inverseTorcherino});
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.inverseTorcherino, 9), ModBlocks.compressedInverseTorcherino);

            if (Torcherino.doubleCompressedTorcherino) {
                GameRegistry.addRecipe(new ItemStack(ModBlocks.doubleCompressedTorcherino), new Object[]{"ttt", "ttt", "ttt", 't', ModBlocks.compressedTorcherino});
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedTorcherino, 9), ModBlocks.doubleCompressedTorcherino);
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.doubleCompressedTorcherino), ModBlocks.doubleCompressedInverseTorcherino);

                GameRegistry.addRecipe(new ItemStack(ModBlocks.doubleCompressedInverseTorcherino), new Object[]{"ttt", "ttt", "ttt", 't', ModBlocks.compressedInverseTorcherino});
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedTorcherino, 9), ModBlocks.doubleCompressedInverseTorcherino);
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.doubleCompressedInverseTorcherino), ModBlocks.compressedInverseTorcherino, Blocks.redstone_torch);
            }
        }

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.torcherino), ModBlocks.inverseTorcherino);
    }

    private Recipes() {
    }
}
