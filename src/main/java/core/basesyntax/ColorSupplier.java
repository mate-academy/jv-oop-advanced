package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
