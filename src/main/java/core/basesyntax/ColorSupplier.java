package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final static Random picker = new Random();

    public static Colors getRandomColor() {
        return Colors.values()[picker.nextInt(Colors.values().length)];
    }
}
