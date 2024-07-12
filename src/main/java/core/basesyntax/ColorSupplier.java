package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final String color = getRandomColor();

    public String getColor() {
        return color;
    }

    public String getRandomColor() {
        int index = (random.nextInt(Color.values().length));
        return Color.values()[index].name();
    }

    private enum Color {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE
    }
}
