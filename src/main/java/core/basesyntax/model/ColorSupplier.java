package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"Black", "Blue", "Green", "Red", "White", "Yellow"};

    public String getRandomColor() {
        String color = COLORS[new Random().nextInt(COLORS.length)];
        return color;
    }
}
