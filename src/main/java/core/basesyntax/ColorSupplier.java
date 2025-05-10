package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return ColorList.values()[new Random().nextInt(ColorList.values().length)].toString();
    }
}
