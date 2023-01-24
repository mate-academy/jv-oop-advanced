package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_LENGTH = Color.values().length;
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLORS_LENGTH);
        return Color.values()[index];
    }
}
