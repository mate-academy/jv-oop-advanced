package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {

        return String.valueOf(Color.values()[new Random().nextInt(Color.values().length)]);
    }
}
