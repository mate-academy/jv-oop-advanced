package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private final Random picker = new Random();

    public Color getRandomColor() {
        return Color.values()[picker.nextInt(Color.values().length)];
    }
}
