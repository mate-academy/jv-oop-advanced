package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        BLACK,
        BLUE,
        GREEN,
        RED,
        YELLOW,
        WHITE
    }

    private static final int colorsCount = Color.values().length;

    public String getRandomColor() {
        int index = new Random().nextInt(colorsCount);
        return Color.values()[index].toString();
    }
}
