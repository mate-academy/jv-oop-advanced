package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_AMOUNT = Colors.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(COLORS_AMOUNT)].name();
    }
}
