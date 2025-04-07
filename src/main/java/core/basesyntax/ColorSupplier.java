package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE,
        WHITE
    }

    public static String getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
