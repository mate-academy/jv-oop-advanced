package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final String[] colors = {"red", "green", "blue", "yellow", "purple", "orange", "pink"};

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
