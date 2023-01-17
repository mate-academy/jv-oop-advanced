package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public static Color getRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color[] colors = Color.values();
        return colors[colorSupplier.random.nextInt(colors.length)];
    }
}
