package core.basesyntax.service.suppliers;

import core.basesyntax.Colors;
import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static String getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length - 1);
        return Colors.values()[colorIndex].name();
    }
}
