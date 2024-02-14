package core.basesyntax.supplier;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        int randomVerge = new Random().nextInt(Color.values().length);
        return Color.values()[randomVerge];
    }
}
