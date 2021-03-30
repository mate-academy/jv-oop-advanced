package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_RANDOM_LIMIT = 7;

    public static String colorGenerator() {
        Random random = new Random();
        int color = random.nextInt(COLOR_RANDOM_LIMIT);

        switch (color) {
            case 0:
                return "yellow";
            case 1:
                return "red";
            case 2:
                return "pink";
            case 3:
                return "white";
            case 4:
                return "black";
            case 5:
                return "blue";
            case 6:
                return "purple";
            default:
                return "gray";
        }
    }
}
