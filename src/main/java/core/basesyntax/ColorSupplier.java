package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final int COLOR_COUNT = Color.values().length;

    public String getRandomColor() {
        int index = random.nextInt(COLOR_COUNT);
        Color color = Color.values()[index];
        return color.name().toLowerCase();
    }
}
