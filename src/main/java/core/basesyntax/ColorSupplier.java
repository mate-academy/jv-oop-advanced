package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS =
            {"red", "green", "blue", "yellow", "orange", "purple", "pink"};

    public static String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
