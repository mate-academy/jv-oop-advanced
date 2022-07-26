package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_COUNT = 6;

    public static Colors getRandomColor() {
        return Colors.values()[new Random().nextInt(COLORS_COUNT)];
    }
}
