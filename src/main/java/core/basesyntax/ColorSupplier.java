package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        String[] colors = new String[]{"red", "blue", "green", "white", "black", "yellow", "brown"};
        return colors[random.nextInt(colors.length)];
    }
}
