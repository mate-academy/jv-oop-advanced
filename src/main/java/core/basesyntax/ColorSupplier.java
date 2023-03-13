package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = Color.values().length;

    public Color getRandomColor() {
        return Color.values()[new Random().nextInt(COLORS_COUNT)];
    }
}
