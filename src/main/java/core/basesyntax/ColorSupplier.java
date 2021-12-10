package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomColor = new Random();

    public static String getRandomColor() {
        return Colors.values()[randomColor.nextInt(Colors.values().length)].toString();
    }
}
