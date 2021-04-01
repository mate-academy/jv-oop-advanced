package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUM_COLORS = 5;
    private Random random = new Random();

    public String getRandomColor() {
        int colors = random.nextInt(NUM_COLORS);
        switch (colors) {
            case 0:
                return "blue";
            case 1:
                return "yellow";
            case 2:
                return "red";
            case 3:
                return "black";
            default:
                return "green";
        }
    }
}
