package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorsAmount = Color.values().length;

    public Color getRandomColor() {
        return Color.values()[new Random().nextInt(colorsAmount)];
    }
}
