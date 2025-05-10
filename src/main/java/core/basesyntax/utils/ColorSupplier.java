package core.basesyntax.utils;

import core.basesyntax.figures.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
