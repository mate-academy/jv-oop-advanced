package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] COLORS = Colors.values();

    public String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)].getColors();
    }
}
