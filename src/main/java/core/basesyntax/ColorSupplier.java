package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors get() {
        Integer randomGeneratedIndex = new Random().nextInt(Colors.values().length);
        return  Colors.values()[randomGeneratedIndex];
    }
}
