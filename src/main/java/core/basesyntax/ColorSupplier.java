package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return String.valueOf(color);
    }
}
