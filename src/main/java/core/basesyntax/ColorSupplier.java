package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final String[] Colors = {"red", "blue", "yellow", "green", "purple", "black"};

    public String getColorSupplier() {
        return Colors[random.nextInt(Colors.length)];
    }
}
