package core.basesyntax.utils;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }

    enum Color {
        YELLOW,
        RED,
        GREEN,
        BLUE,
        WHITE,
        BLACK
    }
}
