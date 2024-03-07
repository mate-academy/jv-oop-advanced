package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final String[] colors = {"red", "blue", "green", "yellow", "orange", "purple"};

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
