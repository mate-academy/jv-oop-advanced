package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[new Random().nextInt(colors.length)].getColors();
    }
}
