package core.basesyntax.suppliers;

import core.basesyntax.enums.Colors;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].name();
    }
}
