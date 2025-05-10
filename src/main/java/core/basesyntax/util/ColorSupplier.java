package core.basesyntax.util;

import core.basesyntax.entity.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }

    public Color getDefaultColor() {
        return Color.WHITE;
    }
}
