package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_RANDOM_LIMIT = 9;

    public static String generateColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(COLOR_RANDOM_LIMIT);

        switch (colorNumber) {
            case 0:
                return "gray";
            case 1:
                return "purple";
            case 2:
                return "yellow";
            case 3:
                return "pink";
            case 4:
                return "blue";
            case 5:
                return "green";
            case 6:
                return "violet";
            case 7:
                return "red";
            case 8:
                return "orange";
            default:
                return "white";
        }
    }
}
