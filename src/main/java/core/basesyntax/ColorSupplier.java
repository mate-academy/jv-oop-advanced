package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors;
    private Random random;

    public ColorSupplier() {
        this.colors = Color.values();
        this.random = new Random();
    }

    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
