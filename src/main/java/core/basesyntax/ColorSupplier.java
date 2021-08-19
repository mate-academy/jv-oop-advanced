package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;
    private Random random = new Random();

    public String getRandomColor() {
        int colorRandomNumber = random.nextInt(COLOR_COUNT);
        return Color.values()[colorRandomNumber].toString().toLowerCase();
    }
}
