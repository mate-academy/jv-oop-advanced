package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random Random = new Random();

    public Colors getRandomColor() {
        Colors[] values = Colors.values();
        return values[Random.nextInt(values.length)];
    }
}
