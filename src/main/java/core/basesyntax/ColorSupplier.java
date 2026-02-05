package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;

    private final Random randomizer = new Random();

    public String getRandomColor() {
        return Color.values()[randomizer.nextInt(COLOR_COUNT)].name();
    }
}
