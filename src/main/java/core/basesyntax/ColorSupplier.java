package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static String getRandomColor() {

        return String.valueOf(Color.values()[random.nextInt(Color.values().length)]);
    }
}
