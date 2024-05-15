package core.basesyntax.util;

import core.basesyntax.enums.Colors;
import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random rnd = new Random();
        int index = rnd.nextInt(Colors.values().length);

        return Colors.values()[index].toString();
    }
}
