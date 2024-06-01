package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private static final String[] colors = {"yellow", "red", "blue", "black"};

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
