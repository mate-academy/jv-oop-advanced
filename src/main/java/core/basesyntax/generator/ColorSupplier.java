package core.basesyntax.generator;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = 5;

    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        return colors[random.nextInt(NUMBER_OF_COLORS)].toString();
    }
}
