package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"blue", "red", "green", "yellow", "black"};
    private final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
