package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final int max = 6;

    public static String getNewColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(max);
        switch (number) {
            case 1 :
                return "Black";
            case 2 :
                return "Brown";
            case 3 :
                return "Red";
            case 4:
                return "Blue";
            case 5 :
                return "Yellow";
            default:
                return "White";
        }
    }
}
