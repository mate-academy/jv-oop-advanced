package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        RED,
        GREEN,
        BLUE,
        WHITE
    }

    private final Random random = new Random();

    public String getRandomColor() {
        int numberOfColors = Color.values().length;
        int index = random.nextInt(numberOfColors);
        return Color.values()[index].name();
    }
}
