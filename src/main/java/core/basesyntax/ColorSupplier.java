package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private static Random random = new Random();

    ColorSupplier() {
    }

    public static String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)].name();
    }
}
