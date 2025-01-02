package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random picker = new Random();

    public static Colors getRandomColor() {
        return Colors.values()[picker.nextInt(Colors.values().length)];
    }
}
