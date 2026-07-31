package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    private static final int COLOR_AMOUNT = Color.values().length;

    public String getRandomColor() {
        final int colorIndex = RANDOM.nextInt(COLOR_AMOUNT);
        return Color.values()[colorIndex].name().toLowerCase();
    }
}
