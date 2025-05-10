package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }

    public Color getDefaultColor() {
        return DEFAULT_COLOR;
    }
}
