package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int maxValue = Color.values().length;
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        int index = random.nextInt(maxValue);
        return String.valueOf(Color.values()[index]);
    }
}
