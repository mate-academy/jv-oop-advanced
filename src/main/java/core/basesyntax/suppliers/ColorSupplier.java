package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_AMOUNT = Color.values().length;
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int index = random.nextInt(COLORS_AMOUNT);
        return Color.values()[index].toString();
    }
}
