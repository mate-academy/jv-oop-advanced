package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static String getRandomColor() {
        String[] colors = new String[]{"red", "blue", "green", "white", "black", "yellow", "brown"};
        return colors[random.nextInt(colors.length)];
    }
}
