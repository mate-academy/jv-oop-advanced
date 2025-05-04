package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLOR_COUNT);
        return Color.values()[index];
    }
}
