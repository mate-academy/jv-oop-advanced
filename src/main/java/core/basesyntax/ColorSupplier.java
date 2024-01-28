package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(ColorEnum.values().length);
        ColorEnum color = ColorEnum.values()[index];
        return color.name().toLowerCase();
    }
}
