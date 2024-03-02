package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COUNT_COLORS = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COUNT_COLORS);
        return Color.values()[index].name();
    }
}
