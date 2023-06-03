package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {"red", "green", "blue", "yellow", "orange", "purple"};
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
