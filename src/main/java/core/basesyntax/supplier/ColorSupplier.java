package core.basesyntax.supplier;

import core.basesyntax.type.Color;

public class ColorSupplier extends BasicRandomValueSupplier {
    @Override
    public Color getRandom() {
        return Color.values()[randomGenerator.nextInt(Color.values().length)];
    }

    @Override
    public Color getDefault() {
        return Color.WHITE;
    }
}
