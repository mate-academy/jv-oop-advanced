package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"beige", "magenta", "blue", "yellow", "pink", "purple"};
    private static final Random RANDOM = new Random();

    public static String getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}
