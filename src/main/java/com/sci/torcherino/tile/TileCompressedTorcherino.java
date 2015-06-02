package com.sci.torcherino.tile;

/**
 * @author sci4me
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileCompressedTorcherino extends TileTorcherino {

    public TileCompressedTorcherino() {
        super(false);
    }

    @Override
    protected int speed(final int base) {
        return base * 9;
    }
}
