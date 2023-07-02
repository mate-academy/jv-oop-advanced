package core.basesyntax.supplier;

import core.basesyntax.type.Color;

public class ColorSupplier extends BasicRandomValueSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;

    @Override
    public Color getRandom() {
        return Color.values()[randomGenerator.nextInt(Color.values().length)];
    }

    @Override
    public Color getDefault() {
        return DEFAULT_COLOR;
    }
}
