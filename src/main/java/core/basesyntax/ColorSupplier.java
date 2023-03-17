package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static String getRandomColor() {
        String[] colors = {"red", "blue", "green", "yellow", "orange", "purple"};
        return colors[random.nextInt(colors.length)];
    }
}
