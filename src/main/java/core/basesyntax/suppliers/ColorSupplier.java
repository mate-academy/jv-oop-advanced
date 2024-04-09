package core.basesyntax.suppliers;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
