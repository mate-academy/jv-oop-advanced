package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"blue", "red", "green", "grey", "white"};

    public String getColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
