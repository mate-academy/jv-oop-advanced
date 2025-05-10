package core.basesyntax.service;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

}
