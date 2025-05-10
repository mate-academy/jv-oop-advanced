package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM_VALUE = new Random();

    public String getRandomColor() {
        int colorsCount = Color.values().length;
        int colorPosition = RANDOM_VALUE.nextInt(colorsCount);
        return Color.values()[colorPosition].name();
    }
}
