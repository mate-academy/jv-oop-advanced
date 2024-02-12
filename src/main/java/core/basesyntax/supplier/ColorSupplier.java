package core.basesyntax.supplier;

import core.basesyntax.figure.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int randomColorIndex = random.nextInt(Color.values().length);
        return Color.values()[randomColorIndex];
    }
}
