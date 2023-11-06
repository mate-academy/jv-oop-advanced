package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();
    private Random random = new Random();

    public Color getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
