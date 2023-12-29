package core.basesyntax;

import java.util.Random;

enum Color {
    RED, BLUE, YELLOW, GREEN, ORANGE, PURPLE, PINK, WHITE;

    public static Color getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
