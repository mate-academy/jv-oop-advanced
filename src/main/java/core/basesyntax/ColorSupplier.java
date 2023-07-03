package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int numberOfColors = ColorEnum.values().length;
        int index = random.nextInt(numberOfColors);
        return ColorEnum.values()[index].name();
    }
}
