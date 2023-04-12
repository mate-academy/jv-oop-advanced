package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();
    private static String[] colors = {"red", "green", "blue", "yellow", "black", "white"};

    public static String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
