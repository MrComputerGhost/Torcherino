package com.sci.torcherino.tile;

/**
 * @author MrComputerGhost
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileDoubleCompressedTorcherino extends TileTorcherino {

    public TileDoubleCompressedTorcherino() {
        super(false);
    }

    @Override
    protected int speed(final int base) {
        return base * 81;
    }
}
