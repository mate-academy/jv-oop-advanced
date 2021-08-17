package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 10;
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
        int colorNumber = random.nextInt(COLOR_COUNT);
        Color[] colors = Color.values();
        return colors[colorNumber].toString().toLowerCase();
    }
}
