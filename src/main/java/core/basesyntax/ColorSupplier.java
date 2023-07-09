package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "black", "blue", "green", "orange"};
    private static final Random random = new Random();

    public static String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
