package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private Random randomIndex = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[randomIndex.nextInt(colors.length)].name();
    }
}
