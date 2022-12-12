package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
