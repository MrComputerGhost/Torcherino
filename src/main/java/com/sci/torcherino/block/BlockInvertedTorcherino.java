package com.sci.torcherino.block;

import com.sci.torcherino.Torcherino;
import com.sci.torcherino.tile.TileInvertedTorcherino;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * @author MrComputerGhost
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockInvertedTorcherino extends BlockTorcherino {

    public BlockInvertedTorcherino() {
        this.setBlockName("inverse_torcherino");
        this.setLightLevel(0.75f);
        this.setBlockTextureName("torcherino:inverted_torcherino" + (Torcherino.animatedTextures ? "_animated" : ""));
    }

    @Override
    public TileEntity createNewTileEntity(final World world, final int i) {
        return new TileInvertedTorcherino();
    }
}
