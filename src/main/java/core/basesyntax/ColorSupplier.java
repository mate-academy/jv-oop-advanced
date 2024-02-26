package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static ColorSupplier instance;
    private static final Color[] COLORS = Color.values();
    private Random random = new Random();

    private ColorSupplier() {
    }

    public static ColorSupplier getInstance() {
        if (instance == null) {
            instance = new ColorSupplier();
        }
        return instance;
    }

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)].name();
    }
}
