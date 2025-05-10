package core.basesyntax.service;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] colors = Color.values();

    public Color getRandomColor() {
        int targetColor = random.nextInt(colors.length);
        return colors[targetColor];
    }
}
