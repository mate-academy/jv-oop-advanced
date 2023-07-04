package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private final Random random = new Random();

    public ColorEnum getRandomColor() {
        int index = random.nextInt(ColorEnum.values().length);
        return ColorEnum.values()[index];
    }
}
