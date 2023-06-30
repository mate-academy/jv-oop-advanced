package core.basesyntax.service;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random;
    private Color[] colors;

    {
        random = new Random();
        colors = Color.values();
    }

    public Color getRandomColor() {
        int targetColor = random.nextInt(colors.length);
        return colors[targetColor];
    }
}
