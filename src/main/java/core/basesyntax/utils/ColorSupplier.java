package core.basesyntax.utils;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "orange", "yellow", "green", "blue", "purple"};

    public String getRandomColor() {
        return COLORS[(new Random().nextInt(COLORS.length))];
    }

}
