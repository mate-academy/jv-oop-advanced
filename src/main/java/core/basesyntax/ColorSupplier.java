package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final String[] colors = new String[]{"Blue", "Red", "Yellow", "Green", "Black"};

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
