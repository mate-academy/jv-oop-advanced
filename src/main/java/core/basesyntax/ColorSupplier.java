package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final String[] colors = {"Red", "Green", "Blue", "Yellow", "Pink"};

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
