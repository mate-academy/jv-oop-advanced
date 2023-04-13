package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"Red", "Green", "Blue", "White", "Black", "Orange"};
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
