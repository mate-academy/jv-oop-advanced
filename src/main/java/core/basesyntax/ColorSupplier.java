package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple", "Orange"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
