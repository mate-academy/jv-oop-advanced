package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 9;

    public String getColorByNumber(int colorNumber) {
        switch (colorNumber) {
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Blue";
            case 6:
                return "Red";
            case 7:
                return "Cyan";
            case 8:
                return "Purple";
            case 9:
                return "White";
            default:
                return "Black";
        }
    }

    public String getRandomColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(COLOR_COUNT);
        return getColorByNumber(colorNumber);
    }
}
