package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = new String[]{"Yellow", "Blue", "Red", "Green", "White"};
    private Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length - 1)];
    }

    public Random getRandom() {
        return random;
    }
}
