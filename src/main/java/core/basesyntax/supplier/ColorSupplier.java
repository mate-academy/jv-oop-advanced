package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)].name();
    }
}
