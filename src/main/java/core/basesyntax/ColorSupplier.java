package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        Color[] figureColors = Color.values();
        return figureColors[random.nextInt(figureColors.length - 1)];
    }
}
