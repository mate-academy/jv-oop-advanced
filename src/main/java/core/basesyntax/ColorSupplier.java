package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"red", "yellow", "green", "white"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
