package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        final String[] Colors;
        Colors = new String[]{"Red", "Blue", "Green", "Yellow", "Orange"};
        Random random = new Random();
        return Colors[random.nextInt(Colors.length)];
    }
}
