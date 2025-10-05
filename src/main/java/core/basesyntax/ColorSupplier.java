package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] values = Color.values();
        Color c = values[random.nextInt(values.length)];
        return c.name().toLowerCase();
    }
}
