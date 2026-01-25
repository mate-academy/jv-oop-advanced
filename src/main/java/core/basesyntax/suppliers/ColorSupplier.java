package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_QUANTITY = 9;
    private final Random random = new Random();

    public String getColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(COLORS_QUANTITY)].name();
    }
}
