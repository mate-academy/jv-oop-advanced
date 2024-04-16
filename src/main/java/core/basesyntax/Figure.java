package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaProvider, Drawable {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }
}
