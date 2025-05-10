package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;

    public String getRandomColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(COLOR_COUNT);
        switch (colorNumber) {
            case 0:
                return "red";
            case 1:
                return "green";
            case 2:
                return "blue";
            case 3:
                return "yellow";
            default:
                return "pink";
        }
    }
}
