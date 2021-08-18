package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 8;
    private Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);
        return Color.values()[colorNumber].toString().toLowerCase();
    }
}
