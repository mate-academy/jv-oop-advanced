package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"red", "green", "blue", "yellow", "purple", "orange", "pink"};

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
