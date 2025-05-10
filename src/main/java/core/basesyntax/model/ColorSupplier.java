package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        Color color = colors[random.nextInt(colors.length)];
        return color;
    }
}
