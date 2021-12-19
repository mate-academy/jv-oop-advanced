package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public ColorsEnum getRandomColor() {
        int index = random.nextInt(ColorsEnum.values().length);
        return ColorsEnum.values()[index];
    }

}
