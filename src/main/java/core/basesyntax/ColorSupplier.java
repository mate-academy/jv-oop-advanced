package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color get() {
        Integer randomGeneratedIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGeneratedIndex];
    }
}
