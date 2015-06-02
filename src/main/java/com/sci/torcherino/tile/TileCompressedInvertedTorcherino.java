package com.sci.torcherino.tile;

/**
 * @author MrComputerGhost
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileCompressedInvertedTorcherino extends TileTorcherino {

    public TileCompressedInvertedTorcherino() {
        super(true);
    }

    @Override
    protected int speed(final int base) {
        return base * 9;
    }

}
