package core.basesyntax;

import core.basesyntax.figure.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int AMOUNT_OF_COLORS = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(AMOUNT_OF_COLORS);
        Color[] colors = Color.values();
        return colors[index];
    }
}
