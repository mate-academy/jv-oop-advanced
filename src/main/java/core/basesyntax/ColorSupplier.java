package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors;
    private final Random random;

    public ColorSupplier() {
        this.colors = new String[] {"red", "green", "blue", "yellow", "orange", "purple", "pink"};
        this.random = new Random();
    }

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
