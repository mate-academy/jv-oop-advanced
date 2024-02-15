package core.basesyntax.supplier;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    static final Random random = new Random();

    public static Color getRandomColor() {
        int randomVerge = random.nextInt(Color.values().length);
        return Color.values()[randomVerge];
    }
}
