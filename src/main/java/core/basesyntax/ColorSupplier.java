package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_VALUE = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        final int index = random.nextInt(MAX_VALUE);
        final Color color = Color.values()[index];
        return color.name();
    }
}
