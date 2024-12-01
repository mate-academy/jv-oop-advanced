package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final String[] COLORS = {"red", "blue", "yellow", "green", "purple", "black"};

    public String getColorSupplier() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
