package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final Color[] colors = Color.values();

    public Color getRandomColor() {
        int numberOfColor = random.nextInt(colors.length);
        return colors[numberOfColor];
    }
}
