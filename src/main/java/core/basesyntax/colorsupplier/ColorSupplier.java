package core.basesyntax.colorsupplier;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public ColorSupplier() {
    }

    public String getRandomColor() {
        int index = random.nextInt(ColorFigure.values().length);
        return String.valueOf(ColorFigure.values()[index]);
    }
}
