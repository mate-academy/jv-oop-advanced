package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"red", "green", "blue", "yellow", "purple", "orange"};
    private static final Random random = new Random();

    public static String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
