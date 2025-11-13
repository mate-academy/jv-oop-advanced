package core.basesyntax;

import java.util.Random;

public enum ColorSupplier {
    BLUE,
    GREEN,
    YELLOW,
    RED,
    BLACK,
    WHITE,
    ORANGE,
    PURPLE,
    GRAY;

    private static Random random = new Random();

    public static ColorSupplier getRandomColor() {
        ColorSupplier[] values = ColorSupplier.values();
        return values[random.nextInt(values.length)];
    }

}
