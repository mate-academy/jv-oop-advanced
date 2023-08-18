package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();
    private static Color[] colors = Color.values();

    public static String getRandomColor() {
        String randomColor = colors[random.nextInt(colors.length)].toString().toString();
        return randomColor;
    }
}
