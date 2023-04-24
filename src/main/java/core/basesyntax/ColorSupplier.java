package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
