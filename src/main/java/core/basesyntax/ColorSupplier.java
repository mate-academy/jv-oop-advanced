package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static String getRandomColor() {
        String[] colors = {"red", "blue", "yellow", "green", "orange"};
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber];
    }
}
