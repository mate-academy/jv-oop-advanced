package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;
    private final Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        int randomIndex = random.nextInt(COLOR_COUNT);
        return Color.values()[randomIndex].name().toLowerCase();
    }
}
