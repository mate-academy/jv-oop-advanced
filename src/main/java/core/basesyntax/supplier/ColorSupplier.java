package core.basesyntax.supplier;

import core.basesyntax.Color;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
