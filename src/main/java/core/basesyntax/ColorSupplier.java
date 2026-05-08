package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static String getRandomColor() {
        int index = random.nextInt(FigureColor.values().length);
        return FigureColor.values()[index].toString().toLowerCase();
    }
}
