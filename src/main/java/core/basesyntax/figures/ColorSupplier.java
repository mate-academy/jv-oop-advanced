package core.basesyntax.figures;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"red", "blue", "green", "yellow", "orange"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
