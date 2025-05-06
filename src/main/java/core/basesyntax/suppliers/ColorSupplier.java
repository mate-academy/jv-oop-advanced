package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLORSIZE = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(COLORSIZE)].name().toLowerCase();
    }
}

