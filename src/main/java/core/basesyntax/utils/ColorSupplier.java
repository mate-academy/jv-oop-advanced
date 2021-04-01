package core.basesyntax.utils;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};

    public String getRandomColor() {
        return colors[(new Random().nextInt(colors.length))];
    }

}
