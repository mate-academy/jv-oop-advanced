package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"red", "blue", "pink", "black", "white", "green"};
    private final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
