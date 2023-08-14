package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_AMOUNT = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(COLORS_AMOUNT)].name();
    }
}
