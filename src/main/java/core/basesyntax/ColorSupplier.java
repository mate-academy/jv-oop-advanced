package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Colors getRandomColor() {
        Colors[] values = Colors.values();
        return values[random.nextInt(values.length)];
    }
}
