package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public java.lang.String getRandomColor() {
        int index = random.nextInt(ColorEnum.values().length);
        return ColorEnum.values() [index].toString();
    }
}
