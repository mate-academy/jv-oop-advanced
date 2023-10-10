package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorsCount = 3;

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(colorsCount)].name();
    }
}
