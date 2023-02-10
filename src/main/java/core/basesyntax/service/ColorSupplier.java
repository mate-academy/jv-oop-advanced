package core.basesyntax.service;

import core.basesyntax.entity.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int indexOfColor = random.nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[indexOfColor];
    }
}
