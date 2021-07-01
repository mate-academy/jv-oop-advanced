package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        int random = new Random().nextInt(3);
        switch (random) {
            case 1:
                return "Red";
            case 2:
                return "Yellow";
            default:
                return "Green";
        }
    }
}
