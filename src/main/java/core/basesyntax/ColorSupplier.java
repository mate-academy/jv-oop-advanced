package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = 10;
    private Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(COLORS_COUNT)];
    }
}
