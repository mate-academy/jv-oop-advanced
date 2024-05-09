package core.basesyntax;

import enums.Colors;
import java.util.Random;

public class ColorSupplier {
    private static final Colors[] colors = Colors.values();
    private final Random random = new Random();

    public Colors getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
