package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.valueOf(Color.values()[random.nextInt(Color.values().length)].name());
    }
}
