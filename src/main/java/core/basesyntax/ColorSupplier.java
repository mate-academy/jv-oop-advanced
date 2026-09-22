package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int value = randomColor.nextInt(colors.length);
        return colors[value].name();
    }
}
