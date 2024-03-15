package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_NUMBER = 4;

    public Color generateColor() {
        Random random = new Random();
        switch (random.nextInt(COLORS_NUMBER)) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLACK;
            case 2:
                return Color.BLUE;
            case 3:
                return Color.GREEN;
            default:
                return Color.BLACK;
        }
    }
}
