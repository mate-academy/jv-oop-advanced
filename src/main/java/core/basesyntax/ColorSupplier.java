package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public static String getRandomColor () {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
