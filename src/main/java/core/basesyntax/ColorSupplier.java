package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorList getRandomColor() {
        return ColorList.values()[new Random().nextInt(ColorList.values().length)];
    }
}
