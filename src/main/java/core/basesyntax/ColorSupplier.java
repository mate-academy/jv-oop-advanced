package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int COLORS_COUNT = 3;

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(COLORS_COUNT)].name();
    }
}
