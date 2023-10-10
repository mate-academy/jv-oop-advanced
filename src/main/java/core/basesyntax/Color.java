package core.basesyntax;

import java.util.Random;

public enum Color {
    RED, GREEN, BLUE, YELLOW, PURPLE, ORANGE, WHITE;

    public static Color getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
