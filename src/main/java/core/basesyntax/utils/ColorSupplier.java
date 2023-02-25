package core.basesyntax.utils;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};

    public static String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
