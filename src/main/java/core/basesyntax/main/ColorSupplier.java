package core.basesyntax.main;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 8;

    public Color generateColor() {
        Random random = new Random();
        int number = random.nextInt(COLOR_COUNT) + 1;

        switch (number) {
            case 1:
                return Color.RED;
            case 2:
                return Color.ORANGE;
            case 3:
                return Color.YELLOW;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.BLUE;
            case 6:
                return Color.PINK;
            case 7:
                return Color.WHITE;
            case 8:
                return Color.BLACK;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }
}
