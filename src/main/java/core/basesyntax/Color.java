package core.basesyntax;

import java.util.Random;

public enum Color {
    PINK, RED, BLUE, PURPLE, GREEN, BLACK, WHITE, VIOLET;

    private static Random random = new Random();

    public static Color getRandom() {
        switch (random.nextInt(Color.values().length)) {
            case 0:
                return VIOLET;

            case 1:
                return RED;

            case 2:
                return GREEN;

            case 3:
                return PINK;

            case 4:
                return BLUE;

            case 5:
                return PURPLE;

            case 6:
                return WHITE;

            default:
                return BLACK;
        }
    }
}
