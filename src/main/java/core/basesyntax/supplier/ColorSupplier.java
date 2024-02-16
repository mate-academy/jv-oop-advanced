package core.basesyntax.supplier;

import core.basesyntax.figure.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomInt = random.nextInt(colors.length);
        return colors[randomInt];
    }
}
