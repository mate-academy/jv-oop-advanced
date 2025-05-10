package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int DEFAULT_COLOR_INDEX = 0;
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }

    public Color getDefaultColor() {
        return Color.values()[DEFAULT_COLOR_INDEX];
    }
}
