package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)].toString();
    }
}
