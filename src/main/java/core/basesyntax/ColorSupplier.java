package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;
    private final Colors[] colors;

    public ColorSupplier(Random random, Colors[] colors) {
        this.random = random;
        this.colors = colors;
    }

    public Colors getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
