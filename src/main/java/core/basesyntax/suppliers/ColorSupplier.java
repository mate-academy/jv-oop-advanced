package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS =
            new String[]{"grey", "blue", "white", "red", "yellow", "green"};

    public String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
