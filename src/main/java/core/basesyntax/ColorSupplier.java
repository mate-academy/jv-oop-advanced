package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static final String[] Colors = {"Red", "Blue", "Green", "Yellow", "Purple", "Orange"};

    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Colors.length);
        return Colors[index];
    }
}
