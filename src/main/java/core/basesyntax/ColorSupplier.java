package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 8;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(COLOR_COUNT)].name();
    }
}
