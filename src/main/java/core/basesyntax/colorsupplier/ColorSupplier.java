package core.basesyntax.colorsupplier;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public ColorSupplier() {
    }

    public String getRandomColor() {
        int index = random.nextInt(ColorFigure.values().length);
        return String.valueOf(ColorFigure.values()[index]);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        ColorSupplier.random = random;
    }
}
