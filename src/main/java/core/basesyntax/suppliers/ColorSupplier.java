package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_LENGTH = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLOR_LENGTH);
        return Color.values()[index];
    }
}
