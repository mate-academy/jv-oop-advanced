package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomizer = new Random();
    private static final int COLOR_COUNT = Color.values().length;

    public Color getRandomColor() {
        return Color.values()[randomizer.nextInt(COLOR_COUNT)];
    }
}
