package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return ColorEnum.values()[new Random().nextInt(ColorEnum.values().length)].toString();
    }
}
