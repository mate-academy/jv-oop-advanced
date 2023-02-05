package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private final Color[] values = Color.values();
    private final int colorCount = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colorCount);
        return values[index].name().toLowerCase();
    }
}
