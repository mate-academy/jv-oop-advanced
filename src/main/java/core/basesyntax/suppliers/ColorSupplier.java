package core.basesyntax.suppliers;

import java.util.Random;

public abstract class ColorSupplier {

    public static String getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)].name();
    }
}
