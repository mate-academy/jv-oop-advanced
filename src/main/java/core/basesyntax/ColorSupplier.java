package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
