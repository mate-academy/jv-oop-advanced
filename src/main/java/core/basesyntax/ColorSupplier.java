package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;
    private Random random = new Random();

    public Color getRandomColor() {
        int colorIndex = random.nextInt(COLOR_COUNT);
        return Color.values()[colorIndex];
    }
}

