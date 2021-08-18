package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int RED = 1;
    private static final int YELLOW = 2;
    private static final int GREEN = 3;
    private static final String[] COLORS = new String[]{"Red", "Yellow", "Green"};

    public String getRandomColor() {
        int random = getRandomInt();
        switch (random) {
            case RED:
                return COLORS[0];
            case YELLOW:
                return COLORS[1];
            case GREEN:
                return COLORS[2];
            default:
                return "Color";
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(3);
    }
}
