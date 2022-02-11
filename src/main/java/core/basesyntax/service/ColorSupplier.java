package core.basesyntax.service;

import core.basesyntax.enums.Color;

public class ColorSupplier {
    public Color getRandomColor() {
        return Color.values()[(int) (Math.random() * Color.values().length)];
    }
}
