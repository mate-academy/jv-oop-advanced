package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] color = Color.values();
    private Random random = new Random();

    public Color getRandomColor() {
        return color[random.nextInt(color.length)];
    }
}
