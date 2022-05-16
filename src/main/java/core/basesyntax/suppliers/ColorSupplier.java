package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int randomColorNumber = random.nextInt(COLORS_COUNT);
        return Color.values()[randomColorNumber].name();
    }
}
