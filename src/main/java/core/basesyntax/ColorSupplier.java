package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;
    private Random random = new Random();

    public Colors getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);
        return Colors.values()[colorNumber];
    }
}
