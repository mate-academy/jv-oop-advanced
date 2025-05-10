package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int RANDOM_LIMIT = 5;

    public static String colorRandomizer() {
        Random number = new Random();
        int randomColorNumber = number.nextInt(RANDOM_LIMIT);

        switch (randomColorNumber) {
            case 0:
                return "white";
            case 1:
                return "blue";
            case 2:
                return "purple";
            case 3:
                return "orange";
            case 4:
                return "green";
            default:
                return "black";
        }
    }
}
