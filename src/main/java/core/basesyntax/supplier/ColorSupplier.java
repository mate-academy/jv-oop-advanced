package core.basesyntax.supplier;

import core.basesyntax.Color;

public class ColorSupplier {
    public String getRandomColor() {
        return Color.getRandomColor().name();
    }
}
