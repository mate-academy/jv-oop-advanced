package core.basesyntax.suppliers;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random randomSupplier = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[randomSupplier.nextInt(colors.length)];
    }
}
