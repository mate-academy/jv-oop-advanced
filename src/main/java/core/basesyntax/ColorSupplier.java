package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_COUNT = 6;

    public String getNewColor() {
        Random random = new Random();
        int number = random.nextInt(COLORS_COUNT);
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
