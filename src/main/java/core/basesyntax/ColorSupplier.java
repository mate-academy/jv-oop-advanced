package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_FIGURE = 5;
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLOR_FIGURE);
        return Color.values()[index];
    }
}
