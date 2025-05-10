package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = Color.values().length;
    private final Random randomizer = new Random();

    public Color getRandomColor() {
        int randomColorCode = randomizer.nextInt(NUMBER_OF_COLORS);
        return Color.values()[randomColorCode];
    }

}
