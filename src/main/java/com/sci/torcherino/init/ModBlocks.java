package com.sci.torcherino.init;

import com.sci.torcherino.Torcherino;
import com.sci.torcherino.block.*;
import com.sci.torcherino.tile.*;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author sci4me
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@GameRegistry.ObjectHolder("Torcherino")
public final class ModBlocks {

    public static BlockTorcherino torcherino;
    public static BlockCompressedTorcherino compressedTorcherino;
    public static BlockDoubleCompressedTorcherino doubleCompressedTorcherino;

    public static BlockInvertedTorcherino inverseTorcherino;
    public static BlockCompressedInvertedTorcherino compressedInverseTorcherino;
    public static BlockDoubleCompressedInvertedTorcherino doubleCompressedInverseTorcherino;

    public static void init() {
        ModBlocks.torcherino = new BlockTorcherino();

        ModBlocks.inverseTorcherino = new BlockInvertedTorcherino();

        if (Torcherino.compressedTorcherino) {
            ModBlocks.compressedTorcherino = new BlockCompressedTorcherino();
            GameRegistry.registerBlock(ModBlocks.compressedTorcherino, ModBlocks.compressedTorcherino.getUnlocalizedName());
            GameRegistry.registerTileEntity(TileCompressedTorcherino.class, "compressed_torcherino_tile");

            ModBlocks.compressedInverseTorcherino = new BlockCompressedInvertedTorcherino();
            GameRegistry.registerBlock(ModBlocks.compressedInverseTorcherino, ModBlocks.compressedInverseTorcherino.getUnlocalizedName());
            GameRegistry.registerTileEntity(TileCompressedInvertedTorcherino.class, "compressed_inverse_torcherino_tile");
        }
        if (Torcherino.doubleCompressedTorcherino && Torcherino.compressedTorcherino) {
            ModBlocks.doubleCompressedTorcherino = new BlockDoubleCompressedTorcherino();
            GameRegistry.registerBlock(ModBlocks.doubleCompressedTorcherino, ModBlocks.doubleCompressedTorcherino.getUnlocalizedName());
            GameRegistry.registerTileEntity(TileDoubleCompressedTorcherino.class, "double_compressed_torcherino_tile");

            ModBlocks.doubleCompressedInverseTorcherino = new BlockDoubleCompressedInvertedTorcherino();
            GameRegistry.registerBlock(ModBlocks.doubleCompressedInverseTorcherino, ModBlocks.doubleCompressedInverseTorcherino.getUnlocalizedName());
            GameRegistry.registerTileEntity(TileDoubleCompressedInvertedTorcherino.class, "double_compressed_inverse_torcherino_tile");
        }

        GameRegistry.registerBlock(ModBlocks.torcherino, ModBlocks.torcherino.getUnlocalizedName());
        GameRegistry.registerTileEntity(TileTorcherino.class, "torcherino_tile");

        GameRegistry.registerBlock(ModBlocks.inverseTorcherino, ModBlocks.inverseTorcherino.getUnlocalizedName());
        GameRegistry.registerTileEntity(TileInvertedTorcherino.class, "inverse_torcherino_tile");
    }

    private ModBlocks() {
    }
}
