package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR = 6;

    public static String colorGenerator() {
        Random random = new Random();
        int color = random.nextInt(COLOR);

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
