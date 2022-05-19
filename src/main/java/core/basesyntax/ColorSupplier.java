package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        return Colour.values()[getIndex()].getReadable();
    }

    private int getIndex() {
        return random.nextInt(Colour.values().length);
    }
}
