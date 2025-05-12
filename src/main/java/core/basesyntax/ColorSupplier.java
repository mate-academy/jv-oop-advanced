package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"red", "blue", "green", "yellow", "black", "white"};
    private final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
