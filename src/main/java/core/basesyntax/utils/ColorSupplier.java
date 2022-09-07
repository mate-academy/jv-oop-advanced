package core.basesyntax.utils;

import core.basesyntax.figure.Color;
import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    // but in my opinion `static` would be better
    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
