package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorsCount = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(colorsCount)].name();
    }
}
