package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_VALUE = Color.values().length;

    public String getRandomColor() {
        final int index = new Random().nextInt(MAX_VALUE);
        final Color color = Color.values()[index];
        return color.name();
    }
}
