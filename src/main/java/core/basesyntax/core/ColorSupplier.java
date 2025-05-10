package core.basesyntax.core;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"red", "blue", "green", "yellow", "orange"};
    private final Random random = new Random();

    public String getRandomColor() {

        return colors[random.nextInt(colors.length)];
    }
}
