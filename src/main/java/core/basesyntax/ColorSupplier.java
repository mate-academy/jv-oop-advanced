package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static ColorEnum getRandomColor() {
        int index = new Random().nextInt(ColorEnum.values().length);
        return ColorEnum.values()[index];
    }
}
