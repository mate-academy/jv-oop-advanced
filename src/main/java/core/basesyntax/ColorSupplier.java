package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 6;

    public String getRandomColor() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int color = random.nextInt(COLOR_COUNT);

        switch (color) {
            case 1:
                return "White";
            case 2:
                return "Red";
            case 3:
                return "Blue";
            case 4:
                return "Yellow";
            case 5:
                return "Brown";
            default:
                return "Black";
        }
    }
}
