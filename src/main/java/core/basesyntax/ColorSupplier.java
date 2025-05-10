package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_COLOR_NUMBER = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        int colorNumber = random.nextInt(MAX_COLOR_NUMBER);
        return Color.values()[colorNumber];
    }
}
