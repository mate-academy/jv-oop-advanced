package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int numberOfColors = Color.values().length;

    public Color getRandomColor() {
        return Color.values()[random.nextInt(numberOfColors)];
    }
}
