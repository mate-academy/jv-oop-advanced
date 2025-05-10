package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_RANDOM_BOUND = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLOR_RANDOM_BOUND);
        Color[] colors = Color.values();
        return colors[index].name();
    }
}
