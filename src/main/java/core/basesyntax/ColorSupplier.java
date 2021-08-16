package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 10;
    private Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);

        switch (colorNumber) {
            case 1:
                return "Black";
            case 2:
                return "Blue";
            case 3:
                return "Yellow";
            case 4:
                return "Red";
            case 5:
                return "Green";
            case 6:
                return "Pink";
            case 7:
                return "Brown";
            case 8:
                return "White";
            case 9:
                return "Violet";
            default:
                return "Orange";
        }
    }
}
