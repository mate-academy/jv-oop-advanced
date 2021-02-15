package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color get() {
        int randomGeneratedIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGeneratedIndex];
    }
}
