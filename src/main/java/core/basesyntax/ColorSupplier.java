package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private enum Color {
        RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE
    }

    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index].name().toLowerCase();
    }
}
