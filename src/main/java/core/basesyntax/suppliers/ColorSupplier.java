package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final int colorsQty = 9;

    public String getColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        return colors[random.nextInt(colorsQty)].name();
    }
}
