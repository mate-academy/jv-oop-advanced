package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS_ARRAY =
            new String[]{"grey", "blue", "white", "red", "yellow", "green"};

    public String getRandomColor() {
        Random random = new Random();
        return COLORS_ARRAY[random.nextInt(COLORS_ARRAY.length)];
    }
}
