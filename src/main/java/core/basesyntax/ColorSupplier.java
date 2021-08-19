package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    enum Color {
        BLACK,
        BLUE,
        YELLOW,
        RED,
        GREEN,
        PINK,
        BROWN,
        WHITE,
        VIOLET,
        ORANGE
    }

    public String getRandomColor() {
        int colorIndex = Color.values().length;
        int colorNumber = random.nextInt(colorIndex);
        return Color.values()[colorNumber].toString().toLowerCase();
    }
}
