package core.basesyntax.colorsupplier;

import java.util.Random;
public class ColorSupplier {
    public static Random random = new Random();

    public ColorSupplier() {
    }

    public static String getRandomColor() {
        int index = random.nextInt(ColorFigure.values().length);
        return String.valueOf(ColorFigure.values()[index]);
    }
}
