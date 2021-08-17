package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int RED = 1;
    private static final int YELLOW = 2;
    private static final int GREEN = 3;
    private static final int RANDOM = new Random().nextInt(3);

    public String getRandomColor() {
        switch (RANDOM) {
            case RED:
                return "Red";
            case YELLOW:
                return "Yellow";
            case GREEN:
                return "Green";
            default:
                return "Color";
        }
    }
}
