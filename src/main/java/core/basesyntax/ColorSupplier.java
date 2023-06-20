package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private static final int COLOR_COUNT = 9;
    public Color getRandomColor() {
        int colorIndex = random.nextInt(COLOR_COUNT);
        return Color.values()[colorIndex];
    }
}

